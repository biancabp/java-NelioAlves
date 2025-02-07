import java.util.Scanner;

public class ProblemExemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        float valor=50;

        a = sc.nextInt();

        if(a>100){
            valor += ((a - 100) * 2);
        }

        System.out.printf("Valor a pagar: R$ %.2f", valor);
    }
}
