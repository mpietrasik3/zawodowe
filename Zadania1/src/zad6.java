import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
    double d = scan.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
    double e = scan.nextDouble();
        System.out.print("Podaj znak: ");
    char operacja = scan.next().charAt(0);
        switch (operacja) {
        case '+': System.out.println(d + e); break;
        case '-': System.out.println(d - e); break;
        case '*': System.out.println(d * e); break;
        case '/':
            if (e == 0) System.out.println("Błąd: dzielenie przez zero!");
            else System.out.println(d / e);
            break;
        default: System.out.println("Błędny symbol działania!");
    }
}
}
