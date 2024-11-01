import java.util.LinkedList;

public class BuscarRegistro {
    public EstudianteIngenieria Buscar(LinkedList<EstudianteIngenieria> Registro, String buscar) {
        EstudianteIngenieria ei = new EstudianteIngenieria();
        for (EstudianteIngenieria datos : Registro) {
            if (ei.getCedula().equalsIgnoreCase(buscar)) {
                ei.setNombre(datos.getNombre());
                ei.setApellido(datos.getApellido());
                ei.setSerial(datos.getSerial());
                ei.setTelefono(datos.getTelefono());
                ei.setNumSemestreActual(datos.getNumSemestreActual());
                ei.setPromedioAcumulado(datos.getPromedioAcumulado());
            }
        }

        return ei;
    }

    
}
