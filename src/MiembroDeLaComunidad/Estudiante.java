package MiembroDeLaComunidad;

import MiembroDeLaComunidad.Empleado.Docente.General;

public class Estudiante extends General {

    private int edad;
    private String curso;

    public Estudiante(String nombre, String apellido, int cedula, int edad, String curso) {
        super(nombre, apellido, cedula);
        this.edad = edad;
        this.curso = curso;
    }

    public String toString() {
        return String.format(getNombre() + " " + getApellido() + "---" + getCedula() + "---" + edad + "---"+ curso);
    }
}
