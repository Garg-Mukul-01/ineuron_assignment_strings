public class SpecialCharacterCount {
    public static void main(String[] args) {
        String str = "Java@123!";
        int specialCount = 0;

        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                specialCount++;
            }
        }

        System.out.println("Special Characters Count: " + specialCount);
    }
}
