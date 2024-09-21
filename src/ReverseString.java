import java.util.List;
import java.util.ListIterator;

public class ReverseString {
    public static void main(String[] args) {
        String testString = "Hello World";

        //Reverse String
        StringBuilder stringBuffer  = new StringBuilder();
        List<String> list = List.of(testString.split(""));

        //using Iterator
        ListIterator<String> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){
            stringBuffer.append(iterator.previous());
        }
        System.out.println(stringBuffer);

        //most optimized solution without stream
        System.out.println(new StringBuffer(testString).reverse());




    }
}