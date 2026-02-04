class MethodOverloadingDemo {

    // Method with two float parameters
    float sum(float a, float b) {
        return a + b;
    }

    // Method with three double parameters04-02-2026
    double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Step 5: Create object
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        // Step 6: Call sum() with two integer arguments
        float result1 = obj.sum(10, 20); // integers will be promoted to float
        System.out.println("Sum of two integers (10, 20): " + result1);

        // Step 7: Call sum() with three integer arguments
        double result2 = obj.sum(5, 15, 25); // integers will be promoted to double
        System.out.println("Sum of three integers (5, 15, 25): " + result2);
    }
}
