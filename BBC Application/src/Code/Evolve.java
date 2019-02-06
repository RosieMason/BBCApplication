package Code;

public class Evolve {
	//a class the maps the evolution of the cells 
	
	//initialise variables 
	String cell; //the cell of interest 
	String[] surrounding_cells; //an array of the surrounding cells 


	//define the cell and surrounding cells
	public Evolve(String cell, String[] cellArray) {
		this.surrounding_cells = cellArray;
		this.cell = cell;
	}

	//returns the array surrounding_cells
	public String[] getSurroundingCells() {
		return surrounding_cells;
	}

	//runs if the cell of interest if live/full, input y is the number of live cells, returns the new value for the central cell
	public String runFullScenarios(int y) {
		//if there are less than 2 live cells, the cell of interest dies 
		if(y < 2) {
			cell = null;
		}
		//if there are more than three live cells the cell of interest dies 
		if(y > 3) {
			cell = null;
		}
		//if there are 2 or 3 live cells the cell of interest remains alive 
		if(y == 2 || y ==3) {
			cell = ".";
		}
		return cell;
	}

	//runs if the cell of interest if dead/empty, input y is the number of live cells, returns the new value for the central cell
	public String runEmptyScenarios(int y) {
		//if there are exactly three live cells the cell of interest becomes live 
		if(y == 3) {
			cell = ".";
		}
		//if there are not three live cells the cell of interest remains dead
		if(y != 3) {
			cell = null;
		}
		return cell;
	}

}
