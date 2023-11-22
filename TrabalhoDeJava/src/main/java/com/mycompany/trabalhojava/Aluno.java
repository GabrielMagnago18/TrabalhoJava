
package com.mycompany.trabalhojava;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public class ControleAluno {
    private List<Aluno> alunos;

    public ControleAluno() {
        this.alunos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos);
    }

    public void atualizarAluno(Aluno alunoAntigo, Aluno alunoNovo) {
        // Implemente a lógica de atualização, por exemplo:
        int index = alunos.indexOf(alunoAntigo);
        if (index != -1) {
            alunos.set(index, alunoNovo);
        }
    }

    public void deletarAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
}
}

