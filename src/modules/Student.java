package modules;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Student extends Person {
    private static int _id = 1;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private int studentId;
    private final List<Integer> grades;
    public Student(String name,  String surname, int age, Boolean gender, ArrayList<Integer> grades) {
        super(name, surname, age,  gender);
        this.grades = grades;
        this.studentId = _id++;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double totalGPA = 0.0;
        for (int grade : grades) {
            double normalizedGPA = (grade / 100.0) * 4.0;
            totalGPA += normalizedGPA;
        }
        return totalGPA / grades.size();
    }
    @Override
    public String toString() {
        String message = super.toString() + " I am a student, my ID is " + this.getStudentId();;
        return message;
    }

}