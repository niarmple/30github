public class ClimbingStars {
    public static void main(String[] args) {
        int rows = 5; // Numberrr of rows for the climbing stars pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
