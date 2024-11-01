
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Operaciones {

    static BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));

    public void PrestamoEquipos() {
        LinkedList<EstudianteIngenieria> ei = new LinkedList<>();
        LinkedList<EstudianteDiseño> ed = new LinkedList<>();
        LinkedList<ComputadorPortatil> computadores = new LinkedList<>();
        LinkedList<TabletaGrafica> tabletas = new LinkedList<>();
    }

    public LinkedList<EstudianteIngenieria> LlenarRegistro(LinkedList<EstudianteIngenieria> Registro) throws IOException {
        String cedula;
        String nombre;
        String apellido;
        String telefono;
        String serial;
        int numSemestreActual;
        float promedioAcumulado;
        BuscarRegistro b = new BuscarRegistro();
        boolean agregarMas = true;

        while (agregarMas) {
            EstudianteIngenieria ei = new EstudianteIngenieria();

            nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            
            ei = b.Buscar(Registro, nombre);

            if (ei != null && ei.getNumSemestreActual() > 0) {
                System.out.println("el registro ya existe por favor escoja otra opcion");

                break;
            }
            ei = new EstudianteIngenieria();// Crear un nuevo objeto si no existe un registro duplicado
            ei.setNombre(nombre);

            apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante");
            ei.setApellido(apellido);

            cedula = JOptionPane.showInputDialog("Ingrese la cedula del estudiante");
            ei.setCedula(cedula);

            telefono = JOptionPane.showInputDialog("Ingrese el telefono del estudiante");
            ei.setTelefono(telefono);

            serial = JOptionPane.showInputDialog("Ingrese el serial del estudiante");
            ei.setSerial(serial);

            numSemestreActual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del semestre que el estudiante esta cursando"));
            ei.setNumSemestreActual(numSemestreActual);

            promedioAcumulado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el promedio del estudiante"));
            ei.setPromedioAcumulado(promedioAcumulado);

            Registro.add(ei);

            System.out.println("¿Desea agregar más registros? 1: Sí, 2: No");
            int opt = 0;

            while (true) {
                try {
                    opt = Integer.parseInt(cp.readLine());
                    if (opt == 1 || opt == 2) {
                        break;
                    } else {
                        System.out.println("Opción no válida, por favor digite de nuevo (1 o 2):");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Opción no válida, por favor digite de nuevo (1 o 2):");
                }
            }

            if (opt == 2) {
                agregarMas = false;
            }

        }
        return Registro;
    }

}
