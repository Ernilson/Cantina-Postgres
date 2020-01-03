/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.BJDBC;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author ernil
 */
public class ModuloConexao {

     public PreparedStatement pst;//responsavel por preparar e realizar pesquisas no banco de dados; "jdbc:mysql://localhost:3306/sibre10";
    public Statement stm;//responsavel por preparar e realizar pesquisas no banco de dados
    public ResultSet rs; //responsavel por armazenar o resultado de uma pesquisa passada para o statement
    public Connection conn;//responsavel por realizar a conexão com o banco de dados
    private final String driver = "org.postgresql.Driver";//responsavel por realizar a conexão com o banco de dados
    private final String caminho =  "jdbc:postgresql://localhost:5432/sibre"; //responsavel por setar o local do banco de dados - u929652320_magal
    //sql10.freesqldatabase.com:3306/sql10234345" senha: 5Q8n1ZBrN5

    private final String usuario = "postgres";
    private final String senha = "musica";

    
    public void conector() {
        try {
            System.setProperty("jdbc.Driver", driver);//seta a propriedade do driver de conexao
            conn = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexao com o banco de dados

            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");//imprime um caixa de texto
        } catch (SQLException ex) {//excessão
            JOptionPane.showMessageDialog(null, "Erro de conexao!\n Erro:" + ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){
            try {
                stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
                rs = stm.executeQuery(sql);
                } catch (Exception e) {
            }
    }

    public void desconecata() { // metodo para fechar a conexao com o banco de dados

        try {
            conn.close();// fecha a conexão
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao!\n Erro:" + ex.getMessage());
        }

    }

}

