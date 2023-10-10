package set.ordenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;
    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, long matricula, double nota) {
        this.alunoSet.add(new Aluno(nome, matricula, nota));
    }
    public void removerAluno(long matricula) {
        for (Aluno a : this.alunoSet) {
            if (a.getMatricula() == matricula) {
                this.alunoSet.remove(a);
                return;
            }
        }
    }
    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(this.alunoSet);
    }
    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new Aluno.ComparatorPorNota());
        alunosPorNota.addAll(this.alunoSet);
        return alunosPorNota;
    }
    public Set<Aluno> exibirAlunos() {
        return this.alunoSet;
    }

}
