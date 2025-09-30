import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Liczba 0 ma nieskończenie wiele dzielników.");
        } else {
            int liczba = Math.abs(n);

            System.out.print("Dzielniki liczby " + n + " to: ");

            boolean pierwsza = true;
            for (int i = 1; i <= liczba; i++) {
                if (liczba % i == 0) {
                    if (!pierwsza) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    pierwsza = false;
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
