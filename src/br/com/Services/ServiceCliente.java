/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Services;

import br.com.BJDBC.ModuloConexao;
import br.com.DAOs.InterClienteDAO;
import br.com.Model.Clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s60254831168
 */
public class ServiceCliente implements InterClienteDAO{

    ModuloConexao conexao = new ModuloConexao();
    PreparedStatement pst;
    ResultSet rs;
    
    @Override
    public void save(Clientes cl) {
       conexao.conector();
        try {
            String sql = "insert into clientes(nome,ender,fone,email)values(?,?,?,?)";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setString(1, cl.getNome());
            pst.setString(2, cl.getEnder());
            pst.setString(3, cl.getFone());
            pst.setString(4, cl.getEmail());

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
    public boolean alterar(Clientes c) {
        conexao.conector();
        try {
            String sql = "update clientes set nome=?, ender=?, fone=?, email=? where id_c=?";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setString(1, c.getNome());
            pst.setString(2, c.getEnder());
            pst.setString(3, c.getFone());
            pst.setString(4, c.getEmail());
            pst.setInt(5, c.getId_c());
            pst.executeUpdate();
            pst.close();            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Clientes cl) {
       conexao.conector();
        try {
            String sql = "delete from clientes where id_c = ?";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            pst.setInt(1, cl.getId_c());
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
    public List<Clientes> findALL() {
        conexao.conector();
        try {
            String sql = "select * from clientes";
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            List<Clientes> listaCliente = new ArrayList<Clientes>();
            while (rs.next()) {
                Clientes cm = new Clientes();
                cm.setId_c(rs.getInt("id_c"));
                cm.setNome(rs.getString("NOME"));
                cm.setEnder(rs.getString("ENDER"));
                cm.setFone(rs.getString("FONE"));
                cm.setEmail(rs.getString("EMAIL"));
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
    public List<Clientes> findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clientes> findByNome(String nome) {
        conexao.conector();
        try {
            String sql = ("select * from clientes where nome like '%" + nome + "%'");
            PreparedStatement pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            List<Clientes> lsVenda = new ArrayList<>();
            while (rs.next()) {
                Clientes cm = new Clientes();
                cm.setId_c(rs.getInt("id_c"));
                cm.setNome(rs.getString("NOME"));
                cm.setEnder(rs.getString("ENDER"));
                cm.setFone(rs.getString("FONE"));
                cm.setEmail(rs.getString("EMAIL"));
                lsVenda.add(cm);

                lsVenda.add(cm);
            }
            return lsVenda;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }      
   
}
