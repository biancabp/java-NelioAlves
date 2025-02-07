package entities;

public class Product {
   public String name;
   public double price;
   public int quant;

   public Product(String name, double price, int quant){
       this.name = name; this.price = price; this.quant = quant;
   }

   public double totalValue(){
       return quant*price;
   }

   public void addProducts(int quant){
       this.quant+=quant;
   }

   public void removeProduct(int quant){
       this.quant-=quant;
   }

   public String toString(){
       return name
               + ", $ "
               + String.format("%.2f", price)
               + ", "
               + quant
               + " units, Total: $"
               + totalValue();
   }
}
