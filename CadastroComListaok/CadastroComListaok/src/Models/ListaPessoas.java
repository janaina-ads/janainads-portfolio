/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

public class ListaPessoas {
    private ArrayList<Pessoa> pessoas;

    public ListaPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(int index) {
        pessoas.remove(index);
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
}