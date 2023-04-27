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
public class Fahrenheit {

    public double celsius(double fahrenheit) {
        double resultado = (fahrenheit - 32) / 1.8;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(resultado));
    }

    public double kelvin(double fahrenheit) {
        double res = (fahrenheit + 459.67) / 1.8;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(res));
    }
}
