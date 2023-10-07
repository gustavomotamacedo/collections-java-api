package list.somarNumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros sn = new SomaNumeros();
        sn.adicionaNumero(1);
        sn.adicionaNumero(18);
        sn.adicionaNumero(-20);
        sn.adicionaNumero(401);
        sn.adicionaNumero(124);
        System.out.println(sn.calcularSoma());
        System.out.println(sn.encontrarMaiorNumero());
        System.out.println(sn.encontrarMenorNumero());
        sn.exibirNumeros();
    }
}
