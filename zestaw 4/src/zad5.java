import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wyrażenie arytmetyczne: ");
        String wyrazenie = scanner.nextLine();

        int licznik = 0;

        for (int i = 0; i < wyrazenie.length(); i++) {
            char znak = wyrazenie.charAt(i);

            if (znak == '(') {
                licznik++;
            } else if (znak == ')') {
                licznik--;

                if (licznik < 0) {
                    System.out.println("Błędne sparowanie nawiasów");
                    return;
                }
            }
        }

        if (licznik == 0) {
            System.out.println("OK");
        } else {
            System.out.println("Błędne sparowanie nawiasów");
        }
    }
}
