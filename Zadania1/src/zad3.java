import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                System.out.print("Podaj wagę w kilogramach: ");
                double waga = scanner.nextDouble();

                System.out.print("Podaj wzrost w metrach (np. 1.75): ");
                double wzrost = scanner.nextDouble();

                double bmi = waga / (wzrost * wzrost);

                System.out.printf("Twoje BMI: %.2f\n", bmi);

                if (bmi < 18.5) {
                    System.out.println("Niedowaga");
                } else if (bmi <= 24.9) {
                    System.out.println("Waga prawidłowa");
                } else {
                    System.out.println("Nadwaga");
                }

                scanner.close();
            }
        }

