package model;

public abstract class Quadrilatero extends Forma {
	protected float base;
	protected float altura;

	public Quadrilatero() {
		super();
	}

	public Quadrilatero(float base, float altura) {
		super();
		this.base = base;
	
		this.altura = altura;

	}
	

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float calArea() {
		return area = base * altura;
	}
	
	public float calPerimetro() {
		return perimetro = 2 * (base + altura);
	}
	

}
