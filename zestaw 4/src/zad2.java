import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ciąg znaków: ");
        String tekst = scanner.nextLine();

        if (tekst.isEmpty()) {
            System.out.println("Nie podano żadnego tekstu!");
            return;
        }

        String odwrocony = new StringBuilder(tekst).reverse().toString();

        System.out.println("Odwrócony ciąg: " + odwrocony);
    }
}
