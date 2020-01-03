/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author ctrlaudos
 */

public class Carrinho implements Serializable {
    
    private int id_c;
    private int codvenda;
    private String nome;
    private String descricao;
    private int qtdp;
    private BigDecimal valorItem;
    private BigDecimal valorSubTotal;
    private BigDecimal valorTotal;
    private String formaPg;
    private String cop;
    private int cop2;
    private String cboCont;
    private int codproduto;
    
    
    public Carrinho() {
    }

    public Carrinho(int id_c, int codvenda, String nome, String descricao, int qtdp, BigDecimal valorItem, BigDecimal valorSubTotal, BigDecimal valorTotal, String formaPg, String cop, int cop2, String cboCont, int codproduto) {
        this.id_c = id_c;
        this.codvenda = codvenda;
        this.nome = nome;
        this.descricao = descricao;
        this.qtdp = qtdp;
        this.valorItem = valorItem;
        this.valorSubTotal = valorSubTotal;
        this.valorTotal = valorTotal;
        this.formaPg = formaPg;
        this.cop = cop;
        this.cop2 = cop2;
        this.cboCont = cboCont;
        this.codproduto = codproduto;
    }

    public int getId_c() {
        return id_c;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }

    public int getCodvenda() {
        return codvenda;
    }

    public void setCodvenda(int codvenda) {
        this.codvenda = codvenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdp() {
        return qtdp;
    }

    public void setQtdp(int qtdp) {
        this.qtdp = qtdp;
    }

    public BigDecimal getValorItem() {
        return valorItem;
    }

    public void setValorItem(BigDecimal valorItem) {
        this.valorItem = valorItem;
    }

    public BigDecimal getValorSubTotal() {
        return valorSubTotal;
    }

    public void setValorSubTotal(BigDecimal valorSubTotal) {
        this.valorSubTotal = valorSubTotal;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPg() {
        return formaPg;
    }

    public void setFormaPg(String formaPg) {
        this.formaPg = formaPg;
    }

    public String getCop() {
        return cop;
    }

    public void setCop(String cop) {
        this.cop = cop;
    }

    public int getCop2() {
        return cop2;
    }

    public void setCop2(int cop2) {
        this.cop2 = cop2;
    }

    public String getCboCont() {
        return cboCont;
    }

    public void setCboCont(String cboCont) {
        this.cboCont = cboCont;
    }

    public int getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(int codproduto) {
        this.codproduto = codproduto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id_c;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrinho other = (Carrinho) obj;
        if (this.id_c != other.id_c) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carrinho{" + "id_c=" + id_c + ", codvenda=" + codvenda + ", nome=" + nome + ", descricao=" + descricao + ", qtdp=" + qtdp + ", valorItem=" + valorItem + ", valorSubTotal=" + valorSubTotal + ", valorTotal=" + valorTotal + ", formaPg=" + formaPg + ", cop=" + cop + ", cop2=" + cop2 + ", cboCont=" + cboCont + ", codproduto=" + codproduto + '}';
    }    
   
}