public class zad6 {

    public static int strToInt(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int i = 0;
        int znak = 1;
        long wynik = 0;

        if (str.charAt(i) == '-') {
            znak = -1;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }


        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            wynik = wynik * 10 + (str.charAt(i) - '0');
            i++;
        }
        if (i < str.length() && (str.charAt(i) == 'e' || str.charAt(i) == 'E')) {
            i++;
            boolean ujemnyWykladnik = false;
            if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                ujemnyWykladnik = (str.charAt(i) == '-');
                i++;
            }

            int wykladnik = 0;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                wykladnik = wykladnik * 10 + (str.charAt(i) - '0');
                i++;
            }


            if (!ujemnyWykladnik) {
                wynik = wynik * (long) Math.pow(10, wykladnik);
            }
        }
        wynik = wynik * znak;

        if (wynik > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (wynik < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) wynik;
    }

    public static void main(String[] args) {
        System.out.println("strToInt(\"-13krowa\") = " + strToInt("-13krowa"));
        System.out.println("strToInt(\"+12\") = " + strToInt("+12"));
        System.out.println("strToInt(\"0001\") = " + strToInt("0001"));
        System.out.println("strToInt(\"991-234-23\") = " + strToInt("991-234-23"));
        System.out.println("strToInt(\"+zonk\") = " + strToInt("+zonk"));
        System.out.println("strToInt(\"\") = " + strToInt(""));
        System.out.println("strToInt(\"-12e5\") = " + strToInt("-12e5"));
        System.out.println("strToInt(\"-12e-5\") = " + strToInt("-12e-5"));
    }
}
