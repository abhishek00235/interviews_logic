import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindCharecterOccurance {

    public static void main(String[] args) {
        String str = "abhishek";
        List<String> list = List.of(str.split(""));
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count = 1;
            for (int j = 1; j < list.size() - 1; j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            map.put(list.get(i), count);
        }
        System.out.println(map);


        //using hashmap
        HashMap<Character, Integer> updatedmap = new HashMap<>();
        for (Character strs : str.toCharArray()) {
            updatedmap.put(strs, updatedmap.getOrDefault(strs, 0) + 1);
        }
        System.out.println(updatedmap);

        //USING STREAM API
        System.out.println(list.stream()
                .collect(Collectors
                        .groupingBy(data->data ,Collectors.counting())));

    }


}
