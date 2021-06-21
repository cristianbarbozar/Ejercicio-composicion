/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadoras;

import ico.fes.comp.Computadora;
import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;



/**
 *
 * @author CBR19
 */
public class Computadoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora comp1=new Computadora();
        Computadora comp2=new Computadora("HP", 234,new Mouse("HP","34f", "Gamer"),new Monitor("f500","HP", 24),new Cpu(),new Teclado());
        
        
        
       
        
    }
    
}
