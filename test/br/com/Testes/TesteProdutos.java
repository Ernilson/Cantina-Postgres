/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Testes;

import br.com.Controller.ClientesController;
import br.com.Controller.ProdutosController;
import br.com.Model.Clientes;
import br.com.Model.Produtos;
import br.com.Services.ServiceCliente;
import br.com.Services.ServiceProdutos;
import java.math.BigDecimal;

/**
 *
 * @author s60254831168
 */
public class TesteProdutos {
    
    public static void main(String[] args) {
       ServiceCliente sc = new ServiceCliente();
        Clientes c = new Clientes();
        ProdutosController sp = new ProdutosController();
        
        Produtos p = new Produtos();
        ServiceProdutos sps = new ServiceProdutos();

//        p.setId_pro(6);
        p.setCodigo(200);
        p.setDescricao("Bebidas");
        p.setEstoque(30);
        p.setPreco(new BigDecimal("11.70"));

        sp.salvaProdutos(p);

    }
    
}
