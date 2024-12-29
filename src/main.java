import modules.*;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        File studentfile = new File("src/students.txt");
        File teacherfile = new File("src/teachers.txt");

        Scanner sc1 = new Scanner(studentfile);
        School school = new School();

        List<Student> students = new ArrayList<>();

        while (sc1.hasNext()) {
            String[] parts  = sc1.nextLine().split(" ");
            ArrayList<Integer> grades = new ArrayList<>();
            for (int i = 4; i < parts.length; i++) {
                grades.add(Integer.parseInt(parts[i]));
            }
            Boolean gender = parts[3].equals("Female");
            Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]), gender, grades);
            school.addMember(student);
        }
        sc1.close();

        sc1 = new Scanner(teacherfile);
        while (sc1.hasNext()) {
            String[] parts  = sc1.nextLine().split(" ");
            Boolean gender = parts[3].equals("Female");
            Teacher teacher = new Teacher(parts[0], parts[1], Integer.parseInt(parts[2]), gender, parts[4], Integer.parseInt(parts[5]), Integer.parseInt(parts[6]));
            school.addMember(teacher);
        }

        sc1.close();
        school.getMembers().forEach(System.out::println);

        System.out.println("\nChanged view:");

        school.giveRaiseToExperiencedTeachers(10, 60);
        school.getMembers().forEach(System.out::println);
    }
}