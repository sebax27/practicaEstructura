
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Estructura {

    public void menu() throws IOException {
        byte opt = 0;
        try {
            do {
                String menuPrincipal = "--- MENU PRINCIPAL ---\n\n"
                        + "1. ESTUDIANTES DE INGENIERIA\n"
                        + "2. ESTUDIANTES DE DISEÑO\n"
                        + "3. IMPRIMIR INVENTARIO TOTAL\n"
                        + "4. SALIR DEL PROGRAMA\n\n"
                        + "Digite la opción deseada: ";

                opt = Byte.parseByte(JOptionPane.showInputDialog(menuPrincipal));

                switch (opt) {
                    case 1:
                        menuEstudiantesIngenieria();
                        break;
                    case 2:
                        menuEstudiantesDisenio();
                        break;
                    case 3:
                        imprimirInventarioTotal();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Vuelva pronto");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, intente nuevamente.");
                        break;
                }
            } while (opt != 4);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opción válida...");
            menu(); // Llamada recursiva para volver a mostrar el menú
        }
    }

    private void menuEstudiantesIngenieria() throws IOException {
        byte opt;
        try {
            do {
                String menuIngenieria = "--- MENU ESTUDIANTES DE INGENIERIA ---\n\n"
                        + "1. REGISTRAR PRESTAMO DE EQUIPO\n"
                        + "2. MODIFICAR PRESTAMO DE EQUIPO\n"
                        + "3. DEVOLUCION DE EQUIPO\n"
                        + "4. BUSCAR EQUIPO\n"
                        + "5. VOLVER AL MENÚ PRINCIPAL\n\n"
                        + "Digite la opción deseada: ";

                opt = Byte.parseByte(JOptionPane.showInputDialog(menuIngenieria));

                switch (opt) {
                    case 1:
                        Operaciones op = new Operaciones();
                        LinkedList<EstudianteIngenieria> Registro = new LinkedList<>();
                        op.LlenarRegistro(Registro);
                        break;
                    case 2:
                        // Código para modificar préstamo de equipo
                        break;
                    case 3:
                        // Código para devolución de equipo
                        break;
                    case 4:
                        // Código para buscar equipo
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida...");
                        break;
                }
            } while (opt != 5);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opción válida...");
            menu(); // Llamada recursiva para volver a mostrar el menú
        }
    }

    private void menuEstudiantesDisenio() throws IOException {
        byte opt;
        try {
            do {
                String menuDisenio = "--- MENU ESTUDIANTES DE DISEÑO ---\n\n"
                        + "1. REGISTRAR PRESTAMO DE EQUIPO\n"
                        + "2. MODIFICAR PRESTAMO DE EQUIPO\n"
                        + "3. DEVOLUCION DE EQUIPO\n"
                        + "4. BUSCAR EQUIPO\n"
                        + "5. VOLVER AL MENÚ PRINCIPAL\n\n"
                        + "Digite la opción deseada: ";

                opt = Byte.parseByte(JOptionPane.showInputDialog(menuDisenio));

                switch (opt) {
                    case 1:
                        // Código para registrar préstamo de equipo
                        break;
                    case 2:
                        // Código para modificar préstamo de equipo
                        break;
                    case 3:
                        // Código para devolución de equipo
                        break;
                    case 4:
                        // Código para buscar equipo
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida...");
                        break;
                }
            } while (opt != 5);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opción válida...");
            menu(); // Llamada recursiva para volver a mostrar el menú
        }
    }

    private void imprimirInventarioTotal() {
        // Código para imprimir el inventario total
        JOptionPane.showMessageDialog(null, "Imprimiendo inventario total...");
    }
}
