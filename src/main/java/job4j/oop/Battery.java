package job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery b1 = new Battery(50);
        Battery b2 = new Battery(20);
        System.out.println("Заряд b1: " + b1.load + " Заряд b2: " + b2.load);
        b1.exchange(b2);
        System.out.println("После обмена");
        System.out.println("Заряд b1: " + b1.load + " Заряд b2: " + b2.load);

    }
}
