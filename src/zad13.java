public class zad13 {

    public static String poprzestawiaj(String tekst, int[] kolejnosc) {
        if (tekst == null || kolejnosc == null) return "";

        char[] wynik = new char[tekst.length()];

        for (int i = 0; i < tekst.length(); i++) {
            if (i < kolejnosc.length && kolejnosc[i] >= 0 && kolejnosc[i] < tekst.length()) {
                wynik[kolejnosc[i]] = tekst.charAt(i);
            }
        }

        return new String(wynik);
    }

    public static void main(String[] args) {
        String tekst = "Egzamin";
        int[] kol = {0, 1, 4, 3, 2, 6, 5};

        String wynik = poprzestawiaj(tekst, kol);
        System.out.println(wynik);
    }
}
