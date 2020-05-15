package app;

public class Ferrari extends SuperCar {

    public Ferrari(String name, int year, int speed) {
        this.name = name;
        this.year = year;
        this.speed = speed;
        this.type = "punane nagu leek";
    }

    public void revV10() {
        System.out.println("V10 läheb skrrrrrrrrrrrrrrrrrrrt");
    }

    public void revV12() {
        System.out.println("V12 läheb vrõmmmmmmmmmm skrrrrrrrrrrrrrrrrrrrt");
    }

    public void revV8() {
        System.out.println("V8 läheb pshuuuuuuuuuuuuuuuuuuuu");
    }
}