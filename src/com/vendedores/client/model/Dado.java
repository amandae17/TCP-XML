/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vendedores.client.model;



/**
 *
 * @author Icaro
 */
public class Dado {

    private String vendedor;
    private int idade;
    private double total;
    private String filial;
    private int ic;

    public Dado(String vendedor, int idade, double total, String filial, int ic) {
        this.vendedor = vendedor;
        this.idade = idade;
        this.total = total;
        this.filial = filial;
        this.ic = ic;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public int getIc() {
        return ic;
    }

    public void setIc(int ic) {
        this.ic = ic;
    }   

    @Override
    public String toString() {
        return "[" + vendedor + ", " + 
                idade + ", " +
                total + ", " +
                filial + ", " +
                ic + "]";
    }
    
    

}
