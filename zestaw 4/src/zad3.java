import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ciąg znaków: ");
        String tekst = scanner.nextLine();

        if (tekst.isEmpty()) {
            System.out.println("Nie podano żadnego tekstu!");
            return;
        }
        String oczyszczony = tekst.replaceAll("\\s+", "").toLowerCase();

        String odwrocony = new StringBuilder(oczyszczony).reverse().toString();

        if (oczyszczony.equals(odwrocony)) {
            System.out.println("Ciąg \"" + tekst + "\" jest palindromem.");
        } else {
            System.out.println("Ciąg \"" + tekst + "\" nie jest palindromem.");
        }
    }
}
