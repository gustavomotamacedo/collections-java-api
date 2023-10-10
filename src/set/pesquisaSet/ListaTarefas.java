package set.pesquisaSet;

import java.util.AbstractSet;
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
    public boolean removerTarefa(String descricao) {
        for (Tarefa t : listaDeTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                listaDeTarefas.remove(t);
                return true;
            }
        }
        return false;
    }
    public void exibirTarefas() {
        System.out.println(listaDeTarefas);
    }
    public int contarTarefas() {
        int index = 0;
        for (Tarefa t : listaDeTarefas) {
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
    public boolean marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaDeTarefas) {
            if  (t.getDescricao().equalsIgnoreCase(descricao)) {
                if (t.isConcluida())  {
                    System.out.println("Tarefa já está concluida!");
                    return false;
                } else {
                    t.changeConcluida();
                    System.out.println("Tarefa marcada como concluida!");
                    return true;
                }
            }
        }
        System.out.println("Tarefa não encontrada!");
        return false;
    }
    public boolean marcarTarefaPendente(String descricao) {
        for (Tarefa t : listaDeTarefas) {
            if  (t.getDescricao().equalsIgnoreCase(descricao)) {
                if (!t.isConcluida())  {
                    System.out.println("Tarefa já está pendente!");
                    return false;
                } else {
                    t.changeConcluida();
                    System.out.println("Tarefa marcada como pendente!");
                    return true;
                }
            }
        }
        System.out.println("Tarefa não encontrada!");
        return false;
    }
    public void limparListaTarefas() {
        listaDeTarefas.clear();
    }
}
