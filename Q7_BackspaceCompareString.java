import java.util.*;
public class Q7_BackspaceCompareString {
    public static boolean backspaceCompare(String s, String t) {
        // create two stacks to keep the character which are left after removing #
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        // fill st1
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='#') {
                if(!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(s.charAt(i));
            }
        }
        // fill st2
        for(int j=0;j<t.length();j++) {
            if(t.charAt(j)=='#') {
                if(!st2.isEmpty()) {
                    st2.pop();
                }
            } else {
                st2.push(t.charAt(j));
            }
        }

        // check the characters are equal or not
        while(!st1.isEmpty()&&!st2.isEmpty()) {
            if(st1.pop()!=st2.pop()) {
                return false;
            }
        }
        // if both stacks are empty return true
        if(st1.isEmpty()&&st2.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }
}
