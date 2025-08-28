package pe.edu.upeu.asistencia.servicio;

import pe.edu.upeu.asistencia.modelo.Estudiante;

import java.util.List;

public interface EstudianteServicoI {
    void save(Estudiante estudiante);

    List<Estudiante> findAllEstudiante();
    Estudiante upuateEstudiante(Estudiante estudiante , int index); //U

    Estudiante updateEstudiante(Estudiante estudiante, int index);

    void delete (int index );
    Estudiante findEstudianteById(int index);
}
