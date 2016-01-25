/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;
import model.Alumno;
import model.Numero;
import model.Valores;

/**
 *
 * @author alum.fial8
 */
public class Principal {
    static Alumno a1;
    static Numero n1;
    static Valores v;
    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        agregar();
//        nuevoN();
        obtenerDatos();
        
    }
    public static void agregar(){
        a1 = new Alumno("Reyes", "Maria", 17, "La Alameda");
        System.out.println("Datos de Alumno");
        System.out.println("________________");
        System.out.println(a1.getApellidos()+" "+a1.getNombres()+" "+a1.getEdad()+" "+a1.getDireccion());
    }
    public static void nuevoN(){
        n1 = new Numero(1);
      
        System.out.println(n1.getN());

    }
    public static void obtenerDatos(){
        int x; int a[]; 
        System.out.println("Numero de Elementos: ");
        x = scanner.nextInt();
        a = new int[x];
        System.out.println("Ingresar "+ x +" números:");
        System.out.println("--------------------------");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }    
        v = new Valores(a);
        System.out.println("La suma es: "+v.sumaValores());
        System.out.println("El mayor es: "+v.mayorN());
    
    }
}
