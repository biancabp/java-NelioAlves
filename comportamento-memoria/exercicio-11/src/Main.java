import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        int idades = 0;
        int acumulo = 0;

        for (int i=0; i<n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.printf("Nome: ");
            nome[i] = sc.next();
            System.out.printf("Idade: ");
            idade[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            if (idades<idade[i]){
                idades = idade[i];
                acumulo = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome[acumulo]);

        sc.close();
    }
}