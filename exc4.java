import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double step, cstep, L;
        System.out.print("Укажите свой рост (СМ): ");
        L = input.nextDouble();
        step = (L / 4 + 37) / 100;
        double km, mile, sMile;
        System.out.print("Укажите кол-во шагов: ");
        cstep = input.nextDouble();
        km = (step * cstep) / 1000;
        mile = km / 1.609;
        sMile = km / 1.862;
        System.out.printf("Вы прошли:\n%.2f КМ\n%.2f МИЛЬ\n%.2f МОРСКИХ МИЛЬ", km, mile, sMile);
    }
}
