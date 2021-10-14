/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.test;

import com.ceep.dominio.*;

/**
 *
 * @author Alumno mañana
 */
public class Test {
 
    
    public static void main(String[] args) {
        
       FiguraGeometrica Figura = new Rectangulo("rectangulo");
       Figura.dibujar();
      
       FiguraGeometrica Figura1 = new Circulo("Circulo");
       Figura1.dibujar();
    
    
    }
    
}
