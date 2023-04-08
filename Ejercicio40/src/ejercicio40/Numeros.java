/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio40;

public class Numeros {
    public static double[][] calcularNumeros(double[] numeros){
        double[][] info = new double [numeros.length][3];
        int i;
        for(i=0;i<numeros.length;i++){
            info[i][0] = Math.round(Math.sqrt(numeros[i])*100.0)/100.0;
            info[i][1] = Math.round(Math.pow(numeros[i],2)*100.0)/100.0;
            info[i][2] = Math.round(Math.pow(numeros[i],3)*100.0)/100.0;
        }
        return info;
    }
}
