import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReplaceCharecterWithOcurrance {

    public static void main(String[] args) {
        String str = "abhishek";
        List<String> list = List.of(str.split(""));

        Map<String, Long> data = list.stream()
                .collect(Collectors.groupingBy(updatedData ->
                        updatedData, Collectors.counting()));

        StringBuilder stringBuilder = new StringBuilder();
     data.entrySet()
             .forEach(updatedData ->stringBuilder.append(updatedData.getKey()).append(updatedData.getValue()));
        System.out.println(stringBuilder);

    }
}
