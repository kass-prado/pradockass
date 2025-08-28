package pe.edu.upeu.asistencia.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.asistencia.modelo.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class EstudianteRepotory {

    public List<Estudiante> estudiante =new ArrayList<>();

    List<Estudiante> findAllEstudiante(){
        estudiante.add(new Estudiante(
                        new SimpleStringProperty("juan"),
                        new SimpleBooleanProperty(true)
        )
        );

        return estudiante;
    }
}

