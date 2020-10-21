package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                result[i] = 'X';
            }
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                if (chars[j] == 'X') {
                    result = monoVertical(board, j);
                    if (result) {
                        break;
                    }
                    result = monoHorizontal(board, j);
                }
            }
        }
        return result;
    }
/*
    public static void main(String[] args) {
        char[][] input1 = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input1);
        System.out.println(result);

        char[][] input = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean result1 = MatrixCheck.isWin(input);
        System.out.println(result1);
    }
 */
}