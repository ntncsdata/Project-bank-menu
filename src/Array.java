public class Array {
    public static void main(String[] args) {
        //Declaração do Array
        int[] numeros = {5,4,3,2,1};
        String[] frutas;

        //Inicialização do Array
        frutas = new String[] {"Maça", "Banana", "Abacate"};

        double[] salarios = new double[5];
        salarios[0] = 100.00;
        salarios[1] = 200.00;
        salarios[2] = 300.00;
        salarios[3] = 400.00;
        salarios[4] = 500.00;

        //Iteração sobre o array
        for(int posicao = 0; posicao < salarios.length; posicao++){
            System.out.println(salarios[posicao]);
        }

        for(double salario : salarios){
            System.out.println(salario);
        }

    }
}
