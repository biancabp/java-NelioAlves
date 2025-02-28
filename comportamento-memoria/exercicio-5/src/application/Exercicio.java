package application;

import entities.People;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int contador = 0;

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        People[] vect = new People[n];
        String[] pessoa16 = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.printf("Nome: ");
            String name = sc.next();
            System.out.printf("Idade: ");
            int idade = sc.nextInt();
            System.out.printf("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            vect[i] = new People(name, idade, altura);

            soma += altura;

            if (idade > 16) {
                pessoa16[contador] = name;
                contador++;
            }
        }

        double mediaAltura = soma / n; // Média das alturas

        System.out.println("Altura média: " + mediaAltura);
        System.out.println("Pessoas com mais de 16 anos: " + contador);

        // Exibe os nomes das pessoas com idade > 16
        System.out.println("Nomes das pessoas com mais de 16 anos:");
        for (int i = 0; i < contador; i++) {
            System.out.println(pessoa16[i]);
        }

        sc.close(); // Fechar o Scanner
    }
}