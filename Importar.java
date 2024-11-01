import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Importar {
    
    public LinkedList<EstudianteIngenieria> leerArchivoIngenieria(String nombreArchivo) {
        String rutaArchivo = nombreArchivo;
        LinkedList<EstudianteIngenieria> estudiante = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            EstudianteIngenieria ei = null;
    
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Cedula: ")) {
                    if (ei != null) {
                        estudiante.add(ei);
                    }
                    ei = new EstudianteIngenieria();
                    ei.setCedula(line.substring(8)); 
                } else if (line.startsWith("Nombre: ")) {
                    if (ei != null) {
                        ei.setNombre(line.substring(8));
                    }
                } else if (line.startsWith("Apellido: ")) {
                    if (ei != null) {
                        ei.setApellido(line.substring(10));
                    }
                } else if (line.startsWith("Telefono: ")) {
                    if (ei != null) {
                        ei.setTelefono(line.substring(10));
                    }
                } else if (line.startsWith("Numero del semestre actual: ")) {
                    if (ei != null) {
                        ei.setNumSemestreActual(Integer.parseInt(line.substring(27)));
                    }
                } else if (line.startsWith("Promedio acumulado: ")) {
                    if (ei != null) {
                        ei.setPromedioAcumulado(Float.parseFloat(line.substring(19)));
                    }
                } else if (line.startsWith("Serial: ")) {
                    if (ei != null) {
                        ei.setSerial(line.substring(8));
                        estudiante.add(ei); 
                        ei = null; // Reiniciar para el siguiente estudiante
                    }
                }
            }
    
            if (ei != null) { // Agregar el último estudiante si el archivo no termina con "Serial: "
                estudiante.add(ei);
            }
    
            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return estudiante;
    }
    
    public LinkedList<EstudianteDiseño> leerArchivoDiseño(String nombreArchivo) {
        String rutaArchivo = nombreArchivo;
        LinkedList<EstudianteDiseño> estudiante = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            EstudianteDiseño ed = null;
    
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Cedula: ")) {
                    if (ed != null) {
                        estudiante.add(ed);
                    }
                    ed = new EstudianteDiseño();
                    ed.setCedula(line.substring(8)); 
                } else if (line.startsWith("Nombre: ")) {
                    if (ed != null) {
                        ed.setNombre(line.substring(8));
                    }
                } else if (line.startsWith("Apellido: ")) {
                    if (ed != null) {
                        ed.setApellido(line.substring(10));
                    }
                } else if (line.startsWith("Telefono: ")) {
                    if (ed != null) {
                        ed.setTelefono(line.substring(10));
                    }
                } else if (line.startsWith("Modalidad : ")) {
                    if (ed != null) {
                        ed.setModalidad(line.substring(11));
                    }
                } else if (line.startsWith("Asignaturas : ")) {
                    if (ed != null) {
                        ed.setAsignaturas(Integer.parseInt(line.substring(11)));
                    }
                } else if (line.startsWith("Serial: ")) {
                    if (ed != null) {
                        ed.setSerial(line.substring(8));
                        estudiante.add(ed); 
                        ed = null; // Reiniciar para el siguiente estudiante
                    }
                }
            }
    
            if (ed != null) { // Agregar el último estudiante si el archivo no termina con "Serial: "
                estudiante.add(ed);
            }
    
            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return estudiante;
    }
 

}
