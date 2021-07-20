package cinemapt1;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;

public class Sessao {
	public ArrayList<Filme> sessoes = new ArrayList<Filme> ();
	public ArrayList<Sala> salas = new ArrayList<Sala> ();
	
	public Sessao() throws FileNotFoundException {
		populateSessao();
		populateSala();
		
	}
	
	public void populateSessao() throws FileNotFoundException {
		sessoes.add(new Filme("Transformers 1", new Image(new FileInputStream("C:\\Users\\vinij\\Documents\\transformers.jpg"))));
		sessoes.add(new Filme("Transformers 2: A vingan�a dos Derrotados", new Image(new FileInputStream("C:\\Users\\vinij\\Documents\\transformers2.jpg"))));
		sessoes.add(new Filme("Transformers 3", null));
		sessoes.add(new Filme("Transformers 4", null));	
		
	}
	
	public void populateSala() {
		salas.add(new Sala(42, 1));
		salas.add(new Sala(30, 2));
		salas.add(new Sala(15, 3));
		salas.add(new Sala(60, 4));	
	}
	
	public int findCapacidade(int aux) {
		int cont = 0;
		for(Sala sala : salas) {
			if(cont == aux) {
				return sala.getCapacidade();
			}
			else {
				cont++;
			}
		}
		return 0;
	}
	
	public int findSala(int aux) {
		int cont = 0;
		for(Sala sala : salas) {
			if(cont == aux) {
				return sala.getSala();
			}
			else {
				cont++;
			}
		}
		return 0;
	}
	
	public String findNome(int aux){
		int cont = 0;
        for(Filme filme : sessoes){
        	if(cont == aux) {
        		return filme.getNome();
        	}
        	else {
        		cont++;
        	}
        }
        return null;
    }
	
	
	public Image findImage(int aux) {
		int cont = 0;
        for(Filme filme : sessoes){
        	if(cont == aux) {
        		return filme.getImage();
        	}
        	else {
        		cont++;
        	}
        }
        return null;
	}
	
}
