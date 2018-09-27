/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Nelson
 */
public class TurnotTest {
    Turno turno;
    LocalDateTime fechaHoraEntrada;
    LocalDateTime fechaHoraSalida  ;
    public TurnotTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
   
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        turno = new Turno();
        String fechaHoraIngreso="14/08/2017 21:59:00";
        String fechaHoraEgreso="15/08/2017 06:09:00";
        
        DateTimeFormatter miFormatFecha = DateTimeFormatter.ofPattern("d/MM/yyyy H:mm:ss");

        fechaHoraEntrada = LocalDateTime.parse(fechaHoraIngreso, miFormatFecha);//LocalDateTime.now();
        System.out.println("Fecha de Entrada "+miFormatFecha.format(fechaHoraEntrada));        
        
        fechaHoraSalida  = LocalDateTime.parse(fechaHoraEgreso,miFormatFecha);//LocalDateTime.now();
         System.out.println("Fecha de Salida "+miFormatFecha.format(fechaHoraSalida));
         
      }
    
    
    @After
    public void tearDown() {
        turno = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void diferenciaHoraTest(){
       long resultado=0;
       long resuEsperado=8;
       
       resultado = turno.calcularHorasTrabajadasTurno(fechaHoraEntrada,fechaHoraSalida);
       assertEquals("resultado diferencia Hora", resuEsperado,resultado);
            
    }
      
}
