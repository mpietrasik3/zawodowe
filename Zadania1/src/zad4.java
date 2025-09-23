import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                // Pobieranie dochodu od użytkownika
                System.out.print("Podaj swój roczny dochód (PLN): ");
                double dochod = scanner.nextDouble();

                double podatek;

                if (dochod <= 85528) {
                    podatek = dochod * 0.18 - 556.02;
                } else {
                    podatek = 14839.02 + (dochod - 85528) * 0.32;
                }

                // Jeżeli podatek wyjdzie ujemny (np. przy bardzo małych dochodach), ustaw na 0
                if (podatek < 0) {
                    podatek = 0;
                }

                // Wyświetlenie podatku z dwoma miejscami po przecinku
                System.out.printf("Należny podatek: %.2f zł\n", podatek);

                scanner.close();
            }
        }