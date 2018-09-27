/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class EmpleadoTest {
    Empleado empleado = new Empleado();
    Turno [] vecTurno = new Turno[30];
   // vectorTurno = [];   
    public EmpleadoTest() {
           empleado.setNombre("Contreras Nelson Ariel");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
   @Test
   public void obnerNombreEmpleado(){
       
       String resuEsperado = "Contreras Nelson Ariel";
    
       String resuObtenido =  empleado.getNombre();
       
       assertEquals(resuEsperado, resuObtenido);
   }
   
   @Test
   public void agregarTurnoEmpleado(){
       
       
   }
    
}
