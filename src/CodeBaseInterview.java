import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CodeBaseInterview {

    public static void main(String[] args) {
        List<String> dictionary = List.of("a","b","c");
        String sentence = "aadsfasf absbs bbab cadsfafs";
        System.out.println(replaceWords1(dictionary,sentence));
    }
    public static String replaceWords1(List<String> dictionary, String sentence) {
        final String[] result = new String[1];
        dictionary.forEach(data -> {
             result[0] = Arrays.stream(sentence.split(" "))
                    .map(word -> word.toUpperCase()
                            .startsWith(data.toUpperCase()) ? data : word)
                    .collect(Collectors.joining(" "));
        });
        return result[0];
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] data = sentence.split(" ");

        for (int i =0; i < dictionary.size(); i++){
            for (int j =0; j < data.length; j++){

                if (data[j].toUpperCase()
                        .startsWith(dictionary.get(i)
                                .toUpperCase())){
                    data[j] = dictionary.get(i);
                }

            }

        }
        return String.join(" ", data);

    }
}
