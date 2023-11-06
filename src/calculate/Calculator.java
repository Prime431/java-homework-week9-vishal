package calculate;

public class Calculator {
    public void addition(int a, int b) { // creating addition method with no return type
        int result = a + b; // addition logic
        System.out.println("a + b is = " + result);
    }
    public void subtraction(int a, int b) { // creating subtraction method with no return type
        int result = a - b; // subtraction logic
        System.out.println("a - b is = " + result);
    }
    public void division(int a, int b) { // creating division method
        if (b != 0) { //using if else loop for if b=0
            double result = (double) a / b; // division logic
            System.out.println("a / b is = " + result);
        } else {
            System.out.println("Division by zero is not allowed");
        }
    }
    public void multiplication(int a, int b) { // creating multiplication method
        int result = a * b; // multiplication logic
        System.out.println("a X b is = " + result);
    }
    public void calculateResult(int a, int b, char symbol) { //method for selecting the one of the symbol and calling the relevant method
        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
            default:
                System.out.println("Invalid symbol: " + symbol);
        }
    }
}
