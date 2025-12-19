package Assignment1;

public class Calculator {
	
	/* A class sixth student required to solve basic mathematics problems. For this he/ she needs to 
	perform operations such as addition, subtraction, multiplication, division, remainder, square, 
	cube, and absolute. Write a program using methods to perform these basic operations. */
	
	
	// method for Addition
	static int add(int a, int b) {
        return a + b;
    }

    // method for Subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // method for Multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // method for Division
    static int divide(int a, int b) {
        return a / b;
    }

    // method for Remainder
    static int remainder(int a, int b) {
        return a % b;
    }

    // Square
    static int square(int a) {
        return a * a;
    }

    // method for Cube
    static int cube(int a) {
        return a * a * a;
    }

    // method for Absolute value
    static int absolute(int a) {
        if (a < 0)
            return -a;
        else
            return a;
    }

    public static void main(String[] args) {
        int x = 10, y = 3;

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));
        System.out.println("Remainder: " + remainder(x, y));
        System.out.println("Square of x: " + square(x));
        System.out.println("Cube of x: " + cube(x));
        System.out.println("Absolute value of -x: " + absolute(-x));
    }
}
