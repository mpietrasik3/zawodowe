public class zad3 {


    public static int strpos(String text, char z) {
        // przechodzimy po wszystkich znakach łańcucha
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == z) { // sprawdzamy, czy znak pasuje
                return i; // zwracamy pozycję, jeśli znaleziono
            }
        }
        // jeśli znak nie został znaleziony, zwracamy -1
        return -1;
    }


    public static void main(String[] args) {
        String napis = "Ala ma kota";

        System.out.println("strpos(\"" + napis + "\", 'm') = " + strpos(napis, 'm'));
        System.out.println("strpos(\"" + napis + "\", 'a') = " + strpos(napis, 'a'));
        System.out.println("strpos(\"" + napis + "\", 'z') = " + strpos(napis, 'z'));
    }
}
