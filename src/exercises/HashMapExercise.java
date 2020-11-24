package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercise {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newStudentId;
        System.out.println("Enter your students (or ENTER to finish):");

        do {

            System.out.print("Id: ");
            newStudentId = input.nextInt();

            if (newStudentId > 0) {
                System.out.print("Name: ");
                String name = input.next();
                students.put(newStudentId, name);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(newStudentId < 0);
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());

        }
    }
}
