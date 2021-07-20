package cinemapt1;


import javafx.scene.image.Image;

public class Filme {
	public String nome;
	public Image cartaz;
	
	public Filme(String nome, Image cartaz) {
		this.nome = nome;
		this.cartaz = cartaz;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public Image getImage() {
		return cartaz;
	}
	
	
	
	
}
