package list.OrdenacaodeNumeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros on = new OrdenacaoNumeros();
        on.adicionarNumero(1);
        on.adicionarNumero(18);
        on.adicionarNumero(120);
        on.adicionarNumero(-19);
        on.adicionarNumero(-8);
        on.adicionarNumero(74);
        on.adicionarNumero(2);
        on.exibirNumeros();
        System.out.println(" ");
        on.ordenarAscendente();
        on.exibirNumeros();
        System.out.println(" ");
        on.ordenarDescendente();
        on.exibirNumeros();
    }
}
