package hf_ladder5.required;


/*
Description
        Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.

        A region is captured by flipping all 'O''s into 'X''s in that surrounded region.

        Have you met this question in a real interview?
        Example
        X X X X
        X O O X
        X X O X
        X O X X
        After capture all regions surrounded by 'X', the board should be:

        X X X X
        X X X X
        X X X X
        X O X X
*/
public class Lint0477_SurroundedArea {

    private static void printBoard(char[][] board) {
        for (char[] row: board) {
            for (char e: row) {
                System.out.print(e);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("hello surranded area");

        char [][] board = { {'x', 'x', 'x','x'},
                            {'x', 'o', 'o', 'x'},
                            {'x', 'x', 'o', 'x'},
                            {'x', 'o', 'x', 'x'}};
        printBoard(board);
    }

    static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void extend(char[][] board, int x, int y) {
        if (board[x][y] == 'o') { // only continue when it is 'o'
            board[x][y] = 'w'; //mark as a new symbol
            for (int[] dir: directions) {
                int x2 = x + dir[0];
                int y2 = y+ dir[1];
                if (x2 > 0 && y > 0 && x2 < board.length && y2 < board[0].length) {
                    extend(board, x2, y2);
                }
            }


        }
    }

    public static void mark(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {

        }
    }
}
