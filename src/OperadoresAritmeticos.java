public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Sushi com a gata S2
        double pratoPrincipal = 360.00;
        double sobremesa = 50.00;
        double bebida = 25.00;

        double valorTotal = pratoPrincipal + sobremesa + bebida;
        double desconto = 10;
        double valorComDesconto = valorTotal / desconto;
        double divisaoCasal = (valorTotal - valorComDesconto) / 2;
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Desconto no PIX: " + valorComDesconto);
        System.out.println("Valor total com Desconto: " + (valorTotal - valorComDesconto));
        System.out.println("Valor divido para 2 pessoas com Desconto: " + divisaoCasal);
    }
}
