package MiembroDeLaComunidad;

import MiembroDeLaComunidad.Empleado.Docente.General;

public class Exalumnos extends General {

    private double promedio;
    private String especialidad;

    public Exalumnos(String nombre, String apellido, int cedula, double promedio, String especialidad) {
        super(nombre, apellido, cedula);
        this.promedio = promedio;
        this.especialidad = especialidad;
    }

    public String toString() {
        return String.format(getNombre() + " " + getApellido() + "---" + getCedula() + "---" + promedio+ "---"+ especialidad);
    }

}
