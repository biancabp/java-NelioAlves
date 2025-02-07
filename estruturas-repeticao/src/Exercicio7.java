import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x, y;
        n = sc.nextInt();
        for (int i=0; i<n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            if (y != 0){
                double op = (double) x/y;
                System.out.println(op);
            } else {
                System.out.println("divisao impossivel");
            }
        }
    }
}
