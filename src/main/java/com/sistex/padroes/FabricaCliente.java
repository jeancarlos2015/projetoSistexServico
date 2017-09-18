/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.padroes;


import com.sistex.cdp.Cliente;
import com.sistex.cgd.DaoCliente;
import com.sistex.util.Clientes;

/**
 *
 * @author jean
 */
public class FabricaCliente extends Fabrica{
    @Override
    public Cliente criaCliente(){return new Cliente();}
    
    @Override
    public DaoCliente criaDaoCliente(){return new DaoCliente();}
    
    @Override
    public Clientes criaClientes(){
        return new Clientes();
    }
    
    
    
}
