import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        double a, b, c, media;
        for (int i=0; i<N; i++){
          a = sc.nextDouble();
          b = sc.nextDouble();
          c = sc.nextDouble();

          media = (a * 2 + b * 3 + c * 5)/10;
            System.out.printf("%.2d", media);
        }

        sc.close();
    }
}
