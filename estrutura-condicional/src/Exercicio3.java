import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        String teste = (b % a == 0)? "Sao Multiplos": "Nao sao Multiplos";

        System.out.println(teste);
    }
}
