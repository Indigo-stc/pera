/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evau2_zuin;

/**
 *
 * @author andres
 */
public class Secretaria {
    
    private String cedula, mombre;
    private int facturas;

    public Secretaria(String cedula, String mombre, int facturas) {
        this.cedula = cedula;
        this.mombre = mombre;
        this.facturas = facturas;
    }

    public Secretaria() {
        
    }
    

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setMombre(String mombre) {
        this.mombre = mombre;
    }

    public void setFacturas(int facturas) {
        this.facturas = facturas;
    }

    
    public String getCedula() {
        return cedula;
    }

    public String getMombre() {
        return mombre;
    }

    public int getFacturas() {
        return facturas;
    }
    
    
    public int salary(int facturas) {
        
        int sueldo = 0;
        
        if (facturas  > 0 && facturas < 500) {
            return sueldo = 300;
        } else if (facturas  >= 500 && facturas < 1000) {
            return sueldo = 600;
        } else if (facturas  >= 100) {
            return sueldo = 900;
        } else {
            return sueldo;
        }
       
    }
}
