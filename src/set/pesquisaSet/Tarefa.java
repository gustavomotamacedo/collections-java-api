package set.pesquisaSet;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    public Tarefa(String descricao) {
        this.descricao = descricao;
        concluida = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    @Override
    public String toString() {
        return "Tarefa {" +
                "\n\tdescricao: " + this.descricao +
                "\n\tconcluida: " + this.concluida +
                "\n}";
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }
    public void changeConcluida() {
        if (this.concluida) {
            this.concluida =  false;
        } else {
            this.concluida = true;
        }
    }
}
