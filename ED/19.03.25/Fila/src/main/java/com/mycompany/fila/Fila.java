public class Fila {
 
    private Object[] vetor;
    private int inicio, fim;
    private int tamanhoMax;
 
    public Fila() {
        this.vetor = new Object[1000];
        this.inicio = 0;
        this.fim = 0;
        this.tamanhoMax = 1000;
    }
 
    public Fila(int maxTam) {
        this.vetor = new Object[maxTam];
        this.inicio = 0;
        this.fim = 0;
        this.tamanhoMax = maxTam;
    }
 
    public boolean enfileira(Object valor) {
        if ((this.fim + 1) % this.tamanhoMax == this.inicio) {
            System.out.println("Erro: A fila está cheia");
            return false;
        }
        this.vetor[this.fim] = valor;
        this.fim = (this.fim + 1) % this.tamanhoMax;
        return true;
    }
 
    public Object desenfileira() {
        if (this.vazia()) {
            System.out.println("Erro: A fila está vazia");
            return null;
        }
        Object valor = this.vetor[this.inicio];
        this.inicio = (this.inicio + 1) % this.tamanhoMax;
        return valor;
    }
    public boolean vazia() {
        return this.inicio == this.fim;
    }
 
    public void imprime() {
        int i = this.inicio;
        while (i != this.fim) {
            System.out.print(this.vetor[i].toString() + " | ");
            i = (i + 1) % this.tamanhoMax;
        }
        System.out.println(); 
    }
 
   
}

 
 