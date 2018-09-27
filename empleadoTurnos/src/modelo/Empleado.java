/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Nelson
 */
class Empleado {
    private String nombre;
    private String cuil;
    private double sueldo;
    static double costoHoras=200; 
    private Turno [] turnos; //= //new Turno[10];
    //private Vector <Turno> turnos; 
    DateTimeFormatter miFormatFecha = DateTimeFormatter.ofPattern("d/MM/yyyy H:mm:ss");
    public String getNombre() {
        return nombre;
    }
    
    Empleado(){
     //this.turnos = new Vector();   
     this.turnos = new Turno[20];   
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //public void AgregarTurno(LocalDateTime fechaIngreso,LocalDateTime fechaSalida){
    public void agregarTurno(Turno t){
       // Turno t = new Turno();
       for (int i=0; i<turnos.length ; i++) {
           if (turnos[i] == null){
               turnos[i]= t;
               break;
           }
       }
           
//  turnos.add(t);
    }
   /* 
    public double calcularHonorarioEmpleado(){
        double horasTrabajadas =0;
        Iterator i = turnos.iterator();
        while(i.hasNext()){
            Turno turno = (Turno) i.next();
            horasTrabajadas= turno.calcularHorasTrabajadasTurno(turno.getFechaHoraEntrada(),turno.getFechaHoraSalida());
            sueldo = sueldo+(horasTrabajadas*costoHoras);
        }
        System.out.println("El sueldo del empleado es: "+sueldo);
        
        return sueldo; 
    }
    */
    
    public double calcularHonorarioEmpleado(){
        double horasTrabajadas =0;
        
        for (int i=0; i<turnos.length ; i++) {
            if (turnos[i]!= null) {
                horasTrabajadas= turnos[i].calcularHorasTrabajadasTurno(turnos[i].getFechaHoraEntrada(),turnos[i].getFechaHoraSalida());
                sueldo = sueldo+(horasTrabajadas*costoHoras);
            }
        }
        
    System.out.println("El sueldo del empleado es: "+sueldo);
        
        return sueldo; 
    }  
    
    public void imprimirTurnoEmpeado(){
        System.out.println("Empleado: "+ this.nombre+ "--"+this.cuil);
        System.out.println("Turnos del empleado ");
        System.out.println("Hora Entrada ------------ Hora Salida -------Diferencia Horas" );        
     
        for (Turno turno : turnos) {
            if (turno != null){         
            System.out.println(turno.getFechaHoraEntrada().format(miFormatFecha) +" ---- "+ turno.getFechaHoraSalida().format(miFormatFecha)+"--->"+turno.calcularHorasTrabajadasTurno(turno.getFechaHoraEntrada(),turno.getFechaHoraSalida()));
            }
        }
     /* 
        Iterator i = turnos.iterator();
        while(i.hasNext()){
            Turno turno = (Turno)i.next();
            System.out.println(turno.getFechaHoraEntrada().format(miFormatFecha) +" ---- "+ turno.getFechaHoraSalida().format(miFormatFecha)+"--->"+turno.calcularHorasTrabajadasTurno(turno.getFechaHoraEntrada(),turno.getFechaHoraSalida()));
        }
    */ 
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

  
}
