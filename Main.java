import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the operator (+, -, *, /, %, or 'X' to exit): ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int ans = 0;

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                } else if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Error: Modulo by zero is not allowed.");
                        continue;
                    }
                }
                System.out.println("Result: " + ans);
                System.out.println();

            } else if (op == 'x' || op == 'X') {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid operator. Please try again.");
                System.out.println();
            }
        }
        sc.close();
    }
}
