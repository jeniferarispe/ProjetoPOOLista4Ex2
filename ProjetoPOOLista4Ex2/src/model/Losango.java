package model;

public class Losango extends Quadrilatero {
	private float diagonalMaior;
	private float diagonalMenor;
	private float lado;

	public Losango() {
		super();
	}

	public Losango(float diagonalMaior, float diagonalMenor, float lado) {
		super();
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
		this.lado = lado;
	}

	public float getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(float diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}

	public float getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(float diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public float calArea() {
		// TODO Auto-generated method stub
		return area= (diagonalMaior*diagonalMenor)/2;
	}

	@Override
	public float calPerimetro() {
		// TODO Auto-generated method stub
		return perimetro =this.lado*4;
	}
	
	

}
