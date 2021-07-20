package gui;


import java.util.Calendar;
import java.util.Date;

import javafx.scene.image.Image;

public class Filme {
	public String nome;
	public Image cartaz;
	public Date Data1;
	public Date Data2;
	public Calendar cal = Calendar.getInstance();
	
	public Filme(String nome, Image cartaz, int hour1, int hour2) {
		this.nome = nome;
		this.cartaz = cartaz;
		cal.set(Calendar.HOUR_OF_DAY, hour1);
		Data1 = cal.getTime();
		cal.set(Calendar.HOUR_OF_DAY, hour2);
		Data2 = cal.getTime();
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public Image getImage() {
		return cartaz;
	}
	
	public Date getData1() {
		return Data1;
	}
	
	public Date getData2() {
		return Data2;
	}
	
	
}
