public class zad12 {

    public static int strToInt(String str) {
        if (str == null || str.isEmpty()) return 0;
        str = str.trim();
        int sign = 1;
        int index = 0;
        if (str.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (str.charAt(0) == '+') {
            index++;
        }

        long result = 0;
        while (index < str.length()) {
            char c = str.charAt(index);
            if (c >= '0' && c <= '9') {
                result = result * 10 + (c - '0');
            } else {
                if (c == 'e') {
                    index++;
                    long exp = 0;
                    while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                        exp = exp * 10 + (str.charAt(index) - '0');
                        index++;
                    }
                    result *= (long) Math.pow(10, exp);
                }
                break;
            }
            index++;
        }

        return (int)(sign * result);
    }

    public static int strFindAndCount(String gdzie, String co) {
        if (gdzie == null || co == null || co.isEmpty()) return 0;
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

    public static boolean czyLiczba(String str) {
        return strToInt(str) != 0 || str.equals("0");
    }

    public static void main(String[] args) {

        String[] zadania = {"mamla", " mama ", "+12", "0001", "991-234-3",
                "-12e5", "-12e-5", "+zonmakm", "ax2", "amakotma"};

        String fraza = "ma";

        int sumaLiczb = 0;
        StringBuilder nieLiczbowe = new StringBuilder();
        int liczbaWystapienKomorki = 0;

        for (String komorka : zadania) {
            int wartosc = strToInt(komorka);
            if (czyLiczba(komorka)) {
                sumaLiczb += wartosc;
            } else {
                nieLiczbowe.append(komorka);
                liczbaWystapienKomorki += strFindAndCount(komorka, fraza);
            }
        }

        String lacznyNieLiczbowe = nieLiczbowe.toString();
        int liczbaWystapienLancuch = strFindAndCount(lacznyNieLiczbowe, fraza);

        double stosunek = (liczbaWystapienLancuch == 0) ? 0.0 :
                (double) liczbaWystapienKomorki / liczbaWystapienLancuch;

        System.out.println("Pkt. 1: " + sumaLiczb);
        System.out.println("Pkt. 2: " + lacznyNieLiczbowe);
        System.out.println("Pkt. 3: " + liczbaWystapienKomorki);
        System.out.println("Pkt. 4: " + liczbaWystapienLancuch);
        System.out.printf("Pkt. 5: %.6f\n", stosunek);
    }
}
