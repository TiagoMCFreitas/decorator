/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.decorator.model;

/**
 *
 * @author tiago
 */
public class Farofa extends Condimento{
    private Janta jantinha;
    public Farofa(Janta janta){
        this.jantinha = janta;
    }
    public String getDescricao(){
        return jantinha.getDescricao() + ", Adicional Farofa";
    }
    public double preco(){
        return 7 + jantinha.preco();
    }
}
