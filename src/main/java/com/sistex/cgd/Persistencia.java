/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jean
 */
public class Persistencia {

    private final String url = "jdbc:postgresql://localhost:5432/bancoSistex";

    private final String usuario = "postgres";
    private final String senha = "ifes";
    private Connection con;
    private Statement stm;
    private final String driver = "org.postgresql.Driver";
    private ResultSet rs;

    public boolean executar(String comando) {
        try {

            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, senha);
            stm = con.createStatement();
            stm.executeUpdate(comando);
            con.close();
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            return false;
        }
    }

    public String select(String comando, String colunas) {
        try {
            Class.forName(driver);
            String comando1 = comando.toLowerCase();
            con = DriverManager.getConnection(url, usuario, senha);
            stm = con.createStatement();
            rs = stm.executeQuery(comando1);
            String[] colunas_str = colunas.split(",");
            String result = "";
            int index;
            while (rs.next()) {
                for (index = 0; index < colunas_str.length - 1; index++) {
                    result += rs.getString(colunas_str[index].trim()) + ",";
                }
                result += rs.getString(colunas_str[index].trim()) + ";";
            }
            rs.close();
            stm.close();
            con.close();
            return result;
        } catch (ClassNotFoundException | SQLException ex) {
            return ex.getMessage();
        }
    }

}
