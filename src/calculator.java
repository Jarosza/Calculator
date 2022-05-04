import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Variable 1:");
        double x = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Variable 2:");
        double y = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("(+) addition / (-) subtraction / (*) multiplication / (/) division");
        String choice = scanner.nextLine();

        switch (choice) {
            case "+":
                System.out.println(x+y);
                 break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            default:
                System.out.println("Sorry, incorrect symbol.");

        }
    }
}

