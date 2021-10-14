/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ceep.dominio;


public abstract class FiguraGeometrica {

 
 private String tipoFigura;
 
 protected FiguraGeometrica(String tipoFigura){
     this.tipoFigura = tipoFigura;
     
     
 }
 public abstract void dibujar();

 
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
     
    
  
 
}
