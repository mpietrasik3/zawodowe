import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ciąg znaków: ");
        String tekst = scanner.nextLine();

        if (tekst.isEmpty()) {
            System.out.println("Nie podano żadnego tekstu!");
            return;
        }

        char ostatniZnak = tekst.charAt(tekst.length() - 1);

        int licznik = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == ostatniZnak) {
                licznik++;
            }
        }

        System.out.println("Ostatni znak to: '" + ostatniZnak + "'");
        System.out.println("Występuje on " + licznik + " razy w podanym ciągu.");
    }
}
