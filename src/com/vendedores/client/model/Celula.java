/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vendedores.client.model;

/**
 *
 * @author Icaro
 */
public class Celula {
    private Celula proxima;
    private Object elemento;
    
    Celula(Celula proxima, Object elemento){
        this.proxima = proxima;
        this.elemento = elemento;        
    }
    Celula(Object elemento) {
        this.elemento = elemento;
    }
    
    public void setProxima(Celula proxima) {
        this.proxima = proxima;        
    }
    
    public Celula getProxima() {
        return this.proxima;
    }
    
    public Object getElemento(){
        return this.elemento;
    }      
}
