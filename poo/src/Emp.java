import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Emp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee dados;
        dados = new Employee();

        System.out.print("Name: ");
        dados.name = sc.next();
        System.out.print("Gross salary: ");
        dados.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        dados.tax = sc.nextDouble();

        System.out.println("Employee: " + dados);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        dados.increaseSalary(percentage);

        System.out.println("Updated data: " + dados);
    }
}
