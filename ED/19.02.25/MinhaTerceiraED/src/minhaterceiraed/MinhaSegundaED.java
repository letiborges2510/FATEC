/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minhaterceiraed;

public class MinhaSegundaED {
    private String[] nomes = new String[26];
    private int totalNomes = 0;

    public void adiciona(String nome) {
        if (!verificanomes(nome)) {
            System.out.println("[Erro] Nome inválido: " + nome);
            return;
        }

       int posicao = getIndice(nome);

        if (!posicaoOcupada(posicao)) {
            nomes[posicao] = nome;
            totalNomes++;
            System.out.println("[Adição] Nome '" + nome + "' adicionado na posição " + posicao);
        } else {
            System.out.println("[Erro] Posição já ocupada por: " + nomes[posicao]);
        }
        System.out.println();
        
    }

    private boolean verificanomes(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return false;
        }
        char letra = Character.toUpperCase(nome.charAt(0));
        return letra >= 'A' && letra <= 'Z';  
   
    
    }
    
    public void remove(String nome) {
        int posicao = getIndice(nome);
        if (!verificanomes(nome)) {
            System.out.println("[Erro] Nome não encontrado: " + nome);
            return;
        }
        
        if (posicaoOcupada(posicao) && nomes[posicao].equals(nome)) {
        nomes[posicao] = null;
        totalNomes--;
        System.out.println("[Remoção] Nome '" + nome + "' removido da posição " + posicao);
        System.out.println();
    }
    }

    private int getIndice(String nome) {
        if (nome == null || nome.isEmpty()) return -1;
        char letra = Character.toUpperCase(nome.charAt(0));

        switch (letra) {
            case 'A': return 0;
            case 'B': return 1;
            case 'C': return 2;
            case 'D': return 3;
            case 'E': return 4;
            case 'F': return 5;
            case 'G': return 6;
            case 'H': return 7;
            case 'I': return 8;
            case 'J': return 9;
            case 'K': return 10;
            case 'L': return 11;
            case 'M': return 12;
            case 'N': return 13;
            case 'O': return 14;
            case 'P': return 15;
            case 'Q': return 16;
            case 'R': return 17;
            case 'S': return 18;
            case 'T': return 19;
            case 'U': return 20;
            case 'V': return 21;
            case 'W': return 22;
            case 'X': return 23;
            case 'Y': return 24;
            case 'Z': return 25;
            default: 
                throw new IllegalArgumentException("Nome inválido");
        }
    }

      private boolean posicaoOcupada(int posicao) {
        return nomes[posicao] != null;
    }

    public boolean contem(String nome) {
        if (!verificanomes(nome)) {
            return false;
        }

        int posicao = getIndice(nome);
        return posicaoOcupada(posicao) && nomes[posicao].equals(nome);
    }

    public String getNome(int posicao) {
        if (posicao < 0 || posicao >= 26) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return nomes[posicao];
    }

    public void mostrarLista() {
        System.out.println("[Lista] Lista atual de nomes:");
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {
                System.out.println("Posição " + i + " (" + (char) ('A' + i) + "): " + nomes[i]);
            }
        }
        System.out.println();
    }

    public int totalNomes() {
        return totalNomes;
    }


    public static void main(String[] args) {
        MinhaSegundaED lista = new MinhaSegundaED();

        lista.adiciona("Agatha");
        lista.adiciona("Bianca");
        lista.adiciona("Bernardo");
        lista.adiciona("Cristina");
        lista.adiciona("Davi");
        lista.adiciona("Giovanna");
        lista.adiciona("Yasmin");
        lista.adiciona("Zoe");
        lista.adiciona("@Lucia");
        
        lista.mostrarLista();
        
        System.out.println("[Verificação] Contém 'José'? " + lista.contem("José"));
        System.out.println("");
        
        lista.remove("Cristina");
        lista.remove("Yasmin");
        
        lista.mostrarLista();
    }
}
