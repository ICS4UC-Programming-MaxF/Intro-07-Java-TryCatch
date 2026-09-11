import java.util.InputMismatchException;
import java.util.Scanner;

public class VolSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere in feet: ");

        try {
            double radius = sc.nextDouble();

            if (radius < 0) {
                System.out.println("Error: Radius cannot be negative.");
            } else if (radius == 0) {
                System.out.println("The volume of the sphere is: 0.0");
            } else {
                double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                volume = Math.round(volume * 1000.0) / 1000.0;
                System.out.println("The volume of the sphere is: " + volume);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value for the radius.");
        } finally {
            sc.close();
        }
    }
}