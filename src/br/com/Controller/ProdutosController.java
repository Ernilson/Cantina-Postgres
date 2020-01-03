/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controller;

import br.com.Model.Produtos;
import br.com.Services.ServiceProdutos;
import java.util.List;

/**
 *
 * @author s60254831168
 */
public class ProdutosController {
    
    private ServiceProdutos sp;

     public ProdutosController() {
       this.sp = new ServiceProdutos();
    }
    
    public void salvaProdutos(Produtos p){
      sp.save(p);
    }
    
    public void alterar(Produtos p){
        sp.alterar(p);
    }
    
    public List<Produtos> listarTodosProdutos(){
        return this.sp.findALL();
    }
    
    public List<Produtos> listaProdutosPorId(int id){
        return this.sp.findById(id);
    }
    
    public void removerProdutos(Produtos p){
        this.sp.delete(p);
    }    
   
    public void EstornoVendas(Produtos p){
        this.sp.logvenda(p);
        this.sp.EstornoVenda(p);
        this.sp.EstornoComplemento(p);
        this.sp.ExcluirVenda(p);
    }
}
