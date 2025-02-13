public class MinhaPrimeiraED {
  
    public static void main(String[] args) {
        
        MinhaPrimeiraED lista = new MinhaPrimeiraED();
        
       
        lista.adiciona("Objeto 1");
        lista.adiciona("Objeto 2");
        
        lista.exibirLista();  

    private Object[] objetos = new Object[10];
    public int totalDeObjetos = 0;

   
    public void adiciona(int posicao, Object objeto) {
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        if (posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição já ocupada!");
        }
        objetos[posicao] = objeto;
        totalDeObjetos++;
    }

    
    public void adiciona(Object objeto) {
        if (totalDeObjetos >= objetos.length) {
            throw new IllegalStateException("Lista cheia!");
        }
        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] == null) {
                objetos[i] = objeto;
                totalDeObjetos++;
                return;
            }
        }
    }

    
    private boolean posicaoOcupada(int posicao) {
        return objetos[posicao] != null;
    }

    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < objetos.length;
    }

    
    public void remove(int posicao) {
        if (!posicaoValida(posicao) || !posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida ou vazia!");
        }
        objetos[posicao] = null;
        totalDeObjetos--;
    }

    // Verifica se a estrutura contém um objeto específico
    public boolean contains(Object objeto) {
        for (Object obj : objetos) {
            if (obj != null && obj.equals(objeto)) {
                return true;
            }
        }
        return false;
    }

    // Retorna a quantidade de objetos armazenados
    public int tamanho() {
        return totalDeObjetos;
    }

    // Método para exibir a lista (opcional)
    public void exibirLista() {
        for (int i = 0; i < objetos.length; i++) {
            System.out.println("Posição " + i + ": " + objetos[i]);
        }
    }
}