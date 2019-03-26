import java.util.Scanner;

/*
This program is a basic calculator that only deals with two whole variables, and one operand,
which are all chosen by the user.
*/
public class Calculator {

    // a function that allows the user to add two variables to get the sum
    public static int Add(int a, int b) {

        return a + b;
    }

    // a function that allows the user to subtract two variables to get the difference
    public static int Subtract(int a, int b) {
        return a - b;
    }

    // a function that allows the user to get the product of two variables
    public static int Multiply(int a, int b) {
        return a * b;
    }

    // a function that allows the user to get the quotient of two variables
    public static int Divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        // initializes the scanner to allow user input
        Scanner sc = new Scanner(System.in);

        // welcomes the user and asks what operand they would like to use
        System.out.println("Hello, welcome to the calculator. \nWhat operand would you like to use?");
        System.out.println("Select a number to choose: 1 = +, 2 = -, 3 = *, 4 = /");

        // reads the next integer that the user inputs, so a decision could be determined from the user
        int chooseOperand = sc.nextInt();
        System.out.println("Number selected: " + chooseOperand);

        // asks user for two whole numbers, since that is all the program can accept
        System.out.println("Now please choose two whole numbers to use in the calculation: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // tries to determine what operand the user wants to use base on the number that they chose
        if (chooseOperand == 1) {
            System.out.println("The sum of the numbers selected is: " + Add(num1, num2));
        }
        else if (chooseOperand == 2) {
            System.out.println("The difference of the numbers selected is: " + Subtract(num1, num2));
        }
        else if (chooseOperand == 3) {
            System.out.println("The product of the numbers selected is: " + Multiply(num1, num2));
        }
        else if (chooseOperand == 4) {
            System.out.println("The quotient of the numbers selected is: " + Divide(num1, num2));
        }
        else {
            System.out.println("Please choose a number 1-4.");
        }

    }
}
