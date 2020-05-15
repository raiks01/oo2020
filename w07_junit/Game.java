package app;
import java.util.Scanner;

public class Game {
    
    public static void game() {
        Scanner input = new Scanner(System.in);
        Board ttt = new Board();
        ttt.resetBoard();
        System.out.println("Tere tulemast trips traps trulli! jeeeeeeee");
        System.out.println("Et mängida pead sa sisestama 1-3 rea numbri ja 1-3 veeru numbri ning sinu märk ilmub mängulauale");
        do {
            System.out.println("Praegune laud näeb välja selline: ");
            ttt.printBoard();
            int row;
            int col;
            do {
                System.out.println("Mängija " + ttt.getMark() + ", vali koht mängulaual!");
                row = input.nextInt()-1;
                col = input.nextInt()-1;
            }
            while (!ttt.placeMark(row, col));
            ttt.changeMark();
        }
        while(!ttt.checkWinner() && !ttt.isFull());
        if (ttt.isFull() && !ttt.checkWinner()) {
            System.out.println("Kahjuks jäite viiki!");
        } else {
            System.out.println("Praegune mängulaud:");
            ttt.printBoard();
            ttt.changeMark();
            System.out.println(Character.toUpperCase(ttt.getMark()) + " Võitis! Palju õnne!");
        }
            input.close();
        }
}