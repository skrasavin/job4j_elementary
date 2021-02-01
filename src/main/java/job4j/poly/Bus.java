package job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Go");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Number of passengers: " + count);
    }

    @Override
    public int tank(int fuel) {
        return 0;
    }
}
