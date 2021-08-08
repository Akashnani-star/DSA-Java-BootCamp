import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;
        while (true) {
            System.out.print("Enter the operator (type C to exit ) : ");
            op = sc.next().trim().charAt(0);
            if (op == 'c' || op == 'C') System.exit(0);
            System.out.print("Enter a and b values : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
            switch (op) {
                case '+' -> c = a + b;
                case '-' -> c = a - b;
                case '*' -> c = a * b;
                case '/' -> c = a / b;
                case '%' -> c = a % b;
                case 'C','c' -> System.exit(0);
                default -> System.out.println("Enter valid operator");
            }
            System.out.println(a + " " + op + " " + b + " = " + c);
        }
    }
}