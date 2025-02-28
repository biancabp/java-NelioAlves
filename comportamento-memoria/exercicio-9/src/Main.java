import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.printf("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double sum=0;

        for (int i=0; i<n; i++){
            System.out.printf("Digite um numero: ");
            vetor[i] = sc.nextDouble();

            sum += vetor[i];
        }

        double media = sum/n;
        System.out.printf("MEDIA DO VETOR = %.3f", media);

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
        for (int i=0; i<n; i++){
            if (vetor[i]<media){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}