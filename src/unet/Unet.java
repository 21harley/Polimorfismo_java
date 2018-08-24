/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unet;
import java.io.*;
import unet.*;
/**
 *
 * @author John.llanes
 */
public class Unet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
       Persona []lista=new Persona[3];
     
       lista[0]=new Alumno();
       lista[1]=new Profesor();
       lista[2]=new Alumno();
       
       lista[0].cargar_Datos();
       lista[1].cargar_Datos();
       lista[2].cargar_Datos();
       
        System.out.println("Lista de Alumnos");
       
       for(int i=0;i<lista.length;i++){
           if(lista[i] instanceof Alumno){
             lista[i].mostrar_datos2();
           }
       }
       
       
    }
    
}
