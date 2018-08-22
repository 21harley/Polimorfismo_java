/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unet;
import unet.Persona;
import java.io.*;
/**
 *
 * @author CASA
 */
public class Alumno extends Persona {
    int matricula;
    int creditos;
    String carrera;
    public Alumno(){
        super();
        this.matricula=0;this.creditos=0;this.carrera=" ";
    }
    public Alumno(String n,String c,String t,int e,int matricula,int creditos,
            String carrera){
        super(n,c,t,e);
        this.matricula=matricula;
        this.creditos=creditos;
        this.carrera=carrera;
    }
    public void cargar_datos() throws IOException {
        DataInputStream lector=new DataInputStream(System.in);
        System.out.println("Registro de Alumndo");
        super.cargar_Dato_DataInputStream();
        System.out.println("Numero de la matricula del alumno");
        this.matricula=Integer.parseInt(lector.readLine());
        System.out.println("Carrera");
        this.carrera=lector.readLine();
        System.out.println("Creditos");
        this.creditos=Integer.parseInt(lector.readLine());
    }
    public void mostar_Datos(){
        System.out.println("Datos de Alumno:");
        super.mostrar_Datos();
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Carrera: "+this.carrera);
        System.out.println("Creditos: "+this.creditos);
    }

    public int getMatricula() {
        return matricula;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
