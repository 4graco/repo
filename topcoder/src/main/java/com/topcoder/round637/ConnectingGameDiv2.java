package com.topcoder.round637;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/*
 * Single Round Match 637 Round 1 - Division II, Level Three
 * http://community.topcoder.com/stat?c=problem_statement&pm=13507&rd=16080
 */
public class ConnectingGameDiv2 {

	public int getmin(String[] board) {
		Grid grid = new Grid();
		grid.fillGrid(board);

		Set<Character> visited = new HashSet<Character>();
		// add region from first column to queue
		PriorityQueue<Path> pathQueue = new PriorityQueue<Path>();
		for (String element : board) {
			char regName = element.charAt(0);
			if (!visited.contains(regName)) {
				pathQueue.add(new Path(regName, grid));
				visited.add(regName);
			}
		}

		Path curPath = pathQueue.poll();
		while (!curPath.isFinished()) {
			Set<Character> neighbors = curPath.getNeighbors();
			for (char name : neighbors) {
				if (!visited.contains(name)) {
					pathQueue.add(new Path(curPath, name));
					visited.add(name);
				}

			}
			curPath = pathQueue.poll();
		}
		return curPath.getLength();
	}
}

class Path implements Comparable<Path> {

	private char name;
	private int length;
	private Grid grid;

	@Override
	public int compareTo(Path comparePath) {
		return this.getLength() - comparePath.getLength();
	}

	Path(char regName, Grid grid) {
		this.grid = grid;
		name = regName;
		length = grid.getRegionByName(regName).getNumberOfCell();
	}

	Path(Path prevPath, char newRegion) {
		this.grid = prevPath.grid;
		name = newRegion;
		length = prevPath.getLength() + grid.getRegionByName(newRegion).getNumberOfCell();
	}

	boolean isFinished() {
		return grid.getRegionByName(getName()).isGotBorder();
	}

	Set<Character> getNeighbors() {
		return grid.getRegionByName(name).getNeighbors();
	}

	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}

class Cell {

	private int row;
	private int col;

	Cell(int row, int col) {
		setCol(col);
		setRow(row);
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

}

class Region {

	private Set<Cell> cells;
	private Set<Character> neighbors;

	Region() {
		cells = new HashSet<Cell>();
		neighbors = new HashSet<Character>();
	}

	int getNumberOfCell() {
		return cells.size();
	}

	void addCell(Cell newCell) {
		cells.add(newCell);
	}

	void gotBorder() {
		neighbors = null;
	}

	boolean isGotBorder() {
		return neighbors == null;
	}

	int getSize() {
		return cells.size();
	}

	void addNeighbor(char name) {
		neighbors.add(name);
	}

	Set<Character> getNeighbors() {
		return neighbors;
	}

	Set<Cell> getCells() {
		return cells;
	}
}

class Grid {

	private Map<Character, Region> regions;

	Grid() {
		regions = new HashMap<Character, Region>();
	}

	Region getRegionByName(char name) {
		return regions.get(name);
	}

	void fillGrid(String[] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length(); j++) {
				this.addCell(board[i].charAt(j), new Cell(i, j));
			}
		}

		fillNeighborForRegions(board);
	}

	void fillNeighborForRegions(String[] board) {
		int size = board[0].length();
		for (Region curReg : regions.values()) {
			for (Cell curCell : curReg.getCells()) {
				if ((curCell.getCol() == size - 1)) {
					curReg.gotBorder();
					break;
				}
				int col = curCell.getCol();
				int row = curCell.getRow();
				char curCellName = board[row].charAt(col);

				addNeighbor(col - 1, row - 1, curCellName, curReg, board);
				addNeighbor(col - 1, row, curCellName, curReg, board);
				addNeighbor(col - 1, row + 1, curCellName, curReg, board);
				addNeighbor(col, row + 1, curCellName, curReg, board);
				addNeighbor(col, row - 1, curCellName, curReg, board);
				addNeighbor(col + 1, row - 1, curCellName, curReg, board);
				addNeighbor(col + 1, row, curCellName, curReg, board);
				addNeighbor(col + 1, row + 1, curCellName, curReg, board);
			}
		}
	}

	void addNeighbor(int col, int row, char name, Region region, String[] board) {
		int colSize = board[0].length();
		int rowSize = board.length;
		if (isIndexCorrect(col, colSize) && isIndexCorrect(row, rowSize)) {
			char newNeighbor = board[row].charAt(col);
			if (name != newNeighbor) {
				region.addNeighbor(newNeighbor);
			}
		}
	}

	private boolean isIndexCorrect(int index, int bordSize) {
		return index >= 0 && index < bordSize;
	}

	void addCell(char name, Cell newCell) {
		Region regin = regions.get(name);
		if (regin == null) {
			regin = new Region();
			regions.put(name, regin);
		}
		regin.addCell(newCell);
	}
}
