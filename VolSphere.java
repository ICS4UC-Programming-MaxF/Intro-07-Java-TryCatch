/**
* This Program calculates the volume of a sphere based on user input for the radius.
* It handles invalid inputs and ensures that the radius is a positive number.
* @author  MF-ROB
* @version 1.0
* @since   2026-14-09
*/
// Java Imports
import java.util.InputMismatchException;
import java.util.Scanner;

// Class Declaration
public class VolSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Asks for user input of radius
        System.out.print("Enter the radius of the sphere in feet: ");

        try {
            double radius = sc.nextDouble(); // Read user input for radius

            if (radius < 0) {
                // If the users number is a negative number, print an error message
                System.out.println("Error: Radius cannot be negative.");
            } else if (radius == 0) {
                // If the users number is 0, print the volume as 0.0
                System.out.println("The volume of the sphere is: 0.0 feet cubed.");
            } else {
                // the calculator for the volume of a sphere is (4/3) * π * r^3, where r is the radius of the sphere
                double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                volume = Math.round(volume * 1000.0) / 1000.0;
                System.out.println("The volume of the sphere is: " + volume + " feet cubed."); // Print the volume of the sphere rounded to 3 decimal places
            }
        } catch (InputMismatchException e) { // catches if the user didn't enter a valid value, print an error message
            System.out.println("Error: Please enter a valid numeric value for the radius.");
        } finally {
            sc.close(); // this line closes the scanner to prevent resource leaks
        }
    }
}