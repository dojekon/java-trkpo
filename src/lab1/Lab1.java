package lab1;

import java.util.Arrays;

public class Lab1 {
    public static boolean swap(int i, int j, int[] array) {
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            return false; // выход за пределы массива
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return true;
    }

    public static void main(String[]args){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + Arrays.toString(array));
        boolean success = swap(1, 3, array);
        System.out.println("After swap: " + Arrays.toString(array));
        System.out.println("Swap successful? " + success);
    }
}
