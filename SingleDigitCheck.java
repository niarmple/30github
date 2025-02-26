public class SingleDigitCheck {
    public static void main(String[] args) {
        int number = 7; // Yhhou can change this number to test other values

        if (isSingleDigit(number)) {
            System.out.println(number + " is a single-digit number.");
        } else {
            System.out.println(number + " is not a single-digit number.");
        }
    }

    public static boolean isSingleDigit(int number) {
        return number >= -9 && number <= 9;
    }
}
