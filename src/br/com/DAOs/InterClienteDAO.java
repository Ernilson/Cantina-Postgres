/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAOs;

import br.com.Model.Clientes;
import java.util.List;

/**
 *
 * @author S60254831168
 */
public interface InterClienteDAO {
    
    void save(Clientes cl);
    
    boolean alterar(Clientes c);

    boolean delete(Clientes cl);
    
    List<Clientes> findALL();
    
    List<Clientes>  findById(int id);

    List<Clientes> findByNome(String nome);
}
