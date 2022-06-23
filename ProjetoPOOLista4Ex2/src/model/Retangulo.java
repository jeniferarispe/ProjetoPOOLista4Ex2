package model;

public class Retangulo extends Quadrilatero {


	public Retangulo() {
		super();
	}


	@Override
	public float calArea() {
		return area= base*altura;
	}

	@Override
	public float calPerimetro() {
		// TODO Auto-generated method stub
		return perimetro=2*( altura+base);
	}

}
