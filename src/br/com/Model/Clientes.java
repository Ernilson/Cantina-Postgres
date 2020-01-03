/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Model;

//import br.com.Entidades.*;

/**
 *
 * @author S60254831168
 */

public class Clientes{
     
    private int id_c;
    private String nome;
    private String ender;
    private String fone;
    private String email;

    public Clientes() {
    }

    public Clientes(int id_c, String nome, String ender, String fone, String email) {
        this.id_c = id_c;
        this.nome = nome;
        this.ender = ender;
        this.fone = fone;
        this.email = email;
    }

    public int getId_c() {
        return id_c;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}