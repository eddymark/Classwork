package projects;


import java.util.Scanner;
import java.util.Random;

class SudokuPuzzle {
	
	private int[][] board = new int[9][9];

	private int[][][] boards = new int[][][] {
		{
			//this creates diffrent boarsds to start off with 
			{5, 3, 0, 0, 7, 0, 0, 0, 0},
			{6, 0, 0, 1, 9, 5, 0, 0, 0},
			{0, 9, 8, 0, 0, 0, 0, 6, 0},
			{8, 0, 0, 0, 6, 0, 0, 0, 3},
			{4, 0, 0, 8, 0, 3, 0, 0, 1},
			{7, 0, 0, 0, 2, 0, 0, 0, 6},
			{0, 6, 0, 0, 0, 0, 2, 8, 0},
			{0, 0, 0, 4, 1, 9, 0, 0, 5},
			{0, 0, 0, 0, 8, 0, 0, 7, 9}
		},
		{
			{1, 2, 3, 4, 9, 7, 8, 6, 5},
			{4, 5, 9, 0, 0, 0, 0, 0, 0},
			{6, 7, 8, 0, 0, 0, 0, 0, 0},
			{3, 0, 0, 0, 1, 0, 0, 0, 0},
			{2, 0, 0, 0, 0, 0, 0, 0, 0},
			{9, 0, 0, 0, 0, 5, 0, 0, 0},
			{8, 0, 0, 0, 0, 0, 0, 0, 0},
			{7, 0, 0, 0, 0, 0, 0, 0, 0},
			{5, 0, 0, 9, 0, 0, 0, 0, 0}
		},	
		{
			{0, 0, 0, 0, 0, 8, 0, 0, 4},
			{0, 8, 4, 0, 1, 6, 0, 0, 0},
			{0, 0, 0, 5, 0, 0, 1, 0, 0},
			{1, 0, 3, 8, 0, 0, 9, 0, 0},
			{6, 0, 8, 0, 0, 0, 4, 0, 3},
			{0, 0, 2, 0, 0, 9, 5, 0, 1},
			{0, 0, 7, 0, 0, 2, 0, 0, 0},
			{0, 0, 0, 7, 8, 0, 2, 6, 0},
			{2, 0, 0, 3, 0, 0, 0, 0, 0}
		},	
		{
			{5, 0, 8, 0, 7, 3, 1, 9, 0},
			{9, 0, 0, 6, 0, 0, 4, 0, 8},
			{0, 0, 0, 9, 0, 8, 0, 3, 5},
			{0, 7, 0, 0, 0, 0, 0, 6, 0},
			{0, 0, 2, 0, 0, 0, 9, 0, 0},
			{0, 1, 0, 0, 0, 0, 0, 8, 0},
			{1, 9, 0, 3, 0, 6, 0, 0, 0},
			{2, 0, 3, 0, 0, 7, 0, 0, 9},
			{0, 8, 7, 1, 9, 0, 3, 0, 4}
		}	
	};

	private boolean start[][] = new boolean[9][9];

	public SudokuPuzzle() {
//this makes the board empty
		createEmptyPuzzle();

	}

	private void createEmptyPuzzle() {

		int[][] emptyBoard = new int[][] {
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0}
		};

		setBoard(emptyBoard);
		//this calls the method to set the board to empty
		setPermanentValues(emptyBoard);
		//starts the board as empty

	}

	public void initializeBoard() {

		int boardsCount = boards.length;
		int randomBoard = new Random().nextInt(boardsCount);

		int[][] initialBoard = boards[randomBoard];

		setBoard(initialBoard);
		setPermanentValues(initialBoard);

	}

	private void setBoard(int[][] theBoard) {
		for (int row = 0; row < theBoard.length; row++) {
			for (int col = 0; col < theBoard[row].length; col++) {
				addInitial(row, col, theBoard[row][col]);
			}
		}
	}

	private void setPermanentValues(int[][] theBoard) {
		for (int row = 0; row < theBoard.length; row++) {
			for (int col = 0; col < theBoard[row].length; col++) {
				if (theBoard[row][col] == 0) {
					start[row][col] = false;
				} else {
					start[row][col] = true;
				}
			}
		}
	}

	private void addInitial(int row, int col, int value) {

		if ((row >= 0 && row <= 8) && (col >= 0 && col <= 8) 
			&& (value >= 0 && value <= 9) ) {
			board[row][col] = value;
		}
	}

	public void addGuess(int row, int col, int value) {

		if ((row >= 0 && row <= 8) && (col >= 0 && col <= 8) 
			&& (value >= 1 && value <= 9) && (start[row][col] == false)) {
			board[row][col] = value;
		}
	}
	
	private boolean validate(int[] values) {
		for (int j = 0; j < values.length; j++) {
			// check value must be between 1 - 9
			if(values[j] < 0 || values[j] > 9) {
				return false;
			}
			// check for duplicates
			for (int k = j + 1; k < values.length; k++) {
				if (k != j && values[j] != 0 && values[k] == values[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkPuzzle() {

		// 3 x 3 grids per every 3 rows
		int[] box1 = new int[9];
		int[] box2 = new int[9];
		int[] box3 = new int[9];
		// 3 x 3 grids row number
		int gridRow = 0;

		for (int row = 0; row < board.length; row++) { // rows
			int[] rowValues = new int[9]; // every value in a row
			for (int col = 0; col < board[row].length; col++) { // cols
				rowValues[col] = getValueIn(row, col); // store every value in a row
				if (col >= 0 && col <= 2) { // 3 x 3 box 1
					int boxIndex = 3 * gridRow + col; // 0 - 8
					box1[boxIndex] = getValueIn(row, col);
				} 
				if (col >= 3 && col <= 5) { // 3 x 3 box 2
					int boxIndex = 3 * gridRow + (col - 3); // 0 - 8
					box2[boxIndex] = getValueIn(row, col);
				}
				if (col >= 6 && col <= 8) { // 3 x 3 box 3
					int boxIndex = 3 * gridRow + (col - 6); // 0 - 8
					box3[boxIndex] = getValueIn(row, col);
				}
			}
			// check if the row is valid
			if (!validate(rowValues)) {
				printArray(rowValues);
				return false;	
			}

			if (gridRow == 2) { // 3 x 3 grids full now
				if(!validate(box1)) { // check if 3 x 3 grid is valid
					return false;
				}
				if(!validate(box2)) { // check if 3 x 3 grid is valid
					return false;
				}
				if(!validate(box3)) { // check if 3 x 3 grid is valid
					return false;
				}
				// reset 3 x 3 grid row number
				gridRow = -1;
			}
			// increment 3 x 3 grid row number
			gridRow++;
		}

		return true;
	}

	private void printArray(int[] values) {
		String result = "[";
		for (int i = 0; i < values.length; i++) {
			result += values[i] + ",";	
		}
		System.out.println(result.substring(0, result.length()-1) + "]");
	}

	public int getValueIn(int row, int col) {

		return board[row][col];
	}

	public boolean[] getAllowedValues(int row, int col) {

		boolean[] allowed = new boolean[9]; 
		int[] numbers = new int[9];
		int[] box = new int[9]; 
		int boxRow = 0;

		// assume all number 1 - 9 can be placed in the given square
		for (int i = 0; i < board.length; i++) {
			allowed[i] = true;
		}

		if (row == 1 || row == 4 || row == 7) {
			boxRow = 1;
		} else if (row == 2 || row == 5 || row == 8) {
			boxRow = 2;
		}

		// try all allowed values
		for (int num = 1; num <= 9; num++) {
			// check if num is allowed within row
			int rowCount = 1;
			for (int c = 0; c < board[row].length; c++) {

				int boxIndex = -1;
				if ((col >= 0 && col <= 2) && (c >= 0 && c <= 2)) { // box
					boxIndex = 3 * boxRow + c; // 0 - 8
					if (c == col) {
						box[boxIndex] = num;
					} else {
						box[boxIndex] = getValueIn(row, c);	
					}
					if (boxRow == 0) {
						box[boxIndex+3] = getValueIn(row+1, c);
						box[boxIndex+6] = getValueIn(row+2, c);
					} else if (boxRow == 1) {
						box[boxIndex-3] = getValueIn(row-1, c);
						box[boxIndex+3] = getValueIn(row+1, c);
					} else if (boxRow == 2) {
						box[boxIndex-3] = getValueIn(row-1, c);
						box[boxIndex-6] = getValueIn(row-2, c);
					}
				}
				if ((col >= 3 && col <= 5) && (c >= 3 && c <= 5)) { // box
					boxIndex = 3 * boxRow + (c - 3); // 0 - 8
					if (c == col) {
						box[boxIndex] = num;
					}
					if (boxRow == 0) {
						box[boxIndex+3] = getValueIn(row+1, c);
						box[boxIndex+6] = getValueIn(row+2, c);
					} else if (boxRow == 1) {
						box[boxIndex-3] = getValueIn(row-1, c);
						box[boxIndex+3] = getValueIn(row+1, c);
					} else if (boxRow == 2) {
						box[boxIndex-3] = getValueIn(row-1, c);
						box[boxIndex-6] = getValueIn(row-2, c);
					}
				}
				if ((col >= 6 && col <= 8) && (c >= 6 && c <= 8)) { // box
					boxIndex = 3 * boxRow + (c - 6); // 0 - 8
					if (c == col) {
						box[boxIndex] = num;
					}
					if (boxRow == 0) {
						box[boxIndex+3] = getValueIn(row+1, c);
						box[boxIndex+6] = getValueIn(row+2, c);
					} else if (boxRow == 1) {
						box[boxIndex-3] = getValueIn(row-1, c);
						box[boxIndex+3] = getValueIn(row+1, c);
					} else if (boxRow == 2) {
						box[boxIndex-3] = getValueIn(row-1, c);
						box[boxIndex-6] = getValueIn(row-2, c);
					}
				}

				// System.out.println("row: " + row + " col: " + col + " c: " + c + " boxIndex: " + boxIndex + " val: " + getValueIn(row, c));

				if (c == col) {
					numbers[c] = num;
				} else {
					numbers[c] = getValueIn(row, c);
				}
				// printArray(box);
				rowCount++;	
			}
			// printArray(box);
			if(!validate(box)) { // validate num within grid (box)
				allowed[num-1] = false;
			}
			if(!validate(numbers)) { // validate num within row 
				allowed[num-1] = false;
			}
			// check if num is allowed within col
			for (int r = 0; r < board.length ; r++) {
				if (r == row) {
					numbers[r] = num;
				} else {
					numbers[r] = getValueIn(r, col);
				}
			}
			if(!validate(numbers)) { // validate num within col
				allowed[num-1] = false;
			}
			// printArray(numbers);
			// System.out.print("[ ");
			// for (int i = 0; i < allowed.length; i++) {
			// 	System.out.print( (allowed[i])? i+1 : "" );
			// }
			// System.out.println("]");
		}

		return allowed;
	}

	public boolean isFull() {

		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (getValueIn(row, col) == 0) {
					return false;
				}
			}
		}

		return true;
	}

	public void reset() {

		createEmptyPuzzle();
	}

	private String drawRow(int[] values) {

		String square = " _____ _____ _____  _____ _____ _____  _____ _____ _____\n";
		square += "|     |     |     ||     |     |     ||     |     |     |\n|";
		for (int i = 0; i < values.length; i++) {
			square += "  " + values[i]; // + "  |";
			if(i == 2 || i == 5) {
				square += "  ||";
			} else {
				square += "  |";
			}
		}
		square += "\n|_____|_____|_____||_____|_____|_____||_____|_____|_____|\n";

		return square;
	}

	public String toString() {

		String display = "";

		for (int row = 0; row < board.length; row++) {
			int[] rowValues = new int[board[row].length];
			for (int col = 0; col < board[row].length; col++) {
				rowValues[col] = getValueIn(row, col);	
			}
			if (row == 3 || row == 6) {
				display += "_________________________________________________________\n";
			}
			display += drawRow(rowValues);
		}

		return display;
	}

	private String drawPermRow(boolean[] values) {

		String square = " _____ _____ _____  _____ _____ _____  _____ _____ _____\n";
		square += "|     |     |     ||     |     |     ||     |     |     |\n|";
		for (int i = 0; i < values.length; i++) {
			square += "  " + ((values[i] == true) ? "T" : "F");
			if(i == 2 || i == 5) {
				square += "  ||";
			} else {
				square += "  |";
			}
		}
		square += "\n|_____|_____|_____||_____|_____|_____||_____|_____|_____|\n";

		return square;
	}

	public String getPermValues() {
		String display = "";

		for (int row = 0; row < start.length; row++) {
			boolean[] rowValues = new boolean[start[row].length];
			for (int col = 0; col < start[row].length; col++) {
				rowValues[col] = start[row][col];	
			}
			if (row == 3 || row == 6) {
				display += "_________________________________________________________\n";
			}
			display += drawPermRow(rowValues);
		}

		return display;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SudokuPuzzle game = new SudokuPuzzle();
		game.initializeBoard();
		boolean quit = false;

		do {
			System.out.println(game.toString());
			System.out.println("Please enter row, column and value, separated by commas");
			System.out.println("Valid values [1-9] ");

			if (!game.checkPuzzle()) {
				System.out.println("*** That's an invalid input. Fix it. ***");
			}

			System.out.print("Or enter (s) to solve, (r) to reset game or (q) to quit :-> ");

			String input = sc.nextLine();
			
			if (input.equals("r")) {
				game.reset();
				game.initializeBoard();
			}else if (input.equals("")){
				System.out.println("you did not input anything please try again");
				
			} else if(input.equals("q")) {
				break;
			} else if (input.equals("s")) {
				// System.out.println("Enter row, col to test Allowed Values: ");
				// input = sc.nextLine();
				// String[] inputs = input.split(",");	
				// int row = Integer.parseInt(inputs[0].trim());
				// int col = Integer.parseInt(inputs[1].trim());
				for (int row = 0; row <=8; row++) {
					for (int col = 0; col <= 8; col++) {
						boolean allowed[] = game.getAllowedValues(row, col);
						int options = 0;
						int num = 0;
						System.out.print("[ row: " + row + " col: " + col + " num(s): ");
						for (int i = 0; i < allowed.length; i++) {
							// count true
							if (allowed[i] == true) {
								options++;	
								num = i + 1; 
							}
							System.out.print( (allowed[i])? i+1 : "," );
						}
						System.out.print("]");
						if (options == 1 && game.getValueIn(row, col) == 0) {
							System.out.println(" -> " + num);
							game.addGuess(row+1, col+1, num);
						}
						System.out.println();
					}
				}	
			} else {
				String[] inputs = input.split(",");	
				int row = Integer.parseInt(inputs[0].trim()) - 1;
				int col = Integer.parseInt(inputs[1].trim()) - 1;
				int val = Integer.parseInt(inputs[2].trim());
				game.addGuess(row, col, val);

				if (game.isFull() && game.checkPuzzle()) {
					System.out.println("Congratulations!!!");
					break;
				}
			} 

		} while( !quit );

	}
}