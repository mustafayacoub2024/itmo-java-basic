package lab5;

public class Task3 {
    public static void replacesWords(String str, String str2, String str3) {

         System.out.println(str.replace(str2,str3));
    }

    public static void main(String[] args) {
        replacesWords("бяка привет бяка пойдём домой бяка улыбнись ","бяка","[вырезано цензурой]");
    }
}
