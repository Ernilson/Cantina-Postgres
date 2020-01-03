/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Testes;

import br.com.Controller.ClientesController;
import br.com.Model.Clientes;
import br.com.Services.ServiceCliente;

/**
 *
 * @author s60254831168
 */
public class TesteClientes {

    public static void main(String[] args) {
        ServiceCliente sc = new ServiceCliente();
        Clientes c = new Clientes();
        ClientesController cc = new ClientesController();
        
//        c.setId_c(7);
        c.setNome("sdfsdTeste");
        c.setEnder("teste");
        c.setFone("321321");
        c.setEmail("@teste");
        
        cc.salvaClientes(c);

// ---------------------------------------------------------------------------
//        Venda v = new Venda();
//        ServiceVenda sv = new ServiceVenda();
//        
//        v.setCodvenda(200);
//        v.setDescricao("Bebidas");
//        v.setNome("Clientes");
//        v.setQtdp(32);
//        v.setFormaPg("Dinheiro");
//        v.setValorItem(new BigDecimal("10.00"));
//        v.setSubTotal(new BigDecimal("08.00"));
//        v.setValorTotal(new BigDecimal("11.00"));
//        
//        sv.save(v);
//        
//  ----------------------------------------------------------------------------
       
//        Carrinho c = new Carrinho();
//        ServiceCarrinho crs = new ServiceCarrinho();
//        c.setCodvenda(500);
//        c.setNome("Cliente");
//        c.setDescricao("Alimento");
//        c.setQtdp(3);
//        c.setValorItem(new BigDecimal("13.70"));
//        c.setValorSubTotal(new BigDecimal("27.40"));
//        c.setValorTotal(new BigDecimal("27.40"));
//        c.setFormaPg("Dinheiro");
//        crs.save(c);
//    ------------------------------------------------------------
//        Produtos p = new Produtos();
//        ServiceProdutos sps = new ServiceProdutos();
//
//        p.setId_pro(6);
//        p.setCodigo(500);
//        p.setDescricao("Alimento");
//        p.setEstoque(45);
//        p.setPreco(new BigDecimal("13.70"));
//
//        sps.save(p);
// ------------------------------------------------------

//        Clientes cl = new Clientes();
//        ServiceCliente scl = new ServiceCliente();
//        try {
//            cl.setNome("Cliente");
//            cl.setEnder("quadra 103");
//            cl.setFone("61 991323236");
//            cl.setEmail("cliente@teste");
//
//            scl.save(cl);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    
//  -----------------------------------------------------------------------
//        List<CadastroModel> cliente = cdao.findALL();
//        for (int i = 0; i < cliente.size(); i++) {
//            System.out.println("ID: " + cliente.get(i).getId() + "-Nome:" + cliente.get(i).getNome()+ "-Nome:" + cliente.get(i).getEnder());
//        }
    }
}
