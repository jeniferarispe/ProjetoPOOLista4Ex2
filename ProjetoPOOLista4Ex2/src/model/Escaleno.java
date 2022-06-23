package model;

public class Escaleno extends Triangulo{
private float semiPerimetro;

public Escaleno() {
	super();
}

public Escaleno(float semiPerimetro) {
this.semiPerimetro = semiPerimetro;


}

	public float getSemiPerimetro() {
	return semiPerimetro;
}

public void setSemiPerimetro(float semiPerimetro) {
	this.semiPerimetro = semiPerimetro;
}

	@Override
	public float calArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
