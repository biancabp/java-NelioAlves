import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, total = 0;

        salario = sc.nextDouble();

        if (salario > 2000.0) {
            if (salario <= 3000.0) {
                // Calcula 8% para a faixa acima de R$ 2000.00
                total += (salario - 2000.0) * 0.08;
            } else if (salario <= 4500.0) {
                // Calcula 8% para os R$ 1000.00 da faixa de R$ 2000.01 até R$ 3000.00
                total += 1000.0 * 0.08;
                // Calcula 18% para a parte acima de R$ 3000.00 até o salário
                total += (salario - 3000.0) * 0.18;
            } else {
                // Calcula 8% para os R$ 1000.00 da faixa de R$ 2000.01 até R$ 3000.00
                total += 1000.0 * 0.08;
                // Calcula 18% para os R$ 1500.00 da faixa de R$ 3000.01 até R$ 4500.00
                total += 1500.0 * 0.18;
                // Calcula 28% para a parte acima de R$ 4500.00
                total += (salario - 4500.0) * 0.28;
            }
        } else {
            System.out.println("Isento");
            sc.close();
            return;
        }

        System.out.printf("R$ %.2f%n", total);

        sc.close();
    }
}
