/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.servico;

import com.google.gson.Gson;
import com.sistex.cgd.Dao;
import com.sistex.padroes.Fabrica;
import com.sistex.util.Clientes;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author joao
 */
@WebService(serviceName = "servicoClientes")
public class servicoClientes {
    private Fabrica fabrica;
    private Dao dao;
   
    @WebMethod(operationName = "getClientes")
    public String getClientes() {
        Gson g = new Gson();
        fabrica = Fabrica.make("cliente");
        dao = fabrica.criaDaoCliente();
        Clientes clientes = fabrica.criaClientes();
        clientes.setClientes(dao.listarClientes());
        return g.toJson(clientes);
    }
}
