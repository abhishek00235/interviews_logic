public class Recurrsion {

    public static void main(String[] args) {
        printNum(6);
    }

        public static void printNum(int i) {
            System.out.println(i);
            if (i > 1) {
               printNum(i-1);
            }
            if (i <6){
                System.out.println(i+1);
            }
        }


}
 