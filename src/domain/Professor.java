package domain;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private List<Aluno> alunos = new ArrayList<>();

    public Professor(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor() {
    }

    public void ensina(Curso curso) {
        System.out.println(curso.getNome());
        alunos.forEach(a -> a.assimilar(curso.getConhecimentos()));
        alunos.forEach(System.out::println);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
