import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Liczba musi być dodatnia!");
        } else {
            int potega = 1;

            while (potega <= n) {
                System.out.println(potega);
                potega *= 2;
            }
        }

        scanner.close();
    }
}
