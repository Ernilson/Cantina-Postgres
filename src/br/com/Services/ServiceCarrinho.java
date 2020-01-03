/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Services;

import br.com.BJDBC.ModuloConexao;
import br.com.DAOs.InterCarrinhoDAO;
import br.com.Model.Carrinho;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author s60254831168
 */
public class ServiceCarrinho implements InterCarrinhoDAO {

    ModuloConexao conexao = new ModuloConexao();
    PreparedStatement pst;
    ResultSet rs;

    // METODO PARA INSERIR DADO NA TABELA CARRINHO
    @Override
    public void save(Carrinho cr) {
        conexao.conector();
        try {
            String sql = "insert into carrinho(codvenda, nome, descricao,qtdp,valor_item,valor_sub_total,valor_total,forma_pg)values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, cr.getCodvenda());
            pst.setString(2, cr.getNome());
            pst.setString(3, cr.getDescricao());
            pst.setInt(4, cr.getQtdp());
            pst.setBigDecimal(5, cr.getValorItem());
            pst.setBigDecimal(6, cr.getValorSubTotal());
            pst.setBigDecimal(7, cr.getValorTotal());
            pst.setString(8, cr.getFormaPg());
            pst.execute();
            pst.close();
            conexao.desconecata();
//            return true;
        } catch (Exception e) {
            e.printStackTrace();
//            return false;
        }
    }

    //METODOS PARA ALTERAR DADOS NA TABELA CARRINHO
    @Override
    public boolean alterar(Carrinho cr) {
        conexao.conector();
        try {
            String sql = "update carrinho setcodvenda=?, nome=?, descricao=?, qtdp =?, valor_item=?, valor_sub_total=?,valor_total=?,forma_pg=? where id_cr=?";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, cr.getCodvenda());
            pst.setString(2, cr.getNome());
            pst.setString(3, cr.getDescricao());
            pst.setInt(4, cr.getQtdp());
            pst.setBigDecimal(5, cr.getValorItem());
            pst.setBigDecimal(6, cr.getValorSubTotal());
            pst.setBigDecimal(7, cr.getValorTotal());
            pst.setString(8, cr.getFormaPg());
            pst.setLong(9, cr.getId_c());

            pst.executeUpdate();
            pst.close();
            conexao.desconecata();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //METODO PARA EXCLUIR DADOS DA TABELA CARRINHO
    @Override
    public boolean delete(Carrinho cr) {
        conexao.conector();
        try {
            String sql = "delete from carrinho where id_c = ?";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, (int) cr.getId_c());
            pst.execute();
            pst.close();
            conexao.desconecata();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    // METODO PARA LISTAR TODOS NA TABELA CARRINHO
    @Override
    public List<Carrinho> findALL() {
        conexao.conector();
        try {
            String sql = "select * from carrinho";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            List<Carrinho> listaCliente = new ArrayList<Carrinho>();
            while (rs.next()) {
                Carrinho cm = new Carrinho();
                cm.setId_c(rs.getInt("id_cr"));
                cm.setCodvenda(rs.getInt("CODVENDA"));
                cm.setNome(rs.getString("NOME"));
                cm.setDescricao(rs.getString("DESCRICAO"));
                cm.setQtdp(rs.getInt("QTDP"));
                cm.setValorItem(rs.getBigDecimal("VALOR_ITEM"));
                cm.setValorSubTotal(rs.getBigDecimal("VALOR_SUB_TOTAL"));
                cm.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
                cm.setFormaPg(rs.getString("FORMA_PG"));
                listaCliente.add(cm);
            }
            return listaCliente;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }

    //METODOS PARA FAZER BUSCA POR ID NA TABELA CARRINHO
    @Override
    public List<Carrinho> findById(int id) {
        conexao.conector();
        ResultSet rs;
        if (id == 0) {
            return (List<Carrinho>) new Carrinho();
        }
        try {
            String sql = ("select * from carrinho where id_cr =" + id);
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            rs.next();
            Carrinho cm = new Carrinho();
            cm.setId_c(rs.getInt("id_cr"));
            cm.setCodvenda(rs.getInt("CODVENDA"));
            cm.setNome(rs.getString("NOME"));
            cm.setDescricao(rs.getString("DESCRICAO"));
            cm.setQtdp(rs.getInt("QTDP"));
            cm.setValorItem(rs.getBigDecimal("VALOR_ITEM"));
            cm.setValorSubTotal(rs.getBigDecimal("VALOR_SUB_TOTAL"));
            cm.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
            cm.setFormaPg(rs.getString("FORMA_PG"));
            pst.close();
            conexao.desconecata();
            return (List<Carrinho>) cm;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // METODO PARA FAZER BUSCA POR NOME NA TABELA CARRINHO
    @Override
    public List<Carrinho> findByNome(String nome) {
        conexao.conector();
        try {
            String sql = ("select * from carrinho where nome like " + nome);
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            List<Carrinho> lsVenda = new ArrayList<>();
            while (rs.next()) {
                Carrinho cm = new Carrinho();
                cm.setId_c(rs.getInt("id_cr"));
                cm.setCodvenda(rs.getInt("CODVENDA"));
                cm.setNome(rs.getString("NOME"));
                cm.setDescricao(rs.getString("DESCRICAO"));
                cm.setQtdp(rs.getInt("QTDP"));
                cm.setValorItem(rs.getBigDecimal("VALOR_ITEM"));
                cm.setValorSubTotal(rs.getBigDecimal("VALOR_SUB_TOTAL"));
                cm.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
                cm.setFormaPg(rs.getString("FORMA_PG"));
                lsVenda.add(cm);

                lsVenda.add(cm);
            }
            return lsVenda;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //METODO PARA INSERIR DADOS DA FORMA DE PAGAMENTO NA TABELA TESTE
    @Override
    public void contador(String cbo) {
        conexao.conector();
        Carrinho dto = new Carrinho();
        String sql = "insert into teste (forma_pg )values (?)";
        try {
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setString(1, dto.getCop());

            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                // JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //METODO PARA INSERIR DADOS DA FORMA DE PAGAMENTO NA TABELA TESTE
     public void salvaCBO(Carrinho dto) {
        conexao.conector();
        String sql = "insert into teste (forma_pg )values (?)";
        try {
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setString(1, dto.getCop());
            pst.executeUpdate();        

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
      // METODO PARA FAZER O UPDATE DA DIFERENÇA DA TABELA PRODUTO (ESTOQUE) PELA TABELA CARRINHO (QUANTIDADE)
    public void baixa_Estoque(Carrinho dto) {
         conexao.conector();
        try {
            PreparedStatement pst = conexao.conn.prepareCall("select Baixa_Estoque(?,?);");
            pst.setInt(1, dto.getCop2());
            pst.setInt(2, dto.getQtdp());
            
            pst.executeUpdate();

        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
        }
    }

     // --------- ABAIXO TEMOS DOIS METODO QUE SÃO ALINHADOS COM UMA PROCEDURE NO BANCO ------------------------------   
     public void salvarCob(Carrinho dto) {       
        CallableStatement proc;
        conexao.conector();
        try {
            PreparedStatement pst = conexao.conn.prepareCall("select alinha_teste(?)");
            pst.setString(1, dto.getCop());
            pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void AlinhaCarrinho(Carrinho dto) {      
        CallableStatement proc;
        conexao.conector();
        try {
            PreparedStatement pst = conexao.conn.prepareCall("select alinha_carrinho(?);");
            pst.setString(1, dto.getCop());
            pst.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
