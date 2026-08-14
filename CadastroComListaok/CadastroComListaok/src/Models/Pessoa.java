/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

public class Pessoa {
    private String nome;
    private int idade;
    private boolean cadastroFinalizado;
    private String observacao;

    public Pessoa(String nome, int idade, String observacao) {
        this.nome = nome;
        this.idade = idade;
        this.cadastroFinalizado = false; // Inicialmente, o cadastro não está finalizado
        this.observacao = observacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isCadastroFinalizado() {
        return cadastroFinalizado;
    }

    public void setCadastroFinalizado(boolean cadastroFinalizado) {
        this.cadastroFinalizado = cadastroFinalizado;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}

      
    

