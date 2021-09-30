/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evau2_zuin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("\t Ingrese los datos de la agencia");
        
        System.out.print("\t Nombre de la agencia: ");
        String nombre =input.next();
        
        System.out.print("\t Direccion: ");
        String direccion = input.next();
        
        System.out.print("\t Telefono: ");
        String telefono = input.next();
        
        Agencia agency = new Agencia(nombre, direccion, telefono);
        
        
        input.nextLine(); //Clean buffer
        
        
        ArrayList <Secretaria> secretaries = new ArrayList<Secretaria>();
        
        System.out.println("\t Agregar datos de secretarias");
        
        System.out.print("\t ¿Desea agregar datos de una secretaria? (Y/N): ");
        String resp = input.nextLine();
        
        
        boolean perform = true;
        
        while (perform) {
            
            if (resp.equalsIgnoreCase("y")) {
                
                System.out.print("\t Cedula: ");
                String cedula = input.next();
                
                System.out.print("\t Nombre: ");
                String nom = input.next();
                
                System.out.print("\t Facturas: ");
                int facturas = input.nextInt();
                
                
                input.nextLine(); //Clean buffer
                
                
                Secretaria secretary = new Secretaria(cedula, nom, facturas);
                
                secretaries.add(secretary);
                
                System.out.print("\t ¿Desea agregar datos de una secretaria? (Y/N): ");
                resp = input.nextLine();
                
            } else {
                
                perform = false;
                System.out.println("\t has terminado de agregar secretarias");
                
            } 
            
        }
        
        
        System.out.printf("%n%10s %s %10s %s %10s %s%s%n%n",
                        "\t ******Agencia:", agency.getNombre(),
                        "\t Direccion:", agency.getDireccion(),
                        "\t Telefono:", agency.getTelefono(),
                        "******");
        
        System.out.println("\t **************Secretarias***************");
        System.out.println("\t Cedula \t Nombre \t Telefono \t Sueldo");
        
        for (int i = 0; i < secretaries.size(); i++) {
            
            //int sueldo = secretaries.get(i).getFacturas(;
            System.out.printf("%15s %15s %17s %16d%n",
                            secretaries.get(i).getCedula(),
                            secretaries.get(i).getMombre(),
                            secretaries.get(i).getFacturas(),
                            secretaries.get(i).salary(secretaries.get(i).getFacturas()));
        }
                
    } 
}
