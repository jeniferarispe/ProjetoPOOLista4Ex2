package model;

public class Equilatero extends Triangulo {
	public Equilatero() {
		super();
	}

	@Override
	public float calArea() {
		return area = (float) ((lado1 * lado1 * Math.sqrt(3)) / 4);
	}

	@Override
	public float calPerimetro() {
		return this.lado1 + this.lado2 + this.base;
	}

}
