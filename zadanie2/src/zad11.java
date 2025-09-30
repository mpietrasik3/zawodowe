import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą większą niż 1: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Liczba musi być większa niż 1.");
        } else {
            boolean jestPierwsza = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    jestPierwsza = false;
                    break;
                }
            }

            if (jestPierwsza) {
                System.out.println(n + " jest liczbą pierwszą.");
            } else {
                System.out.println(n + " nie jest liczbą pierwszą.");
            }
        }

        scanner.close();
    }
}

