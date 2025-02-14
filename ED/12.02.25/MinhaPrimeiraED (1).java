public class MinhaPrimeiraED {
    
    // Criação de um array de objetos com capacidade inicial de 10
    public Object[] elementos = new Object[10];

     // Variável que mantém o controle do número total de objetos na lista
    public int totalDeObjetos = 0;

    // Método para adicionar um objeto em uma posição específica
    public void adiciona(int posicao, Object objeto) {

        // Verifica se a posição é válida antes de adicionar o objeto
       if (posicaoValida(posicao)){

            // Se a posição está ocupada, move os objetos para abrir espaço
           if (posicaoOcupada(posicao)) {
               if (!ocupado()){

                    // Move os objetos à direita para abrir espaço na posição
                   for (int i = totalDeObjetos; i > posicao.length; i--) {
                       objts[i] = objts [i - 1];
               }

               // Adiciona o novo objeto na posição correta
               objts [posicao] = objeto;

                   // Incrementa o contador de objetos
                   totalDeObjetos ++;
               
           }else{
                 // Se o array estiver cheio, cria um novo maior
                for (int i = totalDeObjetos; i > posicao.length; i--) {
                       objts[i] = objts [i - 1];
           }
                   
           // Adiciona o novo objeto na posição correta
           objts [posicao] = objts;

               // Incrementa o contador de objetos
               totalDeObjetos ++;
            }
            
        }else if (posicaoOcupada(posicao) && !ocupado) {
            for (int i = totalDeObjetos; i > posicao.length; i--) {
                   objts[i] = objts [i - 1];
                
        }
         objts [posicao] = objts;
             totalDeObjetos ++;
    }
    
}else{
    // Se a posição não for válida, exibe uma mensagem de erro
    System.out.println("Está posição não está válida!");
}
    // Método para adicionar um objeto ao final da lista, sem especificar a posição
    public void adiciona(Object objeto) {
                
         // Verifica se há espaço para adicionar o objeto
         if (!ocupado()) {
        
           // Adiciona o objeto no próximo espaço disponível
           objts[totalDeObjetos] = objeto;

           // Incrementa o contador de objetos
           totalDeObjetos++;
        }
        
    // Método que verifica se a posição fornecida já está ocupada
    private boolean posicaoOcupada(int posicao) {

        // Retorna true se a posição estiver ocupada (não for null)
        return objts [posicao] != null;
    }

    // Método que verifica se a posição fornecida é válida no array
    private boolean posicaoValida(int posicao) {
        
        // A posição é válida se estiver entre 0 e o tamanho do array
        return posicao >= 0 && posicao < obj.length;
    }

    // Método para remover um objeto em uma posição específica
    public void remover(int posicao) {
        
        // Verifica se a posição é válida e se está ocupada antes de remover
        if (!posicaoValida(posicao) || !posicaoOcupada(posicao)) {

           // Move os objetos à esquerda para "fechar" o espaço da posição removida
           for (int i = posicao; i < totalDeObjetos - 1; i++)
            objts[i] = objts [i +1];

        // Define a posição removida como null
        objts[totalDeObjetos - 1] = null;

        // Decrementa o contador de objetos
        totalDeObjetos--;
    }

    // Método que verifica se um objeto está na lista
    public boolean contem(Object objeto) {

        // Itera sobre os elementos e compara com o objeto fornecido
        for (Object objV : objts) {
            if (objeto != null && objts.equals(objtV)) {
                return true;
            }
        }
        return false;
    }
    
    // Método para contar o número total de objetos na lista
    public int contarObjetos() {
        
         // Retorna o número de objetos no array
         return totalDeObjetos;
    }

    // Método para exibir os objetos armazenados na lista
    public void mostrarLista() {
        
        // Itera sobre o array e imprime cada elemento
        for (int i = 0; i < objts.length; i++) {
            System.out.println("Posição " + i + ": " + objts[i]);
        }
    }
}

    // Método que verifica se o array está cheio e, se estiver, aumenta seu tamanho
    public boolean ocupado() {

        // Verifica se o array está cheio (tamanho total igual ao número de objetos)
        if (objts.length == totalDeObjetos) {

            // Cria um novo array com o dobro do tamanho
            Object[] Vetorn = new Object[objts.length * 2];

            // Copia os elementos do array original para o novo
            for (int i = 0; i < objts.length; i++) {
                Vetorn[i] = objts[i];
            }

            // Aponta o array original para o novo array maior
            objts = Vetorn;
            return true;
        }
        return false;
    }
}
