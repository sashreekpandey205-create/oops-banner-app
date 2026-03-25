// Program: Level 1 Lab Practice - All Concepts in One File

public class LabPracticeAllInOne {

    public static void main(String[] args) {

        // Menu choice variable
        int choice = 1; // Change this value to test different problems

        // Switch to select problem
        switch (choice) {

            case 1:
                evenOddCheck();
                break;

            case 2:
                largestNumber();
                break;

            case 3:
                printNumbers();
                break;

            case 4:
                dayOfWeek();
                break;

            case 5:
                sumWhileLoop();
                break;

            case 6:
                countEvenNumbers();
                break;

            case 7:
                booleanCheck();
                break;

            case 8:
                primeCheck();
                break;

            case 9:
                calculator();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    // 🔹 Even or Odd
    public static void evenOddCheck() {

        int number = 7;

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    // 🔹 Largest of Three Numbers
    public static void largestNumber() {

        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest: " + num2);
        } else {
            System.out.println("Largest: " + num3);
        }
    }

    // 🔹 For Loop Example
    public static void printNumbers() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // 🔹 Switch Example
    public static void dayOfWeek() {

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    // 🔹 While Loop Example
    public static void sumWhileLoop() {

        int n = 5;
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum: " + sum);
    }

    // 🔹 Continue Example
    public static void countEvenNumbers() {

        int count = 0;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) {
                continue;
            }

            count++;
        }

        System.out.println("Even Count: " + count);
    }

    // 🔹 Boolean Expression
    public static void booleanCheck() {

        int age = 20;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("Eligible to Drive");
        } else {
            System.out.println("Not Eligible");
        }
    }

    // 🔹 Break Statement (Prime Check)
    public static void primeCheck() {

        int number = 17;
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }

    // 🔹 Calculator using Switch
    public static void calculator() {

        int num1 = 10;
        int num2 = 5;
        int operation = 1;

        switch (operation) {
            case 1:
                System.out.println("Addition: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}