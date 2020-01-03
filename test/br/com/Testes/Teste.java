/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Testes;

import br.com.BJDBC.ModuloConexao;
import br.com.Model.Carrinho;
import br.com.Model.Venda;
import br.com.Services.ServiceCarrinho;
import br.com.Services.ServiceProdutos;
import br.com.Services.ServiceVenda;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author s60254831168
 */
public class Teste {

    public static void main(String[] args) {
        ServiceProdutos sp = new ServiceProdutos();
        ServiceCarrinho sc = new ServiceCarrinho();
        ServiceVenda sv = new ServiceVenda();
        PreparedStatement pst;
        ResultSet rs;
        ModuloConexao conexao = new ModuloConexao();
        Carrinho dto = new Carrinho();
//        dto.setCodvenda(100);
//        dto.setId_c(178);  
//        conexao.conector();
//        int idi = 0;
//        int qtd = 0;
//        int result = 0;
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Venda v = new Venda();
//        VendasDAO vdao = new VendasDAO();
//        Carrinho v = new Carrinho();
//        CarrinhoDAO cdao = new CarrinhoDAO();
//        v.setCodvenda(100);
//        v.setNome("Cliente");
//        v.setDescricao("Alimento");
//        v.setQtdp(2);
//        v.setValorItem(new BigDecimal("13.70"));
//        v.setValorSubTotal(new BigDecimal("27.40"));
//        v.setValorTotal(new BigDecimal("27.40"));
//        v.setFormaPg("Dinheiro");
//        vdao.incluir(v);
// ---------------------------------------------------------------------------------------------------------------------------------
//        conexao.executaSQL(" select  C.nome, C,descricao, qtdp, valor_Item, valor_sub_total, valor_total, T.codproduto from carrinho C, produtos T where C.id_cr = T.id_pro;");
//        try {
//            conexao.rs.first();
//            pst = conexao.conn.prepareStatement("update produtos set repositor = (select (select estoque where codProduto = ?) - (select qtdp from carrinho where id_cr = ?))");                
//                pst.setInt(1, dto.getCodvenda());
//                pst.setInt(2, dto.getId_c());
//                pst.execute();
//                JOptionPane.showMessageDialog(null, "Produto Baixado com sucesso!!!");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }select  C.nome, C,descricao, qtdp, valor_Item, valor_sub_total, valor_total, T.codproduto from carrinho C, produtos T where C.id_cr = T.id_pro;
//-- ---------------------------------------------------------------------------------------------------------------------------------------
//        int Codprodto = 100; //1Integer.parseInt(CodP.getText());
//        int quantidade =5; //Integer.parseInt(VendQtd.getText());
//        int estoque=0;
//        int result =0;
//        conexao.conector();      
//        conexao.executaSQL("select * from produtos;");
//        try {
//            conexao.rs.first();            
//                estoque = conexao.rs.getInt("estoque");
//                result = estoque - quantidade;
//                pst = conexao.conn.prepareStatement("update produtos set estoque = where codproduto = ?"); 
//                pst.setInt(1, result);
//                pst.setInt(2, Codprodto);
//                JOptionPane.showMessageDialog(null, "Produto Baixado com sucesso!!!");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//---------------------------------------------------------------------------------------------------
//       int  um =200;
//       int dois = 3;
//        CallableStatement proc;
//        conexao.conector();
//        try {
//            pst = conexao.conn.prepareCall("select Baixa_Estoque(?,?);");
//            pst.setInt(1, um);
//            pst.setInt(2, dois);
//            pst.executeUpdate();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
        
        Venda vend = new Venda();
        vend.setId_v(97);
        vend.setDescricao("teste");
        vend.setQtdp(1);
        vend.setFormaPg("Crédito");
        sv.alterar(vend);
    }
}
