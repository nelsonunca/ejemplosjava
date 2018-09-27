/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Nelson
 */
class Turno {
    private LocalDateTime fechaHoraSalida;
    private LocalDateTime fechaHoraEntrada;
    private Empleado trabajador;
    
    Turno(LocalDateTime fechaHoraEntrada, LocalDateTime fechaHoraSalida){
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.fechaHoraSalida = fechaHoraSalida;
    }
    Turno(){
        this.fechaHoraEntrada = null;
        this.fechaHoraSalida = null;
    };
    
  public long calcularHorasTrabajadasTurno(LocalDateTime fechaHoraEntrada, LocalDateTime fechaHoraSalida) {
        
        long resultado = Duration.between( fechaHoraEntrada,fechaHoraSalida).toHours();
     //   System.out.println("duration en horas: "+ resultado);
     //   System.out.println("duration en minutos: "+ Duration.between(fechaHoraEntrada, fechaHoraSalida).toMinutes());
  //      long difer = Duration.between(fechaHoraEntrada, fechaHoraSalida).toMinutes()-(resultado*60);;
     //   System.out.println("diferencia de horas y minutos : "+ difer);
        return resultado;
    }

    public Empleado getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Empleado trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public LocalDateTime getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

   void setFechaHoraEntrada(LocalDateTime fechaHoraEntrada) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }
    
    public void imprimirTurno(LocalDateTime FechaHoraInicio){
        System.out.println("Turno:"+ FechaHoraInicio);
        
        System.out.println("Empleado:" + this.trabajador.getNombre()+"--"+ "Cuil "+this.trabajador.getCuil());
           
    }
    
}
