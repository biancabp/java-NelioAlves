import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        for (int i=1; i<=x; i++){
            System.out.print(i + " ");
            System.out.print(i*i + " ");
            System.out.println(i*i*i);
        }
        
        sc.close();
    }
}
