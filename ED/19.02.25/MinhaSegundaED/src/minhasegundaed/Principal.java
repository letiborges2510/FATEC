/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minhasegundaed;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Principal {
   
    public static void main (String [] args){
        Pizza p1 = new Pizza ("mussarela", 50.00);
        Pizza p2 = new Pizza ("quatro quejos", 50.00);
        Pizza p3 = new Pizza ("frango e catupiry", 50.00);
        Pizza p4 = new Pizza ("la grase", 80.00);
        Pizza p5 = new Pizza ("baicon", 80.00);
        
        
        Bebida b1 = new Bebida ("Coca-Cola", 12.00);
        Bebida b2 = new Bebida ("Sprite", 10.00);
        
         CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        
        c1.adicionaPizza(p1);
        c1.adicionaPizza(p2);
        c1.adicionaPizza(p3);
        c1.adicionaPizza(p4);
        c1.adicionaPizza(p5);
        c1.adicionaBebida(b1);
        c1.adicionaBebida(b2);
        
        
        System.out.println("Total a pagar = " + c1.getTotalPagar());
    }
}

       
