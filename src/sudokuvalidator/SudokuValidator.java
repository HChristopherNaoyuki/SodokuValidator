/**
 * File Name: SudokuValidator.java
 * Purpose: To validate a Sudoku puzzle solution entered by the user.
 * Author: Naoyuki Christopher Higaki
 * Student Number: ST10462415
 * 
 * Question 8.5:
 * Please attach the solution of the exercise 
 * we did in class to produce the output below. 
 * These values must be entered by the user 
 * not assigned. Enter a Sudoku puzzle solution:
 * 
 *  9 6 3 1 7 4 2 5 8
 *  1 7 8 3 2 5 6 4 9
 *  2 5 4 6 8 9 7 3 1
 *  8 2 1 4 3 7 5 9 6
 *  4 9 6 8 5 2 3 1 7
 *  7 3 5 9 6 1 8 2 4
 *  5 8 9 7 1 3 4 6 2
 *  3 1 7 2 4 6 9 8 5
 *  6 4 2 5 9 8 1 7 3
 * 
 *  Valid solution
 * 
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
