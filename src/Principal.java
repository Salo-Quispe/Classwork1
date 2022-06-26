import MiembroDeLaComunidad.Empleado.Administrativo;
import MiembroDeLaComunidad.Empleado.Docente.Administrador;
import MiembroDeLaComunidad.Empleado.Docente.Maestro;
import MiembroDeLaComunidad.Estudiante;
import MiembroDeLaComunidad.Exalumnos;

import javax.swing.*;
import java.nio.file.AccessDeniedException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean fin = false;
        int op;

        Administrador Luis = new Administrador("Luis", "Kanuza", 1795826478, "$500");
        Administrativo Wara = new Administrativo("Wara", "Akana", 1726589965, 15);
        Maestro Jaime = new Maestro("Jaime", "Flores", 1752369845, "Quimica", "Ingeniero en Bioquimica");
        Maestro Elisabeth = new Maestro("Elisabeth", "Sanches", 1726598488, "Lengua y Literatura", "Licenciada en Filosifía y Letras");
        Maestro Peter = new Maestro("Peter", "Ploy", 1746852333, "Inglés", "Licenciatura en edagogia");
        Maestro Asalia = new Maestro("Asalia", "Baez", 1778965422, "Matematicas", "Ingeniera en Arquitectura");
        Estudiante estudiante1 = new Estudiante("Soledad", "Gutierrez", 1778956552, 16, "3ro C");
        Estudiante estudiante2 = new Estudiante("Maria", "Silva", 1756988231, 17, "3ro B");
        Estudiante estudiante3 = new Estudiante("Soledad", "Quispe", 1774521201, 16, "3ro A");
        Exalumnos est1 = new Exalumnos("Amara","Sarsoza", 1745522365, 9.82, "Bach. en Ciencias");
        Exalumnos est2 = new Exalumnos("Amara","Sarsoza", 1745522365, 9.82, "Bach. Biooquimico");
        Exalumnos est3 = new Exalumnos("Amara","Sarsoza", 1745522365, 9.82, "Bach. en Anatomia");
        while (!fin) {

            System.out.println("          |Unidad Esucativa|");
            System.out.println("1. Empleados");
            System.out.println("2. Miembros");
            System.out.println("3. Salir");

            try {
                System.out.println("seleccione una opcion: ");
                op = sn.nextInt();

                switch (op){
                    case 1:
                        System.out.println("         EMPLEADOS");
                        System.out.println("         ******|Administrativo|******");
                        System.out.println(Wara.toString());
                        System.out.println("         ******|Administrador|******");
                        System.out.println(Luis.toString());
                        break;
                    case 2:
                        System.out.println("          MIEMBROS");
                        System.out.println("         ******|Maestros|******");
                        System.out.println(Jaime.toString());
                        System.out.println(Elisabeth.toString());
                        System.out.println(Peter.toString());
                        System.out.println(Asalia.toString());
                        System.out.println("         ******|Cuadro de Honor|******");
                        System.out.println(estudiante1.toString());
                        System.out.println(estudiante2.toString());
                        System.out.println(estudiante3.toString());
                        System.out.println("         ******|Egresados|******");
                        System.out.println(est1.toString());
                        System.out.println(est2.toString());
                        System.out.println(est3.toString());
                        break;
                    case 3:
                        fin = true;
                        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                        break;
                    default:
                        System.out.println("Ingrese una opción valida entre 1 y 3");
                }

            } catch (InputMismatchException e) {
                System.out.println("¡¡ERROR!!");
            }
        }
    }
}