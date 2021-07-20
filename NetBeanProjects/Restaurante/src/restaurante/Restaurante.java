/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author felps
 */
public class Restaurante {
    
    static void endl(){
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);        
        Menu cardapio = new Menu();
        ArrayList<Mesa> mesas = new ArrayList<Mesa>();
        
        
        int loop = -1, numMesa, numPessoas, qtdMesa = 0,op;
        
        do{
            System.out.print("[1]Reservar mesa\n[2]Cardapio\n[3]Fazer pedido\n"
                             + "[4]Cancelar pedido\n[5]Levar a conta\n[6]Efetuar pagamento\n"
                             + "[7]Liberar mesa\n[8]Adicionar prato ao cardapio\n[0]Sair\nEscolha a opcao: ");
            op= cin.nextInt();
            
            switch(op){
                case 1:
                    System.out.print("\nNumero da mesa: ");
                    numMesa = cin.nextInt();
                    
                    System.out.print("Mesa para quantos: ");
                    numPessoas = cin.nextInt();
                    
                    mesas.add(new Mesa(numMesa,numPessoas));
                    
                    endl();
                    break;
                case 2:
                    System.out.print("\n" + cardapio + "\n");
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                    
                case 7:
                    break;
                    
                case 8:
                    break;
                    
                case 0:
                    loop = 0;
                    break;
            }
        }while(loop!=0);
    }
}
