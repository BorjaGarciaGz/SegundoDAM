package repasoArrays;

import java.util.Arrays;

public class metodosArrays {
    public static void main(String[] args) {
        //Array de una dimesión
        int [] array1D = {1,2,3};
        System.out.println("Array 1D: " + Arrays.toString(array1D));
        //Array de dos dimensiones
        int [][] array2D = {{1,2,3},{4,5}};
        System.out.println("Array 2D: " + Arrays.deepToString(array2D));
    }
}
