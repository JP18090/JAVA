package TADListaLinear;

public class vetor {
    String[ ] A; // armazena os elementos do vetor
    int capacity; // capacidade do vetor
    int size; // elementos no vetor
    
    public vetor(int capacity) {
        A = new String[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    public boolean isEmpty() {
        // verifica se o vetor esta vazio ou não 
        if (size == 0)
            return true;
        else
            return false;
    }
    public boolean isFull() {
        //verifica se o Vetor está cheio
        if (size == capacity)
            return true;
        else 
            return false;
    }
    public int size() {
        //Retorna a quantidade de elementos do vetor 
        return size;
    }
    public String get(int i) throws Exception {
        //Retorna o elemento da possição i
        if (i<0 || i>=size)
            throw new Exception("Posição inválida");
        return A[i];
    }
    public void set(int i, String n) throws Exception {
        //Substitui conteudo da posição i por n 
        if (i<0 || i>=size)
            throw new Exception("Posição não é valida");
        A[i] = n;
        }
        public void add(int i, String n) throws Exception {
        // Adiciona o elemento n na posição i
        if (i < 0 || i > size) // Não pode ser menor que 0 e maior que o tamanho atual
            throw new Exception("Posição inválida");
        
        if (isFull()) // Verifica se o vetor está cheio
            throw new Exception("Vetor cheio");
        
        // Move os elementos para a direita para abrir espaço para o novo elemento
        for (int j = size; j > i; j--) {
            A[j] = A[j - 1];
        }
        // Coloca o novo elemento na posição i
        A[i] = n;
        size++; // Aumenta o tamanho do vetor
    }
    public void remove(int i) throws Exception {
        // Remove o elemento da posição i
        if (i < 0 || i >= size) // Verifica se a posição é válida
            throw new Exception("Posição inválida");
            
        // Move os elementos para a esquerda para preencher a posição removida
        for (int j = i; j < size - 1; j++) {
            A[j] = A[j + 1];
        }
        A[size - 1] = null; // Limpa o último elemento
        size--; // Diminui o tamanho do vetor
    }
    public int search(String n) {
        //Busca o valor n na lista retonando a posição -1, se nao existir
        for(int i=0;i<size; i++)
            if (A[i].equals(n))
                return i;
        return -1;
    }
    
    public void show() {
        //Mostra todo o conteudo da lista
        for(int i=0;i<size; i++)
            System.out.println(A[i]);
        System.out.println("\n Fim da lista! ");
    }
}

