package src.Student;//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        setName(name);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
