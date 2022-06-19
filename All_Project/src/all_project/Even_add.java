
package all_project;

import java.util.Scanner;

public class Even_add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the Positive number: ");
        num = input.nextInt();
        
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
