/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.padroes;

import com.sistex.cdp.Produto;
import com.sistex.cgd.DaoProduto;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author jean
 */
public class FabricaProduto extends Fabrica{
    @Override
    public Produto criaProduto(){return new Produto();}
    
    @Override
    public DaoProduto criaDaoProduto(){return new DaoProduto();}
    
}
