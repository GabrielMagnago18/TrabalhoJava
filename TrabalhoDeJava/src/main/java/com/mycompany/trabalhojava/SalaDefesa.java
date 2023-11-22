
package com.mycompany.trabalhojava;

import java.util.ArrayList;
import java.util.List;


public class SalaDefesa {
    private int codigo;
    private String nome;
    private String local;
    private String horarioInicio;
    private String horarioTermino;
    private boolean reservado;

    public SalaDefesa(int codigo, String nome, String local, String horarioInicio, String horarioTermino, boolean reservado) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.reservado = reservado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
    
    
    public class SalaDeDefesa {
    private List<SalaDeDefesa> salas;

    public SalaDeDefesa() {
        this.salas = new ArrayList<>();
    }

    public void cadastrarSala(SalaDeDefesa sala) {
        salas.add(sala);
    }

    public List<SalaDeDefesa> listarSalas() {
        return new ArrayList<>(salas);
    }

    public void atualizarSala(SalaDeDefesa salaAntiga, SalaDeDefesa salaNova) {
        // Implemente a lógica de atualização, por exemplo:
        int index = salas.indexOf(salaAntiga);
        if (index != -1) {
            salas.set(index, salaNova);
        }
    }

    public void deletarSala(SalaDeDefesa sala) {
        salas.remove(sala);
    }
}
}



