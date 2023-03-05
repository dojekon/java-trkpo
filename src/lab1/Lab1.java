package lab1;

import java.util.Arrays;

public class Lab1 {
    public static boolean swap(int i, int j, int[] anArray) {
        if (i < 0 || i >= anArray.length || j < 0 || j >= anArray.length) {
            return false; // выход за пределы массива
        }
        int temp = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = temp; 
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
