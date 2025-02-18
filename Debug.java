public class Debug {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        int result = a / b; // This will cause an exception
        System.out.println("Result: " + result);
    }
}
