package Lab6;

interface Calculator {
    int sum (int x, int y);    
}

public class Lab6 implements Calculator {
    public int sum(int x, int y) {
        long result = ((long) x) + y;
        if (result > Integer.MAX_VALUE) {
            throw new ArithmeticException("Integer overflow");
        } else if (result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Integer underflow");
        } else return (int) result;
    }
}
