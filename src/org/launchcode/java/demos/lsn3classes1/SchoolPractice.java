package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student student = new Student("Lee", 1, 4);
        //student.addGrade(1, 4.0);
        System.out.println("Grade: " + student.getGradeLevel(5));
        System.out.println(student);
    }
}
