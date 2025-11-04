public class zad15 {

    public static int[] HTMLColor2RGB(String color) {
        if (color == null || !color.matches("#[0-9a-fA-F]{6}")) {
            throw new IllegalArgumentException("Niepoprawny format koloru! Oczekiwano #RRGGBB");
        }

        int r = Integer.parseInt(color.substring(1, 3), 16);
        int g = Integer.parseInt(color.substring(3, 5), 16);
        int b = Integer.parseInt(color.substring(5, 7), 16);

        return new int[]{r, g, b};
    }

    public static void main(String[] args) {
        int[] rgb1 = HTMLColor2RGB("#FF0050");
        System.out.println("R: " + rgb1[0] + ", G: " + rgb1[1] + ", B: " + rgb1[2]); // 255, 0, 80

        int[] rgb2 = HTMLColor2RGB("#001020");
        System.out.println("R: " + rgb2[0] + ", G: " + rgb2[1] + ", B: " + rgb2[2]); // 0, 16, 32
    }
}
