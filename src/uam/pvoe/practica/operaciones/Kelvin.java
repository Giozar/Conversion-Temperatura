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
public class Kelvin {
    public double  celsius(double kelvin) {
        double res =  kelvin - 273.15;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(res));
    }
    
    public  double fahrenheit(double kelvin) {
        double res =  (kelvin * 1.8) - 459.67;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(res));
    }
    
}
