import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double mediaMulher = 0;
        int homens = 0, mulher = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa (M/F): ");
            genero[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            if (altura[i] < menor) {
                menor = altura[i];
            }
            if (altura[i] > maior) {
                maior = altura[i];
            }

            if (genero[i] == 'F') {
                mulher++;
                mediaMulher += altura[i];
            } else if (genero[i] == 'M') {
                homens++;
            }
        }

        if (mulher > 0) {
            mediaMulher /= mulher;
        } else {
            mediaMulher = 0;
        }

        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulher);
        System.out.println("Numero de homens = " + homens);

        sc.close();
    }
}