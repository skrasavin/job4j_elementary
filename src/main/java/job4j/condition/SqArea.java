package job4j.condition;

/**
 *
 * h = p / (2 * (k + 1));
 *
 * L = h * k;
 *
 * s = L * h;
 *
 */
public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double result = l * h;
        return result;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result1);
    }
}
