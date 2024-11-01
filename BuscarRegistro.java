import java.util.LinkedList;

public class BuscarRegistro {
    public EstudianteIngenieria Buscar(LinkedList<EstudianteIngenieria> Registro, String nombreBucar) {
        EstudianteIngenieria ei = new EstudianteIngenieria();
        for (EstudianteIngenieria datos : Registro) {
            if (ei.getSerial().equalsIgnoreCase(nombreBucar)) {
                ei.setNombre(datos.getNombre());
                ei.setApellido(datos.getApellido());
                ei.setCedula(datos.getCedula());
                ei.setTelefono(datos.getTelefono());
                ei.setNumSemestreActual(datos.getNumSemestreActual());
                ei.setPromedioAcumulado(datos.getPromedioAcumulado());
            }
        }

        return ei;
    }
}
