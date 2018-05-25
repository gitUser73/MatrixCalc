package models;

public class MatrixEntry {

	private int i;
	private int j;
	
	private double value;
	
	public MatrixEntry(int i, int j, double value) {
		setI(i);
		setJ(j);
		setValue(value);
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public void setJ(int j) {
		this.j = j;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public int getI() {
		return i;
	}
	
	public int getJ() {
		return j;
	}
	
	public double getValue() {
		return value;
	}
}
