package set.pesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private final Set<Tarefa> listaDeTarefas;
    public ListaTarefas() {
        listaDeTarefas = new HashSet<>();
    }
    public void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        listaDeTarefas.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
    }
    public void exibirTarefas() {
        System.out.println(listaDeTarefas);
    }
    public int contarTarefas() {
        int index = 0;
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            ++index;
        }
        return index;
    }
    public void obterTarefasConcluidas() {
        for (Tarefa t : listaDeTarefas) {
            if (t.isConcluida()) {
                System.out.println(t);
            }
        }
    }
    public void obterTarefasPendentes() {
        for (Tarefa t : listaDeTarefas) {
            if (!t.isConcluida()) {
                System.out.println(t);
            }
        }
    }
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaDeTarefas) {
            if  (t.getDescricao().equalsIgnoreCase(descricao)) {
                if (t.isConcluida())  {
                    System.out.println("Tarefa já está concluida!");
                } else {
                    t.changeConcluida();
                    System.out.println("Tarefa marcada como concluida!");
                }
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");
    }
    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : listaDeTarefas) {
            if  (t.getDescricao().equalsIgnoreCase(descricao)) {
                if (!t.isConcluida())  {
                    System.out.println("Tarefa já está pendente!");
                } else {
                    t.changeConcluida();
                    System.out.println("Tarefa marcada como pendente!");
                }
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");
    }
    public void limparListaTarefas() {
        listaDeTarefas.clear();
    }
}
