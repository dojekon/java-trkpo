package lab2;

public class Lab2 {

    /*
     * Этот код ищет минимальное число из трех целых чисел (a, b, c).
     * Он проверяет, какое из трех чисел (a, b, c) является наименьшим.
    */
    public static int min(int a, int b, int c) {
        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(min(3, 2, 1)); // 1
    }

}
