package Code;

import java.util.Arrays;

public class SurroundingCells  {

	//establish components of the surrounding cells 
	int i; //identifier
	int j; //identifier 
	String cell; //current central cell
	String[][] cells; //String for the game of life
	String[] return_cell = new String[9];


	public SurroundingCells(String cell, String[][] cells, int i, int j) {
		this.i = i;
		this.j = j;
		this.cell = cell;
		this.cells = cells;
	}
	
	public String[] findSurroundingCells() {
		int c = 0;;
		for(int a = i - 1; a < i + 2; a++) {
			if(a > -1 && a < cells.length) {
				String[] cell_line = cells[a];
				for(int b = j - 1; b < j + 2; b++) {
					if(b > -1 && b < cell_line.length) {
						return_cell[c] = cell_line[b];
					}
					c += 1;
			}
			}
			else {
				int i = 0;
				while(i < 3) {
					return_cell[c] = null;
					c += 1;
					i += 1;
				}
			}
		}
		return_cell[4] = null;
		return return_cell;
	}

	
	public int getFull(String[] cells) {
		int n = 0;
		for(int i = 0; i < 9; i++) {
			if(cells[i] == ".") {
				n += 1;
			}
		}
		return n;
	}

}
