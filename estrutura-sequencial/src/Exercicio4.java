import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id, horas;
        double valor, salario;
        id = sc.nextInt();;
        sc.nextLine();
        horas = sc.nextInt();
        sc.nextLine();
        valor = sc.nextDouble();
        salario = horas * valor;

        System.out.printf("NUMBER = %d\n", id);
        System.out.printf("SALARY = $ %.2f", salario);

        sc.close();
    }
}
