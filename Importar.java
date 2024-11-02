import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "Ocurrió un error al procesar el archivo por favor inténtelo de nuevo");
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
            JOptionPane.showMessageDialog(null, "Ocurrió un error al procesar el archivo por favor inténtelo de nuevo");
        }
    
        return estudiante;
    }
 
    public LinkedList<ComputadorPortatil> leerArchivoComputadorPortatil(String nombreArchivo) {
        String rutaArchivo = nombreArchivo;
        LinkedList<ComputadorPortatil> computador = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            ComputadorPortatil com = null;
    
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Serial: ")) {
                    if (com != null) {
                        computador.add(com);
                    }
                    com = new ComputadorPortatil();
                    com.setSerial(line.substring(6)); 
                } else if (line.startsWith("Marca: ")) {
                    if (com != null) {
                        com.setMarca(line.substring(5));
                    }
                } else if (line.startsWith("Tamaño: ")) {
                    if (com != null) {
                        com.setTamaño(Float.parseFloat(line.substring(6)));
                    }
                } else if (line.startsWith("Precio: ")) {
                    if (com != null) {
                        com.setPrecio(Float.parseFloat(line.substring(6)));
                    }
                } else if (line.startsWith("Sistema operativo : ")) {
                    if (com != null) {
                        com.setSistemaOperativo(line.substring(16));
                    }
                } else if (line.startsWith("Procesador: ")) {
                    if (com != null) {
                        com.setProcesador(line.substring(11));
                        computador.add(com); 
                        com = null; // Reiniciar para el siguiente estudiante
                    }
                }
            }
    
            if (com != null) { // Agregar el último estudiante si el archivo no termina con "Serial: "
            computador.add(com);
            }
    
            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al procesar el archivo por favor inténtelo de nuevo");
        }
    
        return computador;
    }
 
    public LinkedList<TabletaGrafica> leerArchivoTabletaGrafica(String nombreArchivo) {
        String rutaArchivo = nombreArchivo;
        LinkedList<TabletaGrafica> tableta = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            TabletaGrafica ta = null;
    
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Serial: ")) {
                    if (ta != null) {
                        tableta.add(ta);
                    }
                    ta = new TabletaGrafica();
                    ta.setSerial(line.substring(6)); 
                } else if (line.startsWith("Marca: ")) {
                    if (ta != null) {
                        ta.setMarca(line.substring(5));
                    }
                } else if (line.startsWith("Tamaño: ")) {
                    if (ta != null) {
                        ta.setTamaño(Float.parseFloat(line.substring(6)));
                    }
                } else if (line.startsWith("Precio: ")) {
                    if (ta != null) {
                        ta.setPrecio(Float.parseFloat(line.substring(6)));
                    }
                } else if (line.startsWith("Almacenamiento : ")) {
                    if (ta != null) {
                        ta.setAlmacenamiento(line.substring(16));
                    }
                } else if (line.startsWith("Peso: ")) {
                    if (ta != null) {
                        ta.setPeso(Float.parseFloat(line.substring(4)));
                        tableta.add(ta); 
                        ta = null; // Reiniciar para el siguiente estudiante
                    }
                }
            }
    
            if (ta != null) { // Agregar el último estudiante si el archivo no termina con "Serial: "
            tableta.add(ta);
            }
    
            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al procesar el archivo por favor inténtelo de nuevo");
        }
    
        return tableta;
    }
 

}
