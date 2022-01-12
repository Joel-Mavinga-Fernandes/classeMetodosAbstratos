package entidades;

import entidades.enums.Cor;

public class Circulo extends Forma {

	private double raio;
	
	public Circulo() {
	}

	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}



	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
	return	raio * raio * Math.PI;
	}
	
	
}
