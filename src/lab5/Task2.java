package lab5;

public class Task2 {
    public static boolean  isPalindrome(String str) {
        String str1 = str.toLowerCase();
        String revers = new StringBuilder(str1).reverse().toString();
        return (str1.equals(revers));
    }

    public static void main(String[] args) {
        System.out.println( isPalindrome("Казак"));
        System.out.println( isPalindrome("Маша"));
    }
}
