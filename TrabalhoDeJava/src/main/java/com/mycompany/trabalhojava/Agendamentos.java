
package com.mycompany.trabalhojava;

import java.util.ArrayList;
import java.util.List;

public class Agendamentos {
    private int codigo;
    private int codigoSala;
    private String matriculaAluno;
    private String cpfOrientador;
    private String cpfMembroBanca1;
    private String cpfMembroBanca2;
    private String cpfMembroBanca3;
    private String cpfMembroBanca4;

    public Agendamentos(int codigo, int codigoSala, String matriculaAluno, String cpfOrientador, String cpfMembroBanca1, String cpfMembroBanca2, String cpfMembroBanca3, String cpfMembroBanca4) {
        this.codigo = codigo;
        this.codigoSala = codigoSala;
        this.matriculaAluno = matriculaAluno;
        this.cpfOrientador = cpfOrientador;
        this.cpfMembroBanca1 = cpfMembroBanca1;
        this.cpfMembroBanca2 = cpfMembroBanca2;
        this.cpfMembroBanca3 = cpfMembroBanca3;
        this.cpfMembroBanca4 = cpfMembroBanca4;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getCpfOrientador() {
        return cpfOrientador;
    }

    public void setCpfOrientador(String cpfOrientador) {
        this.cpfOrientador = cpfOrientador;
    }

    public String getCpfMembroBanca1() {
        return cpfMembroBanca1;
    }

    public void setCpfMembroBanca1(String cpfMembroBanca1) {
        this.cpfMembroBanca1 = cpfMembroBanca1;
    }

    public String getCpfMembroBanca2() {
        return cpfMembroBanca2;
    }

    public void setCpfMembroBanca2(String cpfMembroBanca2) {
        this.cpfMembroBanca2 = cpfMembroBanca2;
    }

    public String getCpfMembroBanca3() {
        return cpfMembroBanca3;
    }

    public void setCpfMembroBanca3(String cpfMembroBanca3) {
        this.cpfMembroBanca3 = cpfMembroBanca3;
    }

    public String getCpfMembroBanca4() {
        return cpfMembroBanca4;
    }

    public void setCpfMembroBanca4(String cpfMembroBanca4) {
        this.cpfMembroBanca4 = cpfMembroBanca4;
    }
    
    
    public class AgendamentoDefesa {
    private List<AgendamentoDefesa> agendamentos;

    public AgendamentoDefesa() {
        this.agendamentos = new ArrayList<>();
    }

    public void cadastrarAgendamento(AgendamentoDefesa agendamento) {
        agendamentos.add(agendamento);
    }

    public List<AgendamentoDefesa> listarAgendamentos() {
        return new ArrayList<>(agendamentos);
    }

    public void atualizarAgendamento(AgendamentoDefesa agendamentoAntigo, AgendamentoDefesa agendamentoNovo) {
        // Implementar a lógica de atualização, por exemplo:
        int index = agendamentos.indexOf(agendamentoAntigo);
        if (index != -1) {
            agendamentos.set(index, agendamentoNovo);
        }
    }

    public void deletarAgendamento(AgendamentoDefesa agendamento) {
        agendamentos.remove(agendamento);
    }
}

    
}

