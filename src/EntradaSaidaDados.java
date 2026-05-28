import java.util.Scanner;

public class EntradaSaidaDados {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite seu nome: "); //Output
        String nome = scanner.nextLine(); //Input
        System.out.println("Bem Vindo " + nome); //Output

        System.out.println("Digite a sua idade: "); //Output
        int idade = scanner.nextInt(); //Input

        System.out.println("Você tem " + idade + " anos."); //Output

        


    }
}
