// Step 1: Create class Box
class Box {
    // Step 2: Declare instance variables
    double width;
    double height;
    double depth;

    // Step 3: Constructor with three parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Step 4: Default constructor
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Step 5: Constructor with one parameter (cube)
    Box(double len) {
        width = height = depth = len;
    }

    // Step 6: Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

// Step 7: Another class with main method
class OverloadCons {
    public static void main(String[] args) {
        // Step 8: Create objects using different constructors
        Box mybox1 = new Box(10, 20, 15);   // three-argument constructor
        Box mybox2 = new Box();             // default constructor
        Box mycube = new Box(7);            // single-argument constructor

        // Step 9: Call volume() for each object
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1: " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2: " + vol);

        vol = mycube.volume();
        System.out.println("Volume of mycube: " + vol);
    }
}