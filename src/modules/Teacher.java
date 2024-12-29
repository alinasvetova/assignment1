package modules;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private double salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void giveRaise(int per){
        this.salary *= ((double) (per + 100) / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " My subject is " + this.getSubject() + " and my salary is: " + this.getSalary();
    }
}