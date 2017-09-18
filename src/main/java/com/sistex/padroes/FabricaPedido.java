/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.padroes;

import com.sistex.cdp.Pedido;
import com.sistex.cgd.DaoPedido;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author jean
 */
public class FabricaPedido extends Fabrica{
    @Override
    public Pedido criaPedido(){return new Pedido();}
    
    @Override
    public DaoPedido criaDaoPedido(){return new DaoPedido();}
    
    
   
    
    
}
