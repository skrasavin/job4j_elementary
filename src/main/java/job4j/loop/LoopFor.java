package job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[numbers.length - 1 - index] % 2 == 0) {
                System.out.println(numbers[numbers.length - 1 - index]);
            }
        }
    }
}