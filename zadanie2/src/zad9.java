import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        liczba = Math.abs(liczba);

        int sumaCyfr = 0;
        int sumaParzyste = 0, liczbaParzyste = 0;
        int sumaNieparzyste = 0, liczbaNieparzyste = 0;

        int temp = liczba;

        if (liczba == 0) {
            sumaCyfr = 0;
            liczbaParzyste = 1;
        } else {
            while (temp > 0) {
                int cyfra = temp % 10;
                sumaCyfr += cyfra;

                if (cyfra % 2 == 0) {
                    sumaParzyste += cyfra;
                    liczbaParzyste++;
                } else {
                    sumaNieparzyste += cyfra;
                    liczbaNieparzyste++;
                }

                temp /= 10;
            }
        }

        double sredniaParzyste = liczbaParzyste > 0 ? (double) sumaParzyste / liczbaParzyste : 0;
        double sredniaNieparzyste = liczbaNieparzyste > 0 ? (double) sumaNieparzyste / liczbaNieparzyste : 0;

        System.out.println("Suma cyfr: " + sumaCyfr);

        if (liczbaParzyste == 0) {
            System.out.println("Brak cyfr parzystych – średnia nieokreślona.");
        } else {
            System.out.printf("Średnia cyfr parzystych: %.2f%n", sredniaParzyste);
        }

        if (liczbaNieparzyste == 0) {
            System.out.println("Brak cyfr nieparzystych – średnia nieokreślona.");
        } else {
            System.out.printf("Średnia cyfr nieparzystych: %.2f%n", sredniaNieparzyste);
        }

        if (sredniaNieparzyste == 0) {
            System.out.println("Nie można obliczyć stosunku – brak cyfr nieparzystych.");
        } else {
            double stosunek = sredniaParzyste / sredniaNieparzyste;
            System.out.printf("Stosunek średniej parzystych do nieparzystych: %.2f%n", stosunek);
        }

        scanner.close();
    }
}
