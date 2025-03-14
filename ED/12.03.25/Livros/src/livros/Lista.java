/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livros;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Lista {
    
    private Livros cabeca;
    private Livros Anterior;
    
    
    public void adiciona(Livros livro){
        if (Anterior == null){
            Anterior = livro;
        }else{
            cabeca = livro;
            cabeca.setAnterior(Anterior);
            Anterior = cabeca;
        }
    }
    
    public void remover (){
     cabeca = cabeca.getAnterior();
     Anterior = cabeca;
    }
   }
    
    public Livros cabeca(){
    return cabeca;
    }

public void mostrarLivros (){



    
     
    
    
      
    
    public void listarLivros(){
    Livros livrosatualizados = cabeca;
    while (livrosatualizados != null){
        System.out.println("Nome:" + livrosatualizados.getNome() + "\n Ano: " + livrosatualizados.getAno() + "\n Preço: " + livrosatualizados.getPreco());
        livrosatualizados = livrosatualizados.getAnterior();
    }
}


public static void main (String [] args){
       
    
    
}}

