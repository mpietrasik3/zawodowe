public class zad2 {

    public static long fibonacciIteracyjny(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;

        long a = 1;
        long b = 2;
        long c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static long fibonacciRekurencyjny(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        return fibonacciRekurencyjny(n - 1) + fibonacciRekurencyjny(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Fibonacci iteracyjny (" + n + ") = " + fibonacciIteracyjny(n));
        System.out.println("Fibonacci rekurencyjny (" + n + ") = " + fibonacciRekurencyjny(n));
    }
}
