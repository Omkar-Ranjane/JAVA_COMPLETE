public class AccessArray_2 {
    public static void main(String[] args) {
        // create an array
        int[] age = {12, 5, 4, 8};

        // loop through the array
        System.out.println("Accessing array using for loop");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        // loop thorugh the array
        System.out.println("\nAccessing array using each-for loop");
        for (int array : age) {
            System.out.println(array);
        }
    }
}
