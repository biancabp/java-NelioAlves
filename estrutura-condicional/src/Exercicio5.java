import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id, qtd;
        double valor=0, total;

        id = sc.nextInt();
        qtd = sc.nextInt();

        switch (id){
            case 1: valor = 4;
            break;
            case 2: valor = 4.50;
            break;
            case 3: valor = 5;
            break;
            case 4: valor = 2;
            break;
            case 5: valor = 1.50;
            break;
            default:
                System.out.println("insira um valor válido");
                break;
        }

        total = valor * qtd;
        System.out.printf("Total: R$ %.2f", total);
    }
}
