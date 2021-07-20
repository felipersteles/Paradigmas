/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.*;

/**
 *
 * @author vinij
 */
public class Menu {

    public ArrayList<Item> pratos = new ArrayList<Item>();

    public Menu() {
        populateMenu();
    }
    
    public void populateMenu() {
        pratos.add(new Item(22 , "Hamburger" , 20));
        pratos.add(new Item(31 , "Fritas" , 13));
        pratos.add(new Item(11 , "Coca-cola" , 5));
        pratos.add(new Item(8 , "Cerveja" , 7));
        pratos.add(new Item(10 , "Hot-dog" , 18));
        pratos.add(new Item(7 , "Salada" , 12));
    }

    public boolean testPratoId(int ID,ArrayList<Item> lista) {
        for (Item item : lista) {
            if (item.getID() == ID)
                return true;
        }
        return false;
    }
    
    public double findPricePrato(int ID) {
        for (Item item : pratos) {
            if (item.getID() == ID) {
                return item.getPrice();
            }
        }
        return 0;
    }

    public String findNamePrato(int ID) {
        String aux;
        for (Item item : pratos) {
            if (item.getID() == ID) {
                aux = item.getName();
                return aux;
            }
        }
        return null;
    }

    /*public String toString() {
        String aux = "";
        aux += "-----------CARDAPIO-----------";
        aux += "\nCOD.\t NOME\t  PRECO\n";
        aux += "------------------------------\n";
        for (Item lista: pratos) {
            aux += lista.getID() + ". \t" + lista.getName() + "\t R$" + lista.getPrice();
            aux += "\n";
        }
        
        aux += "------------------------------\n";
        return aux;
    }*/
    public String toString(){
       String values = "";
       values+= "---------------CARDAPIO-------------\n";
       for(Item item : pratos){
           values+= item.getID() + ".\t\t" + item.getName() +  "\t\tR$" + item.getPrice();
           values+= "\n";
       }
       return values;
    }
}
