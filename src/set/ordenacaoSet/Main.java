package set.ordenacaoSet;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos ga = new GerenciadorAlunos();
        ga.adicionarAluno("Gustavo Macedo", 98061168, 7.1);
        ga.adicionarAluno("Naiandra", 99851435, 10.0);
        ga.adicionarAluno("Gustavo Mota", 99071269, 6.2);
        System.out.println(ga.exibirAlunosPorNota());
        System.out.println(ga.exibirAlunosPorNome());
        ga.removerAluno(99071269);
        System.out.println(ga.exibirAlunos());

    }
}
