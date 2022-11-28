//Реализовать простой калькулятор

import java.util.Scanner;

public class Task_03 {
    public static void main(String args[]) {
        double x;
        double y;
        double result;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("first num: ");
        x = sc.nextDouble();
        System.out.print("enter operator: ");
        op = sc.next().charAt(0);
        System.out.print("second num: ");
        y = sc.nextDouble();
        sc.close();
        switch (op) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.println("Enter correct operator!");
                return;
        }
        System.out.printf(x + " " + op + " " + y + " = " + result);    
}
}
