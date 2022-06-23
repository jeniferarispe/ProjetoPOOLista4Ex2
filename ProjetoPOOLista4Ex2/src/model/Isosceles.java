package model;

public class Isosceles extends Triangulo {
	public Isosceles() {
		super();
	}

	@Override
	public float calArea() {
		return area = (base * altura) / 2;
	}

	@Override
	public float calPerimetro() {
		return this.lado1 + this.lado2 + this.base;
	}

}
