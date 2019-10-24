package com.example.listviewpersonalizado;

public class Curso {
    private String nome;
    private String descricao;
    private EstadoAtual estadoAtual;
    private Categoria categoria;

    public Curso(String nome, String descricao, EstadoAtual estadoAtual, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.estadoAtual = estadoAtual;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Curso: " + nome + " Descrição: " +
                descricao + " Estado: " + estadoAtual;
    }
}
