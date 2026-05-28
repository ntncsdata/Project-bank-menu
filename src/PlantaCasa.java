public class PlantaCasa {
    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String material;
    String cor;

    public void construir(){
        System.out.println("---A construção foi inicializada---");
        System.out.println("---Metragem " + metragem);
        System.out.println("---Número de quartos " + numeroQuartos);
        System.out.println("---Número de banheiros " + numeroBanheiros);
        System.out.println("---Material utilizado: " + material);
    }

    public int somarMetragem(){
        return metragem * numeroQuartos + numeroBanheiros;
    }

    public int somarAmbiente(){
        return numeroQuartos + numeroBanheiros;
    }

    public void pintar(){
        System.out.println("---A casa foi pintada de " + cor);
    }

    //Alterando as características com uma nova function (void)
    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiros;
        material = mat;
        construir();
    }

    //métodos de instância = só podem ser usados quando cria o objeto
    //métodos estáticos = podem ser usados sem criar o objeto
}
