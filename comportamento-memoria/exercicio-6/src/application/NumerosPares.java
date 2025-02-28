package application;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        int pares = 0;

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i=0; i<n; i++){
            if (numeros[i]%2==0){
                pares++;
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println("\nQUANTIDADE DE PARES = " + pares);

        sc.close();
    }
}