import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();

        int suma = 0;

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            if (Character.isDigit(znak)) {
                int cyfra = Character.getNumericValue(znak);
                suma += cyfra;
            }
        }

        System.out.println("Suma cyfr w tekście wynosi: " + suma);
    }
}
