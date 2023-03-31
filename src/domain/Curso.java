package domain;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;

    private List<String> conhecimentos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso(String nome, List<String> conhecimentos) {
        this.nome = nome;
        this.conhecimentos = conhecimentos;
    }

    public List<String> getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(List<String> conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curso [nome=" + nome + ", conhecimentos=" + conhecimentos + "]";
    }
    
}
