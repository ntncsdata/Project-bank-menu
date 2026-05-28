import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {
        //Alt+Enter  = import class
        List<String> listaDeCompras = new ArrayList<>();

        //add posição automática
        listaDeCompras.add("Pera");
        listaDeCompras.add("Carne");
        listaDeCompras.add("Papel Toalha");
        listaDeCompras.add("Pasta de Dente");

        //add com uma posição específica
        listaDeCompras.add(1, "Maça");

        for(String itens : listaDeCompras){
            System.out.println("Lista cheia: " + itens);
        }

        //Buscas dentro do array
        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho: " + item);

        //Removendo um item da lista
        listaDeCompras.remove("Pasta de Dente");

        for(String item2 : listaDeCompras){
            System.out.println("Depois do remove: " + item2);
        }

        //Verificando se a lista está vazia
        boolean eVazia = listaDeCompras.isEmpty();
        System.out.println("A lista está vazia? " + eVazia);

        //Tamanho da lista
        int tamanho = listaDeCompras.size();
        System.out.println("Quantos elementos tem a lista? " + tamanho);

        //Verificando se a lista contém um elemento
        boolean contem = listaDeCompras.contains("Maça");
        System.out.println("A lista contém maça? " + contem);

        //Limpando a lista
        listaDeCompras.clear();
        System.out.println("A lista está vazia? " + listaDeCompras.isEmpty());

        //ForEach
        listaDeCompras.forEach(produto -> System.out.println(produto));
    }
}
