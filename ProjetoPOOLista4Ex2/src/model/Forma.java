package model;

public abstract class Forma {
	protected float area;
	protected float perimetro;

	public Forma() {

	}

	public Forma(float area, float perimetro) {
		this.area = area;
		this.perimetro = perimetro;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

	public abstract float calPerimetro();

	public abstract float calArea();

}
