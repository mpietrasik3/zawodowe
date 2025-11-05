import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj łańcuch znaków do zaszyfrowania: ");
        String tekst = scanner.nextLine();

        System.out.print("Podaj przesunięcie: ");
        int przesuniecie = scanner.nextInt();

        String zaszyfrowany = szyfrujCezara(tekst, przesuniecie);

        System.out.println("Zaszyfrowany tekst: " + zaszyfrowany);
    }

    public static String szyfrujCezara(String tekst, int przesuniecie) {
        StringBuilder wynik = new StringBuilder();

        przesuniecie = przesuniecie % 26;

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            if (znak == ' ') {
                wynik.append(' ');
            } else if (znak >= 'a' && znak <= 'z') {
                int nowaPozycja = (znak - 'a' + przesuniecie + 26) % 26;
                char nowaLitera = (char) ('a' + nowaPozycja);
                wynik.append(nowaLitera);
            } else {
                wynik.append(znak);
            }
        }

        return wynik.toString();
    }
}
