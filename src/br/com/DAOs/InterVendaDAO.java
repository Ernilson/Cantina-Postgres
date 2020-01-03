/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAOs;

import br.com.Model.Venda;
import java.util.List;

/**
 *
 * @author S60254831168
 */
public interface InterVendaDAO {
    
    boolean save(Venda vend);
    
    boolean alterar(Venda vend);

    boolean delete(Venda vend);

    List<Venda> findALL();
    
    List<Venda>  findById(int id);

    List<Venda> findByNome(String nome);
}
