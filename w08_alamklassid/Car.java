package app;

public abstract class Car {
    String name;
    int year;
    
    public abstract void action();

    public void getYear() {
        System.out.println(year + ". aasta kohta pole paha");
    }

    public void stop() {
        System.out.println("tshhhhhhhhhhh");
    }

    public void start() {
        System.out.println("vrõmmmmmmmm");
    }
}