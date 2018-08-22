/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unet;
import unet.Persona;
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
    public Alumno(String n,String c,String t,int e,int matricula,int creditos,String carrera){
        super(n,c,t,e);
        this.matricula=matricula;
        this.creditos=creditos;
        this.carrera=carrera;
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
