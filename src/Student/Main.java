//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>
package src.Student;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        students.put("Carlos", new Student("Carlos", 100));
        students.put("Juan", new Student("Juan", 90));
        students.put("Pedro", new Student("Pedro", 80));
        students.put("Maria", new Student("Maria", 70));
        students.put("Ana", new Student("Ana", 60));

        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue().getName() + " " + entry.getValue().getGrade());
        }

        System.out.println("\nIncreasing grades by 10\n");

        increaseGrades(students);

        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue().getName() + " " + entry.getValue().getGrade());
        }
    }

    public static void increaseGrades(Map<String, Student> students) {
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            entry.getValue().setGrade(entry.getValue().getGrade() + 10);
        }
    }


}
