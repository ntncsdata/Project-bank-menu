public class OperadoresLogicos {
    public static void main(String[] args) {
        //Stacks Java Junior:
        boolean springBoot = false;
        boolean postgreSQL = true;
        boolean mongoDB = false;

        //If-Else if-Else
        if(springBoot && postgreSQL){
            System.out.println("you're HIRED");
        }
        else if (postgreSQL || mongoDB){
            System.out.println("you was SELECT");
        }
        else{
            System.out.println("you're FIRED");
        }
        //Operador Ternário
        String operadorTernario = (springBoot) ? "you're HIRED" : "you're FIRED";
        System.out.println(operadorTernario);

        //Switch-Case
        String diaSemana = "Quinta";

        switch (diaSemana){
            case "Domingo":
                System.out.println("1");
                break;
            case "Segunda":
                System.out.println("2");
                break;
            case "Terça":
                System.out.println("3");
                break;
            case "Quarta":
                System.out.println("4");
                break;
            case "Quinta":
                System.out.println("5");
                break;
            case "Sexta":
                System.out.println("6");
                break;
            case "Sábado":
                System.out.println("7");
                break;


        }
    }
}
