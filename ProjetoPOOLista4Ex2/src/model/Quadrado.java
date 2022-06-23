package model;

public class Quadrado extends Quadrilatero {

	private float lado;

	public Quadrado() {
		super();
	}

	public Quadrado(float lado) {
		super();
		this.lado=lado;
		
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
		return lado*lado;

	}

	@Override
	public float calPerimetro() {
		// TODO Auto-generated method stub
		return lado+lado+lado+lado;

	}


}
