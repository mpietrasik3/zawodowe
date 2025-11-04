public class zad1 {

    public static long silniaIteracyjna(int n) {
        long wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static long silniaRekurencyjna(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * silniaRekurencyjna(n - 1);
        }
    }

    public static void main(String[] args) {
        int liczba = 5;

        System.out.println("Silnia iteracyjnie (" + liczba + ") = " + silniaIteracyjna(liczba));
        System.out.println("Silnia rekurencyjnie (" + liczba + ") = " + silniaRekurencyjna(liczba));
    }
}
