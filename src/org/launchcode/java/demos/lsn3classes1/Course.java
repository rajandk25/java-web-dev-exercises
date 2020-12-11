package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {

    private int creditsHours;
    private String name;
    private ArrayList <Student> students = new ArrayList<Student>();

    public Course(int creditsHours, String name){
        this.creditsHours = creditsHours;
        this.name = name;
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public ArrayList <Student> getStudents(){
        return this.students;
    }

    public int getCreditsHours() {
        return creditsHours;
    }

    public void setCreditsHours(int creditsHours) {
        this.creditsHours = creditsHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "creditsHours=" + creditsHours +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return creditsHours == course.creditsHours &&
                Objects.equals(name, course.name) &&
                Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditsHours, name, students);
    }
}
