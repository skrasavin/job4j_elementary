package job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int firstStep = first  > second ? first : second;
        return firstStep > third ? firstStep : third;
    }
}
