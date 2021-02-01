package job4j.oop;

public class Cat {

    private String name;
    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("Cat '" + this.name + "' ate up " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.name = "Gav";
        gav.eat("kotleta\n");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.name = "Black";
        black.eat("fish");
        black.show();
    }
}