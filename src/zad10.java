public class zad10 {

    public static int strFindAndCount(String gdzie, String co) {
        if (gdzie == null || co == null || co.isEmpty()) {
            return 0;
        }

        int licznik = 0;
        int index = 0;

        while (index <= gdzie.length() - co.length()) {
            boolean znaleziono = true;

            for (int j = 0; j < co.length(); j++) {
                if (gdzie.charAt(index + j) != co.charAt(j)) {
                    znaleziono = false;
                    break;
                }
            }

            if (znaleziono) {
                licznik++;
                index += 1;
            } else {
                index++;
            }
        }

        return licznik;
    }

    public static void main(String[] args) {
        System.out.println("strFindAndCount(\"Ala ma kota\", \"ma\") = " + strFindAndCount("Ala ma kota", "ma"));
        System.out.println("strFindAndCount(\"mama ma kota\", \"ma\") = " + strFindAndCount("mama ma kota", "ma"));
        System.out.println("strFindAndCount(\"Ala mmaa ma kota\", \"ma\") = " + strFindAndCount("Ala mmaa ma kota", "ma"));
        System.out.println("strFindAndCount(\"Ala ma kota\", \"Asia\") = " + strFindAndCount("Ala ma kota", "Asia"));
    }
}
