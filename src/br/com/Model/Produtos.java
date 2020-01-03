/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Model;

import java.math.BigDecimal;
/**
 *
 * @author ctrlaudos
 */

public class Produtos {
       
    private int id_pro;
    private int codigo;
    private String descricao;
    private int Estoque;
    private int repositor;
    private BigDecimal preco;

    public Produtos() {
    }

    public Produtos(int id_pro, int codigo, String descricao, int Estoque, int repositor, BigDecimal preco) {
        this.id_pro = id_pro;
        this.codigo = codigo;
        this.descricao = descricao;
        this.Estoque = Estoque;
        this.repositor = repositor;
        this.preco = preco;
    }

    
    /**
     * @return the id_pro
     */
    public int getId_pro() {
        return id_pro;
    }

    /**
     * @param id_pro the id_pro to set
     */
    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
     * @return the Estoque
     */
    public int getEstoque() {
        return Estoque;
    }

    /**
     * @param Estoque the Estoque to set
     */
    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }

    /**
     * @return the repositor
     */
    public int getRepositor() {
        return repositor;
    }

    /**
     * @param repositor the repositor to set
     */
    public void setRepositor(int repositor) {
        this.repositor = repositor;
    }

    /**
     * @return the preco
     */
    public BigDecimal getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id_pro;
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
        final Produtos other = (Produtos) obj;
        if (this.id_pro != other.id_pro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "id_pro=" + id_pro + ", codigo=" + codigo + ", descricao=" + descricao + ", Estoque=" + Estoque + ", repositor=" + repositor + ", preco=" + preco + '}';
    }    
   
}
