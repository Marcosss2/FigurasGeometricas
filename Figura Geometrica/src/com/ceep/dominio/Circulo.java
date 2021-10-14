/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno mañana
 */
public class Circulo extends FiguraGeometrica {

   public Circulo(String TipoFigura){
        super(TipoFigura);
   
    }
   public void dibujar(){
        System.out.println("de imprime un" + this.getClass().getSimpleName());
  }  
       
       
   } 
    
    

