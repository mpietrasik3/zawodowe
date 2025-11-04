public class zad4 {

    public static String flipCase(String text) {
        StringBuilder wynik = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char znak = text.charAt(i);

            if (Character.isLowerCase(znak)) {
                wynik.append(Character.toUpperCase(znak));
            }
            else if (Character.isUpperCase(znak)) {
                wynik.append(Character.toLowerCase(znak));
            }
            else {
                wynik.append(znak);
            }
        }

        return wynik.toString();
    }

    public static void main(String[] args) {
        String napis = "Ala MA KoTa 123!";

        System.out.println("Oryginał: " + napis);
        System.out.println("Po flipCase: " + flipCase(napis));
        System.out.println("TEST");
    }
}
