import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, div, t;
        N = sc.nextInt();

        for (int i=1; i<N; i++){
            t = N - i;
            div = N / t;
            System.out.println(div);
        }
    }
}
