package set.operacoesBasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cp = new ConjuntoPalavrasUnicas();
        cp.adicionarPalavra("Obrigado");
        cp.adicionarPalavra("Grato");
        cp.adicionarPalavra("Agradeço");
        cp.adicionarPalavra("Caguei");
        cp.exibirPalavrasUnicas();
        cp.removerPalavra("Caguei");
        if (!cp.verificarPalavra("Caguei"))
            System.out.println("Apagado com sucesso!");
        else
            System.out.println("Falha ao apagar palavra!");
        cp.exibirPalavrasUnicas();
    }
}
