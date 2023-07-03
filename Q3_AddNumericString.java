public class Q3_AddNumericString {
    public static String addStrings(String num1, String num2) {
        // create a stringBuilder to store add number
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int add = 0;

        // iterate over strings and add
        while (i >= 0 || j >= 0) {
            int sum = add;

            if (i >= 0) sum += (num1.charAt(i--) - '0');
            if (j >= 0) sum += (num2.charAt(j--) - '0');

            sb.append(sum % 10);
            add = sum / 10;
        }

        if (add != 0) sb.append(add);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "11", num2 = "123";
        System.out.println(addStrings(num1, num2));
    }
}
