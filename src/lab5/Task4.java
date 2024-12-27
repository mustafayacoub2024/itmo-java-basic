package lab5;

public class Task4 {
    public static int numberOfsubstrings(String str1, String str2) {
        int count = 0;
        int index = 0;
        while ((index = str2.indexOf(str1, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfsubstrings("об", "обаобоба"));
        System.out.println(numberOfsubstrings("об", "aaaaaaaaaaa"));
        System.out.println(numberOfsubstrings("об", "обаобобаобобоб"));
    }
}
