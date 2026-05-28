import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {
        //HashMap não (chave;valor), não mantém ordem dos elementos (tabela de hash)!!

        //inicializando o HashMap
        HashMap<String, Double> notasAlunos = new HashMap<>();

        //Adicionando dentro do HashMap
        notasAlunos.put("Natan", 10.0);
        notasAlunos.put("Carol", 9.9);
        notasAlunos.put("Maria", 8.0);

        //Buscando dentro do HashMap
        double nota = notasAlunos.get("Natan");
        System.out.println("A nota do Natan é: " + nota);

        //Usando o for na iteração
        for(String nome : notasAlunos.keySet()){
            double notas = notasAlunos.get(nome);
            System.out.println(notas);
        }

        for(Map.Entry<String, Double> nota2 : notasAlunos.entrySet()){
            String nome = nota2.getKey();
            double valorNota = nota2.getValue();
            System.out.println(nome + " : " + valorNota);
        }
        //Saber o tamanho
        int tamanhoHash = notasAlunos.size();
        System.out.println("Qual o tamanho do HasMap? " +tamanhoHash);

        //Remover do HashMap
        notasAlunos.remove("Natan");

    }
}
