/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.consultorio;

/**
 *
 * @author Gabriel
 */
public class Consulta {
     private String nomePaciente;
    private String cpf;
    private String telefone;
    private String dataConsulta;
    private boolean jaEraPaciente;
    private boolean consultaRealizada;
    private String observacoes;

  
    public Consulta(String nomePaciente, String cpf, String telefone,
                    String dataConsulta, boolean jaEraPaciente) {

        this.nomePaciente = nomePaciente;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataConsulta = dataConsulta;
        this.jaEraPaciente = jaEraPaciente;
        this.consultaRealizada = false; // começa como não realizada
        this.observacoes = "";
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public boolean isJaEraPaciente() {
        return jaEraPaciente;
    }

    public boolean isConsultaRealizada() {
        return consultaRealizada;
    }

    public String getObservacoes() {
        return observacoes;
    }

  
    public void finalizarConsulta(String observacoes) {
        this.consultaRealizada = true;
        this.observacoes = observacoes;
    }
 
}
