package Code;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfLife {

	public static void main(String[] args) {
		GameOfLife game = new GameOfLife();
		
		String[][] cells = new String[3][3];
		cells[0][1] = ".";
		cells[1][1] = ".";
		cells[2][1] = ".";
		
		
		int k = 0;
		
		while(k < 10) {
			String[][] new_cells = new String[cells.length][(cells[0].length)];
					 
			for(int i = 0; i < cells.length ; i++) {
				
				for(int j = 0 ; j < cells[i].length; j++) {
					
					String cell = cells[i][j];
					SurroundingCells surrounding_cells = new SurroundingCells(cell, cells, i, j);
					String[] cellArray = surrounding_cells.findSurroundingCells();
					Evolve evolution = new Evolve(cell, cellArray);
					
					int y = surrounding_cells.getFull(cellArray);
					String new_cell = "";
					
					if(cell == ".")
						new_cell = evolution.runFullScenarios(y);
					
					else
						new_cell = evolution.runEmptyScenarios(y);
					
					new_cells[i][j] = new_cell;
					
				}
				
			}
			
			
			cells = new_cells;
			for(int i =0; i < cells.length; i++) {
				System.out.println(Arrays.toString(cells[i]));
			}
		
			System.out.println("-----------------");
			
			k+=1;
		}
		
	}

}
