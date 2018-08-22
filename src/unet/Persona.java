/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unet;
import java.util.*;
import java.io.*;
/**
 *
 * @author CASA
 */
public class Persona {
    String nombre;
    String cedula;
    String telefono;
    int edad;
    public Persona(){
        this.nombre=" ";this.cedula=" ";this.telefono=" ";this.edad=0;
    }
    public Persona(String nombre,String cedula,String telefono,int edad){
        this.nombre=nombre;
        this.cedula=cedula;
        this.edad=edad;
        this.telefono=telefono;
    }
    void cargar_Dato_Scanener(){
        Scanner lec=new Scanner(System.in);
        System.out.println("Ingrese los proximos datos");
        System.out.println("Nombre");
        this.nombre=lec.nextLine();
        System.out.println("Cedula");
        this.cedula=lec.nextLine();
        System.out.println("Edad");
        this.edad=Integer.parseInt(lec.nextLine());
        System.out.println("Telefono");
        this.telefono=lec.nextLine();
    }
    void mostrar_Dato_DataInputStream()throws IOException {
        DataInputStream lector=new DataInputStream(System.in);
        System.out.println("Ingrese los proximos datos");
        System.out.println("Nombre");
        this.nombre=lector.readLine();
        System.out.println("Cedula");
        this.cedula=lector.readLine();
        System.out.println("Edad");
        this.edad=Integer.parseInt(lector.readLine());
        System.out.println("Telefono");
        this.telefono=lector.readLine();
    }
    void mostrar_Datos(){
        System.out.println("Datos");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Cedula: "+this.cedula);
        System.out.println("Edad: "+this.edad);
        System.out.println("Telefono:"+this.telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

 
}
