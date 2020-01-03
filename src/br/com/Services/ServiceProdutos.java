/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Services;

import br.com.BJDBC.ModuloConexao;
import br.com.DAOs.InterProdutoDAO;
import br.com.Model.Produtos;
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
public class ServiceProdutos implements InterProdutoDAO{

    ModuloConexao conexao = new ModuloConexao();
    PreparedStatement pst;
    ResultSet rs;
    
    @Override
    public void save(Produtos prod) {
        conexao.conector();
        try {
            String sql = "insert into produtos(codproduto, descricao_p, estoque, repositor, preco)values(?,?,?,?,?)";
           PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, prod.getCodigo());
            pst.setString(2, prod.getDescricao());
            pst.setInt(3, prod.getEstoque());
            pst.setInt(4, prod.getRepositor());
            pst.setBigDecimal(5, prod.getPreco());

            pst.execute();
            pst.close();
            conexao.desconecata();
//            return true;
        } catch (Exception e) {
            e.printStackTrace();
//            return false;
        }
    }

    @Override
    public boolean alterar(Produtos prod) {
       conexao.conector();
        try {
            String sql = "update produtos set codproduto =?, descricao_p=?, estoque =?, preco=? where id_pro=?";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, prod.getCodigo());
            pst.setString(2, prod.getDescricao());
            pst.setInt(3, prod.getEstoque());
            pst.setBigDecimal(4, prod.getPreco());

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
    public boolean delete(Produtos prod) {
        conexao.conector();
        try {
            String sql = "delete from produtos where id_pro = ?";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, (int) prod.getId_pro());
            pst.execute();
            pst.close();
            conexao.desconecata();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Produtos> findALL() {
       conexao.conector();
        try {
            String sql = "select * from produtos";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            List<Produtos> listaCliente = new ArrayList<Produtos>();
            while (rs.next()) {
                Produtos cm = new Produtos();
                cm.setId_pro(rs.getInt("ID_PRO"));
                cm.setCodigo(rs.getInt("CODPRODUTO"));
                cm.setDescricao(rs.getString("DESCRICAO_P"));
                cm.setEstoque(rs.getInt("ESTOQUE"));
                cm.setPreco(rs.getBigDecimal("PRECO"));
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
    public List<Produtos> findById(int id) {
        conexao.conector();
        ResultSet rs;
        if (id == 0) {
            return (List<Produtos>) new Produtos();
        }
        try {
            String sql = ("select * from produtos where id_pro =" + id);
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            rs.next();
            Produtos cm = new Produtos();
            cm.setCodigo(rs.getInt("CODPRODUTO"));
            cm.setDescricao(rs.getString("DESCRICAO"));
            cm.setEstoque(rs.getInt("ESTOQUE"));
            cm.setPreco(rs.getBigDecimal("PRECO"));
            pst.close();
            conexao.desconecata();
            return (List<Produtos>) cm;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Produtos> findByDescricao(String desc) {
        conexao.conector();
        try {
            String sql = ("select * from produtos where descricao_p like '%" + desc + "%'");
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            List<Produtos> listaProd = new ArrayList<Produtos>();
            while (rs.next()) {
                Produtos cm = new Produtos();
                cm.setId_pro(rs.getInt("id_pro"));
                cm.setCodigo(rs.getInt("CODPRODUTO"));
                cm.setDescricao(rs.getString("DESCRICAO_P"));
                cm.setEstoque(rs.getInt("ESTOQUE"));
                cm.setPreco(rs.getBigDecimal("PRECO"));
                listaProd.add(cm);
            }
            return listaProd;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }
    
    public void EstornoVenda(Produtos pto) {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este Venda?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "update produtos set repositor = (select (select estoque where codProduto = ?) + (select qtdp from venda where id_v = ?));";
            conexao.conector();
            try {
                PreparedStatement pst = conexao.conn.prepareStatement(sql);
                pst.setInt(1, pto.getCodigo());
                pst.setInt(2, pto.getId_pro());

                if (pto.getDescricao().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos obrgatórios");
                } else {
                    pst.executeUpdate();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro");
            }
        }      
    }

    public void EstornoComplemento(Produtos pto) {
        String sql = "update produtos set estoque = (select cast(repositor as integer) from produtos where codproduto = ?); ";
        conexao.conector();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, pto.getCodigo());

            if (pto.getDescricao().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrgatórios");
            } 
             pst.executeUpdate();               
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void logvenda(Produtos pto){
       conexao.conector();
        String sql = "insert into estorno(codVenda, caixa, cliente, descricao, qtde, valor_item, valor_total, forma_pg)\n" +
"               select C.codVenda, A.login, C.nome, C.descricao, C.qtdp, C.valor_item, C.valor_total,\n" +
"               C.forma_pg from venda C, acesso A  where id_v = ?";
        try {
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
             pst.setInt(1, pto.getId_pro());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Erro! " + e.getMessage());
        }
    }

    public void ExcluirVenda(Produtos pto) {
        conexao.conector();
        String sql = "delete from venda where id_v = ?";
        try {
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, pto.getId_pro());
            int apagado = pst.executeUpdate();
            if (apagado > 0) {
                JOptionPane.showMessageDialog(null, "Venda Estornada com sucesso!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro");

        }
    }
}
