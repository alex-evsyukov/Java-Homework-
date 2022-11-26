//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task_01 {
    public static void main(String args[]) {
        int sum = 0;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            sum += i;
            factorial *= i;

        }
        System.out.printf("sum = %d; n! = %d", sum, factorial);
    }
}
