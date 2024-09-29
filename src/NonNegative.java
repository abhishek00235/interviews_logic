import java.util.HashMap;

public class NonNegative {

    /*Given a positive integer n, return the number of the integers in the range [0, n] whose binary representations do not contain consecutive ones.



Example 1:

Input: n = 5
Output: 5
Explanation:
Here are the non-negative integers <= 5 with their corresponding binary representations:
0 : 0
1 : 1
2 : 10
3 : 11
4 : 100
5 : 101
Among them, only integer 3 disobeys the rule (two consecutive ones) and the other 5 satisfy the rule.
Example 2:

Input: n = 1
Output: 2
Example 3:
 */
    public static void main(String[] args) {


    }

    public int findIntegers(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,10);
        map.put(3,11);
        map.put(4,100);
        map.put(5,101);
        int count=0;

        if (map.containsKey(n)){
            map.values().stream()
        }
    }
}
