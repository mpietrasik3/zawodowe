import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczba;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Podawaj liczby całkowite (0 kończy wprowadzanie):");

        boolean podanoDane = false;

        while (true) {
            liczba = scanner.nextInt();

            if (liczba == 0) {
                break;
            }

            if (liczba < min) {
                min = liczba;
            }

            if (liczba > max) {
                max = liczba;
            }

            podanoDane = true;
        }

        if (!podanoDane) {
            System.out.println("Nie podano żadnych danych.");
        } else {
            int suma = min + max;
            double srednia = suma / 2.0;

            System.out.println("Suma min i max: " + suma);
            System.out.println("Średnia min i max: " + srednia);
        }

        scanner.close();
    }
}

