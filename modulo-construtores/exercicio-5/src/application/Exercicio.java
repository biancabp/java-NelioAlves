package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        People vect[] = new People[n];
        double soma =0;

        for (int i=0; i<n; i++){
            System.out.println("Dados da "+ (i + 1) + "a pessoa: ");
            System.out.printf("Nome: ");
            String name = sc.next();
            System.out.printf("Idade: ");
            int idade = sc.nextInt();
            System.out.printf("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            vect[i] = new People(name, idade, altura);

            soma = altura + vect[i].getAltura();
        }

        double media = soma/n;

        System.out.println(media);

    }
}