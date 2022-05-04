import java.util.Scanner;

public class Practice {

    // public static void main(String[] args) throws Exception {
    // // the lower data type (having smaller size) is converted into the higher
    // data type (having larger size). there is no loss in data. this type of
    // conversion happens automatically. This is also known as Implicit Type
    // Casting.
    // int num = 10;
    // System.out.println("The integer value: " + num);

    // // convert into double type, can be named whatever
    // double bloop = num;
    // System.out.println("The double value: " + bloop);
    // }

    // public static void main(String[] args) {
    // // create double type variable
    // double num = 10.99;
    // System.out.println("The double value: " + num);

    // // convert into int type
    // int data = (int)num;
    // System.out.println("The integer value: " + data);
    // / Narrowing Type Casting, the higher data types (having larger size) are
    // converted into lower data types (having smaller size). there is the loss of
    // data. This is why this type of conversion does not happen automatically.
    // known as Explicit Type Casting. /
    // }

    // public static void main(String[] args) {
    // // create int type variable
    // int num = 10;
    // System.out.println("The integer value is: " + num);

    // // converts int to string type
    // String data = String.valueOf(num);
    // System.out.println("The string value is: " + data);
    // //used the valueOf() method of the Java String class to convert the int type
    // variable into a string
    // }

    // public static void main(String[] args) {
    // // create string type variable
    // String data = "10";
    // System.out.println("The string value is: " + data);

    // // convert string variable to int
    // int num = Integer.parseInt(data);
    // System.out.println("The integer value is: " + num);
    // }


    public static void main(String[] args) {
        int addedNums = 1 + 2;
        System.out.println(addedNums);

        try (// Add numbers together that are entered in the console
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int numOne = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter another number:");
            int numTwo = Integer.valueOf(scanner.nextLine());

            // Assign a variable to print the sum of the two numbers
            int numbers = numOne + numTwo;
            
            System.out.println(numOne + " + " + numTwo + " = " + numbers);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
