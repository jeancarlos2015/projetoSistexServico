/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.padroes;

import com.sistex.cdp.Funcionario;
import com.sistex.cgd.DaoFuncionario;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author jean
 */
public class FabricaFuncionario extends Fabrica{
    @Override
    public Funcionario criaFuncionario(){return new Funcionario();}
    
    @Override
    public DaoFuncionario criaDaoFuncionario(){return new DaoFuncionario();}
    
    
    
    
}
