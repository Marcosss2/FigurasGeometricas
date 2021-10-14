/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;


public class Rectangulo  extends FiguraGeometrica{
 
    public Rectangulo(String TipoFigura){
        super(TipoFigura);
   
    }
  public void dibujar(){
      System.out.println("de imprime un" + this.getClass().getSimpleName());
  }  
    
}
