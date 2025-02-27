package application;

import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++){
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/ vect.length;

        System.out.printf("Average price: %.2f%n", avg);

        sc.close();
    }
}