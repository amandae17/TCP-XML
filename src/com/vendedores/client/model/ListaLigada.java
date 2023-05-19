/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vendedores.client.model;

/**
 *
 * @author Icaro
 */
public class ListaLigada {

    private Celula primeira;
    private Celula ultima;
    private int total = 0;

    public void adiciona(Object elemento) {
        if (this.total == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            total += 1;
        }
    }

    public int tamanho() {
        return this.total;
    }

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(this.primeira, elemento);
        this.primeira = nova;
        if (this.total == 0) {
            this.ultima = this.primeira;
        }
        this.total++;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.total;
    }

    public Object pega(int posicao) {
        return pegaCelula(posicao).getElemento();
    }

    private Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        Celula atual = this.primeira;
        for (int i = 0; i <= posicao - 1;i++) {
            atual = atual.getProxima();
        }
        return atual;
    }

    public void removeDoComeco() {
        if (!posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        this.primeira = primeira.getProxima();
        this.total--;
        if (total == 0) {
            this.ultima = null;
        }
    }

    @Override
    public String toString() {
        if (total == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        for (int i = 0; i < total - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(",");
            atual = atual.getProxima();
        }
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
    
}
