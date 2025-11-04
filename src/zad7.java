public class zad7 {

    public static int strfind(String gdzie, String co) {
        if (gdzie == null || co == null) return -1;
        if (co.isEmpty()) return 0;
        if (gdzie.length() < co.length()) return -1;

        for (int i = 0; i <= gdzie.length() - co.length(); i++) {
            boolean znaleziono = true;

            for (int j = 0; j < co.length(); j++) {
                if (gdzie.charAt(i + j) != co.charAt(j)) {
                    znaleziono = false;
                    break;
                }
            }

            if (znaleziono) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("strfind(\"Ala ma kota\", \"ma\") = " + strfind("Ala ma kota", "ma"));
        System.out.println("strfind(\"Ala ma kota\", \"Ala ma kota\") = " + strfind("Ala ma kota", "Ala ma kota"));
        System.out.println("strfind(\"Ala ma kota\", \"\") = " + strfind("Ala ma kota", ""));
        System.out.println("strfind(\"Pies\", \"jakis napis\") = " + strfind("Pies", "jakis napis"));
        System.out.println("strfind(\"Ala ma kota\", \"pies\") = " + strfind("Ala ma kota", "pies"));
    }
}
