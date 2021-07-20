package cinemapt1;

public class Sala {
	public int capacidade;
	public int nSala;
	
	public Sala(int capacidade, int nSala) {
		this.capacidade = capacidade;
		this.nSala = nSala;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public int getSala() {
		return nSala;
	}
	
	public void RemoveCadeira() {
		capacidade--;
	}
}
