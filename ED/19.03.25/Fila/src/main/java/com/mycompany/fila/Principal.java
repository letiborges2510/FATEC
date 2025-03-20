/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        fila.enfileira("a");
        fila.enfileira("b"); 
        fila.enfileira("c");
        fila.enfileira("d");
        fila.desenfileira();
        fila.imprime();
        fila.enfileira("e");
        fila.enfileira("f"); 
        fila.desenfileira();
        fila.imprime();
    }
}
