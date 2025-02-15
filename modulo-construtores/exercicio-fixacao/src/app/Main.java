package app;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Conta conta;
        System.out.print("Enter account number: ");
        int contaId = sc.nextInt();
        System.out.print("Enter account holder: ");
        String titular = sc.next();
        System.out.print("Is there na initial deposit (y/n)? ");
        char initial = sc.next().charAt(0);
        double deposito;
        if (initial == 'y'){
            System.out.print("Enter initial deposit value: ");
            deposito = sc.nextDouble();
        } else {
            deposito = 0;
        }
        conta = new Conta(contaId, titular, deposito);

        System.out.println("Account data:");
        System.out.println(conta);
        sc.nextLine();

        System.out.print("Enter a deposit value: ");
        deposito = sc.nextDouble();
        conta.depositar(deposito);
        System.out.println(conta);

        System.out.print("Enter a withdraw value: ");
        deposito = sc.nextDouble();
        conta.retirar(deposito);
        System.out.println(conta);
    }
}
