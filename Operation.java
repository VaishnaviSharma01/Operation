public class Operation {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
