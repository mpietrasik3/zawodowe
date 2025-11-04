public class zad5 {

    public static boolean startsWith(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("startsWith(\"Alibaba\", \"Ali\") = " + startsWith("Alibaba", "Ali"));
        System.out.println("startsWith(\"Alibaba\", \"Alibaba\") = " + startsWith("Alibaba", "Alibaba"));
        System.out.println("startsWith(\"Kot\", \"Pies\") = " + startsWith("Kot", "Pies"));
        System.out.println("startsWith(\"Kot\", \"Ko\") = " + startsWith("Kot", "Ko"));
        System.out.println("startsWith(\"Kot\", \"Kotek\") = " + startsWith("Kot", "Kotek"));
    }
}
