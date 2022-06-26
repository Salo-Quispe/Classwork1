package MiembroDeLaComunidad.Empleado.Docente;

public class Administrador extends General {

    private String sueldo;

    public Administrador(String nombre, String apellido, int cedula, String sueldo) {
        super (nombre, apellido, cedula);
        this.sueldo = sueldo;
    }

    public String toString() {
        return String.format(getNombre() + " " + getApellido() + "---" + getCedula() + "---" + sueldo);
    }
}
