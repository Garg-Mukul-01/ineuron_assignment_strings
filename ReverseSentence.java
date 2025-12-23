public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Think Twice";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String revWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                revWord += word.charAt(i);
            }
            result += revWord + " ";
        }

        System.out.println(result.trim());
    }
}
