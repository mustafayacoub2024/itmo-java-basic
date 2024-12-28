package lab5;

public class Task1 {
    public static String  longestWord(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            if (word.length() > result.length()) {
                result = word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestWord("Написать метод для поиска самого длинного слова в тексте"));
    }
}
