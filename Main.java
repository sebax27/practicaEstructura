
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Estructura op = new Estructura();
        // op.menu();
        //  LinkedList<EstudianteIngenieria> Registro = new LinkedList<>();

        // Exportar ex = new Exportar();
        // ex.exportarArchivoIngenieria(Registro);
        Importar im = new Importar();
        im.leerArchivoIngenieria("EstudiantesIngenieria.txt");
        // TabletaGrafica tg = new TabletaGrafica();
        // tg.setAlmacenamiento(tg.elegirAlmacenamiento());
        //TabletaGrafica tg = new TabletaGrafica();
        // tg.elegirAlmacenamiento();
        // EstudianteIngenieria ei = new EstudianteIngenieria();
        // String cedula = JOptionPane.showInputDialog("Ingrese la cedula: ");
        // ei.setCedula(cedula);
    }
}
