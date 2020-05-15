package app;

public class Lambo extends SuperCar {
    public Lambo(String name,int year, int speed) {
        this.name = name;
        this.year = year;
        this.speed = speed;
        this.type = "fucking fast as fuck boiiiiiiiiiii";
    }

    @Override
    public void getSpeed() {
        System.out.println("kaks sotti on sees ja lendab kus kurat");
    }
}