package com.decorator.view;

import com.decorator.model.Arroz;
import com.decorator.model.Carne;
import com.decorator.model.Completa;
import com.decorator.model.Janta;
import com.decorator.model.Mandioca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tiago
 */
public class Main {
    public static void main(String[] args) {
        
        Janta janta1 = new Completa();
        System.out.println("-------------------------------------------------");
        System.out.println("Carro:   "+ janta1.getDescricao());
        System.out.println("Preco:  " + janta1.preco());
        System.out.println("-------------------------------------------------");
        janta1 = new Carne(janta1);
        System.out.println("Carro:   "+ janta1.getDescricao());
        System.out.println("Preco:  " + janta1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        janta1 = new Mandioca(janta1);
        System.out.println("Carro:   "+ janta1.getDescricao());
        System.out.println("Preco:  " + janta1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println();
       
}
}