public class MethodsDemo {

    // 1. Static Method (Void)
    static void displayHeader() {
        System.out.println("==================================");
        System.out.println("   JAVA METHODS INTERVIEW DEMO    ");
        System.out.println("==================================");
    }

    // 2. Overloaded Method 1: Integer addition
    static int calculateSum(int a, int b) {
        return a + b;
    }

    // 3. Overloaded Method 2: Double addition
    static double calculateSum(double a, double b) {
        return a + b;
    }

    // 4. Non-Static Method
    public void displayMessage(String message) {
        System.out.println("Non-static method response: " + message);
    }

    public static void main(String[] args) {
        displayHeader();

        // Testing Method Overloading
        System.out.println("Integer Sum: " + calculateSum(10, 20));
        System.out.println("Double Sum: " + calculateSum(10.5, 20.5));

        // Testing Non-Static Method
        MethodsDemo demo = new MethodsDemo();
        demo.displayMessage("Ready for interview practice!");
    }
}