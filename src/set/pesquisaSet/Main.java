package set.pesquisaSet;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();
        lt.adicionarTarefa("Lavar louça");
        lt.adicionarTarefa("Passar pano");
        lt.adicionarTarefa("Arrumar quarto");
        lt.adicionarTarefa("LAjkkdamkad");
        lt.exibirTarefas();
        lt.removerTarefa("LAjkkdamkad");
        lt.marcarTarefaConcluida("Passar Pano");
        lt.obterTarefasPendentes();
        lt.marcarTarefaConcluida("lavar Louça");
        lt.marcarTarefaPendente("passar pano");
        lt.obterTarefasConcluidas();
        System.out.println(lt.contarTarefas());
        lt.limparListaTarefas();
        lt.exibirTarefas();
    }
}
