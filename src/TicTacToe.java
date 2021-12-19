import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    final char SIGN_X = 'X';
    final char SIGN_O = 'O';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("YOU WON");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW");
                break;
            }
            turnAi();
            printTable();
            if (isWin(SIGN_O)) {
                System.out.println("Ai WON");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW");
                break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[x][y] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y (1...3)");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_X;
    }

    void turnAi() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++)
                if (checkWinHorizontal(j)) {
                    randomHorizontal(j);
                    return;
                } else if (checkWinVertical(i)) {
                    randomVertical(i);
                    return;
                }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++)
                if (checkDefenceHorizontal(j)) {
                    randomHorizontal(j);
                    return;
                } else if (checkDefenceVertical(i)) {
                    randomVertical(i);
                    return;
                } else {
                    random();
                    return;
                }
        }
    }

    void randomHorizontal(int y) {
        int x;
        do {
            x = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_O;
    }

    void randomVertical(int x) {
        int y;
        do {
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_O;
    }

    void random() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_O;
    }

    boolean checkDefenceHorizontal(int y) {
        int countX = 0;
        int countSpace = 0;
        for (int i = 0; i < table.length; i++) {
            if (SIGN_X == table[i][y]) {
                countX++;
            } else if (SIGN_EMPTY == table[i][y]) {
                countSpace++;
            }
        }
        return countX == 2 && countSpace == 1;
    }

    boolean checkWinHorizontal(int y) {
        int countO = 0;
        int countSpace = 0;
        for (int i = 0; i < table.length; i++) {
            if (SIGN_O == table[i][y]) {
                countO++;
            } else if (SIGN_EMPTY == table[i][y]) {
                countSpace++;
            }
        }
        return countO == 2 && countSpace == 1;
    }

    boolean checkDefenceVertical(int x) {
        int countX = 0;
        int countSpace = 0;
        for (int i = 0; i < table.length; i++) {
            if (SIGN_X == table[x][i]) {
                countX++;
            } else if (SIGN_EMPTY == table[x][i]) {
                countSpace++;
            }
        }
        return countX == 2 && countSpace == 1;
    }

    boolean checkWinVertical(int x) {
        int countO = 0;
        int countSpace = 0;
        for (int i = 0; i < table.length; i++) {
            if (SIGN_O == table[x][i]) {
                countO++;
            } else if (SIGN_EMPTY == table[x][i]) {
                countSpace++;
            }
        }
        return countO == 2 && countSpace == 1;
    }

    boolean isWin(char ch) {
        for (int y = 0; y < table.length; y++) {
            if (table[y][0] == ch && table[y][1] == ch && table[y][2] == ch) {
                return true;
            }
            if (table[0][y] == ch && table[1][y] == ch && table[2][y] == ch) {
                return true;
            }
            if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) {
                return true;
            }
            if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) {
                return true;
            }
        }
        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == SIGN_EMPTY;
    }
}


