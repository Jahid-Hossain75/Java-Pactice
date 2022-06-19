
package all_project;

import java.util.Scanner;

public class Triangel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base: ");
        double base = input.nextInt();
        
        System.out.print("Enter the height: ");
        double height = input.nextInt();
        
        double area = 3.1416 * base * height;
        System.out.println("Triangle: "+area);
    }
}
