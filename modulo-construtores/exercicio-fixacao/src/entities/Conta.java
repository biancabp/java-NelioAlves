package entities;

public class Conta {
    private int id;
    private String titular;
    private double deposito;

    public Conta(int id, String titular, double deposito) {
        this.id = id;
        this.titular = titular;
        this.deposito = deposito;
    }

    public Conta(int id, String titular) {
        this.id = id;
        this.titular = titular;
    }

    public int getId() {        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getDeposito() {
        return deposito;
    }

    public void depositar(double deposito){
        this.deposito+=deposito;
    }

    public void retirar(double deposito){
        this.deposito -= deposito + 5;
    }

    public String toString(){
        return "Account "
                + id
                + " Holder: "
                + titular
                + " Balance: "
                +  String.format("$ %.2f", deposito);
    }
}
