package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number of miles driven");
        double miles = input.nextDouble();
        System.out.println("What is the amount of gas used (in gallons)");
        double gallons = input.nextDouble();
        double milesPerGallon = miles/gallons;
        System.out.print("Miles per gallon are: " + milesPerGallon);

    }
}
