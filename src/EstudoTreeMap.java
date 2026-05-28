import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {
        //TreeMap (chave;valor), mantém a ordem dos elementos!!

        //inicializando o TreeMap
        TreeMap<String, Double> notasAlunos = new TreeMap<>();

        //Adicionando dentro do TreeMap
        notasAlunos.put("Carol", 10.0);
        notasAlunos.put("Natan", 9.5);
        notasAlunos.put("Maria", 8.0);

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

        //Get Ordenado
        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Última chave: " + notasAlunos.lastKey());
    }
}
