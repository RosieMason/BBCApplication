package Code;

import java.util.Arrays;

public class SurroundingCells  {
	
	//a class to create an array of the cells surrounding a cell of interest 

	//initialise the variables
	int i; //identifier
	int j; //identifier 
	String cell; //current central cell
	String[][] cells; //String for the game of life
	String[] return_cell = new String[9]; //the array will always have 9 components, the central cell will always be null

	//define the variables 
	public SurroundingCells(String cell, String[][] cells, int i, int j) {
		this.i = i;
		this.j = j;
		this.cell = cell;
		this.cells = cells;
	}
	
	//creates an array of the cells surrounding the cell of interest 
	public String[] findSurroundingCells() {
		int c = 0;
		//runs between the line of cells above and one below of the cell of interest 
		for(int a = i - 1; a < i + 2; a++) {
			//runs if the cell is within the defines grid (i.e is an actual cell will be called)
			if(a > -1 && a < cells.length) {
				//find an array of the cells either above, in line with or below the cell of interest 
				String[] cell_line = cells[a];
				//run over the cells to the right, in line with and to the left of the cell of interest 
				for(int b = j - 1; b < j + 2; b++) {
					//runs if the cell is within the defines grid (i.e is an actual cell will be called)
					if(b > -1 && b < cell_line.length) {
						//add the cell to the list of surrounding cells 
						return_cell[c] = cell_line[b];
					}
					//increase the loop 
					c += 1;
			}
			}
			//runs if the line of cells is not within the given grid(i.e the cells are out of bounds)
			else {
				int i = 0;
				//loop over three cells to simulate the cells to the left, in line with and to the right of the cell of interest
				while(i < 3) {
					//add a null cell to the surorunding cells 
					return_cell[c] = null;
					//increase loops 
					c += 1;
					i += 1;
				}
			}
		}
		//set the cell of interest to a null as to not scew the evolution
		return_cell[4] = null;
		return return_cell;
	}

	//finds the number of live cells in the surrounding cells 
	public int getFull(String[] cells) {
		int n = 0;
		//loop over all elements of the array 
		for(int i = 0; i < 9; i++) {
			//if the cell is live increase the number of live cells 
			if(cells[i] == ".") {
				n += 1;
			}
		}
		return n;
	}

}
