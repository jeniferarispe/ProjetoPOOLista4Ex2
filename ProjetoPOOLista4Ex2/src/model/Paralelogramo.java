package model;

public class Paralelogramo extends Quadrilatero{
	float lado;

	public Paralelogramo() {
		super();
	}
	public Paralelogramo(float base, float altura, float lado) {
		super(base, altura);
		this.lado = lado;
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
		return area= base*altura;

	}

	@Override
	public float calPerimetro() {
		// TODO Auto-generated method stub
		return perimetro=2*( lado+base);

	}

}
