import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wysokość choinki (n > 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Wysokość musi być większa od 0.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}

