package br.com.Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author sibre
 */

public class Venda implements Serializable {

    private static long serialVersionUID = 1L;
   
    private int id_v;
    private int codvenda;
    private String nome;
    private String descricao;
    private int qtdp;
    private BigDecimal valorItem;
    private BigDecimal SubTotal;
    private BigDecimal valorTotal;
    private String formaPg;
    private Clientes clientes;

    public Venda() {
    }

    public Venda(int id_v, int codvenda, String nome, String descricao, int qtdp, BigDecimal valorItem, BigDecimal SubTotal, BigDecimal valorTotal, String formaPg, Clientes clientes) {
        this.id_v = id_v;
        this.codvenda = codvenda;
        this.nome = nome;
        this.descricao = descricao;
        this.qtdp = qtdp;
        this.valorItem = valorItem;
        this.SubTotal = SubTotal;
        this.valorTotal = valorTotal;
        this.formaPg = formaPg;
        this.clientes = clientes;
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the id_v
     */
    public int getId_v() {
        return id_v;
    }

    /**
     * @param id_v the id_v to set
     */
    public void setId_v(int id_v) {
        this.id_v = id_v;
    }

    /**
     * @return the codvenda
     */
    public int getCodvenda() {
        return codvenda;
    }

    /**
     * @param codvenda the codvenda to set
     */
    public void setCodvenda(int codvenda) {
        this.codvenda = codvenda;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the qtdp
     */
    public int getQtdp() {
        return qtdp;
    }

    /**
     * @param qtdp the qtdp to set
     */
    public void setQtdp(int qtdp) {
        this.qtdp = qtdp;
    }

    /**
     * @return the valorItem
     */
    public BigDecimal getValorItem() {
        return valorItem;
    }

    /**
     * @param valorItem the valorItem to set
     */
    public void setValorItem(BigDecimal valorItem) {
        this.valorItem = valorItem;
    }

    /**
     * @return the SubTotal
     */
    public BigDecimal getSubTotal() {
        return SubTotal;
    }

    /**
     * @param SubTotal the SubTotal to set
     */
    public void setSubTotal(BigDecimal SubTotal) {
        this.SubTotal = SubTotal;
    }

    /**
     * @return the valorTotal
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the formaPg
     */
    public String getFormaPg() {
        return formaPg;
    }

    /**
     * @param formaPg the formaPg to set
     */
    public void setFormaPg(String formaPg) {
        this.formaPg = formaPg;
    }

    /**
     * @return the clientes
     */
    public Clientes getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

   
}
