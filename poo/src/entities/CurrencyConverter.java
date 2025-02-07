package entities;

public class CurrencyConverter {
    public static double IOP = 0.06;

    public static double calculateTotalInReais(double dollarPrice, double amount){
      return (amount * dollarPrice)  + (amount * dollarPrice) * IOP;
    }
}
