public class zad8 {

    public static int wordCount(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int liczbaSlow = 0;
        boolean wSlowie = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isWhitespace(c)) {
                wSlowie = false;
            } else {
                if (!wSlowie) {
                    liczbaSlow++;
                    wSlowie = true;
                }
            }
        }

        return liczbaSlow;
    }

    public static void main(String[] args) {
        System.out.println("wordCount(\"Ala ma kota\") = " + wordCount("Ala ma kota"));
        System.out.println("wordCount(\"   Ala   ma   kota   \") = " + wordCount("   Ala   ma   kota   "));
        System.out.println("wordCount(\"\") = " + wordCount(""));
        System.out.println("wordCount(\"\\tTo\\njest\\nprzykład!\\t\") = " + wordCount("\tTo\njest\nprzykład!\t"));
        System.out.println("wordCount(\"   \") = " + wordCount("   "));
    }
}
