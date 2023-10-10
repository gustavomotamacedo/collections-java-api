package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private final Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }
    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }
    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }
    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }
    public void exibirPalavrasUnicas() {
        int index = 0;
        for (String palavra :  palavras) {
            System.out.println("\t " + ++index + " - " + palavra);
        }
    }
}
