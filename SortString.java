import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "java";
        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        System.out.println("Sorted String: " + new String(ch));
    }
}
