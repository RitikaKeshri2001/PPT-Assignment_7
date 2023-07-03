public class Q4_ReverseWord {
    public static String reverseWords(String s) {
        // split the string, array
        String arr[] = s.split(" ");
        // create a stringBuilder to add reverse word
        StringBuilder sb = new StringBuilder();
        for(String x : arr) {
            // reverse the word and append the word
            sb.append(reverse(x)).append(" ");
        }
        return sb.toString().trim();
    }

    // create a function to reverse a word
    public static String reverse(String s) {
        int i = 0;
        int j = s.length() - 1;
        char arr[] = s.toCharArray();
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
