import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] a = str1.toLowerCase().toCharArray();
        char[] b = str2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
