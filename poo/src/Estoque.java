import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quant = sc.nextInt();
        Product x = new Product(name, price, quant);

        System.out.print("Product data: ");
        System.out.println(x);

        System.out.print("Enter the number of products to be added in stock:");
        quant = sc.nextInt();
        x.addProducts(quant);
        System.out.print("Updated data: " + x);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quant = sc.nextInt();
        x.removeProduct(quant);
        System.out.println("Updated data: " + x);

        sc.close();
    }
}
