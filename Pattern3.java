public class Pattern3 {
    public static void main(String[] args) {

        int rows = 9;
        int cols = 12;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if (i == 1 || i == rows ||
                    j == 1 || j == cols ||
                    (i <= 4 && j <= 5) ||
                    (i <= 4 && j >= 8)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
