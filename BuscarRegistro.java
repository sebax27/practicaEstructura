import java.util.LinkedList;

public class BuscarRegistro {
    public EstudianteIngenieria BuscarIngeniero(LinkedList<EstudianteIngenieria> Registro, String cedula) {
       
        EstudianteIngenieria est=null;
        for (EstudianteIngenieria estudiante : Registro) {
            if (estudiante.getCedula().equalsIgnoreCase(cedula)) {
                est=  estudiante;
            }
        }

        return est; 
    }
    public EstudianteDiseño buscarDiseñador(LinkedList<EstudianteDiseño> registro, String cedula) {
        for (EstudianteDiseño estudiante : registro) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante; // Devuelve el estudiante si se encuentra
            }
        }
        return null; // Devuelve null si no se encuentra
    }

    public ComputadorPortatil buscarComputadorPortatil(LinkedList<ComputadorPortatil> registro, String serial) {
        for (ComputadorPortatil com : registro) {
            if (com.getSerial().equals(serial)) {
                return com; // Devuelve el estudiante si se encuentra
            }
        }
        return null; // Devuelve null si no se encuentra
    }

    public TabletaGrafica buscarTableta(LinkedList<TabletaGrafica> registro, String serial) {
        for (TabletaGrafica tableta : registro) {
            if (tableta.getSerial().equals(serial)) {
                return tableta; // Devuelve el estudiante si se encuentra
            }
        }
        return null; // Devuelve null si no se encuentra
    }
    
}
