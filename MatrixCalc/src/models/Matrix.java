package models;

import java.util.ArrayList;

public class Matrix {

	private ArrayList<MatrixEntry> entries = new ArrayList<MatrixEntry>();
	private int dimensionI;
	private int dimensionJ;
	
	public Matrix(int dimensionI, int dimensionJ, ArrayList<Double> entries) throws Exception {
		setDimensionI(dimensionI);
		setDimensionJ(dimensionJ);
		setEntries(entries);
	}
	
	public void setDimensionI(int dimensionI) {
		this.dimensionI = dimensionI;
	}
	
	public void setDimensionJ(int dimensionJ) {
		this.dimensionJ = dimensionJ;
	}
	
	public void setEntries(ArrayList<Double> entries) throws Exception {
		if(!checkEntries(entries)) {
			throw new Exception("Fail");
		}
		for(int i = 0; i < getDimensionI(); ++i) {
			for(int j = 0; j < getDimensionJ(); ++j) {
				double value = entries.get(i * getDimensionI() + j);
				this.entries.add(new MatrixEntry( (i+1), (j+1), value));
			}
		}
	}
	
	private static boolean checkEntries(ArrayList<Double> entries) {
		//TODO
		return true;
	}
	
	public int getDimensionI() {
		return dimensionI;
	}
	
	public int getDimensionJ() {
		return dimensionJ;
	}
}
