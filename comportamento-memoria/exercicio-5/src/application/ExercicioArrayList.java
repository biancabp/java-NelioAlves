package application;

import entities.People;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioArrayList {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int media = 0;

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        People[] vect = new People[n];
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.printf("Nome: ");
            String name = sc.next();
            System.out.printf("Idade: ");
            int idade = sc.nextInt();
            System.out.printf("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new People(name, idade, altura);

            soma += altura;

            if (idade < 16) {
                media++;
                nomes.add(name);
            }
        }

        double mediaAltura = soma / n;
        double percentual = ((double) media / n) * 100;

        System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", percentual);
        System.out.println("Nomes das pessoas com menos de 16 anos: " + nomes);

        sc.close();
    }
}