
package com.mycompany.trabalhojava;


public class Professor {
    private String cpf;
    private String nome;
    private String instituicao;
    private boolean externo;

    public Professor(String cpf, String nome, String instituicao, boolean externo) {
        this.cpf = cpf;
        this.nome = nome;
        this.instituicao = instituicao;
        this.externo = externo;
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public boolean isExterno() {
        return externo;
    }

    public void setExterno(boolean externo) {
        this.externo = externo;
    }

    
}
