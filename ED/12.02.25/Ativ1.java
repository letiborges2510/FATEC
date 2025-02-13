public class Main {
    
    public static int search(int v[], int x) {
        int esq = 0;
        int dir = v.length - 1;  // Corrigido o "lenght" para "length"
        
        while (esq <= dir) {
            int meio = (esq + dir) / 2;  // Corrigido o cálculo do meio
            
            if (v[meio] == x) {
                return meio; // Encontrou o valor
            }
            
            if (x > v[meio]) {
                esq = meio + 1; // Valor está à direita
            } else {
                dir = meio - 1; // Valor está à esquerda
            }
        }
        
        return -1; // Valor não encontrado
    }
    
    public static void main(String[] args) {
        int v[] = {10, 20, 30, 40, 50, 60, 70, 80};
        int w[] = {15, 25, 35, 40, 55, 60, 75, 90, 100, 120, 1000};
        
        System.out.println("v[?] = 50...: " + search(v, 50));
        System.out.println("w[?] = 100...: " + search(w, 100)); // Corrigido para passar o vetor "w" e não "v"
        
        System.out.printf("\nv[%d] = 50...: %d\n", 50, search(v, 50));
        System.out.printf("w[%d] = 100...: %d\n", 100, search(w, 100));
    }
}