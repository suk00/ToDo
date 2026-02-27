import java.util.*;
import static java.lang.Math.sqrt;

public class Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double ari = 0;
        double geo = 0;

        ari = (x + y) / 2;
        geo = sqrt(x * y);

        System.out.printf("%.1f%n", ari);
        System.out.printf("%.1f%n", geo);
    }
}