package gui;

public class Ingresso {
	private double valorinteiro;
	private double valormeia;
	
	Ingresso(double valor){
		valorinteiro = valor;
		valormeia = valor/2;
	}
	
	public double getValorInteiro() {
		return valorinteiro;
	}
	public double getValorMeia() {
		return valormeia;
	}
	
	public void setValorInteiro(double valor) {
		valorinteiro = valor;
		valorinteiro = valor/2;
	}
}
