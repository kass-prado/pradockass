package pe.edu.upeu.asistencia.servicio;

import pe.edu.upeu.asistencia.modelo.Estudiante;
import pe.edu.upeu.asistencia.repositorio.EstudianteRepotory;

import java.util.ArrayList;
import java.util.List;

public class EstudianteServicioImp extends EstudianteRepotory implements EstudianteServicoI {

    // Lista para almacenar estudiantes
    private List<Estudiante> estudiantes = new ArrayList<>();

    @Override
    public void save(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public List<Estudiante> findAllEstudiante() {
        return estudiantes;
    }

    @Override
    public Estudiante upuateEstudiante(Estudiante estudiante, int index) {
        return null;
    }

    @Override
    public Estudiante updateEstudiante(Estudiante estudiante, int index) {
        // Verificamos que el índice sea válido
        if (index >= 0 && index < estudiantes.size()) {
            estudiantes.set(index, estudiante);
            return estudiante;
        }
        return null; // O lanzar excepción según diseño
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < estudiantes.size()) {
            estudiantes.remove(index);
        }
        // Opcional: manejar índice inválido
    }

    @Override
    public Estudiante findEstudianteById(int index) {
        if (index >= 0 && index < estudiantes.size()) {
            return estudiantes.get(index);
        }
        return null; // O lanzar excepción según diseño
    }
}
