package job4j.calculator;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("This is " + name + ", his age is " + age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name, age);

    }
}
