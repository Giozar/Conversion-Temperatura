/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.practica.operaciones;

import java.text.DecimalFormat;

/**
 *
 * @author giova
 */
public class Celsius {
    public  double fahrenheit(double celsius) {
        double res =  (celsius * 1.8) + 32;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(res));
    }
    
    public  double kelvin(double celsius) {
        double res = celsius + 273.15;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(res));
    }
}
