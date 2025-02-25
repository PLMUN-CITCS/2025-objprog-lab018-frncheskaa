import java.util.Scanner;

public class EvenOddChecker {
    public static int getIntegerinput() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter an integer: "); 
        int integer = input.nextInt(); 
        return integer; 
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number = getIntegerinput();
        System.out.println(number + " is an " + checkEvenOrOdd(number) + " number.");
    }
}