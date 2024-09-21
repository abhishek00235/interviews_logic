import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

public class FindRepeatedCharecterWithCount {

    public static void main(String[] args) {
        String str = "abhishek";
        List<String> list = List.of(str.split(""));

        HashMap<Character, Integer> updatedmap = new HashMap<>();
        for (Character strs : str.toCharArray()) {
                updatedmap.put(strs, updatedmap.getOrDefault(strs, 0) + 1);
        }

        for(Map.Entry<Character,Integer> entry:updatedmap.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        //using Java 8 Stream

        list.stream()
                .collect(Collectors
                        .groupingBy(data -> data,
                                Collectors.counting()))
                .entrySet().stream().filter(updatedData ->
                        updatedData.getValue() > 1).forEach(System.out::println);
    }
}
