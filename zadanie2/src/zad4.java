import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int liczba;

        System.out.println("Podawaj liczby całkowite (0 kończy program):");

        do {
            liczba = scanner.nextInt();
            suma += liczba;
        } while (liczba != 0);

        System.out.println("Suma podanych liczb wynosi: " + suma);

        scanner.close();
    }
}
