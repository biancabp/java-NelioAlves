package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int sum=0;
        int media;

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            sum += vect[i];
        }

        System.out.print("VALORES = ");
        for (int i=0; i<n; i++){
            System.out.print(vect[i] + " ");
        }

        System.out.println("SOMA = " + sum);
        media = sum/n;
        System.out.println("MEDIA = " + media);
    }
}