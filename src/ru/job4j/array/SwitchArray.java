package ru.job4j.array;

public class SwitchArray {
//source указывает индекс элемента, который нужно заменить на элемент из dest.
//То есть значение ячеек source и dest нужно поменять местами.
    public static int[] swap(int[] array, int source, int dest) {
        int[] copyArray = array.clone();
        for (int i = 0; i < array.length; i++) {
            array[source] = copyArray[dest];
            array[dest] = copyArray[source];
        }
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}