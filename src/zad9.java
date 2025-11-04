import java.util.ArrayList;

public class zad9 {

    public static String[] podzielNaSlowa(String tekst) {
        if (tekst == null || tekst.isEmpty()) {
            return new String[0];
        }

        ArrayList<String> slowa = new ArrayList<>();
        StringBuilder slowo = new StringBuilder();

        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);

            if (Character.isWhitespace(c)) {
                if (!slowo.isEmpty()) {
                    slowa.add(slowo.toString());
                    slowo.setLength(0);
                }
            } else {
                slowo.append(c);
            }
        }

        if (!slowo.isEmpty()) {
            slowa.add(slowo.toString());
        }

        return slowa.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String tekst1 = "Ala ma kota";
        String tekst2 = "   To  jest  test   ";
        String tekst3 = "\tKoty\nlubią\tmleko ";
        String tekst4 = "";

        System.out.println("Tekst 1: " + tekst1);
        wypiszTablice(podzielNaSlowa(tekst1));

        System.out.println("\nTekst 2: " + tekst2);
        wypiszTablice(podzielNaSlowa(tekst2));

        System.out.println("\nTekst 3: " + tekst3);
        wypiszTablice(podzielNaSlowa(tekst3));

        System.out.println("\nTekst 4: \"" + tekst4 + "\"");
        wypiszTablice(podzielNaSlowa(tekst4));
    }

    public static void wypiszTablice(String[] tab) {
        System.out.print("Słowa (" + tab.length + "): ");
        for (String s : tab) {
            System.out.print("[" + s + "] ");
        }
        System.out.println();
    }
}
