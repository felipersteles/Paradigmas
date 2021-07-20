package gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

import javafx.scene.image.Image;

public class Sessao {
	public ArrayList<Filme> sessoes = new ArrayList<Filme> ();
	public ArrayList<Sala> salas = new ArrayList<Sala> ();

	
	public Sessao() throws FileNotFoundException {
		populateSessao();
		populateSala();

	}
	

	public void populateSessao() throws FileNotFoundException {
		sessoes.add(new Filme("Transformers.", new Image(new FileInputStream("D:\\2019.2\\PARADIGMAS\\Eclipse\\JavaFX1\\Images\\transformers.jpg")), 12, 23));
		sessoes.add(new Filme("Transformers 2: A Vingança dos Derrotados.", new Image(new FileInputStream("D:\\2019.2\\PARADIGMAS\\Eclipse\\JavaFX1\\Images\\transformers2.jpg")), 10, 4));
		sessoes.add(new Filme("Transformers 3: O Lado Oculto da Lua.", new Image(new FileInputStream("D:\\2019.2\\PARADIGMAS\\Eclipse\\JavaFX1\\Images\\transformers3.jpg")), 3, 11));
		sessoes.add(new Filme("Transformers: A Era da Extinção.", new Image(new FileInputStream("D:\\2019.2\\PARADIGMAS\\Eclipse\\JavaFX1\\Images\\transformers4.jpg")), 6, 7));	
		
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
	
	public String allNomes() {
		for(Filme filme : sessoes) {
			return filme.getNome();
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
	
	public Date findData1(int aux){
		int cont = 0;
        for(Filme filme : sessoes){
        	if(cont == aux) {
        		return filme.getData1();
        	}
        	else {
        		cont++;
        	}
        }
        return null;
    }
	
	public Date findData2(int aux){
		int cont = 0;
        for(Filme filme : sessoes){
        	if(cont == aux) {
        		return filme.getData2();
        	}
        	else {
        		cont++;
        	}
        }
        return null;
    }
	
}
