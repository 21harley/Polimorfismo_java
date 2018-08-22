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
       Alumno pedro=new Alumno();
       Profesor mario=new Profesor();
       
       pedro.cargar_datos();
       mario.cargar_Datos();
       
       pedro.mostar_Datos();
       mario.mostar_Datos();

        
    }
    
}
