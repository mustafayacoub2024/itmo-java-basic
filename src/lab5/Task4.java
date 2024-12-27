package lab5;

public class Task4 {
    public static int result(String str1, String str2) {
        int count = 0;
        char[] word1 = str1.toCharArray();
        char[] word2 = str2.toCharArray();

        for (int i = 0; i < word1.length - 1; i++) {
            for (int j = 0; j < word2.length - 1; j++) {
                if (word1[i] == word2[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(result("об", "обаобоба"));
        System.out.println(result("об", "aaaaaaaaaaa"));
        System.out.println(result("об", "обаобобаобобоб"));
    }
}
