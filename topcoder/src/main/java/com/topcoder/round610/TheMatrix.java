package com.topcoder.round610;

/*
 * Single Round Match 610 Round 1 - Division I, Level One
 * Single Round Match 610 Round 1 - Division II, Level Two
 * http://community.topcoder.com/stat?c=problem_statement&pm=13035&rd=15843
 */
public class TheMatrix {

	int[] calcuLine(boolean[] line) {
		int[] res = new int[line.length];
		int count = 1;
		for (int i = 0; i < line.length - 1; i++) {
			if (line[i] ^ line[i + 1]) {
				count++;
			} else {
				do {
					res[i - count + 1] = count;
					count--;
				} while (count > 0);
				count = 1;
			}
		}
		do {
			res[line.length - count] = count;
			count--;
		} while (count > 0);
		return res;
	}

	int[][] calculRows(String[] board) {
		int[][] rows = new int[board.length][];
		for (int i = 0; i < board.length; i++) {
			boolean[] line = new boolean[board[0].length()];
			for (int j = 0; j < board[0].length(); j++) {
				line[j] = (board[i].charAt(j) == '1') ? true : false;
			}
			rows[i] = calcuLine(line);
		}
		return rows;
	}

	int[][] calculCols(String[] board) {
		int[][] cols = new int[board.length][board[0].length()];
		for (int i = 0; i < board[0].length(); i++) {
			boolean[] line = new boolean[board.length];
			for (int j = 0; j < board.length; j++) {
				line[j] = (board[j].charAt(i) == '1') ? true : false;
			}
			int[] col = calcuLine(line);
			for (int j = 0; j < board.length; j++) {
				cols[j][i] = col[j];
			}
		}

		return cols;
	}

	public int maxArea(String[] board) {
		int[][] cols = calculCols(board);
		int[][] rows = calculRows(board);
		int max = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length(); j++) {
				if (cols[i][j] * rows[i][j] > max) {
					int width = rows[i][j];
					max = Math.max(cols[i][j], rows[i][j]) > max ? Math.max(cols[i][j], rows[i][j]) : max;
					for (int k = 1; k < cols[i][j]; k++) {
						if (rows[i + k][j] < width) {
							max = width * k > max ? width * k : max;
							width = rows[i + k][j];
						}
						if (width * cols[i][j] < max) {
							break;
						}
					}
					if (width * cols[i][j] > max) {
						max = width * cols[i][j];
					}
				}
			}
		}

		return max;
	}
}
