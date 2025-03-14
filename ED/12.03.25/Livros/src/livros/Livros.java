/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livros;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Livros {

    
    private String nome;
    private int ano;
    private double preco;
    
    private Livros Anterior;
    
   public Livros (String nome,int ano,double preco, Livros Anterior){
       this.nome = nome;
       this.ano = ano;
       this.preco = preco;
     
   }
    
   public String getNome(){
       return nome;
   }
   
    public void setNome(String nome){
       this.nome = nome;
   }
   
   public int getAno(){
       return ano;
   }
   
    public void setAno(int ano){
       this.ano = ano;
   }
    
   
   public double getPreco(){
       return preco;
   }
   
    public void setpPreco(double preco){
       this.preco = preco;
   }
   
 
   public Livros getAnterior(){
       return Anterior;
   }
   
   public Livros setAnterior(){
       return Anterior;
   }
   
   public String (toString()){
       
   }
    /*
     * @param args the command line arguments
     */
    
    
}
