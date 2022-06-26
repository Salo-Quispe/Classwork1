package MiembroDeLaComunidad.Empleado;

import MiembroDeLaComunidad.Empleado.Docente.General;

public class Administrativo extends General {

    private int oficina;

    public Administrativo(String nombre, String apellido, int cedula, int oficina) {
        super(nombre, apellido, cedula);
        this.oficina = oficina;
    }

    public String toString() {
        return String.format( getNombre() + " " + getApellido() + "---" + getCedula() + "---" + oficina);
    }
}
