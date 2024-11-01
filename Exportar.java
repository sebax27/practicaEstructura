
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {

    public void exportarArchivoIngenieria(LinkedList<EstudianteIngenieria> Registro) {

        try (FileWriter escriba = new FileWriter("EstudiantesIngenieria.txt")) {
            for (EstudianteIngenieria datos : Registro) {
                escriba.write("Cedula: " + datos.getCedula() + "\n");
                escriba.write("Nombre: " + datos.getNombre() + "\n");
                escriba.write("Apellido: " + datos.getApellido() + "\n");
                escriba.write("telefono: " + datos.getTelefono() + "\n");
                escriba.write("Numero del semestre actual: " + datos.getNumSemestreActual() + "\n");
                escriba.write("Promedio acumulado: " + datos.getPromedioAcumulado() + "\n");
                escriba.write("Serial: " + datos.getSerial() + "\n");

                escriba.write("---------------------------------------\n");

            }

            System.out.println("Archivo exportado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportarArchivoDiseño(LinkedList<EstudianteDiseño> Registro) {

        try (FileWriter escriba = new FileWriter("EstudiantesDIseño.txt")) {
            for (EstudianteDiseño datos : Registro) {
                escriba.write("Cedula: " + datos.getCedula() + "\n");
                escriba.write("Nombre: " + datos.getNombre() + "\n");
                escriba.write("Apellido: " + datos.getApellido() + "\n");
                escriba.write("telefono: " + datos.getTelefono() + "\n");
                escriba.write("Modalidad: " + datos.getModalidad() + "\n");
                escriba.write("Asignaturas: " + datos.getAsignaturas() + "\n");
                escriba.write("Serial: " + datos.getSerial() + "\n");

                escriba.write("---------------------------------------\n");

            }

            System.out.println("Archivo exportado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
