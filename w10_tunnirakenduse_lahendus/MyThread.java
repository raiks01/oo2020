package app;

public class MyThread implements Runnable {

    private Thread thread;
    private String tName;

   
    public MyThread(String tName, int inter) {
        this.tName = tName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 20; i++) {

                if (tName == "off line thread") { 
                    if (i % 2 == 0){
                        System.out.println("");
                    }
                    else{
                        System.out.println(tName + ": " + i + " käivitus");
                        Thread.sleep(1200);
                    }
                } else if(tName == "main line thread"){
                    if (i % 2 != 0){
                        System.out.println("");
                    }
                    else{
                        System.out.println(tName + ": " + i + " käivitus");
                        Thread.sleep(600);
                    }
                }else{
                    System.out.println("");
                }

            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + tName + "on surnud");
        }

    }

    public void start() {
        System.out.println("Thread " + tName + " Töötab");
        if (thread == null) {
            thread = new Thread(this, tName);
            thread.start();
        }
    }

}