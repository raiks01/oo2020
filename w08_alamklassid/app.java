package app;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) throws Exception {
        Ferrari car1 = new Ferrari("La Ferrari", 2008, 116);
        Ferrari car2 = new Ferrari("Superfast", 2012, 140);
        Lambo car3 = new Lambo("Aventador SVJ", 2016 ,80);
        Ferrari car4 = new Ferrari("F40", 1999, 200);
        Lambo car5 = new Lambo("Huracan", 2020 ,60);

        List<SuperCar> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        car1.revV12();
        car2.revV10();
        car4.revV8();
        System.out.println("-----------------------");

        for(SuperCar car : cars) {
            car.getType();
            car.getSpeed();
            car.getYear();
            System.out.println("-----------------------");
        }
    }
}