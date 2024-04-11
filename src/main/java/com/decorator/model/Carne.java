/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.decorator.model;

/**
 *
 * @author tiago
 */
public class Carne extends Condimento{
    private Janta jantinha;
    public Carne(Janta janta){
        this.jantinha = janta;
    }
    public String getDescricao(){
        return jantinha.getDescricao() + ", Adicional Carne";
    }
    public double preco(){
        return 10 + jantinha.preco();
    }
}
