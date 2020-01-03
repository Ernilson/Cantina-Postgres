/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAOs;

import br.com.Model.Carrinho;
import java.util.List;

/**
 *
 * @author S60254831168
 */
public interface InterCarrinhoDAO {

    void save(Carrinho cr);

    void contador(String cbo);

    boolean alterar(Carrinho cr);

    boolean delete(Carrinho cr);

    List<Carrinho> findALL();

    List<Carrinho> findById(int id);

    List<Carrinho> findByNome(String nome);
}
