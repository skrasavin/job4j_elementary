package ru.job4j.oop.machine;

public class Realization {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[] {bus, plane, train};
        for (Vehicle veh : vehicles) {
            veh.move();
        }

    }
}
