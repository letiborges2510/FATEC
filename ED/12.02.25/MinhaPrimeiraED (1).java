public class MinhaPrimeiraED {

    private Object[] objetos = new Object[10]; // Vetor inicial com capacidade 10
    private int totalDeObjetos = 0; // Contador de elementos no vetor

    // Método para adicionar um objeto em uma posição específica
    public void adiciona(int posicao, Object objeto) {
        if (!posicaoValida(posicao)) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }

        if (totalDeObjetos == objetos.length) {
            aumentaCapacidade(); // Expande a capacidade do vetor caso esteja cheio
        }

        // Desloca elementos para a direita para abrir espaço
        for (int i = totalDeObjetos; i > posicao; i--) {
            objetos[i] = objetos[i - 1];
        }

        objetos[posicao] = objeto; // Insere o novo objeto
        totalDeObjetos++; // Atualiza o contador
    }

    // Método para adicionar um objeto na próxima posição disponível
    public void adiciona(Object objeto) {
        adiciona(totalDeObjetos, objeto); // Reutiliza o método acima
    }

    // Método para verificar se uma posição está ocupada
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeObjetos;
    }

    // Método para verificar se a posição é válida para inserção
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= totalDeObjetos; // Permite inserir no final
    }

    // Método para remover um elemento de uma determinada posição
    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }

        // Desloca elementos para a esquerda para preencher o espaço removido
        for (int i = posicao; i < totalDeObjetos - 1; i++) {
            objetos[i] = objetos[i + 1];
        }

        objetos[--totalDeObjetos] = null; // Remove a última referência e atualiza o contador
    }

    // Método para verificar se um objeto está presente no vetor
    public boolean contem(Object objeto) {
        for (int i = 0; i < totalDeObjetos; i++) {
            if ((objetos[i] == null && objeto == null) || (objetos[i] != null && objetos[i].equals(objeto))) {
                return true;
            }
        }
        return false;
    }

    // Método para retornar um objeto de uma posição específica
    public Object getObjeto(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        return objetos[posicao];
    }

    // Método para retornar o número de elementos armazenados
    public int tamanho() {
        return totalDeObjetos;
    }

    // Método para dobrar a capacidade do vetor quando necessário
    private void aumentaCapacidade() {
        Object[] novoArray = new Object[objetos.length * 2]; // Novo vetor com o dobro do tamanho
        for (int i = 0; i < objetos.length; i++) {
            novoArray[i] = objetos[i]; // Copia os elementos para o novo vetor
        }
        objetos = novoArray;
    }

    // Método auxiliar para exibir a lista no console
    public void mostrarLista() {
        for (int i = 0; i < totalDeObjetos; i++) {
            System.out.println("Posição " + i + ": " + objetos[i]);
        }
    }

    // Método principal para testes
    public static void main(String[] args) {
        MinhaPrimeiraED lista = new MinhaPrimeiraED();

        // Teste de adicionar elementos
        System.out.println("Adicionando elementos...");
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.mostrarLista();

        // Teste de adicionar em uma posição específica
        System.out.println("\nAdicionando 'X' na posição 1...");
        lista.adiciona(1, "D");
        lista.mostrarLista();

        // Teste de verificar se contém um elemento
        System.out.println("\nA lista contém 'B'? " + lista.contem("B"));
        System.out.println("A lista contém 'Z'? " + lista.contem("Z"));

        // Teste de remover elemento
        System.out.println("\nRemovendo o elemento da posição 2...");
        lista.remove(2);
        lista.mostrarLista();

        // Teste de obter elemento por posição
        System.out.println("\nElemento na posição 1: " + lista.getObjeto(1));

        // Teste de tamanho da lista
        System.out.println("\nTamanho da lista: " + lista.tamanho());

        // Teste de expansão automática do vetor
        System.out.println("\nAdicionando mais elementos");
        for (int i = 0; i < 15; i++) {
            lista.adiciona( (i + 1));
        }
        lista.mostrarLista();
        System.out.println("Novo tamanho da estrutura: " + lista.objetos.length);
    }
}
