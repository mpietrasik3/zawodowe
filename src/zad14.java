public class zad14 {

    public static boolean czyAnagram(String t1, String t2) {
        if (t1 == null || t2 == null) return false;

        int[] liczniki = new int[26];

        for (char c : t1.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                liczniki[c - 'a']++;
            }
        }

        for (char c : t2.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                liczniki[c - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (liczniki[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(czyAnagram("kolej", "olejk"));             // true
        System.out.println(czyAnagram("kolej", "kole"));              // false
        System.out.println(czyAnagram("kolej", "K O L E J"));         // true
        System.out.println(czyAnagram("Gregory House", "Huge ego, sorry")); // true
    }
}
