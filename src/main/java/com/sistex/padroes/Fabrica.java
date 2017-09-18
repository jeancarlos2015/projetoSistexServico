/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.padroes;


import com.sistex.cdp.Cliente;
import com.sistex.cdp.Fornecedor;
import com.sistex.cdp.Funcionario;
import com.sistex.cdp.Pedido;
import com.sistex.cdp.Produto;
import com.sistex.cgd.DaoCliente;
import com.sistex.cgd.DaoFornecedor;
import com.sistex.cgd.DaoFuncionario;
import com.sistex.cgd.DaoPedido;
import com.sistex.cgd.DaoProduto;
import com.sistex.cgd.Persistencia;
import com.sistex.util.Clientes;
import com.sistex.util.Funcionarios;
import com.sistex.util.Pedidos;
import com.sistex.util.Produtos;



public class Fabrica {
    public static Fabrica make(Tipo tipo){
        switch(tipo){
            case cliente:
                return new FabricaCliente();
            case produto:
                return new FabricaProduto();
            case pedido:
                return new FabricaPedido();
            case funcionario:
                return new FabricaFuncionario();
            case fornecedor:
                return new FabricaFornecedor();
            default:
                return new Fabrica();
        }
    }
    public static Fabrica make(String tipo){
        switch(tipo){
            case "cliente":
                return new FabricaCliente();
            case "produto":
                return new FabricaProduto();
            case "pedido":
                return new FabricaPedido();
            case "funcionario":
                return new FabricaFuncionario();
            case "fornecedor":
                return new FabricaFornecedor();
            default:
                return new Fabrica();
        }
    }
    public Produto criaProduto(){return null;}
    public Cliente criaCliente(){return null;}
    public Pedido criaPedido(){return null;}
    public Funcionario criaFuncionario(){return null;}
    public Fornecedor criaFornecedor(){return null;}
    
    public DaoProduto criaDaoProduto(){return null;}
    public DaoCliente criaDaoCliente(){return null;}
    public DaoFornecedor criaDaoFornecedor(){return null;}
    public DaoPedido criaDaoPedido(){return null;}
    public DaoFuncionario criaDaoFuncionario(){return null;}
    
    public Persistencia criaPersistencia(){return new Persistencia();}
    
    public Clientes criaClientes(){return null;}
    public Funcionarios criaFuncionarios(){return null;}
    public Pedidos criaPedidos(){return null;}
    public Produtos criaProdutos(){return null;}
    
    
    
   
}
