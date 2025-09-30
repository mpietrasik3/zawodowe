import java.util.Scanner;
import java.util.Random;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int wylosowana = rand.nextInt(100) + 1; // losuje liczbę z zakresu 1–100
        int proba;

        System.out.println("Zgadnij liczbę z zakresu 1 do 100:");

        while (true) {
            System.out.print("Podaj liczbę: ");
            proba = scanner.nextInt();

            if (proba < 1 || proba > 100) {
                System.out.println("Podaj liczbę z zakresu 1–100.");
                continue;
            }

            if (proba > wylosowana) {
                System.out.println("Podałeś za dużą wartość.");
            } else if (proba < wylosowana) {
                System.out.println("Podałeś za małą wartość.");
            } else {
                System.out.println("Gratulacje! Odgadłeś liczbę.");
                break;
            }
        }

        scanner.close();
    }
}
