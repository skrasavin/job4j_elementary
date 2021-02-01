package job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                System.out.println(number);
                count++;
            }
        }
        return count;
    }
}