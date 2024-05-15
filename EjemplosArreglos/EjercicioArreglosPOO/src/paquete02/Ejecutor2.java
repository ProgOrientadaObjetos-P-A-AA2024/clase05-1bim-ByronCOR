/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;
import paquete01.LibretaCalificacion;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // listado de variables para ingreso de datos por teclado
        
        double[] notas ={10,9,8,10};
        String nombreEstudiante = "René Elizalde";
        
       
        // con el ingreso del nombre del estudiante y el ingreso del conjunto
        // de calificaciones; se procede a crear el objeto de tipo
        // LibretaCalificacion
        LibretaCalificacion libreta = new LibretaCalificacion(nombreEstudiante,
                notas);
        // Se llama a los métodos que realizan el calculo del
        // promedio y promedio cualitativo
        libreta.establecerPromedio();
        /* libreta.establecerPromedio(); si dejas comentada se va a presentar 
        el valor de de fabrica que es 0.00 ya que es de tipoo double 
        porque nunca se llamo al metodo promedio por lo que aum,e ese valor*/
        libreta.establecerPromedioCualitativo();
        /* libreta.establecerPromedioCualitativo(); si dejas comentada se 
        va a presentar el valor de de fabrica que es null ya que es de tipo 
        String porque nunca se llamo al metodo por lo que asume ese valor*/
        System.out.printf("\n%s\n", libreta);
    }
}
