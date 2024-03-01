package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Curso {
    private String nombre;
    private Collection<Estudiante>estudiantes;

    public Curso (String nombre){
        this.nombre = nombre;
        estudiantes = new LinkedList<>();
        assert nombre != null;
    }

    public void agregarEstudiante(Estudiante estudiante){
        assert validarNumeroIdenficacionExista (estudiante.numeroIdentificacion())==false;
        estudiantes.add(estudiante);
    }

    private boolean validarNumeroIdenficacionExista (String numeroIdentificacion){
        boolean exista= false;
        for (Estudiante estudiante: estudiantes){
            if (estudiante.numeroIdentificacion().equals(numeroIdentificacion)){
                exista= true;
            }
        }
        return exista;
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    
}
