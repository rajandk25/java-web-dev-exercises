package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int numberOfCredits, double gpa) {
        this.name = name;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getGradeLevel(int numberOfCredits) {

        if (numberOfCredits >=0 && numberOfCredits <= 29) {
            return "Freshman";
        } else if (numberOfCredits >= 30 && numberOfCredits <= 59) {
            return "Sophomore";
        } else if (numberOfCredits >= 60 && numberOfCredits <= 89) {
            return "Junior";
        } else {
            return "Senior";
        }

    }

    public void addGrade(int credits, double numericalGrade) {
        double currentQualityScore = gpa * numberOfCredits;
        double qualityScore = numericalGrade * credits;
        double newQualityScore = currentQualityScore + qualityScore;

        numberOfCredits = numberOfCredits + credits;
        gpa = newQualityScore / numberOfCredits;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }
}