package job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("length: " + ages.length);
        System.out.println("length: " + surnames.length);
        System.out.println("length: " + prices.length + "\n");
        String[] names = new String[4];
        names[0] = "Jack";
        names[1] = "Peter";
        names[2] = "Chloe";
        names[3] = "Farhad";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
