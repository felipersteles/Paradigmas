/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;

/**
 *
 * @author felps
 */
public class Mesa extends Menu {

    public int nMesa;
    public int nPessoas;
    public ArrayList<Item> pedidos = new ArrayList<Item>();
    public int[] qtd;
    public double conta;

    public Mesa(int numero, int cadeiras) {
        nMesa = numero;
        nPessoas = cadeiras;
    }
    
    public boolean addPedido(int codigo) {
        double preco;
        String name;

        if (super.testPratoId(codigo, pratos) == true) {

            preco = super.findPricePrato(codigo);
            if (super.testPratoId(codigo, pedidos) != true) {
                name = super.findNamePrato(codigo);
                pedidos.add(new Item(codigo, name, preco));

                qtd[codigo] = 1;
            } else 
                qtd[codigo]++;
            
            conta += preco;
            return true;
        }
        return false;
    }

    boolean removePedido(int codigo) { 
        if (testPratoId(codigo, pedidos) == true) {     //caso n tenha na lista de pedidos
            String name = super.findNamePrato(codigo);
            double price = super.findPricePrato(codigo);

            pedidos.remove(codigo);
            qtd[codigo]--;
            conta -= price;
            return true;
        }
        return false;
    }

    static void listarPedidos() {
    }

    public String toString() {
        String total = "";
        int auxInt = 0;

        total += ("\n------------MESA" + nMesa + "------------\n"+
                "\n------------------------------\nQTD.\tNOME\tPRECO"+
                "\n------------------------------\n");

        for (Item lista : pedidos) {
            auxInt++;
            total += (auxInt + "..." + lista.getName() + "\t" + lista.getPrice());
        }
        total += ("\n------------------------------\n"
                + "TOTAL:\t\t" + conta);

        return total;
    }
    
    public double getConta(){
        return conta;
    }
}


