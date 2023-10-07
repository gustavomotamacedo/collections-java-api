package list.somarNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> numeros = new ArrayList<>();

    public void adicionaNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int resultado = 0;
        for (Integer n : numeros) {
            resultado += n;
        }
        return resultado;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        for (Integer n : numeros) {
            if (n > maiorNumero) {
                maiorNumero = n;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (i == 0) {
                menorNumero = numeros.get(i);
            }
            if (menorNumero > numeros.get(i)) {
                menorNumero = numeros.get(i);
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.print("Exibindo Lista de Numeros:\n\t");
        for (Integer n : numeros) {
            System.out.print(n + "\n\t");
        }
    }
}
