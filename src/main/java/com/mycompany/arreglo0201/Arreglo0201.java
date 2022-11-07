/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arreglo0201;

/**
 *
 * @author LAB-2
 */
public class Arreglo0201 {

    public static void main(String[] args) {
        var paul = new Dueño("0106904832","Paul Pauta",2);
        paul.nuevoTelefono("0984357604", 0, "Móvil", "tuenti",0);
        paul.nuevoTelefono("074078385",2,"Casa","Etapa",1);
        paul.nuevoTelefono("074135250",1287,"Fijo IP","Etapa",2);
        
        System.out.println(paul.toString());
    }
}
