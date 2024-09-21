public class interview3 {

    public static void main(String[] args) {
       /* Write a program to Find k closest elements to a given value

        Input: K = 4, X = 35

        arr[] = {12, 16, 22, 30, 35, 39, 42,

                45, 48, 50, 53, 55, 56}

        Output: 30 39 42 45*/


        int[] arr = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
            closestX(arr);

    }

    public static void closestX(int[] arr) {
        int[] resArr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 35){
                for (int j = i-1 ; j==5 ;j++){
                    if (arr[i] != 35){
                        resArr[j] = arr[j];
                    }
                }
            }
        }
        System.out.println(resArr);
    }
}
