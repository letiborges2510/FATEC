public class MinhaPrimeiraED {
    
    public Object[] elementos = new Object[10];
    public int totalDeObjetos = 0;
    
    public void adiciona(int posicao, Object objeto) {
       if (posicaoValida(posicao)){
           
           if (posicaoOcupada(posicao)) {
               
               if (!ocupado()){
                   for (int i = totalDeObjetos; i > posicao.length; i--) {
                       objts[i] = objts [i - 1];
               }
               objts [posicao] = objts;
                   totalDeObjetos ++;
               
           }else{
                for (int i = totalDeObjetos; i > posicao.length; i--) {
                       objts[i] = objts [i - 1];
           }
           objts [posicao] = objts;
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
    System.out.println("Está posição não está válida!");
}
    
    public void adiciona(Object objeto) {
         if (!ocupado()) {
           objts[totalDeObjetos] = objeto;
           totalDeObjetos++;
        }
        
    private boolean posicaoOcupada(int posicao) {
        return objts [posicao] != null;
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < obj.length;
    }
    
    public void remover(int posicao) {
        if (!posicaoValida(posicao) || !posicaoOcupada(posicao)) {
           for (int i = posicao; i < totalDeObjetos - 1; i++)
            objts[i] = objts [i +1];

        }
        objts[posicao] = null;
        totalDeObjetos--;
    }
    
    public boolean contem(Object objeto) {
        for (Object objV : objts) {
            if (objeto != null && objts.equals(objtV)) {
                return true;
            }
        }
        return false;
    }
    
    public int contarObjetos() {
         if (posicaoValida(posicao) && posicaoOcupada(posicao)) {
            return objetos[posicao];
    }
     return null;
}
    
    public void mostrarLista() {
        for (int i = 0; i < objts.length; i++) {
            System.out.println("Posição " + i + ": " + objts[i]);
        }
    }
}

    public int tamanho() {
        return totalDeObjetos;
    }

    public boolean vazio() {
        return totalDeObjetos == 0;
    }

  
    public boolean ocupado() {
        if (objts.length == totalDeObjetos) {
            Object[] Vetorn = new Object[objts.length * 2];

            for (int i = 0; i < objts.length; i++) {
                Vetorn[i] = objts[i];
            }

            objts = Vetorn;
            return true;
        }
        return false;
    }
}
