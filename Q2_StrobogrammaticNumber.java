import java.util.*;
public class Q2_StrobogrammaticNumber {
    public static boolean isStrobogrammatic(String num) {
        // map all number which are same as we rotate by 180 degrees.
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');

        // traverse the string to check whether it is strobogammatic or not.
        int start = 0, end = num.length()-1;
        while(start <= end) {
            // we check the number match or not.
            // if not return false.
            if(num.charAt(start) != map.getOrDefault(num.charAt(end),' ')) {
                return false;
            }
            // increment start index and decrement end index.
            start++;
            end--;
        }
        // otherwise return true
        return true;
    }

    public static void main(String[] args) {
        String num = "69";
        System.out.println(isStrobogrammatic(num));
    }
}
