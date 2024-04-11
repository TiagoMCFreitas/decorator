/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.decorator.model;

/**
 *
 * @author tiago
 */
public class Tropeiro extends Condimento{
    private Janta jantinha;
    public Tropeiro(Janta janta){
        this.jantinha = janta;
    }
    public String getDescricao(){
        return jantinha.getDescricao() + ", Adicional Tropeiro";
    }
    public double preco(){
        return 5 + jantinha.preco();
    }
}
