
package all_project;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        double radius = input.nextInt();
        
        double Area = 3.1416 * radius * radius;
        System.out.println("Circle: "+Area);
    }
}
