package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Departamento {

    private String nome;
    private List<Professor> professores = new ArrayList<>();
    private String email;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void criarProfessor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do professor...");
        String nome = in.nextLine();
        Professor professor = new Professor(nome);
        this.professores.add(professor);
        in.close();
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public String getNome() {
        return nome;
    }

    public Departamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public Departamento setProfessores(List<Professor> professores) {
        this.professores = professores;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Departamento setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", professores=" + professores + ", email=" + email + "]";
    }
}
