import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();
        String teste;

        teste = (a >= 0) ? "NAO NEGATIVO": "NEGATIVO";

        System.out.println(teste);
    }
}
