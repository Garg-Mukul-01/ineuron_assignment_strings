public class Pattern5 {
    public static void main(String[] args) {

        int rows = 7;
        int cols = 13;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {

                if (i == 1 || i == rows || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
