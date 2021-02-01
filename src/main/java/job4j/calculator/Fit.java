package job4j.calculator;

//Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
//Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        short womanHeight = 175;
        double man = Fit.manWeight(manHeight);
        System.out.println("Man 187 is " + man);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Woman 175 is " + woman);
    }

}
