public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "programming";

        int[] count = new int[256];

        for (char ch : str.toCharArray()) {
            count[ch]++;
        }

        System.out.println("Repeated characters:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " : " + count[i]);
            }
        }
    }
}
