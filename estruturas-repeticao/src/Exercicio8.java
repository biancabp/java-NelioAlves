import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, fat = 1;
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            fat = fat * i; // Multiplica o acumulador pelo valor atual de i
        }
        System.out.println(fat); // Imprime o resultado final
    }
}
