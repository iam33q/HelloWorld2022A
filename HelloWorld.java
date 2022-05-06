import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        System.out.println("Hello, "+name+".");
        System.out.println("Enter you age: ");
        float age = 0;
        boolean runTry = true;
        while (runTry) {
            try
            {
                Scanner in1 = new Scanner(System.in);
                age = in1.nextFloat();
                runTry = false;
            }
            catch (Exception e)
            {
                System.out.println("You have not entered a value number. Please try again.");
                runTry = true;
            }
        }
        System.out.println("You are " + (Math.floor(age)) + " years and " + Math.floor((age - Math.floor(age)) * 12) + " months old.");
        System.out.println("Next year you will be " + Math.floor(age+1) + ".");
    }
}