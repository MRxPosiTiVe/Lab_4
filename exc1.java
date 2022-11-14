//import java.util.Scanner;
//
//public class exc1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double u, y;
//        System.out.println("Введите переменную u: ");
//        u = input.nextDouble();
//        System.out.println("Введите переменную y: ");
//        y = input.nextDouble();
//        double T = (Math.sin(2 * u)/Math.log(2 * y + u));
//        System.out.println("Ответ: T = " + T);
//
//    }
//}

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, z, b, a;
        System.out.println("Введите переменную X: ");
        x = input.nextDouble();
        System.out.println("Введите переменную Z: ");
        z = input.nextDouble();
        System.out.println("Введите переменную B: ");
        b = input.nextDouble();
        System.out.println("Введите переменную A: ");
        a = input.nextDouble();
        double F = (Math.sqrt(Math.abs(x) + Math.pow(Math.cos(x), 3) + Math.pow(z, 4))) /
                (Math.log(x) - Math.asin(b * x - a));
        // аргумент arcsin(x) == -1 < x < 1
        if ((b * x - a) < -1 || (b * x - a) > 1) {
            System.out.print("Говно данные!");
        }
        else {
            System.out.print("Ответ: F = " + F);
        }
    }
}
