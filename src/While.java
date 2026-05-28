public class While {
    public static void main(String[] args) {
        int idade = 0;

        //While
        while(idade <= 5){
            System.out.println("Contador de Idade = " + idade);
            idade++;
        }

        //Do--While
        do{
            System.out.println("Primeiro faz depois verifica " + idade);
            idade++;
        }while (idade <= 5);

        //For
        for(int contador = 0; contador <= 5; contador++){
            System.out.println("Contador do for: " + contador);
        }
    }
}
