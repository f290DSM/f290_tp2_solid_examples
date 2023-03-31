package domain;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private List<String> conhecimentos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, List<String> conhecimentos) {
        this.nome = nome;
        this.conhecimentos = conhecimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(List<String> conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

    public void assimilar(List<String> conhecimentos) {
        this.conhecimentos.addAll(conhecimentos);
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + 
        ", conhecimentos=" + conhecimentos + 
        "]";
    }
}
