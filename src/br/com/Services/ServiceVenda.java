/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Services;

import br.com.BJDBC.ModuloConexao;
import br.com.DAOs.InterVendaDAO;
import br.com.Model.Venda;
import java.sql.Connection;
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
public class ServiceVenda implements InterVendaDAO {

    ModuloConexao conexao = new ModuloConexao();
    PreparedStatement pst;
    ResultSet rs;

    @Override
    public boolean save(Venda vend) {
        conexao.conector();
        try {
            String sql = "insert into venda(codvenda,nome, descricao,qtdp,valor_item,sub_total,valor_total,forma_pg)values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, vend.getCodvenda());
            pst.setString(2, vend.getNome());
            pst.setString(3, vend.getDescricao());
            pst.setInt(4, vend.getQtdp());
            pst.setBigDecimal(5, vend.getValorItem());
            pst.setBigDecimal(6, vend.getSubTotal());
            pst.setBigDecimal(7, vend.getValorTotal());
            pst.setString(8, vend.getFormaPg());

            pst.execute();
            pst.close();
            conexao.desconecata();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean alterar(Venda vend) {
        conexao.conector();
        try {
            String sql = "UPDATE VENDA SET DESCRICAO=?, QTDP=?, VALOR_TOTAL=?, FORMA_PG=? WHERE ID_V=?";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setString(1, vend.getDescricao());
            pst.setInt(2, vend.getQtdp());
            pst.setBigDecimal(3, vend.getValorTotal());
            pst.setString(4, vend.getFormaPg());
            pst.setInt(5, (int) vend.getId_v());
            pst.executeUpdate();
            pst.close();
            conexao.desconecata();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Venda vend) {
      conexao.conector();
        try {
            String sql = "delete from venda where id_v = ?";
           PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, (int) vend.getId_v());
            pst.execute();
//            pst.close();
//            ConexaoJDBC.conectaMysql().close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Venda> findALL() {
        conexao.conector();
        try {
            String sql = "select * from venda";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            List<Venda> listaCliente = new ArrayList<Venda>();
            while (rs.next()) {
                Venda cm = new Venda();
                cm.setId_v(rs.getInt("id_v"));
                cm.setNome(rs.getString("NOME"));
                cm.setDescricao(rs.getString("DESCRICAO"));
                cm.setQtdp(rs.getInt("QTDP"));
                cm.setValorItem(rs.getBigDecimal("VALOR_ITEM"));
                cm.setSubTotal(rs.getBigDecimal("SUB_TOTAL"));
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
    
    @Override
    public List<Venda> findById(int id) {
        conexao.conector();
        ResultSet rs;
        if (id == 0) {
            return (List<Venda>) new Venda();
        }
        try {
            String sql = ("select * from venda where id_v =" + id);
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            rs.next();
            Venda cm = new Venda();
            cm.setId_v(rs.getInt("ID_V"));
            cm.setCodvenda(rs.getInt("CODVENDA"));
            cm.setNome(rs.getString("NOME"));
            cm.setDescricao(rs.getString("DESCRICAO"));
            cm.setQtdp(rs.getInt("QTDP"));
            cm.setValorItem(rs.getBigDecimal("VALOR_ITEM"));
            cm.setSubTotal(rs.getBigDecimal("SUB_TOTAL"));
            cm.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
            cm.setFormaPg(rs.getString("FORMA_PG"));

            return (List<Venda>) cm;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Venda> findByNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     // METODO PARA FAZER O UPDATE DA DIFERENÇA DA TABELA PRODUTO (ESTOQUE) PELA TABELA CARRINHO (QUANTIDADE)
    public void baixa_Estoque(Venda dto) {
       conexao.conector();
        try {
            String sql = "update produtos set repositor = (select (select estoque where codProduto = ?) - (select qtdp from carrinho where id_cr = ?))";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, dto.getCodvenda());
            pst.setInt(2, dto.getId_v());
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA FAZER O UPDATE DA TABELA PRODUTO COLUNA ESTOQUE COM O CONTEUDO DA COLUNA REPOSITORIO
    public void baixa_Estoque2(Venda dto) {
        conexao.conector();
        try {
            String sql = "update produtos set estoque = (select cast(repositor as integer) from produtos where codproduto = ?); ";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, dto.getCodvenda());
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
