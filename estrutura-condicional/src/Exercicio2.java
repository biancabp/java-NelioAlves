import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();
        String teste;

        teste = (a % 2 == 0)? "PAR": "IMPAR";

        System.out.println(teste);
    }
}
