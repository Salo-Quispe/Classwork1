package MiembroDeLaComunidad.Empleado.Docente;

public class Maestro extends General {

    private String materiaImparte;
    private String nivelEducacion;

    public Maestro(String nombre, String apellido, int cedula, String materiaImparte, String nivelEducacion) {
        super (nombre, apellido, cedula);
        this.materiaImparte = materiaImparte;
        this.nivelEducacion = nivelEducacion;
    }

    public String toString() {
        return String.format(getNombre() + " " + getApellido() + "---" + getCedula() + "---" + materiaImparte + "---"+ nivelEducacion);
    }
}
