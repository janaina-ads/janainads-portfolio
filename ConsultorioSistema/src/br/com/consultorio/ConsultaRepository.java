/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.consultorio;
import br.com.consultorio.Consulta;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Gabriel
 */
public class ConsultaRepository {
  private static List<Consulta> lista = new ArrayList<>();

    // 🔹 Adicionar nova consulta
    public static void adicionar(Consulta c) {
        lista.add(c);
    }

    // 🔹 Listar todas as consultas
    public static List<Consulta> listar() {
        return lista;
    }

    // 🔹 Remover consulta pelo índice
    public static void remover(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        }
    }

    // 🔹 Verificar se CPF já existe
    public static boolean cpfExiste(String cpf) {
        for (Consulta c : lista) {
            if (c.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }
}