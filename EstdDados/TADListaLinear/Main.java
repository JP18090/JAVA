package TADListaLinear;

public class Main {
    public static void main(String[] args) {
        // Criação de uma instância da classe vetor com capacidade 100
        vetor Lista = new vetor(5);
        
        try {
            // Testando os métodos da classe vetor
            
            // Verifica se a lista está vazia
            System.out.println("Lista está vazia? " + Lista.isEmpty());
            
            // Adicionando elementos na lista
            Lista.add(0, "Elemento 1");
            Lista.add(1, "Elemento 2");
            Lista.add(2, "Elemento 3");
            
            // Mostra o conteúdo da lista
            Lista.show();
            
            // Verifica se um elemento está na lista
            int pos = Lista.search("Elemento 2");
            System.out.println("Elemento 'Elemento 2' encontrado na posição: " + pos);
            
            // Alterando um elemento
            Lista.set(1, "Elemento Modificado");
            Lista.show();
            
            // Remover um elemento
            Lista.remove(0);
            Lista.show();
            
            // Verifica o tamanho da lista
            System.out.println("Tamanho da lista: " + Lista.size());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
    