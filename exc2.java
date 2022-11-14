import java.util.Scanner;
import static java.lang.Math.*;
public class exc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double v1, v2, a, an;
        double A = 5;
        System.out.print("Введите скорость машины: ");
        v1 = input.nextDouble();
        System.out.print("Введите угол наклона стекла: ");
        a = input.nextDouble();
        an = (a * PI)/180;
        v2 = ceil(v1 * tan(an));
        System.out.printf("Скорость капель: %.1f КМ/Ч", v2);
    }
}
