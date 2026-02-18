class TwoDArray {
    public static void main(String[] args) {
        // Step 3 & 4: Declare and allocate memory for a 2D array
        int[][] twoD = new int[4][5];

        // Step 5: Declare variables
        int i, j, k = 0;

        // Step 6: Fill the array with sequential values
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        // Step 7 & 8: Display the array elements
        System.out.println("The 2D Array elements are:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}


