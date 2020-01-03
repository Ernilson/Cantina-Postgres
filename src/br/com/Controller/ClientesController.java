/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controller;

import br.com.Model.Clientes;
import br.com.Services.ServiceCliente;
import java.util.List;

/**
 *
 * @author s60254831168
 */
public class ClientesController {

   private ServiceCliente sc;

     public ClientesController() {
       this.sc = new ServiceCliente();
    }
    
    public void salvaClientes(Clientes c){
      sc.save(c);
    }
    
    public void alterar(Clientes c){
        sc.alterar(c);
    }
    
    public List<Clientes> listarTodosClientes(){
        return this.sc.findALL();
    }
    
    public List<Clientes> listaClientesPorId(int id){
        return this.sc.findById(id);
    }
    
    public void removerClientes(Clientes c){
        this.sc.delete(c);
    }   
            
}
