// Superclass A
class A {
    int i, j;

    // Method to display i and j
    void showij() {
        System.out.println("i = " + i + ", j = " + j);
    }
}

// Subclass B extends A
class B extends A {
    int k;

    // Method to display k
    void showk() {
        System.out.println("k = " + k);
    }

    // Method to calculate and display sum
    void sum() {
        System.out.println("Sum of i, j, and k = " + (i + j + k));
    }
}

//  Driver class
class SimpleInheritance {                                                                         
    public static void main(String[] args) {
        // Create object of superclass A
        A superOb = new A();

        // Assign values to i and j
        superOb.i = 10;
        superOb.j = 20;

        // Display values using showij()
        System.out.println("Contents of superOb:");
        superOb.showij();

        // Create object of subclass B
        B subOb = new B();

        // Assign values to i, j, and k
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        // Display inherited variables
        System.out.println("\nContents of subOb:");
        subOb.showij();

        // Display subclass variable
        subOb.showk();

        // Display sum of all three variables
        subOb.sum();
    }
}