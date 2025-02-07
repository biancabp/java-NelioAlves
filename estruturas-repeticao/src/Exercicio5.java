import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int n, in=0, out=0;
        x = sc.nextInt();
        for (int i=0; i<x; i++){
            n = sc.nextInt();
            if (n>=10 && n<=20){
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("%d in%n", in);
        System.out.printf("%d out", out);

        sc.close();
    }
}
