package classeExecutavel;

import javax.swing.JOptionPane;

import model.Equilatero;
import model.Isosceles;
import model.Losango;
import model.Paralelogramo;
import model.Quadrado;
import model.Retangulo;
import model.Trapezio;
import model.TriRetangulo;

public class classeExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado quadrado1 = new Quadrado();

		String ladoquadrado = JOptionPane.showInputDialog("Digite os Lados do Quadrado:");
		quadrado1.setLado(Float.parseFloat(ladoquadrado));
		System.out.println("Area do Quadrado: " + quadrado1.calArea());
		System.out.println("Perimetro do Quadrado: " + quadrado1.calPerimetro());
		System.out.println("------------------------------------");

		Paralelogramo paralelogramo1 = new Paralelogramo();

		String altura = JOptionPane.showInputDialog("Digite a altura do Paralelogramo:");
		paralelogramo1.setAltura(Float.parseFloat(altura));
		String base = JOptionPane.showInputDialog("Digite a base do Paralelogramo:");
		paralelogramo1.setBase(Float.parseFloat(base));
		String ladop = JOptionPane.showInputDialog("Digite o lado do Paralelogramo:");
		paralelogramo1.setLado(Float.parseFloat(ladop));

		System.out.println("Area do Paralelogramo: " + paralelogramo1.calArea());
		System.out.println("Perimetro do Paralelogramo: " + paralelogramo1.calPerimetro());
		System.out.println("------------------------------------");

		Retangulo retangulo1 = new Retangulo();

		altura = JOptionPane.showInputDialog("Digite a altura do Retangulo:");
		retangulo1.setAltura(Float.parseFloat(altura));
		base = JOptionPane.showInputDialog("Digite a base do Retangulo:");
		retangulo1.setBase(Float.parseFloat(base));

		System.out.println("Area do Retangulo: " + retangulo1.calArea());
		System.out.println("Perimetro do Retangulo: " + retangulo1.calPerimetro());
		System.out.println("------------------------------------");

		Trapezio trapezio1 = new Trapezio();

		altura = JOptionPane.showInputDialog("Digite a altura do Trapezio:");
		trapezio1.setLado1(Float.parseFloat(altura));
		base = JOptionPane.showInputDialog("Digite a base Maior do Trapezio :");
		trapezio1.setLado2(Float.parseFloat(base));
		String base2 = JOptionPane.showInputDialog("Digite a base Menor do Trapezio :");
		trapezio1.setBaseMenor(Float.parseFloat(base2));
		String ladoT1 = JOptionPane.showInputDialog("Digite o lado do Trapezio :");
		trapezio1.setLado1(Float.parseFloat(ladoT1));
		String ladoT2 = JOptionPane.showInputDialog("Digite o lado do Trapezio :");
		trapezio1.setLado2(Float.parseFloat(ladoT2));

		System.out.println("Area do Trapezio: " + trapezio1.calArea());
		System.out.println("Perimetro do Trapezio: " + trapezio1.calPerimetro());

		System.out.println("------------------------------------");

		Losango losango1 = new Losango();

		String diagonalMaior = JOptionPane.showInputDialog("Digite o comprimento da diagonal Maior do Losango:");
		losango1.setDiagonalMaior(Float.parseFloat(diagonalMaior));
		String diagonalMenor = JOptionPane.showInputDialog("Digite o comprimento da diagonal Menor do Losango:");
		losango1.setDiagonalMenor(Float.parseFloat(diagonalMenor));

		String lado = JOptionPane.showInputDialog("Digite o valor do lado do Losango :");
		losango1.setLado(Float.parseFloat(lado));

		System.out.println("Area do Losango: " + losango1.calArea());
		System.out.println("Perimetro do Losango: " + losango1.calPerimetro());

		System.out.println("------------------------------------");

		Equilatero equilatero1 = new Equilatero();

		altura = JOptionPane.showInputDialog("Digite a altura do Equilatero:");
		equilatero1.setAltura(Float.parseFloat(altura));
		base = JOptionPane.showInputDialog("Digite a base do Equilatero :");
		equilatero1.setBase(Float.parseFloat(base));
		lado = JOptionPane.showInputDialog("Digite o valor do lado do Equilatero :");
		equilatero1.setLado1(Float.parseFloat(lado));

		lado = JOptionPane.showInputDialog("Digite o valor do lado do Equilatero :");
		equilatero1.setLado2(Float.parseFloat(lado));

		System.out.println("Area do Losango: " + equilatero1.calArea());
		System.out.println("Perimetro do Losango: " + equilatero1.calPerimetro());

		System.out.println("------------------------------------");

		Isosceles isosceles1 = new Isosceles();

		String lado1 = JOptionPane.showInputDialog("Digite o comprimento de um lado do Triangulo Isosceles:");
		isosceles1.setAltura(Float.parseFloat(lado1));
		String lado2 = JOptionPane.showInputDialog("Digite o comprimento do outro lado do Triangulo Isosceles:");
		isosceles1.setBase(Float.parseFloat(lado2));
		String lado3 = JOptionPane.showInputDialog("Digite o comprimento da base do Triangulo Isosceles:");
		isosceles1.setLado1(Float.parseFloat(lado3));

		System.out.println("Area do Triangulo Isosceles: " + isosceles1.calArea());
		System.out.println("Perimetro do Triangulo Isosceles: " + isosceles1.calPerimetro());

		System.out.println("------------------------------------");

		TriRetangulo TriRetangulo1 = new TriRetangulo();

		altura = JOptionPane.showInputDialog("Digite o comprimento de um lado do Triangulo Retangulo:");
		TriRetangulo1.setAltura(Float.parseFloat(altura));
		base = JOptionPane.showInputDialog("Digite o comprimento do outro lado do Triangulo Retangulo:");
		TriRetangulo1.setBase(Float.parseFloat(base));
		lado1 = JOptionPane.showInputDialog("Digite o comprimento da base do Triangulo Retangulo:");
		TriRetangulo1.setLado1(Float.parseFloat(lado1));

		System.out.println("Area do Triangulo Retangulo: " + TriRetangulo1.calArea());
		System.out.println("Perimetro do Triangulo Retangulo: " + TriRetangulo1.calPerimetro());
	}

}
