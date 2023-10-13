package lt.gerasimovas;

public class Factorial {
    public static void main(String[] args) {
        int x = getFactorial(6);
        System.out.println(x);
    }

    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }
}
