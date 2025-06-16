package model.model;

public class Aluno {
    private String nome;
    private String cpf;
    private Plano plano;
    private boolean presente;

    public Aluno(String nome, String cpf, Plano plano) {
        this.nome = nome;
        this.cpf = cpf;
        this.plano = plano;
        this.presente = false;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Plano getPlano() {
        return plano;
    }

    public boolean isPresente() {
        return presente;
    }

    public void registrarPresenca() {
        this.presente = true;
    }

    public void resetarPresenca() {
        this.presente = false;
    }

    @Override
    public String toString() {
        return nome + " - CPF: " + cpf + " - Plano: " + plano.getNome();
    }
}
