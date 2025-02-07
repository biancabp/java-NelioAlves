package entities;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double finalGrade(){
        return firstGrade + secondGrade + thirdGrade;
    }
    public boolean isAproved() {
        if (finalGrade() >= 60) {
            return true; // Aluno aprovado
        } else {
            return false; // Aluno reprovado
        }
    }

    public double missingPoints(){
        return 60 - finalGrade();
    }

    public String toString(){
        return "FINAL GRADE = "
                + finalGrade();
    }

}
