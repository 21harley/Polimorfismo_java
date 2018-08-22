/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unet;
import java.io.*;
import unet.Persona;
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
      Persona []lis=new Persona[2];
      
      lis[0]=new Persona();
      lis[0].cargar_Dato_Scanener();
      
      lis[1]=new Persona();
      lis[1].mostrar_Dato_DataInputStream();
      
      lis[0].mostrar_Datos();
      lis[1].mostrar_Datos();
        
    }
    
}
