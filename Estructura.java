
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Estructura {

    public void menu() throws IOException {
        byte opt = 0;
        Operaciones op = new Operaciones();
        LinkedList<ComputadorPortatil> portatiles = new LinkedList<>();
        LinkedList<TabletaGrafica> tabletas = new LinkedList<>();
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
                        menuEstudiantesDiseño();
                        break;
                    case 3:
                    op.mostrarInventarioCompleto(portatiles, tabletas);
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

    public static void menuEstudiantesIngenieria() throws IOException {
        byte opt;
        Operaciones op = new Operaciones();
        LinkedList<EstudianteIngenieria> Registro = new LinkedList<>();
        
        Exportar ex = new Exportar();
        Importar im = new Importar();
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
                       
                    Registro = im.leerArchivoIngenieria("EstudiantesIngenieria.txt");

                        System.out.println("----> "+im.leerArchivoIngenieria("EstudiantesIngenieria.txt"));
                        op.LlenarRegistroIngenieria(Registro);
                        op.menuRegistroPortatil();
                      

                        break;
                    case 2:
                        LinkedList<ComputadorPortatil> equipos = new LinkedList<>();
                        im.leerArchivoIngenieria("EstudiantesIngenieria.txt");
                        im.leerArchivoComputadorPortatil("ComputadoresPortatiles.txt");
                        op.modificarPrestamoEquipoIngenieria(Registro, equipos);

                        break;
                    case 3:
                        // Código para devolución de equipo
                        break;
                    case 4:

                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                        break;
                  
                }
            } while (opt != 5);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opción válida...");
            menuEstudiantesIngenieria(); // Llamada recursiva para volver a mostrar el menú
        }
    }

    private void menuEstudiantesDiseño() throws IOException {
        byte opt ;
        Operaciones op = new Operaciones();
        LinkedList<EstudianteDiseño> Registro = new LinkedList<>();
        Exportar ex = new Exportar();
        Importar im = new Importar();

        try {
            do {
                String menuDiseño = "--- MENU ESTUDIANTES DE DISEÑO ---\n\n"
                        + "1. REGISTRAR PRESTAMO DE EQUIPO\n"
                        + "2. MODIFICAR PRESTAMO DE EQUIPO\n"
                        + "3. DEVOLUCION DE EQUIPO\n"
                        + "4. BUSCAR EQUIPO\n"
                        + "5. VOLVER AL MENÚ PRINCIPAL\n\n"
                        + "Digite la opción deseada: ";

                opt = Byte.parseByte(JOptionPane.showInputDialog(menuDiseño));
                

                switch (opt) {
                    case 1:
                
                    im.leerArchivoIngenieria("EstudiantesDiseño.txt");
                    op.LlenarRegistroDiseño(Registro);
                    ex.exportarArchivoDiseño(Registro);
                    op.menuRegistroTableta();
                        
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
            menuEstudiantesDiseño(); // Llamada recursiva para volver a mostrar el menú
        }
    }

    
}
