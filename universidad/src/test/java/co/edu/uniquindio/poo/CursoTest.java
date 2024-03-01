package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CursoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
     /**
     * Prueba para verificar que los datos de un curso estén completos
     */
    @Test
    public void datosCompletos() {
        LOG.info ("Inicio de test datosCompletos");

        Curso curso = new Curso ("Programación I");

        assertEquals("Programación I", curso.getNombre());

        LOG.info ("Inicio de test datosCompletos");
    }
     /**
     * Prueba para agregar un estudiante al curso
     */
    @Test
    public void agregarEstudiante() {
        LOG.info ("Inicio de test agregarEstudiante");

        Curso curso = new Curso ("Programación I");
        Estudiante estudiante = new Estudiante ("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co",
        "315635674", 18);

        curso.agregarEstudiante(estudiante);

        assertTrue(curso.getEstudiantes().contains(estudiante));
        assertEquals(1, curso.getEstudiantes().size());

        LOG.info ("Inicio de test agregarEstudiante");
    }
     /**
     * Prueba para verificar que los datos del curso no sean nulos
     */
    @Test
    public void datosNulos() {
        LOG.info ("Inicio de test datosNulos");

        assertThrows(Throwable.class, ()-> new Curso(null));


        LOG.info ("Inicio de test datosNulos");
    }
     /**
     * Prueba para agregar un estudiante repetido
     */
    @Test
    public void agregarEstudianteRepetido() {
        LOG.info ("Inicio de test agregarEstudianteRepetido");

        Curso curso = new Curso ("Programación I");
        Estudiante estudiante1 = new Estudiante ("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co",
        "315635674", 18);
        Estudiante estudiante2 = new Estudiante ("luis", "Londoño", "109453264", "luis@uniquindio.edu.co",
        "315635674", 40);
        
        curso.agregarEstudiante(estudiante1);

        assertThrows(Throwable.class, ()-> curso.agregarEstudiante(estudiante2));


        LOG.info ("Inicio de test agregarEstudianteRepetido");
    }
    
    
      
}
