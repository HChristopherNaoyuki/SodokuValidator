# Sudoku Validator

## Overview
This project provides a Java implementation of a Sudoku validator that checks if a given 9x9 Sudoku puzzle solution is valid. It ensures that the solution adheres to the standard Sudoku rules, which require that each number from 1 to 9 appears exactly once in each row, column, and 3x3 sub-grid.

## Features
- Validates Sudoku solutions by checking for duplicates in:
  - Rows
  - Columns
  - 3x3 sub-grids
- Allows user input to enter a Sudoku grid.
- Comprehensive unit tests to verify functionality.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven (optional, for building and managing dependencies)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/SodokuValidator.git
   cd sudoku-validator
   ```

2. Compile the Java files:
   ```bash
   javac src/sudokuvalidator/*.java -d out
   ```

3. Run the program:
   ```bash
   java -cp out sudokuvalidator.SudokuValidator
   ```

### Running Tests
To run the unit tests, you can use a testing framework like JUnit. Make sure to have JUnit added to your classpath.

1. Compile the test files:
   ```bash
   javac -cp junit.jar src/sudokuvalidator/SudokuValidatorTest.java -d out
   ```

2. Run the tests:
   ```bash
   java -cp out:junit.jar org.junit.runner.JUnitCore sudokuvalidator.SudokuValidatorTest
   ```

## Usage
After running the program, enter a 9x9 Sudoku grid, with numbers separated by spaces or new lines. The program will output whether the solution is valid or invalid.

### Example Input
```
9 6 3 1 7 4 2 5 8
1 7 8 3 2 5 6 4 9
2 5 4 6 8 9 7 3 1
8 2 1 4 3 7 5 9 6
4 9 6 8 5 2 3 1 7
7 3 5 9 6 1 8 2 4
5 8 9 7 1 3 4 6 2
3 1 7 2 4 6 9 8 5
6 4 2 5 9 8 1 7 3
```

### Example Output
```
Invalid solution
```

## Testing
The project includes a suite of unit tests located in the `SudokuValidatorTest.java` file. These tests cover various scenarios, including:
- Valid Sudoku grids
- Grids with duplicates in rows, columns, or sub-grids
- Empty grids
- Almost valid grids

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your improvements or fixes.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
