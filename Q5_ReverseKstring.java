public class Q5_ReverseKstring {
    public static String reverseStr(String s, int k) {
        // create a character array
        char[] str = s.toCharArray();
        int n = str.length;

        // iterate over char array
        for(int i = 0 ; i < n; i += 2*k){
            if(i+k-1 < n){
                // reverse char till k value
                reverseK(i,i+k-1,str);
            }else{
                //for fewer than k characters left (edge case)
                reverseK(i,n-1,str);
            }
        }
        // ans string
        String ans = new String(str);
        return ans;
    }
    public static void reverseK(int i, int j, char[] str){ // reverse a sequence of character
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
