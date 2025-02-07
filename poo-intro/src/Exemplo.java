import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int maximo = max(a, b, c);
        
        showResult(maximo);
    }
    
    public static int max(int x, int y, int z){
        int aux=0;
        if (x>y && x>z){
            aux = x;
        } else if (y>x && y>z) {
            aux = y;
        } else if (z>x && z>y) {
            aux = z;
        }
        return aux;
    }
    
    public static int showResult(int resultado){
        System.out.println(resultado);
    return resultado;
    }
}
