/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAOs;

import br.com.Model.Produtos;
import java.util.List;

/**
 *
 * @author S60254831168
 */
public interface InterProdutoDAO {
    
    void save(Produtos prod);
    
    boolean alterar(Produtos prod);

    boolean delete(Produtos prod);

    List<Produtos> findALL();
    
    List<Produtos>  findById(int id);

    List<Produtos> findByDescricao(String desc);
}
