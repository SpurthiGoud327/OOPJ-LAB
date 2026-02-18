// Superclass A
class A {
    int i, j;

    // Parameterized constructor
    A(int a, int b) {
        i = a;
        j = b;
    }

    // Method to display i and j
    void show() {
        System.out.println("i = " + i + ", j = " + j);
    }
}

// Subclass B extends A
class B extends A {
    int k;

    // Parameterized constructor
    B(int a, int b, int c) {
        super(a, b); // Initialize i and j from superclass
        k = c;       // Initialize k
    }

    // Override show() method
	void show() {
        System.out.println("k = " + k);
    }
}

//  Driver class
class Override {
    public static void main(String[] args) {
        // Create object of subclass B
        B subOb = new B(10, 20, 30);

        // Call overridden show() method
        subOb.show();
    }
}