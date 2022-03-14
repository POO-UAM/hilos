/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Cajera;
import Modelos.Cliente;

/**
 *
 * @author pipet
 */
public class PreparacionHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("a1","Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("a2","Cliente 2", new int[]{1, 3, 5, 1, 1});

        Cajera cajera1 = new Cajera("c1","Cajera 1",1);
        Cajera cajera2 = new Cajera("c2","Cajera 2",1);
        
        cajera1.setCliente(cliente1);
        cajera2.setCliente(cliente2);
        
        Thread proceso1=new Thread(cajera1);
        Thread proceso2=new Thread(cajera2);
        
        proceso1.start();
        proceso2.start();
       
    }

}
