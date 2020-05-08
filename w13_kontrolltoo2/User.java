import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        /*int userTime;*/
        /*System.out.println("Sisesta etteantud aeg, millal sa tahad poodi külastada");
        int userTime = input.nextInt();*/
        /*System.out.println("test:" + Mall.Test(userTime, userTime, userTime));*/
        System.out.println("Kas sa tahad mingil kellaajal poodi külastada?(jah/ei)");
        while(!stop) {
            String again = input.nextLine();
            if(again.equals("jah")) {
                System.out.println("Sisesta etteantud aeg, millal sa tahad poodi külastada");
                int userTime = input.nextInt();
                System.out.println("test:" + Mall.Test(userTime, userTime, userTime));
                System.out.println("");
                System.out.println("Kas sa tahad veel mingil kellaajal poodi külastada?(jah/ei)");
            } if(again.equals("ei")){
                System.out.println("nägemist!");
                stop = true;
            }
        }
        input.close();
    }
}