import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student x;
        x = new Student();

        x.name = sc.next();
        x.firstGrade = sc.nextDouble();
        x.secondGrade = sc.nextDouble();
        x.thirdGrade = sc.nextDouble();

        System.out.println(x);
        if (x.isAproved() == true){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + x.missingPoints() + " POINTS");

        }
    }
}
