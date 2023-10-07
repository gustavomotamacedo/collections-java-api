package list.carrinhoDeCompras;

public class Main {

    public static void exibirCarrinho(CarrinhoDeCompras carrinhoDeCompras) {
        System.out.println("NOME\t\t\tPRECO\tQUANTIDADE");
        carrinhoDeCompras.exibirItems();
        System.out.println("TOTAL\t\t\t" + carrinhoDeCompras.calcularValorTotal());
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Garrafa Termica", 19.90, 32);
        carrinhoDeCompras.adicionarItem("Garrafa Termica", 19.90, 32);
        carrinhoDeCompras.adicionarItem("Garrafa Termica", 19.90, 32);
        carrinhoDeCompras.adicionarItem("Garrafa Termica", 19.90, 32);
        exibirCarrinho(carrinhoDeCompras);
        carrinhoDeCompras.removerItem("Garrafa Termica");
        exibirCarrinho(carrinhoDeCompras);
    }
}
