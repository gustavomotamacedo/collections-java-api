package list.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> carrinho = new ArrayList<>();

    public  void adicionarItem(String nome, double preco, int quantidade) {
        Item produto = new Item(nome, preco, quantidade);
        carrinho.add(produto);
    }

    public void removerItem(String nome) {
        Item itemAtual;
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equals(nome)) {
                itensParaRemover.add(item);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public void exibirItems() {
        Item itemAtual;
        for (Item item : carrinho) {
            itemAtual = item;
            System.out.print(itemAtual.getNome() + "\t");
            System.out.print(itemAtual.getPreco() + "\t");
            System.out.println(itemAtual.getQuantidade());
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : carrinho) {
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }

}
