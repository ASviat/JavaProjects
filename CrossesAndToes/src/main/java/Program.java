import java.util.Random;
import java.util.Scanner;

public class Program {


    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static final int WIN_COUNT = 3;
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '*';
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;
    private static boolean flagForAI;
    private static int xFieldForAI;
    private static int yFieldForAI;
    private static char direction;


    public static void main(String[] args) {
        while (true) {
            initialize();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (checkState(DOT_HUMAN, "Вы победили!"))
                    break;
                aiTurn();
                printField();
                if (checkState(DOT_AI, "Победил компьютер!"))
                    break;
            }
            System.out.println("Желаете сыграть еще раз? (Y - да): ");
            if (!scanner.next().equalsIgnoreCase("Y"))
                break;
        }

    }

    /**
     * Инициализация объектов игры
     */
    static void initialize() {
        fieldSizeX = 5;
        fieldSizeY = 5;
        field = new char[fieldSizeX][fieldSizeY];
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                field[x][y] = DOT_EMPTY;
            }
        }
    }

    /**
     * Печать текущего состояния игрового поля
     */
    static void printField() {
        System.out.print("+");
        for (int x = 0; x < fieldSizeX; x++) {
            System.out.print("-" + (x + 1));
        }
        System.out.println("-");


        for (int x = 0; x < fieldSizeX; x++) {
            System.out.print(x + 1 + "|");
            for (int y = 0; y < fieldSizeY; y++) {
                System.out.print(field[x][y] + "|");
            }
            System.out.println();
        }

        for (int x = 0; x < fieldSizeX * 2 + 2; x++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * Ход игрока (человека)
     */
    static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты хода X и Y\n(от 1 до 3) через пробел: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[x][y] = DOT_HUMAN;
    }


    /**
     * Проверка, является ли ячейка игрового поля пустой
     *
     * @param x
     * @param y
     * @return
     */
    static boolean isCellEmpty(int x, int y) {
        return field[x][y] == DOT_EMPTY;
    }

    /**
     * Проверка валидности координат хода
     *
     * @param x
     * @param y
     * @return
     */
    static boolean isCellValid(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }


    /**
     * Ход игрока (компьютера)
     */
    static void aiTurn() {
        int x = 0;
        int y = 0;
        do {
            if (flagForAI) {
                switch (direction) {
                    case 'v' -> {
                        if (xFieldForAI + 1 < fieldSizeX && field[xFieldForAI + 1][yFieldForAI] == DOT_EMPTY) {
                            field[xFieldForAI + 1][yFieldForAI] = DOT_AI;
                            return;
                        }
                        if (xFieldForAI - 2 >= 0 && field[xFieldForAI - 2][yFieldForAI] == DOT_EMPTY
                                && field[xFieldForAI + 1][yFieldForAI] == DOT_AI) {
                            field[xFieldForAI - 2][yFieldForAI] = DOT_AI;
                            return;
                        }
                        direction = ' ';
                        flagForAI = false;
                    }
                    case 'h' -> {
                        if (yFieldForAI + 1 < fieldSizeY && field[xFieldForAI][yFieldForAI + 1] == DOT_EMPTY) {
                            field[xFieldForAI][yFieldForAI + 1] = DOT_AI;
                            return;
                        }
                        if (yFieldForAI - 2 >= 0 && field[xFieldForAI][yFieldForAI - 2] == DOT_EMPTY
                                && field[xFieldForAI][yFieldForAI + 1] == DOT_AI) {
                            field[xFieldForAI][yFieldForAI - 2] = DOT_AI;
                            return;
                        }
                        direction = ' ';
                        flagForAI = false;
                    }
                    case 'q' -> {
                        if (yFieldForAI + 1 < Math.min(fieldSizeX, fieldSizeY)
                                && xFieldForAI - 1 >= 0
                                && field[xFieldForAI - 1][yFieldForAI + 1] == DOT_EMPTY) {
                            field[xFieldForAI - 1][yFieldForAI + 1] = DOT_AI;
                            return;
                        }
                        if (xFieldForAI + 2 < fieldSizeX
                                && yFieldForAI - 2 >= 0
                                && field[xFieldForAI + 2][yFieldForAI - 2] == DOT_EMPTY
                                && yFieldForAI + 1 < Math.min(fieldSizeX, fieldSizeY)) {
                            field[xFieldForAI + 2][yFieldForAI - 2] = DOT_AI;
                            return;
                        }
                        direction = ' ';
                        flagForAI = false;
                    }

                }

            } else {
                x = random.nextInt(fieldSizeX);
                y = random.nextInt(fieldSizeY);
            }
        }
        while (!isCellEmpty(x, y));
        field[x][y] = DOT_AI;
    }

    /**
     * Проверка на ничью
     *
     * @return
     */
    static boolean checkDraw() {
        for (int x = 0; x < fieldSizeX; x++) {

            for (int y = 0; y < fieldSizeY; y++) {
                if (isCellEmpty(x, y)) return false;
            }
        }
        return true;
    }

    /**
     * Метод проверки победы
     *
     * @param dot фишка игрока
     * @return
     */
    static boolean checkWin(char dot) {
        int counter = 0;

        //Проверка по горизонталям
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {

                if (field[i][j] == DOT_HUMAN) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == WIN_COUNT - 1) {
                    flagForAI = true;
                    xFieldForAI = i;
                    yFieldForAI = j;
                    direction = 'h';
                }
                if (counter == 3) {
                    return true;
                }
            }
            counter = 0;
        }

        //Проверка по вертикали
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {

                if (field[j][i] == DOT_HUMAN) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == WIN_COUNT - 1) {
                    flagForAI = true;
                    xFieldForAI = j;
                    yFieldForAI = i;
                    direction = 'v';
                }
                if (counter == 3) {
                    return true;
                }
            }
            counter = 0;
        }

        // Проверка победы по горизонталям и вертикалям
//        for (int x = 0; x < fieldSizeX; x++) {
//            for (int y = 0; y < Math.min(fieldSizeX, fieldSizeY); y++) {
//                if (field[x][y] == dot || field[y][x] == dot) {
//                    counter++;
//                    if (counter == WIN_COUNT) {
//                        return true;
//                    }
//                } else {
//                    counter = 0;
//                }
//            }
//            counter = 0;
//
//        }

        int countCircles = 0;
        //проверка диагоналей, разбитых на четверти
        for (int k = Math.min(fieldSizeX, fieldSizeY) - 1; k > 0; k--) {
            for (int f = k, l = 0; l < Math.min(fieldSizeX, fieldSizeY) - countCircles; f--, l++) {
                if (field[f][l] == dot) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 2) {
                    flagForAI = true;
                    xFieldForAI = f;
                    yFieldForAI = l;
                    direction = 'q';
                }
                if (counter == WIN_COUNT) {
                    return true;
                }
            }
            countCircles++;
            counter = 0;
        }

        for (int k = Math.min(fieldSizeX, fieldSizeY) - 1, u = 1; u < Math.min(fieldSizeX, fieldSizeY); u++) {
            for (int f = k, l = u; l < Math.min(fieldSizeX, fieldSizeY); f--, l++) {
                if (field[f][l] == dot) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 2) {
                    flagForAI = true;
                    xFieldForAI = f;
                    yFieldForAI = l;
                    direction = 'q';
                }
                if (counter == WIN_COUNT) {
                    return true;
                }
            }
            counter = 0;
        }

        for (int k = (Math.min(fieldSizeX, fieldSizeY) - 1); k >= 0; k--) {
            for (int l = ((Math.min(fieldSizeX, fieldSizeY) - 1)), i = k; i >= 0; i--, l--) {
                if (field[l][i] == dot) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 2) {
                    flagForAI = true;
                    xFieldForAI = l;
                    yFieldForAI = i;
                    direction = 'e';
                }
                if (counter == WIN_COUNT) {
                    return true;
                }
            }
            counter = 0;
        }
        //и проверить верх второй части
        for (int i = Math.min(fieldSizeX, fieldSizeY) - 2; i >= 0; i--) {
            for (int j = i, k = Math.min(fieldSizeX, fieldSizeY) - 1; j >= 0; j--, k--) {
                if (field[j][k] == dot) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 2) {
                    flagForAI = true;
                    xFieldForAI = j;
                    yFieldForAI = k;
                    direction = 'r';
                }
                if (counter == WIN_COUNT) {
                    return true;
                }
            }
            counter = 0;
        }


        return false;
    }

    /**
     * Проверка состояния игры
     *
     * @param dot фишка игрока
     * @param s   победный слоган
     * @return
     */
    static boolean checkState(char dot, String s) {
        if (checkWin(dot)) {
            System.out.println(s);
            return true;
        } else if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false; // Игра продолжается
    }

}