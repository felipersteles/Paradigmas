package restaurante;

import java.util.*;

/**
 *
 * @author vinij
 */
public class Item {
    private double preco;
    private String nome;
    private int ID;

    public Item(int ID, String nome, double preco) {
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
        
    }
    
    public String getName(){
        return nome;
    }
    
    public double getPrice(){
        return preco;
    }
    
    public int getID(){
        return ID;
    }
}
