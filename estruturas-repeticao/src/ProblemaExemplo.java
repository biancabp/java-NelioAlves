import java.util.Scanner;

public class ProblemaExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char s;
        double f, c;
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            c = sc.nextDouble();
            f = (9 * c)/5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", f);
            System.out.print("Deseja repetir (s/n)?");
            s = sc.next().charAt(0);
        } while (s == 's');
    }
}
