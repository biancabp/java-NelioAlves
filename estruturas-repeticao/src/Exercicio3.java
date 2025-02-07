import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code, a = 0, g = 0, d = 0;
        code = sc.nextInt();

        while (code != 4){
            switch (code){
                case 1: a += 1;
                break;
                case 2: g += 1;
                break;
                case 3: d += 1;
            }
            code = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", a);
        System.out.printf("Gasolina: %d%n", g);
        System.out.printf("Diesel: %d%n", d);

        sc.close();
    }
}
