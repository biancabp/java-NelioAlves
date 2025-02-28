import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos alunos serao digitados? ");
        int n  = sc.nextInt();

        String[] nome = new String[n];
        double[] primeiroSem = new double[n];
        double[] segundoSem = new double[n];

        String aprovados = "";

        for (int i=0; i<n; i++){
            System.out.println("Digite nome, primeira e segunda nota do" + (i + 1) + "o aluno:");
            nome[i] = sc.next();
            primeiroSem[i] = sc.nextDouble();
            segundoSem[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i=0; i<n; i++){
            double media = (primeiroSem[i] + segundoSem[i])/2;
            if (media>=6){
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}