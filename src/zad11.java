public class zad11 {

    public static String strcut(String str, int start, int ile) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        if (start < 0) start = 0;
        if (ile < 0) ile = 0;
        if (start >= str.length()) return str;

        int end = start + ile;
        if (end > str.length()) end = str.length();

        String wynik = str.substring(0, start) + str.substring(end);
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println(strcut("Ala ma kota", 4, 3));  // "Ala kota"
        System.out.println(strcut("Ala ma kota", 0, 4));  // "ma kota"
        System.out.println(strcut("Ala ma kota", 0, 11)); // ""
        System.out.println(strcut("Ala ma kota", 5, 50)); // "Ala ma"
        System.out.println(strcut("Ala ma kota", 12, 3)); // "Ala ma kota" (start poza zakresem)
    }
}

