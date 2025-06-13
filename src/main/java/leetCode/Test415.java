package leetCode;

public class Test415 {
    public static void main(String[] args) {
        System.out.println(addStrings("233", "2"));
    }

    private static String addStrings(String num1, String num2) {
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int add = 0;
        StringBuffer sb = new StringBuffer();
        while (p1 >= 0 || p2 >= 0 || add != 0) {
            int x = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int y = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            int result = x + y + add;
            sb.append(result % 10);
            add = result / 10;
            p1--;
            p2--;
        }
        sb.reverse();
        return sb.toString();
    }
}
