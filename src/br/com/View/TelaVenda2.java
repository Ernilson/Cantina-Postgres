/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.View;

import br.com.BJDBC.ModuloConexao;
import br.com.Controller.CarrinhoController;
import br.com.Controller.ClientesController;
import br.com.Controller.ProdutosController;
import br.com.Controller.VendaController;
import br.com.Model.Carrinho;
import br.com.Model.Produtos;
import br.com.Model.Venda;
import java.math.BigDecimal;
import br.com.zUtils.Exporter;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author s60254831168
 */
public class TelaVenda2 extends javax.swing.JFrame {

    ModuloConexao conexao = new ModuloConexao();
    PreparedStatement pst;
    ResultSet rs; int flag = 1;
    VendaController sv = new VendaController();
    ClientesController cc = new ClientesController();
    CarrinhoController ccr = new CarrinhoController();    
    ProdutosController pc = new ProdutosController();
    
    
    //METODO PARA FAZER BUSCA POR NOME NA TABELA CLIENTE - VendTbale;  select nome as Nome from clientes where nome like ?
    public void pesquisaCadastro() {
        conexao.conector();
        String sql = "SELECT NOME AS NOME FROM CLIENTES WHERE NOME LIKE ?";
        try {
            pst = conexao.conn.prepareStatement(sql);
            pst.setString(1, VendNome.getText() + "%");
            rs = pst.executeQuery();
            // a linha abaixo usa a biblioteca rs2xml.jar                          
            VendTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
     // METODO PARA PREENCHER OS CAMPOS DOS FOMULARIOS COM DADOS DA TABELA PRODUTOS "RESULT_TABLE' NA SEGUNDA ABA;
    public void pesquisaProduto(String sql) {
        conexao.conector();
        try {
            pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            // a linha abaixo usa a biblioteca rs2xml.jar                  
            ResultTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //METODOS PARA PREENCHER O FORMULARIO COM OS DADOS DO BANCO DA TABELA CLIENTES
    private void setarCadastro() {
        int setar = VendTable.getSelectedRow();
        VendNome.setText(VendTable.getModel().getValueAt(setar, 0).toString());
    }

    //METODO PARA FAZER BUSCA POR NOME NA TABELA PRODUTO - VendTbale2; 
    public void pesquisaProdutos() {
        conexao.conector();
        String sql = "select descricao_p as Descrição, estoque as Estoque, preco as Valor, codproduto as CodProduto, dataq as Data from produtos where descricao_p like ?";
        try {
            pst = conexao.conn.prepareStatement(sql);
            pst.setString(1, VendProduto.getText() + "%");
            rs = pst.executeQuery();
            // a linha abaixo usa a biblioteca rs2xml.jar
            VendTable2.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }  
    
    // METODO PARA LISTA OS DADOS DA TABELA DE FECHAMENENTO NA 3º ABA
    public void Tentativa_A(String sql) {
        conexao.conector();
        try {
            pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            // a linha abaixo usa a biblioteca rs2xml.jar                  
            tblFechamento.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //METODOS PARA PREENCHER O FORMULARIO COM OS DADOS DO BANCO DA TABELA PRODUTOS  JTable "VendTable2" NA PRIMEIRA ABA;
    private void setarProduto() {
        int setar = VendTable2.getSelectedRow();
        VendProduto.setText(VendTable2.getModel().getValueAt(setar, 0).toString());
        VendQtd.setText(VendTable2.getModel().getValueAt(setar, 1).toString());
        VendValorItem.setText(VendTable2.getModel().getValueAt(setar, 2).toString());
        VendValor.setText(VendTable2.getModel().getValueAt(setar, 2).toString());
        VendData.setText(VendTable2.getModel().getValueAt(setar, 3).toString());
        CodP.setText(VendTable2.getModel().getValueAt(setar, 3).toString());
        CodP2.setText(VendTable2.getModel().getValueAt(setar, 3).toString());
    }

    // MÉTOD PARA VISUALIZAR OS PRODUTOS ADCIONADOS NA TABELA 3ª DA PRIMEIRA ABA
    private void VisualiaCarrinho(String sql) {
        conexao.conector();
        try {
            pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            // a linha abaixo usa a biblioteca rs2xml.jar                  
            VendTable3.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     //METODOS PARA PREENCHER O FORMULARIO COM OS DADOS DO BANCO DA TABELA PRODUTOS (primeira aba) COM OS DADOS DA TABELA CARRINHO;
    private void avancar3() {
        int setar3 = VendTable3.getSelectedRow();
       
    }
    
    // METODOS PARA EXCLUIR LIMPAR A TABELA VENDA DA 3ª ABA
    private void excluirVenda() {
        conexao.conector();
        int confirma = JOptionPane.showConfirmDialog(null, "TEM CERTEZA QUE DESEJA APAGAR OS DADOS DA TABELA VENDA?!", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "truncate venda cascade";
            try {
                pst = conexao.conn.prepareStatement(sql);
                int apagado = pst.executeUpdate();
                if (apagado >= 0) {
                    JOptionPane.showMessageDialog(null, "A Tabela estar Limpa!!!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro" + e);

            }
        }
    }
    
   // METODO PARA PREENCHER OS CAMPOS DOS FOMULARIOS COM DADOS DA TABELA VENDA "RESULT_TABLE' NA SEGUNDA ABA;
    public void pesquisaVenda(String sql) {
        conexao.conector();
        try {
            pst = conexao.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            // a linha abaixo usa a biblioteca rs2xml.jar                           
            ResultTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // METODO PARA CHAMAR A CALCULADORA
     public void actionPerformed() {
        try {
            Runtime rt = Runtime.getRuntime();
            //Process pr = rt.exec("cmd /c dir");
            Process pr = rt.exec("C:\\Windows\\system32\\calc.exe");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }   
    
    // METODO PARA PREENCHER OS CAMPOS DOS FOMULARIOS COM DADOS DA TABELA VENDA "RESULT_TABLE' NA SEGUNDA ABA;
    private void setarReult() {
        int setar = ResultTable.getSelectedRow();
        ResultId.setText(ResultTable.getModel().getValueAt(setar, 0).toString());
        ResultPesq.setText(ResultTable.getModel().getValueAt(setar, 2).toString());
        ProdDesc.setText(ResultTable.getModel().getValueAt(setar, 2).toString());
        ProdQtd.setText(ResultTable.getModel().getValueAt(setar, 3).toString());
        ProdPreco.setText(ResultTable.getModel().getValueAt(setar, 4).toString());
        CodPrduto.setText(ResultTable.getModel().getValueAt(setar, 1).toString());
        txtRep.setText(ResultTable.getModel().getValueAt(setar, 0).toString());
    }
    
     // METODO PARA PREENCHER OS CAMPOS DOS FOMULARIOS COM DADOS DA TABELA VENDA "RESULT_TABLE' NA SEGUNDA ABA;
    private void setarVenda() {
        int setar = ResultTable.getSelectedRow();        
        ResultId.setText(ResultTable.getModel().getValueAt(setar, 0).toString());
        CodPrduto.setText(ResultTable.getModel().getValueAt(setar, 1).toString());
        ResultPesq.setText(ResultTable.getModel().getValueAt(setar, 2).toString());
        ProdDesc.setText(ResultTable.getModel().getValueAt(setar, 3).toString());
        ProdQtd.setText(ResultTable.getModel().getValueAt(setar, 5).toString());
        ProdPreco.setText(ResultTable.getModel().getValueAt(setar, 4).toString());
        ProdPag.setText(ResultTable.getModel().getValueAt(setar, 7).toString());

    }

    // METODO PARA CALCULAR O VALOR TOTAL DA TABELA VENDA 
    public void Leandro() {
        float ttext = Float.parseFloat(ValorFinal.getText());
        float total = Float.parseFloat(VendValorT.getText());
        float subtotal = Float.parseFloat(ValorFinal.getText());
        float qtd = Float.parseFloat(VendQtd.getText());
        float Final = (float) (total + subtotal);
        total = Final;
        ValorFinal.setText(String.valueOf(total));

    }

    // METODO PARA LIMPAR TABELA CARRINHO NO BANCO
    private void excluir() {
        String sql = "TRUNCATE CARRINHO;";
        try {
            pst = conexao.conn.prepareStatement(sql);
            int apagado = pst.executeUpdate();
            if (apagado > 0) {
                 JOptionPane.showMessageDialog(null, "Usuário removido com sucesso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");

        }
    }
    
    //METODO PARA PREENCHER COM OS DADOS DO BANCO DA TABELA  "VENDA" o JTABLE - VENDTABLE2 NA PRIMEIRA ABA;
    public void pesquisaV() {
        conexao.conector();
        String sql = "SELECT NOME AS NOME, DESCRICAO AS DESCRIÇÃO, QTDP AS QUANTIDADE, VALOR_ITEM AS ITEM, VALOR_SUB_TOTAL AS SUB_TOTAL, FORMA_PG AS FORMA_PG, DATAQ AS DATA FROM VENDA;";
        try {
            pst = conexao.conn.prepareStatement(sql);
            //pst.setString(1, VendProduto.getText() + "%");
            rs = pst.executeQuery();
            // a linha abaixo usa a biblioteca rs2xml.jar
            LastTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void SetarId(){
          conexao.conector();
        try {
            conexao.executaSQL("select * from carrinho order by id_car desc");
            conexao.rs.first();            
        } catch (Exception ex) {
            System.out.println("Erro " + ex);
        }
    }            
    
    //METODO PARA CONVERTER DADOS DOS FORMOLARIOS PARA A TABELA CARRINHO
    public void SalvarFora(){
            String nome = this.VendNome.getText();
            String descrica = this.VendProduto.getText();
            int qtd = Integer.parseInt(VendQtd.getText());
            BigDecimal valorTotal = new BigDecimal(VendValorT.getText());
            BigDecimal vfinal = new BigDecimal(ValorFinal.getText());
            BigDecimal valorItem = new BigDecimal(VendValor.getText());
            int Codprodto = Integer.parseInt(CodP.getText());
            int Codprodto2 = Integer.parseInt(CodP2.getText());
            int id = Integer.parseInt(IdV.getText());
            
            Carrinho c = new Carrinho();
            c.setId_c(id);
            c.setCodvenda(Codprodto);c.setCop2(Codprodto2);c.setNome(nome);c.setDescricao(descrica);
            c.setQtdp(qtd);c.setValorItem(valorItem);c.setValorSubTotal(vfinal);
            c.setValorTotal(valorTotal);          
            //CHAMA O METODO BAIXA ESTOQUE NO BTN ADCIONAR
             ccr.baixaEstoque(c);
                
            //METODO PARA SALVAR NO CARRINHO
             ccr.salvaCarrinho(c);
    }     
       
    //METODO PARA LIMPAR A TELA
     private void limpaTela() {
        VendTable.setVisible(false);
        VendProduto.setText("");
        VendTable2.setVisible(false);
        VendQtd.setText("");
        VendValorT.setText("");                
        VendValorItem.setText("");
        VendData.setText("");
    }
     
     //METODO PARA LIMPAR A TELA ESTOQUE
     private void LimparEstoque() {
        ResultId.setText(null);
        ResultPesq.setText(null);
        ResultTable.setVisible(false);
        ProdDesc.setText(null);
        ProdQtd.setText(null);
        ProdPreco.setText(null);
        ProdPag.setText(null);
        CodPrduto.setText(null);
    }
     
    /**
     * Creates new form TelaVenda
     */
    public TelaVenda2() {
        initComponents();
        ValorFinal.setText("0");
        IdV.setText("1");
        VendQtd.setEnabled(false);
        VendProduto.setEnabled(false);
        VendAdd.setEnabled(true);

       
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        VendTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        VendNome = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        VendTable2 = new javax.swing.JTable();
        VendData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        VendTable3 = new javax.swing.JTable();
        LblBemVindo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        VendAdd = new javax.swing.JButton();
        ValorFinal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnFinal = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        VendQtd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnDel = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        VendValorT = new javax.swing.JTextField();
        VendValorItem = new javax.swing.JTextField();
        VendProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        VendValor = new javax.swing.JTextField();
        CodP = new javax.swing.JTextField();
        CodP2 = new javax.swing.JTextField();
        IdV = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ResultPesq = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ResultId = new javax.swing.JTextField();
        BtnVendido = new javax.swing.JButton();
        ResultEstoque = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        BtnAdic = new javax.swing.JButton();
        BtnApagaP = new javax.swing.JButton();
        BtnEstorno = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ProdDesc = new javax.swing.JTextField();
        ResultNovo = new javax.swing.JButton();
        ProdPreco = new javax.swing.JTextField();
        ProdPag = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtnProdAlterar = new javax.swing.JButton();
        ProdQtd = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        CodPrduto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BtnCalc01 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtRep = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        BtnPgnt = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblFechamento = new javax.swing.JTable();
        BtnLB = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Abast = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnImportar = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        LastTable = new javax.swing.JTable();
        BtnRelCantina = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1753, 772));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(1700, 770));

        VendTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VendTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VendTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        VendTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VendTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(VendTable);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Nome:");

        VendNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VendNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VendNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VendNomeKeyReleased(evt);
            }
        });

        VendTable2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VendTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        VendTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VendTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(VendTable2);

        VendData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VendData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VendData.setEnabled(false);

        VendTable3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VendTable3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VendTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VendTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VendTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VendTable3);

        LblBemVindo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LblBemVindo.setText("Bem Vindo");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Seja Bem Vindo");

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        VendAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VendAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TImagens/chegada.jpg"))); // NOI18N
        VendAdd.setToolTipText("Finalizar Venda");
        VendAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VendAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VendAddMouseClicked(evt);
            }
        });
        VendAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendAddActionPerformed(evt);
            }
        });

        ValorFinal.setFont(new java.awt.Font("FreeSans", 3, 70)); // NOI18N
        ValorFinal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ValorFinal.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Valor Total:");

        btnFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TImagens/Seta2.png"))); // NOI18N
        btnFinal.setToolTipText("Adicionar");
        btnFinal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Adicionar:");

        VendQtd.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        VendQtd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VendQtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                VendQtdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                VendQtdFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Qtdade:");

        btnDel.setBackground(new java.awt.Color(255, 255, 255));
        btnDel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TImagens/renovar.jpg"))); // NOI18N
        btnDel.setToolTipText("Novo");
        btnDel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(VendQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(ValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(VendAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(154, 154, 154)
                .addComponent(jLabel18)
                .addGap(316, 316, 316)
                .addComponent(jLabel10)
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ValorFinal, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(VendQtd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(VendAdd))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        VendValorT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        VendValorT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VendValorT.setEnabled(false);

        VendValorItem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VendValorItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VendValorItem.setEnabled(false);
        VendValorItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VendValorItemMouseClicked(evt);
            }
        });

        VendProduto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        VendProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VendProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VendProdutoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SubTotal:");

        jLabel17.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        jLabel17.setText("Valor/Item:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Produto");

        CodP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CodP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CodP.setEnabled(false);

        CodP2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        CodP2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CodP2.setEnabled(false);

        IdV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        IdV.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(VendProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(VendValor, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VendValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(CodP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VendValorT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(VendValor, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VendProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(VendValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VendValorT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel17)
                            .addComponent(CodP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(CodP2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IdV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel26.setText("Data da Compra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VendNome, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VendData, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26))
                            .addComponent(LblBemVindo))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(LblBemVindo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(VendNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VendData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vendas", jPanel1);

        jPanel3.setBackground(new java.awt.Color(184, 163, 163));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMaximumSize(new java.awt.Dimension(960, 700));
        jPanel3.setPreferredSize(new java.awt.Dimension(964, 700));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Pesquisa");

        ResultPesq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResultPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultPesqActionPerformed(evt);
            }
        });
        ResultPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ResultPesqKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Id");

        ResultId.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        ResultId.setEnabled(false);

        BtnVendido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnVendido.setText("Vendidos");
        BtnVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVendidoActionPerformed(evt);
            }
        });
        BtnVendido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BtnVendidoKeyReleased(evt);
            }
        });

        ResultEstoque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ResultEstoque.setText("Estoque");
        ResultEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultEstoqueActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(184, 163, 163));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnAdic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnAdic.setText("Adicionar Produto");
        BtnAdic.setToolTipText("Adiciona Produto");
        BtnAdic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnAdic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAdic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdicActionPerformed(evt);
            }
        });

        BtnApagaP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnApagaP.setText("Apaga Produto");
        BtnApagaP.setToolTipText("Apga produto");
        BtnApagaP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnApagaP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnApagaP.setEnabled(false);
        BtnApagaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApagaPActionPerformed(evt);
            }
        });

        BtnEstorno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnEstorno.setText("ESTORNO");
        BtnEstorno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnEstorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEstornoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(BtnAdic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(BtnEstorno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnApagaP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdic, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnApagaP, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEstorno, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(184, 163, 163));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Descrição:");

        ProdDesc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        ResultNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResultNovo.setText("Novo");
        ResultNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultNovoActionPerformed(evt);
            }
        });

        ProdPreco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        ProdPag.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Preço por unidade:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Forma de Pagamento");

        BtnProdAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnProdAlterar.setText("Altera Vendido");
        BtnProdAlterar.setToolTipText("Alterar vendidos");
        BtnProdAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnProdAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnProdAlterar.setEnabled(false);
        BtnProdAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProdAlterarActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Qtd/venda");

        CodPrduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CodPrduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("CodProduto");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProdPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProdQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CodPrduto))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProdPag, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnProdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(ResultNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResultNovo))
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel13))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProdQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ProdPag, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProdPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CodPrduto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnProdAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ResultTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ResultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ResultTable);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane7.setViewportView(jTextArea1);

        BtnCalc01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TImagens/Calculadora.1.png"))); // NOI18N
        BtnCalc01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalc01ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Lembrete");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Calculadora");

        txtRep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRep.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BtnCalc01, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(ResultId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRep, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BtnVendido)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ResultPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ResultEstoque))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResultEstoque)
                    .addComponent(ResultPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(BtnVendido))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(13, 13, 13)
                                .addComponent(BtnCalc01)
                                .addGap(50, 50, 50))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ResultId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(txtRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1438, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Abasteciemento", jPanel2);

        jTabbedPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane3.setForeground(new java.awt.Color(51, 0, 51));
        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel11.setBackground(new java.awt.Color(153, 165, 150));

        BtnPgnt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnPgnt.setText("Resumo do Dia");
        BtnPgnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPgntActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tblFechamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblFechamento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblFechamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tblFechamento);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        BtnLB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnLB.setText("LimpaBanco");
        BtnLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLBActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("FIADO");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("CRÉDITO");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setText("DINHEIRO");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel27.setText("DÉBITO");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Cadastro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(BtnPgnt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnLB, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel19)
                            .addComponent(jLabel27)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(563, 563, 563)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPgnt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Ferramentas", jPanel11);

        jPanel12.setForeground(new java.awt.Color(0, 204, 204));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setText("Sistema de Vendas da Segunda Igreja Batista no Recanto das Emas - SIBRE");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Este programa foi desenvolvido com a finalidade de suprir uma necessidade básica das vendas da cantina da SIBRE");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("pois era necessário que se soubesse quando houve uma venda e a forma de pagamento na qual esta venda foi feita ");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("afim de apresentar o relatório da mesma para conferência e também para ajustes de contas nas reuniões da SIBRE.");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Toda honra e toda a glória seja dada ao Senhor nosso Jesus Cristo para gloria de Deus Pai.");

        jLabel21.setText("Sistema desenvolvido por: Ernilson Daniel Lima de Souza");
        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("No Senhor faremos proesas. Salmos 108:13 "); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel30))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel29))))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(285, 285, 285))))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel20))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(jLabel22))
                    .addComponent(jLabel21))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(43, 43, 43))
        );

        jTabbedPane3.addTab("Sobre", jPanel12);

        jTabbedPane2.addTab("", jTabbedPane3);

        jTabbedPane1.addTab("Ferramentas", jTabbedPane2);

        Abast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(153, 152, 173));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Vani", 0, 36)); // NOI18N
        jLabel1.setText("Impressão de Relatorios da Cantina");

        btnImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TImagens/Excel2.jpg"))); // NOI18N
        btnImportar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        LastTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LastTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(LastTable);

        BtnRelCantina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TImagens/pdf.jpg"))); // NOI18N
        BtnRelCantina.setToolTipText("Impressão de Relatório");
        BtnRelCantina.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnRelCantina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRelCantinaActionPerformed(evt);
            }
        });

        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/TImagens/renovar.jpg"))); // NOI18N
        btnExport.setText("Renova Tabela");
        btnExport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(jLabel1)
                .addContainerGap(488, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247)
                        .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRelCantina, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnRelCantina, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        Abast.addTab("Relatório da Cantina", jPanel8);

        jTabbedPane1.addTab("Relatórios", Abast);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1447, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1463, 859));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEstornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEstornoActionPerformed
        int id = Integer.parseInt(ResultId.getText());
        String descricao = this.ProdDesc.getText();
        String qtd = this.ProdQtd.getText();
        String preco = this.ProdPreco.getText();
        String repositor = txtRep.getText();
        int codproduto = Integer.parseInt(CodPrduto.getText());
        Produtos p = new Produtos();
        p.setId_pro(id);p.setDescricao(descricao);p.setCodigo(codproduto);
        pc.EstornoVendas(p);        
        LimparEstoque();
    }//GEN-LAST:event_BtnEstornoActionPerformed

    private void BtnCalc01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalc01ActionPerformed
        actionPerformed();
    }//GEN-LAST:event_BtnCalc01ActionPerformed

    private void ResultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultTableMouseClicked
        if (flag == 2) {
            setarReult();
        } else {
            setarVenda();
        }
    }//GEN-LAST:event_ResultTableMouseClicked

    private void BtnProdAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProdAlterarActionPerformed
        int id = Integer.parseInt(ResultId.getText());
        String descricao = this.ProdDesc.getText();
        int qtd = Integer.parseInt(ProdQtd.getText());         
        BigDecimal preco = new BigDecimal(ProdPreco.getText());      
        String formpg = ProdPag.getText();
        Venda v = new Venda();
        v.setId_v(id); v.setDescricao(descricao);v.setQtdp(qtd);v.setFormaPg(formpg);
        sv.alterar(v);
        LimparEstoque();
    }//GEN-LAST:event_BtnProdAlterarActionPerformed

    private void ResultNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultNovoActionPerformed
        txtRep.setText("10");
        ProdDesc.setEnabled(true);
        ProdPreco.setEnabled(true);
        ProdQtd.setEnabled(true);
        ResultEstoque.setEnabled(true);
        BtnAdic.setEnabled(true);
        BtnVendido.setEnabled(true);
        BtnApagaP.setEnabled(false);
        CodPrduto.setEnabled(true);
        BtnEstorno.setEnabled(false);
        LimparEstoque();
    }//GEN-LAST:event_ResultNovoActionPerformed

    private void BtnApagaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApagaPActionPerformed
        int id_pro = Integer.parseInt(ResultId.getText());  
        Produtos p = new Produtos();
        p.setId_pro(id_pro); 
        pc.removerProdutos(p);
        ResultTable.setVisible(false);
        LimparEstoque();
    }//GEN-LAST:event_BtnApagaPActionPerformed

    private void BtnAdicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicActionPerformed
        String descricao = this.ProdDesc.getText();
        int qtd = Integer.parseInt(ProdQtd.getText());
        BigDecimal preco = new BigDecimal(ProdPreco.getText());
        String repositor = txtRep.getText();
        int codproduto = Integer.parseInt(CodPrduto.getText());
        Produtos p = new Produtos();
        p.setCodigo(codproduto);p.setDescricao(descricao); p.setEstoque(qtd); p.setPreco(preco);
        pc.salvaProdutos(p);        
        LimparEstoque();
    }//GEN-LAST:event_BtnAdicActionPerformed

    private void ResultEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultEstoqueActionPerformed
        pesquisaVenda("select id_pro as Id, codproduto as CodProduto, descricao_p as Descrição, estoque as Quantidade, preco as Preço, dataq as Data from produtos where descricao_p like '%" + ResultPesq.getText() + "%'order by dataq desc");
        ProdDesc.setEnabled(true);
        ProdPreco.setEnabled(true);
        ProdQtd.setEnabled(true);
        BtnApagaP.setEnabled(true);
        ResultTable.setVisible(true);
        ProdPag.setEnabled(false);
        BtnEstorno.setEnabled(false);
        BtnProdAlterar.setEnabled(false);
        BtnAdic.setEnabled(false);
        flag = 2;
        CodPrduto.setEnabled(true);
        txtRep.setText("5");
    }//GEN-LAST:event_ResultEstoqueActionPerformed

    private void BtnVendidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnVendidoKeyReleased
        //        ProdPag.setEnabled(false);
    }//GEN-LAST:event_BtnVendidoKeyReleased

    private void BtnVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVendidoActionPerformed
        pesquisaProduto("select id_v as Id, codvenda CodVenda, nome as Nome, descricao as Descrição, valor_item as Valor_Item, qtdp as Quantidade,valor_sub_total as Sub_Total,forma_pg as Forma_Pg, dataq as Data from venda where nome like '%" + ResultPesq.getText() + "%'order by dataq desc");
        BtnAdic.setEnabled(false);
        BtnApagaP.setEnabled(false);
        ProdDesc.setEnabled(true);
        ProdQtd.setEnabled(true);
        ProdPreco.setEnabled(true);
        ResultTable.setVisible(true);
        ProdPag.setEnabled(true);
        BtnProdAlterar.setEnabled(true);
        BtnEstorno.setEnabled(true);
        flag = 1;
        CodPrduto.setEnabled(false);
        txtRep.setText("2");
    }//GEN-LAST:event_BtnVendidoActionPerformed

    private void ResultPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResultPesqKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultPesqKeyReleased

    private void ResultPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultPesqActionPerformed

    private void VendProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VendProdutoKeyReleased
        pesquisaProdutos();
        VendNome.setEnabled(false);
        VendTable2.setVisible(true);
        btnFinal.setEnabled(true);
        VendAdd.setEnabled(false);
    }//GEN-LAST:event_VendProdutoKeyReleased

    private void VendValorItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VendValorItemMouseClicked

    }//GEN-LAST:event_VendValorItemMouseClicked

    private void VendQtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VendQtdFocusLost
        float valorTotal;
        valorTotal = Float.parseFloat(VendValorItem.getText()) * Integer.parseInt(VendQtd.getText());
        VendValorT.setText(String.valueOf(valorTotal));
    }//GEN-LAST:event_VendQtdFocusLost

    private void VendQtdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VendQtdFocusGained
        float valorTotal;
        valorTotal = Float.parseFloat(VendValorItem.getText()) * Integer.parseInt(VendQtd.getText());
        VendValorT.setText(String.valueOf(valorTotal));
    }//GEN-LAST:event_VendQtdFocusGained

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        Integer adic;
        
        adic = Integer.parseInt(VendQtd.getText());
        if (adic == 0) {
            JOptionPane.showMessageDialog(null, "Confirme a quantidade");
        } else {
            Leandro();
            SalvarFora();
            VisualiaCarrinho("SELECT ID_CR, CODVENDA, NOME AS NOME, DESCRICAO AS DESCRIÇÃO, VALOR_ITEM AS VALOR_ITEM, QTDP AS QTD, VALOR_SUB_TOTAL AS SUB_TOTAL, VALOR_TOTAL AS VALOR_TOTAL FROM CARRINHO;");
            VendQtd.setEnabled(false);
            VendAdd.setEnabled(true);
            btnFinal.setEnabled(false);
            SetarId();
            limpaTela();            
            int i = 0;
            int numero = Integer.parseInt(IdV.getText());
            switch (numero) {
                case 0:IdV.setText("1"); break; case 1:IdV.setText("2"); break; case 2: IdV.setText("3"); break; case 3: IdV.setText("4"); break; case 4: IdV.setText("5"); break;
                case 5: IdV.setText("6"); break; case 7: IdV.setText("7"); break; case 8: IdV.setText("8"); break; case 9: IdV.setText("9"); break; default: break;
            }
        }
    }//GEN-LAST:event_btnFinalActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        excluir();
        VendNome.setEnabled(true);
        VendTable3.setVisible(false);
        ValorFinal.setText("0");
        VendAdd.setEnabled(false);
        IdV.setText("0");
    }//GEN-LAST:event_btnDelActionPerformed

    private void VendAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendAddActionPerformed
        VendNome.setText("");
        VendTable3.setVisible(false);
        ValorFinal.setText("0");
        VendValorT.setText("0");
        VendProduto.setText("");
        VendQtd.setEnabled(false);
        VendProduto.setEnabled(false);
        btnFinal.setEnabled(false);
        TPagamento tp = new TPagamento();
        tp.setVisible(true);
    }//GEN-LAST:event_VendAddActionPerformed

    private void VendAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VendAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VendAddMouseClicked

    private void VendTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VendTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VendTable3MouseClicked

    private void VendTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VendTable2MouseClicked
        setarProduto();
        VendQtd.setEnabled(true);
        VendQtd.setText("0");
        VendTable2.setVisible(false);
        VendTable3.setVisible(true);
        VisualiaCarrinho("SELECT CODVENDA, NOME AS NOME, DESCRICAO AS DESCRIÇÃO, VALOR_ITEM AS VALOR_ITEM, QTDP AS QTD, VALOR_SUB_TOTAL AS SUB_TOTAL, VALOR_TOTAL AS VALOR_TOTAL FROM CARRINHO ORDER BY ID_CR DESC;");
    }//GEN-LAST:event_VendTable2MouseClicked

    private void VendNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VendNomeKeyReleased
        pesquisaCadastro();
        VendTable.setVisible(true);
        VendProduto.setEnabled(true);
        btnFinal.setEnabled(true);
    }//GEN-LAST:event_VendNomeKeyReleased

    private void VendTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VendTableMouseClicked
        setarCadastro();
        VendTable.setVisible(false);
    }//GEN-LAST:event_VendTableMouseClicked

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
         pesquisaV();
        if (this.LastTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Sem dados a exportar", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            this.btnExport.grabFocus();
            return;
        }
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guarda arquivo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            List<JTable> tb = new ArrayList<>();
            List<String> nom = new ArrayList<>();
            tb.add(LastTable);
            nom.add("socios");
            String file = chooser.getSelectedFile().toString().concat(".xls");
            try {
                Exporter e = new Exporter(new File(file), tb, nom);
                if (e.export()) {
                    JOptionPane.showMessageDialog(null, "Sucesso");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO");

            }
        }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void BtnRelCantinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRelCantinaActionPerformed
        // Essa função é para gerar relatório
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão desse deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            conexao.conector();
            //imprimindo o relatório com o framework JasperReports  select * from venda order by dataq desc;
            try {
                conexao.executaSQL(" select nome,descricao,qtdp,valor_item,valor_sub_total,forma_pg,dataq from venda");
                JRResultSetDataSource relatResult = new JRResultSetDataSource(conexao.rs);
                JasperPrint print = JasperFillManager.fillReport("C:/Cantina_Postgres/lib/Report/MyReports/Perto.jasper", new HashMap(), relatResult);
                JasperViewer jv = new JasperViewer(print, false); //Cria instancia para impressão
                jv.setVisible(true); //chama o relatório para visualização\\ C:/Cantina_Postgres/lib/Report/MyReports/Perto.jasper
                jv.toFront(); // set o formuloari a frente da aplicação// src/Cantina1.jasper
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não há conteúdo a ser exibido!!!");
            }

        }
    }//GEN-LAST:event_BtnRelCantinaActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        pesquisaV();
    }//GEN-LAST:event_btnExportActionPerformed

    private void BtnPgntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPgntActionPerformed
        Tentativa_A("select sum(qtdp * valor_item) as Dinheiro from venda where forma_pg = 'Dinheiro' union\n" +
                    "select sum(qtdp * valor_item) as Débito from venda where forma_pg = 'Débito' union\n" +
                    "select sum(qtdp * valor_item) as Crédito from venda where forma_pg = 'Crédito' union\n" +
                    "select  sum(qtdp * valor_item) as Fiado from venda where forma_pg = 'Fiado';");
    }//GEN-LAST:event_BtnPgntActionPerformed

    private void BtnLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLBActionPerformed
        excluirVenda();
    }//GEN-LAST:event_BtnLBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaClientes tc = new TelaClientes();
        tc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Abast;
    private javax.swing.JButton BtnAdic;
    public static javax.swing.JButton BtnApagaP;
    private javax.swing.JButton BtnCalc01;
    private javax.swing.JButton BtnEstorno;
    private javax.swing.JButton BtnLB;
    private javax.swing.JButton BtnPgnt;
    public static javax.swing.JButton BtnProdAlterar;
    private javax.swing.JButton BtnRelCantina;
    private javax.swing.JButton BtnVendido;
    private javax.swing.JTextField CodP;
    private javax.swing.JTextField CodP2;
    private javax.swing.JTextField CodPrduto;
    private javax.swing.JTextField IdV;
    public javax.swing.JTable LastTable;
    public static javax.swing.JLabel LblBemVindo;
    private javax.swing.JTextField ProdDesc;
    private javax.swing.JTextField ProdPag;
    private javax.swing.JTextField ProdPreco;
    private javax.swing.JTextField ProdQtd;
    private javax.swing.JButton ResultEstoque;
    private javax.swing.JTextField ResultId;
    private javax.swing.JButton ResultNovo;
    private javax.swing.JTextField ResultPesq;
    public javax.swing.JTable ResultTable;
    public static javax.swing.JTextField ValorFinal;
    public static javax.swing.JButton VendAdd;
    private javax.swing.JTextField VendData;
    public static javax.swing.JTextField VendNome;
    public static javax.swing.JTextField VendProduto;
    public static javax.swing.JTextField VendQtd;
    private javax.swing.JTable VendTable;
    private javax.swing.JTable VendTable2;
    public static javax.swing.JTable VendTable3;
    private javax.swing.JTextField VendValor;
    public static javax.swing.JTextField VendValorItem;
    private javax.swing.JTextField VendValorT;
    private javax.swing.JButton btnDel;
    public javax.swing.JButton btnExport;
    private javax.swing.JButton btnFinal;
    public javax.swing.JButton btnImportar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblFechamento;
    private javax.swing.JTextField txtRep;
    // End of variables declaration//GEN-END:variables
}
