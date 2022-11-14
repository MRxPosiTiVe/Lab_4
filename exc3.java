import java.util.Scanner;
import static java.lang.Math.*;

public class exc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Введите переменную a: ");
        a = input.nextDouble();
        System.out.println("Введите переменную b: ");
        b = input.nextDouble();
        System.out.println("Введите переменную c: ");
        c = input.nextDouble();
        double p = (a + b + c)/2;
        double S = sqrt(p * abs(p - a) * abs(p - b) * abs(p - c));
        double h = (2 * S)/a;
        double m = sqrt(2 * pow(c, 2) + 2 * pow(b, 2) - pow(a, 2))/2;
        System.out.print("h(Высота) = "+h+"\nm(Медиана) = "+m);
    }
}
