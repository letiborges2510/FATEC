public class MinhaPrimeiraED {
    public static void main(String[] args) {
        MinhaPrimeiraED lista = new MinhaPrimeiraED();
        
        lista.inserir("Item A");
        lista.inserir("Item B");
        
        lista.mostrarLista();
    }
    
    private Object[] elementos = new Object[10];
    private int quantidadeElementos = 0;
    
    public void inserir(int indice, Object elemento) {
        if (!indiceValido(indice)) {
            throw new IllegalArgumentException("Índice fora do intervalo permitido!");
        }
        if (indiceOcupado(indice)) {
            throw new IllegalArgumentException("Este índice já contém um elemento!");
        }
        elementos[indice] = elemento;
        quantidadeElementos++;
    }
    
    public void inserir(Object elemento) {
        if (quantidadeElementos >= elementos.length) {
            throw new IllegalStateException("A estrutura está cheia!");
        }
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = elemento;
                quantidadeElementos++;
                return;
            }
        }
    }
    
    private boolean indiceOcupado(int indice) {
        return elementos[indice] != null;
    }
    
    private boolean indiceValido(int indice) {
        return indice >= 0 && indice < elementos.length;
    }
    
    public void remover(int indice) {
        if (!indiceValido(indice) || !indiceOcupado(indice)) {
            throw new IllegalArgumentException("Índice inválido ou sem elemento!");
        }
        elementos[indice] = null;
        quantidadeElementos--;
    }
    
    public boolean contem(Object elemento) {
        for (Object obj : elementos) {
            if (obj != null && obj.equals(elemento)) {
                return true;
            }
        }
        return false;
    }
    
    public int contarElementos() {
        return quantidadeElementos;
    }
    
    public void mostrarLista() {
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Posição " + i + ": " + elementos[i]);
        }
    }
}
