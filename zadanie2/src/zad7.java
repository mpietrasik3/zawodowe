import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj znak wypełnienia: ");
        char znak = scanner.next().charAt(0);

        System.out.print("Podaj pozycję x (kolumna, od 1): ");
        int x = scanner.nextInt();

        System.out.print("Podaj pozycję y (wiersz, od 1): ");
        int y = scanner.nextInt();

        System.out.print("Podaj wysokość prostokąta (a): ");
        int a = scanner.nextInt();

        System.out.print("Podaj szerokość prostokąta (b): ");
        int b = scanner.nextInt();

        System.out.println();

        for (int i = 1; i < y; i++) {
            System.out.println();
        }

        for (int i = 0; i < a; i++) {
            for (int j = 1; j < x; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < b; j++) {
                System.out.print(znak);
            }

            System.out.println();
        }

        scanner.close();
    }
}

