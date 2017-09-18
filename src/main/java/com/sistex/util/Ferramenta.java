/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jean
 */
public class Ferramenta {
    private final Random aleatorio;

    public Ferramenta() {
        aleatorio = new Random();
    }
    public String getcpf(){
        String cpf ="";
        for(int num=0;num<11;num++){
            cpf+=aleatorio.nextInt(9);
        }
        return cpf;
    }
    
    private String[] getNomes(){
        String vetor[]={"Rafael Delano","Pedro Albuquerque","Jose Oliveira",
        "Amanda Oliguedes", "Santiago De La", "Thiago De Sam","Joana Sanatos"};
        return vetor;
    }
    
    
    
    public String getNome(){
        String[] nomes = getNomes();
        int index=aleatorio.nextInt(nomes.length-1);
        return nomes[index];
    }
    public int getIdade(){
        return aleatorio.nextInt(80);
    }
    
    
    public static void fechaSessao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            if (request.getParameter("operacao").equals("fechasessao")) {
                HttpSession session = request.getSession();
                session.setAttribute("usuario", null);
                response.sendRedirect("acesso.jsp");
            }
    }
    
    public static String getDate(){
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(data);
    }
    
}
