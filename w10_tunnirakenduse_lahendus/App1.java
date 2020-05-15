package app;

public class App1 {
    public static void main(String[] args) throws Exception {
        /*MyThread myThread1 = new MyThread("Paaritu thread", 1000);
        MyThread myThread2 = new MyThread("Paaris thread", 600);*/
        MyThread myThread1 = new MyThread("off line thread", 1200);
        MyThread myThread2 = new MyThread("main line thread", 600);
        //MyThread myThread3 = new MyThread("AMD Ryzen Threadripper 3990X", 600);
        myThread2.start();
        myThread1.start();
        //myThread3.start();
    }
}