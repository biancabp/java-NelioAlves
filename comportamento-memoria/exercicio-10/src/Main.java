import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        int sum=0;
        int divisao=0;

        for (int i=0; i<n; i++){
            System.out.printf("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            if (vetor[i]%2==0){
             sum += vetor[i];
             divisao++;}
        }

        if (divisao==0){
            System.out.printf("NENHUM NUMERO PAR");
        } else {
            double media = ((double)sum/divisao);
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }
        sc.close();
    }
}