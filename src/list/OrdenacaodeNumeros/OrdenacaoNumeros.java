package list.OrdenacaodeNumeros;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros = new ArrayList<>();
    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAcendente = new ArrayList<>(numeros);
        Collections.sort(numerosAcendente);
        numeros = numerosAcendente;
        return numerosAcendente;
    }
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(numeros);
        numerosDescendente.sort(Collections.reverseOrder());
        numeros = numerosDescendente;
        return numerosDescendente;
    }
    public void exibirNumeros() {
        for (Integer n : numeros) {
            System.out.println("- " + n + " -");
        }
    }
}
