import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100:");
        int numOne = Integer.valueOf(scanner.nextInt());
        if (numOne >89){
            System.out.println("Your grade is an A, over achiever");
        } else if (numOne > 79) {
            System.out.println("Your grade is a B++, much learn");
        } else if (numOne > 69) {
            System.out.println("Your grade is a C++, C's still get degrees!");
        } else if (numOne > 59) {
            System.out.println("Your grade is a D, put the phone down fam");
        } else {
            System.out.println("Your grade is a F, go ahead and log off for me");
        }

    }
    
}
