import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code, c2, number, n2;
        double valor, v2, total;

        code = sc.nextInt();
        number = sc.nextInt();
        valor = sc.nextDouble();
        sc.nextLine();

        c2 = sc.nextInt();
        n2 = sc.nextInt();
        v2 = sc.nextDouble();

        total = (number * valor + n2 * v2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        sc.close();
    }
}
