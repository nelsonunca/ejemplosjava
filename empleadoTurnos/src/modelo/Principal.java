/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.util.Vector;

/**
 *
 * @author Nelson
 */
public class Principal {
 
    public static void main(String args[]){
   // Vector <Empleado> emple = new Vector();     
        
        //// Definiendo empleado y sus turnos. 
        Empleado empleado =  new Empleado();
        String nombre = "Carrizo Luis";
        String cuil= "1111111111";
        
        empleado.setCuil(cuil);//l=cuil;
        empleado.setNombre(nombre);
        
        DateTimeFormatter miFormatFecha = DateTimeFormatter.ofPattern("d/MM/yyyy H:mm:ss");
         
        Turno turno = new Turno(LocalDateTime.parse("14/08/2017 21:59:00",miFormatFecha),LocalDateTime.parse("15/08/2017 06:00:00",miFormatFecha));
    
        //turno. fechaHoraEntrada = LocalDateTime.parse("14/08/2017 21:59:00", miFormatFecha) ; cuando no es privado lo puedo acceder
      ///  turno.setFechaHoraEntrada(LocalDateTime.parse("14/08/2017 21:59:00", miFormatFecha));
        //turno.fechaHoraSalida =  LocalDateTime.parse("15/08/2017 06:00:00", miFormatFecha);// cuando no es privado lo puedo acceder
     ///   turno.setFechaHoraSalida(LocalDateTime.parse("15/08/2017 06:00:00", miFormatFecha));
        
        Turno turno1 = new Turno();
   
        turno1.setFechaHoraEntrada(LocalDateTime.parse("15/08/2017 21:59:00", miFormatFecha));
        turno1.setFechaHoraSalida(LocalDateTime.parse("16/08/2017 06:00:00", miFormatFecha));
        
        
        ///// Definiendo Otro Empleado y sus turnos
        Empleado empleado1 =  new Empleado();
        String nombre1 = "Zarate Ernesto";
        String cuil1= "222222222";
        
        empleado1.setCuil(cuil1); 
        empleado1.setNombre(nombre1);// nombre=nombre1;
        
        Turno turno2 = new Turno();
                   
        turno2.setFechaHoraEntrada(LocalDateTime.parse("10/08/2017 21:59:00", miFormatFecha)) ;
        turno2.setFechaHoraSalida(LocalDateTime.parse("11/08/2017 06:00:00", miFormatFecha)) ; 
   ///     turno2.setTrabajador(empleado);
        Turno turno3 = new Turno();
        
   
       turno3.setFechaHoraEntrada(LocalDateTime.parse("11/08/2017 21:59:00", miFormatFecha)) ;
       turno3.setFechaHoraSalida(LocalDateTime.parse("12/08/2017 06:00:00", miFormatFecha)) ;
       turno3.setTrabajador(empleado1);
       
       
       empleado1.agregarTurno(turno2);
       empleado.agregarTurno(turno1);
       empleado.agregarTurno(turno2);
       empleado.agregarTurno(turno3);
        
       empleado.imprimirTurnoEmpeado();
       empleado.calcularHonorarioEmpleado();
       empleado1.imprimirTurnoEmpeado();
       empleado1.calcularHonorarioEmpleado();        
    }
}
