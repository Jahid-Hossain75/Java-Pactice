
package all_project.Collage;

import java.util.Scanner;

public class SumOf_Serics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.print("Enter N value: ");
        num = input.nextInt();
        for(int i=1; i<=num; i++) {
          sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}
