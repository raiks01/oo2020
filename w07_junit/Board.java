package app;

public class Board {

    private char[][] board;
    private char mark;

    public Board() {
        board = new char[3][3];
        mark = 'X';
        resetBoard();
    }

    //praegune mängija märk
    public char getMark() {
        return mark;
    }

    //Tühjendab laua
    public void resetBoard() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    //prindib laua
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isFull() {
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    public boolean checkWinner() {
        return (checkRows4Win() || checkColumns4Win() || checkDiagonals4Win());
    }


    // Kontrollib ridu kas on keegi võitnud
    private boolean checkRows4Win() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    // Kontrollib veergusid kas on keegi võitnud
    private boolean checkColumns4Win() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    // Kontrollib diagonaale kas on keegi võitnud
    private boolean checkDiagonals4Win() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }

    // Kontrollib kas on kolm järjestikust samasugust väärtust
    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    //vahetab märki
    public void changeMark() {
        if(mark == 'X') {
            mark = 'O';
        } else {
            mark = 'X';
        }
    }

    // Paneb mängija poolt valitud välja mängija märgi
    public boolean placeMark(int row, int col) {
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = mark;
                    return true;
                }
            }
        }
        return false;
    }
}