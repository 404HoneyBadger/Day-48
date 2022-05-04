import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Enter anther number: ");
        int num2 = Integer.valueOf(scanner.nextLine());
    
        int addedNums = num1 + num2;
        int subNums = num1 - num2;
        int multNums = num1 * num2;
        int divNums = num1 / num2;
        int modNums = num1 % num2;
        System.out.println(num1 + " + " + num2 + " = " + addedNums );
        System.out.println(num1 + " - " + num2 + " = " + subNums );
        System.out.println(num1 + " * " + num2 + " = " + multNums );
        System.out.println(num1 + " / " + num2 + " = " + divNums );
        System.out.println(num1 + " % " + num2 + " = " + modNums );
    }    
}
