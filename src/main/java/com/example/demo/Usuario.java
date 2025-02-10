package com.example.demo;

public class Usuario {
    private String cpf;
    private int telefone;
    private String nome;


    public Usuario(String cpf, int telefone, String nome) {
        this.cpf = cpf;
        this.telefone = telefone;
        this.nome = nome;
    }

    public Usuario() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
