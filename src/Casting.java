public class Casting {
    public static void main(String[] args) {
    
        double num = 112.35;
        int numInt = (int)num;
        System.out.println("Double: " + num);
        System.out.println("Double: " + numInt);

        String val = "49";
        int valInt = Integer.parseInt(val);
        System.out.println("The string value is: " + val);
        System.out.println("The integer value is: " + valInt);
    }
}
