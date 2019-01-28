package Code;

public class Evolve {
	
	String cell;
	String[] surrounding_cells;


	public Evolve(String cell, String[] cellArray) {
		this.surrounding_cells = cellArray;
		this.cell = cell;
	}

	public String[] getSurroundingCells() {
		return surrounding_cells;
	}

	public String runFullScenarios(int y) {
		if(y < 2) {
			cell = null;
		}
		if(y > 3) {
			cell = null;
		}
		if(y == 2 || y ==3) {
			cell = ".";
		}
		return cell;
	}

	public String runEmptyScenarios(int y) {
		if(y == 0) {
			cell = null;
		}
		if(y == 3) {
			cell = ".";
		}
		if(y != 0 && y != 3) {
			cell = null;
		}
		return cell;
	}

}
