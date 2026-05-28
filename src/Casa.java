public class Casa {
    public static void main(String[] args) {
        //Criando o objeto
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variáveis--características)
        casa.metragem = 25;
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 4;
        casa.material = "Tijolo";

        //return da function (return)
        int metragemTotal = casa.somarMetragem();
        System.out.println("A metragem total foi de " + metragemTotal + " metros");

        int comodosTotais = casa.somarAmbiente();
        System.out.println("A casa possui " + comodosTotais + " comodos");

        //Chamada da Function (void)
        casa.construir();
        casa.pintar();

        //Chamando a function com os novos parâmetros
        casa.alterarCaracteristicas(100, 5, 3, "Cimento");

        //Novo objeto
        PlantaCasa casaVizinho = new PlantaCasa();

        //Atributos casa do vizinho
        casaVizinho.metragem = 200;
        casaVizinho.numeroQuartos = 7;
        casaVizinho.numeroBanheiros = 4;
        casaVizinho.material = "Azulejo";

        casaVizinho.construir();




    }
}
