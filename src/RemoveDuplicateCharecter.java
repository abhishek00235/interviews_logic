import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateCharecter {

    public static void main(String[] args) {
        String str = "mynameisabhishek";

        //without Stream
        List<String> list = new java.util.ArrayList<>(List.of(str.split("")));
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i).equals(list.get(i+1)) || i != list.size()-1) {
               list.remove(i);
           }
        }
        System.out.println(String.join("", list));

        //with stream api only
        List<String> stringList = new java.util.ArrayList<>(list);
        System.out.println(stringList.stream()
                .distinct().collect(Collectors.joining("")));

    }
}
