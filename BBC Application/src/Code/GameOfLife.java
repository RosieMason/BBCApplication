package Code;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfLife {

	public static void main(String[] args) {
		
		//Initialise a new Game of Life
		GameOfLife game = new GameOfLife();
		
		//Input the initial Grid conditions - I have assumed this will be done manually as an array 
		//this code runs on "." being a live cell and null cells being dead cells 
		String[][] cells = new String[3][3];
		cells[0][1] = ".";
		cells[1][1] = ".";
		cells[2][1] = ".";
		
		
		int k = 0;
		
		//loop over a number of like cycles (in this case I have run over 10) 
		while(k < 10) {
			//create an array to fill with the new cell composition (it will be the same size as the input array)
			String[][] new_cells = new String[cells.length][(cells[0].length)];
					 
			//loop over the length of the array 
			for(int i = 0; i < cells.length ; i++) {
				
				//loop over the width of each of the arrays 
				for(int j = 0 ; j < cells[i].length; j++) {
					
					//find the cell of interest 
					String cell = cells[i][j];
					//create an array of the surrounding cells 
					SurroundingCells surrounding_cells = new SurroundingCells(cell, cells, i, j);
					String[] cellArray = surrounding_cells.findSurroundingCells();
					
					//initialise the evolution of the cell of interest
					Evolve evolution = new Evolve(cell, cellArray);
					
					//find the number of live cells in the surrounding cells 
					int y = surrounding_cells.getFull(cellArray);
					String new_cell = "";
					
					//if the cell is live, run the live cell scearios 
					if(cell == ".")
						new_cell = evolution.runFullScenarios(y);
					
					//otherwise run the dead cell scenarios 
					else
						new_cell = evolution.runEmptyScenarios(y);
					
					//input the new cell value
					new_cells[i][j] = new_cell;
					
				}
				
			}
			
			//update the cell 
			cells = new_cells;
			
			//print the cell in an appropriate manner 
			for(int i =0; i < cells.length; i++) {
				System.out.println(Arrays.toString(cells[i]));
			}
		
			//print a line to seperate the cells 
			System.out.println("-----------------");
			
			//increase the value of the loop 
			k+=1;
		}
		
	}

}
