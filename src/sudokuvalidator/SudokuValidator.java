/**
 * File Name: SudokuValidator.java
 * Purpose: To validate a Sudoku puzzle solution entered by the user.
 */
package sudokuvalidator;
import java.util.Scanner;

public class SudokuValidator {

    public static void main(String[] args) {
        int[][] grid = new int[9][9];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        // Read the Sudoku puzzle solution from the user
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = input.nextInt();
            }
        }

        // Check if the provided solution is valid
        if (isValidSudoku(grid)) {
            System.out.println("Valid solution");
        } else {
            System.out.println("Invalid solution");
        }
    }

    /**
     * Checks if the provided Sudoku solution is valid.
     * @param grid the 9x9 Sudoku grid
     * @return true if the solution is valid, false otherwise
     */
    public static boolean isValidSudoku(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            boolean[] boxCheck = new boolean[9];

            for (int j = 0; j < 9; j++) {
                // Check each row
                if (!check(grid[i][j], rowCheck)) return false;
                // Check each column
                if (!check(grid[j][i], colCheck)) return false;
                // Check each 3x3 sub-grid
                if (!check(grid[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3], boxCheck)) return false;
            }
        }
        return true;
    }

    /**
     * Helper method to check if a number has already been encountered.
     * @param num the number to check
     * @param check the boolean array used to track occurrences
     * @return true if the number is valid, false otherwise
     */
    public static boolean check(int num, boolean[] check) {
        if (num < 1 || num > 9 || check[num - 1]) {
            return false;
        }
        check[num - 1] = true;
        return true;
    }
}
