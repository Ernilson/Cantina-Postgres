/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controller;

import br.com.BJDBC.ModuloConexao;
import br.com.Model.Carrinho;
import br.com.Model.Venda;
import br.com.Services.ServiceCarrinho;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ernilson Daniel Lima de Souza
 */
public class CarrinhoController {

    private ServiceCarrinho cr;
    private Carrinho dto;
    public CarrinhoController() {
        this.cr = new ServiceCarrinho();
        this.dto = new Carrinho();
    }

    public void salvaCarrinho(Carrinho c) {
        cr.save(c);
    }

    public void alterar(Carrinho c) {
        cr.alterar(c);
    }

    public List<Carrinho> listarTodosCarrinho() {
        return this.cr.findALL();
    }

    public List<Carrinho> listaCarrinhoPorId(int id) {
        return this.cr.findById(id);
    }

    public void removerCarrinho(Carrinho c) {
        this.cr.delete(c);
    }    
        
    public void Complemento(Carrinho c){
       
    }  
    
    public void baixaEstoque(Carrinho c){
        this.cr.baixa_Estoque(c);
    }

    public void Contador(String cbo) {
        int x = 1;
            dto.setCop(cbo);
            cr.salvaCBO(dto);
    }
    
     public void Comp(String cob){
        dto.setCop(cob);
         cr.salvarCob(dto);
    }
    
    public void AlinhaCarrinho(String cob){
        dto.setCop(cob);
         cr.AlinhaCarrinho(dto);
    }
    
}
