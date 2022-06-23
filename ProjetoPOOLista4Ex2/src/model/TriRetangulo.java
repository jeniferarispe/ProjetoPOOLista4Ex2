package model;

public class TriRetangulo extends Triangulo {
	public TriRetangulo() {
		super();
	}

	@Override
	public float calArea() {
		return area = (base * altura) / 2;
	}

	@Override
	public float calPerimetro() {
		return perimetro = base + altura + lado1;
	}

}
