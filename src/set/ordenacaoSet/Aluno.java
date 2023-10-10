package set.ordenacaoSet;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private final String nome;
    private final long matricula;
    private final double nota;

    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    static class ComparatorPorNota implements Comparator<Aluno> {
        @Override
        public int compare(Aluno a1, Aluno a2) {
            return Double.compare(a1.getNota(), a2.getNota());
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }
}
