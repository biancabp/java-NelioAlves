import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        double maior=0;
        int posicao = 0;

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        for (int i=0; i<n; i++){
            if (maior<numeros[i]){
                maior = numeros[i];
                posicao = i;
            }
        }

        System.out.print("MAIOR VALOR = " + maior);
        System.out.print("\nPOSICAO DO MAIOR VALOR = " + posicao);


    sc.close();
    }
}