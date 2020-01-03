/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controller;

import br.com.Model.Venda;
import br.com.Services.ServiceVenda;
import java.util.List;

/**
 *
 * @author S60254831168
 */
public class VendaController {
    
     private ServiceVenda sv;

     public VendaController() {
       this.sv = new ServiceVenda();
    }
    
    public void salvaVenda(Venda v){
      sv.save(v);
    }
    
    public void alterar(Venda v){
          sv.alterar(v);
    }
    
    public List<Venda> listarTodosVenda(){
        return this.sv.findALL();
    }
    
    public List<Venda> listaVendaPorId(int id){
        return this.sv.findById(id);
    }
    
    public void removerVenda(Venda v){
        this.sv.delete(v);
    }    
   
    

        
}
