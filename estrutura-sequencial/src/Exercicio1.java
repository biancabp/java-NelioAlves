import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, soma;
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
        soma = a + b;

        System.out.printf("SOMA = %d\n", soma);

        sc.close();
    }
}
