/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.decorator.model;

/**
 *
 * @author tiago
 */
public abstract class Janta {
    String descricao = "Jantinha";

	public String getDescricao() {
		return descricao;
	}
        
	public abstract double preco();
}
