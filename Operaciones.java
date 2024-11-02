
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

    public LinkedList<EstudianteIngenieria> LlenarRegistroIngenieria(LinkedList<EstudianteIngenieria> Registro) throws IOException {
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

            while (true) {
                cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante: ");

                // Opción para salir
                if (cedula == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    return Registro; // Salir del método
                }

                // Verificar si el estudiante ya existe
                if (b.BuscarIngeniero(Registro, cedula) != null) {
                    JOptionPane.showMessageDialog(null, "El estudiante con cédula " + cedula + " ya existe");
                    continue; // Solicitar cédula nuevamente
                }

                ei.setCedula(cedula);

                nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
                ei.setNombre(nombre);

                apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante");
                ei.setApellido(apellido);

                telefono = JOptionPane.showInputDialog("Ingrese el telefono del estudiante");
                ei.setTelefono(telefono);

                numSemestreActual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del semestre que el estudiante esta cursando"));
                ei.setNumSemestreActual(numSemestreActual);

                promedioAcumulado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el promedio del estudiante"));
                ei.setPromedioAcumulado(promedioAcumulado);

                serial = JOptionPane.showInputDialog("Ingrese el serial del estudiante");
                ei.setSerial(serial);

                Registro.add(ei);
                // Preguntar si se desea agregar más registros
                String opt = JOptionPane.showInputDialog("¿Desea agregar más registros? (1. Si o 2. No)");

                if ("2".equals(opt)) {
                    agregarMas = false; // Salir del bucle
                    break; // Salir del bucle interno también
                } else if (!"1".equals(opt)) {
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break; // Regresar al inicio para pedir la cédula de nuevo
                }
            }
        }
        return Registro;
    }

    public LinkedList<EstudianteDiseño> LlenarRegistroDiseño(LinkedList<EstudianteDiseño> Registro) throws IOException {
        String cedula;
        String nombre;
        String apellido;
        String telefono;
        String modalidad;
        int asignaturas;
        String serial;
        BuscarRegistro b = new BuscarRegistro();
        boolean agregarMas = true;

        while (agregarMas) {
            EstudianteDiseño ed = new EstudianteDiseño();

            while (true) {
                cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante: ");

                // Opción para salir
                if (cedula == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    return Registro; // Salir del método
                }

                // Verificar si el estudiante ya existe
                if (b.buscarDiseñador(Registro, cedula) != null) {
                    JOptionPane.showMessageDialog(null, "El estudiante con cédula " + cedula + " ya existe");
                    continue; // Solicitar cédula nuevamente
                }
                ed.setCedula(cedula);

                nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
                ed.setNombre(nombre);

                apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante");
                ed.setApellido(apellido);

                telefono = JOptionPane.showInputDialog("Ingrese el telefono del estudiante");
                ed.setTelefono(telefono);

                modalidad = (JOptionPane.showInputDialog("Ingrese la modalidad del estudiante (virtual o presencial)"));
                ed.setModalidad(modalidad);

                asignaturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asignaturas del estudiante"));
                ed.setAsignaturas(asignaturas);

                serial = JOptionPane.showInputDialog("Ingrese el serial del estudiante");
                ed.setSerial(serial);

                Registro.add(ed);

                // Preguntar si se desea agregar más registros
                String opt = JOptionPane.showInputDialog("¿Desea agregar más registros? (1. Si o 2. No)");

                if ("2".equals(opt)) {
                    agregarMas = false; // Salir del bucle
                    break; // Salir del bucle interno también
                } else if (!"1".equals(opt)) {
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break; // Regresar al inicio para pedir la cédula de nuevo
                }

            }
        }
        return Registro;

    }

    public LinkedList<ComputadorPortatil> LlenarRegistroComputadorPortatil(LinkedList<ComputadorPortatil> Registro) throws IOException {
        String serial;
        String marca;
        String tamaño;
        String precio;
        String sistemaOperativo;
        String procesador;

        BuscarRegistro b = new BuscarRegistro();
        boolean agregarMas = true;

        while (agregarMas) {
            ComputadorPortatil com = new ComputadorPortatil();

            while (true) {
                serial = JOptionPane.showInputDialog("Ingrese el serial del computador portatil: ");

                // Opción para salir
                if (serial == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    return Registro; // Salir del método
                }

                // Verificar si el estudiante ya existe
                if (b.buscarComputadorPortatil(Registro, serial) != null) {
                    JOptionPane.showMessageDialog(null, "El estudiante con cédula " + serial + " ya existe");
                    continue; // Solicitar cédula nuevamente
                }

                com.setSerial(serial);

                marca = JOptionPane.showInputDialog("Ingrese la marca del computador portatil:");
                com.setMarca(marca);

                tamaño = JOptionPane.showInputDialog("Ingrese el tamaño del computador portatil: ");
                com.setTamaño(Float.parseFloat(tamaño));

                precio = JOptionPane.showInputDialog("Ingrese el precio del computador portatil: ");
                com.setPrecio(Float.parseFloat(precio));

                sistemaOperativo = (JOptionPane.showInputDialog("Ingrese el sistema operativo del computador portatil: "));
                com.setSistemaOperativo(sistemaOperativo);

                procesador = (JOptionPane.showInputDialog("Ingrese el procesador del computador portatil"));
                com.setProcesador(procesador);

                Registro.add(com);

                 // Preguntar si se desea agregar más registros
                 String opt = JOptionPane.showInputDialog("¿Desea agregar más registros? (1. Si o 2. No)");

                 if ("2".equals(opt)) {
                     agregarMas = false; // Salir del bucle
                     break; // Salir del bucle interno también
                 } else if (!"1".equals(opt)) {
                     JOptionPane.showMessageDialog(null, "Opción no válida");
                     break; // Regresar al inicio para pedir la cédula de nuevo
                 }
            }
        }
        return Registro;
    }

    public LinkedList<TabletaGrafica> LlenarRegistroTableta(LinkedList<TabletaGrafica> Registro) throws IOException {
        String serial;
        String marca;
        String tamaño;
        String precio;
        String almacenamiento;
        Float peso;

        BuscarRegistro b = new BuscarRegistro();
        boolean agregarMas = true;

        while (agregarMas) {
            TabletaGrafica ta = new TabletaGrafica();

            while (true) {
                serial = JOptionPane.showInputDialog("Ingrese el serial del computador portatil: ");

                // Opción para salir
                if (serial == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    return Registro; // Salir del método
                }

                // Verificar si el estudiante ya existe
                if (b.buscarTableta(Registro, serial) != null) {
                    JOptionPane.showMessageDialog(null, "El estudiante con cédula " + serial + " ya existe");
                    continue; // Solicitar cédula nuevamente
                }

                ta.setSerial(serial);

                marca = JOptionPane.showInputDialog("Ingrese la marca de la tableta:");
                ta.setMarca(marca);

                tamaño = JOptionPane.showInputDialog("Ingrese el tamaño de la tableta: ");
                ta.setTamaño(Float.parseFloat(tamaño));

                precio = JOptionPane.showInputDialog("Ingrese el precio de la tableta: ");
                ta.setPrecio(Float.parseFloat(precio));

                almacenamiento = (JOptionPane.showInputDialog("Ingrese el almacenamiento de la tableta: "));
                ta.setAlmacenamiento(almacenamiento);

                peso = Float.parseFloat((JOptionPane.showInputDialog("Ingrese el peso de la tableta")));
                ta.setPeso(peso);

                Registro.add(ta);

                // Preguntar si se desea agregar más registros
                String opt = JOptionPane.showInputDialog("¿Desea agregar más registros? (1. Si o 2. No)");

                if ("2".equals(opt)) {
                    agregarMas = false; // Salir del bucle
                    break; // Salir del bucle interno también
                } else if (!"1".equals(opt)) {
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break; // Regresar al inicio para pedir la cédula de nuevo
                }

            }
        }
        return Registro;
    }

    public void menuRegistroPortatil() throws IOException {
        byte opt;
        Operaciones op = new Operaciones();
        Exportar ex = new Exportar();
        Importar im = new Importar();
        LinkedList<ComputadorPortatil> Registro = new LinkedList<>();

        try {
            opt = Byte.parseByte(JOptionPane.showInputDialog("Desea agregar un nuevo dispositivo o ver uno ya existente\n"
                    + "1. Agregar nuevo dispositivo\n"
                    + "2. Ver dispositivos existentes\n"));

            switch (opt) {
                case 1:
                    im.leerArchivoComputadorPortatil("ComputadoresPortatiles.txt");
                    op.LlenarRegistroComputadorPortatil(Registro);
                    ex.exportarArchivoComputadorPortatil(Registro);

                    JOptionPane.showMessageDialog(null, "Dispositivo agregado correctamente");
                    break;
                case 2:
                    im.leerArchivoComputadorPortatil("ComputadoresPortatiles.txt");
                    op.mostrarPortatiles(Registro);
                    JOptionPane.showMessageDialog(null, "Dispositivos mostrados correctamente");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, seleccione 1 o 2");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida por favor ingrese un número");
        }

    }

    public void menuRegistroTableta() throws IOException {
        byte opt;
        Operaciones op = new Operaciones();
        Exportar ex = new Exportar();
        Importar im = new Importar();
        LinkedList<TabletaGrafica> Registro = new LinkedList<>();

        try {
            opt = Byte.parseByte(JOptionPane.showInputDialog("Desea agregar un nuevo dispositivo o ver uno ya existente\n"
                    + "1. Agregar nuevo dispositivo\n"
                    + "2. Ver dispositivos existentes\n"));

            switch (opt) {
                case 1:
                    im.leerArchivoTabletaGrafica("TabletasGraficas.txt");
                    op.LlenarRegistroTableta(Registro);
                    ex.exportarArchivoTabletaGrafica(Registro);

                    JOptionPane.showMessageDialog(null, "Dispositivo agregado correctamente");
                    break;
                case 2:
                    im.leerArchivoTabletaGrafica("TabletasGraficas.txt");
                    op.mostrarTabletas(Registro);
                    JOptionPane.showMessageDialog(null, "Dispositivos mostrados correctamente");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, seleccione 1 o 2");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida por favor ingrese un número");
        }

    }

    public void mostrarPortatiles(LinkedList<ComputadorPortatil> Registro) {

        for (ComputadorPortatil com : Registro) {
            JOptionPane.showMessageDialog(null, "Detalles del portátil:\n"
                    + "Serial: " + com.getSerial() + "\n"
                    + "Marca: " + com.getMarca() + "\n"
                    + "Tamaño: " + com.getTamaño() + "\n"
                    + "Precio: " + com.getPrecio() + "\n"
                    + "Sistema operativo: " + com.getSistemaOperativo() + "\n"
                    + "Procesador: " + com.getProcesador() + "\n"
                    + "------------------------------------------");
        }
    }

    public void mostrarTabletas(LinkedList<TabletaGrafica> Registro) {

        for (TabletaGrafica ta : Registro) {
            JOptionPane.showMessageDialog(null, "Detalles del portátil:\n"
                    + "Serial: " + ta.getSerial() + "\n"
                    + "Marca: " + ta.getMarca() + "\n"
                    + "Tamaño: " + ta.getTamaño() + "\n"
                    + "Precio: " + ta.getPrecio() + "\n"
                    + "Almacenamiento: " + ta.getAlmacenamiento() + "\n"
                    + "Peso: " + ta.getPeso() + "\n"
                    + "------------------------------------------");
        }
    }

    public void modificarPrestamoEquipoIngenieria(LinkedList<EstudianteIngenieria> Registro, LinkedList<ComputadorPortatil> equipos) throws IOException {
        String cedula;
        EstudianteIngenieria ei = new EstudianteIngenieria();
        ComputadorPortatil com = new ComputadorPortatil();
        BuscarRegistro b = new BuscarRegistro();
        boolean encontrado = false;

        while (true) {
            cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante cuyo préstamo desea modificar:");

            // Opción para salir
            if (cedula == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return; // Salir del método
            }

            ei = b.BuscarIngeniero(Registro, cedula);

            if (ei == null) {
                JOptionPane.showMessageDialog(null, "No se encontró un estudiante con la cédula " + cedula + " Intente de nuevo");

            } else {
                encontrado = true; // Se ha encontrado al estudiante
                break; // Salir del bucle
            }
        }
        mostrarPortatiles(equipos);

        String serialSeleccionado = JOptionPane.showInputDialog("Ingrese el serial del equipo que desea modificar:");
        com = b.buscarComputadorPortatil(equipos, serialSeleccionado);

        // Verificar si el usuario cancela la entrada
        if (serialSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
            return; // Salir del método
        }

        if (com != null) {

            JOptionPane.showMessageDialog(null, "Modificando el prestamo");

            // Modificar el equipo existente
            String nuevoSerial = JOptionPane.showInputDialog("Ingrese el nuevo serial del equipo (el qeuipo actual es: " + com.getSerial() + "):");
            com.setSerial(nuevoSerial); // Modificar el serial del equipo

            String nuevaMarca = JOptionPane.showInputDialog("Ingrese la nueva marca del equipo (el equipo actual es: " + com.getMarca() + "):");
            com.setMarca(nuevaMarca);

            // Modificar otros campos del computador portátil según sea necesario
            JOptionPane.showMessageDialog(null, "Préstamo modificado correctamente para el estudiante con cédula " + cedula);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un equipo con el serial ingresado.");
        }
    }
}
