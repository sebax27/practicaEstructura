
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Operaciones {

    
   
   

    static BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));

    public LinkedList<EstudianteIngenieria> LlenarRegistroIngenieria(LinkedList<EstudianteIngenieria> Registro) throws IOException {
        String cedula;
        String nombre;
        String apellido;
        String telefono;
        String serial;
        int numSemestreActual;
        float promedioAcumulado;
        BuscarRegistro b = new BuscarRegistro();
        Exportar ex = new Exportar();
        boolean agregarMas = true;

        while (agregarMas) {
            EstudianteIngenieria ei;

            while (true) {
                cedula = JOptionPane.showInputDialog("Ingrese la cedula del estudiante: ");

                // Salir del metodo
                if (cedula == null) {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada.");
                    return Registro;
                }

                // Verificar si el estudiante ya existe
                if (b.BuscarIngeniero(Registro, cedula) != null) {
                    JOptionPane.showMessageDialog(null, "El estudiante con cedula " + cedula + " ya existe");
                    continue; // Solicitar cedula nuevamente
                }
                ei = new EstudianteIngenieria();
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

                //Guarda el estudiante ingresado
                ex.exportarArchivoIngenieria(Registro);

                // Preguntar si se desea agregar mas registros
                String opt = JOptionPane.showInputDialog("Desea agregar mas registros? (1. si o 2. no)");

                if ("2".equals(opt)) {
                    agregarMas = false;
                    break; // Salir del bucle
                } else if (!"1".equals(opt)) {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break; // Regresar al inicio para pedir la cedula de nuevo
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
        Exportar ex = new Exportar();
        BuscarRegistro b = new BuscarRegistro();
        boolean agregarMas = true;

        while (agregarMas) {
            EstudianteDiseño ed;

            while (true) {
                cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante: ");

                // Salir del metodo
                if (cedula == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    return Registro;
                }

                // Verificar si el estudiante ya existe
                if (b.buscarDiseñador(Registro, cedula) != null) {
                    JOptionPane.showMessageDialog(null, "El estudiante con cédula " + cedula + " ya existe");
                    continue; // Solicitar cedula nuevamente
                }
                ed = new EstudianteDiseño();
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

                //Guardar el registro 
                ex.exportarArchivoDiseño(Registro);

                // Preguntar si se desea agregar mas registros
                String opt = JOptionPane.showInputDialog("Desea agregar mas registros? 1. si o 2. no");

                if ("2".equals(opt)) {
                    agregarMas = false; // Salir del bucle
                    break; // Salir del bucle interno también
                } else if (!"1".equals(opt)) {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
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
        Exportar ex = new Exportar();
        BuscarRegistro b = new BuscarRegistro();
        boolean agregarMas = true;

        while (agregarMas) {
            ComputadorPortatil com;

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
                com = new ComputadorPortatil();
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

                //Guardar el Registro
                ex.exportarArchivoComputadorPortatil(Registro);

                // Preguntar si se desea agregar más registros
                String opt = JOptionPane.showInputDialog("Desea agregar más registros? (1. si o 2. no)");

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
        Exportar ex = new Exportar();
        BuscarRegistro b = new BuscarRegistro();
        boolean agregarMas = true;

        while (agregarMas) {
            TabletaGrafica ta;

            while (true) {
                serial = JOptionPane.showInputDialog("Ingrese el serial del computador portatil: ");

                // Opción para salir
                if (serial == null) {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada.");
                    return Registro; // Salir del método
                }

                // Verificar si el estudiante ya existe
                if (b.buscarTableta(Registro, serial) != null) {
                    JOptionPane.showMessageDialog(null, "El estudiante con cedula " + serial + " ya existe");
                    continue; // Solicitar cédula nuevamente
                }
                ta = new TabletaGrafica();
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

                //Guardar el Registro
                ex.exportarArchivoTabletaGrafica(Registro);

                // Preguntar si se desea agregar más registros
                String opt = JOptionPane.showInputDialog("Desea agregar mas registros? (1. si o 2. no)");

                if ("2".equals(opt)) {
                    agregarMas = false; // Salir del bucle
                    break; // Salir del bucle interno también
                } else if (!"1".equals(opt)) {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break; // Regresar al inicio para pedir la cédula de nuevo
                }

            }
        }
        return Registro;
    }

    public void menuRegistroPortatil() throws IOException {
        byte opt;
        Importar im = new Importar();
        Operaciones op = new Operaciones();
        LinkedList<ComputadorPortatil> Registro = new LinkedList<>();

        try {
            opt = Byte.parseByte(JOptionPane.showInputDialog("Desea agregar un nuevo dispositivo o ver uno ya existente\n"
                    + "1. Agregar nuevo dispositivo\n"
                    + "2. Ver dispositivos existentes\n"));

            switch (opt) {
                case 1:
                    im.leerArchivoComputadorPortatil("ComputadoresPortatiles.txt");
                    op.LlenarRegistroComputadorPortatil(Registro);
                    

                    JOptionPane.showMessageDialog(null, "Dispositivo agregado correctamente");
                    break;
                case 2:
                    im.leerArchivoComputadorPortatil("ComputadoresPortatiles.txt");
                    op.mostrarPortatiles(Registro);
                    JOptionPane.showMessageDialog(null, "Dispositivos mostrados correctamente");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida, seleccione 1 o 2");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada invalida por favor ingrese un número");
        }

    }

    public void menuRegistroTableta() throws IOException {
        byte opt;
        Importar im = new Importar();
        Operaciones op = new Operaciones();

        LinkedList<TabletaGrafica> Registro = new LinkedList<>();

        try {
            opt = Byte.parseByte(JOptionPane.showInputDialog("Desea agregar un nuevo dispositivo o ver uno ya existente\n"
                    + "1. Agregar nuevo dispositivo\n"
                    + "2. Ver dispositivos existentes\n"));

            switch (opt) {
                case 1:
                    im.leerArchivoTabletaGrafica("TabletasGraficas.txt");
                    op.LlenarRegistroTableta(Registro);
                    JOptionPane.showMessageDialog(null, "Dispositivo agregado correctamente");

                    break;
                case 2:
                    im.leerArchivoTabletaGrafica("TabletasGraficas.txt");
                    op.mostrarTabletas(Registro);
                    JOptionPane.showMessageDialog(null, "Dispositivos mostrados correctamente");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida, seleccione 1 o 2");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada invalida por favor ingrese un numero");
        }

    }

    public void mostrarPortatiles(LinkedList<ComputadorPortatil> Registro) {

        if (Registro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay equipos disponibles.");
            return;
        }

        for (ComputadorPortatil com : Registro) {
            JOptionPane.showMessageDialog(null, "Detalles del portatil:\n"
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

        if (Registro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay equipos disponibles.");
            return;
        }

        for (TabletaGrafica ta : Registro) {
            JOptionPane.showMessageDialog(null, "Detalles del portatil:\n"
                    + "Serial: " + ta.getSerial() + "\n"
                    + "Marca: " + ta.getMarca() + "\n"
                    + "Tamaño: " + ta.getTamaño() + "\n"
                    + "Precio: " + ta.getPrecio() + "\n"
                    + "Almacenamiento: " + ta.getAlmacenamiento() + "\n"
                    + "Peso: " + ta.getPeso() + "\n"
                    + "------------------------------------------");
        }
    }

    // Metodo para mostrar el inventario completo de computadores portatiles y tabletas graficas
    public void mostrarInventarioCompleto(LinkedList<ComputadorPortatil> portatiles, LinkedList<TabletaGrafica> tabletas) {
        String inventario = "Inventario Completo:\n\n";

        // Agregar informacion de los computadores portatiles
        inventario += "Computadores Portatiles:\n";
        if (portatiles.isEmpty()) {
            inventario += "No hay computadores portatiles en el inventario.\n";
        } else {

        }

        // Agregar información de las tabletas gráficas
        inventario += "Tabletas Gráficas:\n";
        if (tabletas.isEmpty()) {
            inventario += "No hay tabletas gráficas en el inventario.\n";

            for (ComputadorPortatil equipo : portatiles) {
                inventario += ("Serial: " + equipo.getSerial() + "\n"
                        + "Marca: " + equipo.getMarca() + "\n"
                        + "Tamaño: " + equipo.getTamaño() + "\n"
                        + "Precio: " + equipo.getPrecio() + "\n"
                        + "Sistema operativo: " + equipo.getSistemaOperativo() + "\n"
                        + "Procesador: " + equipo.getProcesador() + "\n"
                        + "------------------------------------------");
            }

        } else {
            for (TabletaGrafica equipo : tabletas) {
                inventario += ("Serial: " + equipo.getSerial() + "\n"
                        + "Marca: " + equipo.getMarca() + "\n"
                        + "Tamaño: " + equipo.getTamaño() + "\n"
                        + "Precio: " + equipo.getPrecio() + "\n"
                        + "Almacenamiento: " + equipo.getAlmacenamiento() + "\n"
                        + "Peso: " + equipo.getPeso() + "\n"
                        + "------------------------------------------");
            }
        }

        // Mostrar todo el inventario en un solo cuadro de diálogo
        JOptionPane.showMessageDialog(null, inventario);
    }

    public void modificarPrestamoEquipoIngenieria(LinkedList<EstudianteIngenieria> Registro, LinkedList<ComputadorPortatil> equipos) throws IOException {
        String cedula;
        EstudianteIngenieria ei = new EstudianteIngenieria();
        ComputadorPortatil com = new ComputadorPortatil();
        BuscarRegistro b = new BuscarRegistro();
        Exportar ex = new Exportar();
        boolean encontrado = false;

        while (true) {
            cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante cuyo préstamo desea modificar:");

            // Salir del método
            if (cedula == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return;
            }

            ei = b.BuscarIngeniero(Registro, cedula);

            if (ei == null) {
                JOptionPane.showMessageDialog(null, "No se encontró un estudiante con la cédula " + cedula + " Intente de nuevo");

            } else {
                encontrado = true; // Se ha encontrado al estudiante
                break;
            }
        }
        mostrarPortatiles(equipos);

        String serialSeleccionado = JOptionPane.showInputDialog("Ingrese el serial del equipo que desea modificar:");
        com = b.buscarComputadorPortatil(equipos, serialSeleccionado);

        // Salir del método
        if (serialSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
            return;
        }

        if (com != null) {

            JOptionPane.showMessageDialog(null, "Modificando el prestamo");

            // Modificar el equipo existente
            String nuevoSerial = JOptionPane.showInputDialog("Ingrese el nuevo serial del equipo (el qeuipo actual es: " + com.getSerial() + "):");
            com.setSerial(nuevoSerial);

            String nuevaMarca = JOptionPane.showInputDialog("Ingrese la nueva marca del equipo (el equipo actual es: " + com.getMarca() + "):");
            com.setMarca(nuevaMarca);

            String nuevoTamaño = JOptionPane.showInputDialog("Ingrese el nuevo tamaño del equipo (el qeuipo actual es: " + com.getTamaño() + "):");
            com.setTamaño(Float.parseFloat(nuevoTamaño));

            String nuevoPrecio = JOptionPane.showInputDialog("Ingrese el nuevo precio del equipo (el qeuipo actual es: " + com.getPrecio() + "):");
            com.setPrecio(Float.parseFloat(nuevoPrecio));

            String nuevoSistemaOperativo = JOptionPane.showInputDialog("Ingrese el nuevo sistema operativo del equipo (el qeuipo actual es: " + com.getSistemaOperativo() + "):");
            com.setSistemaOperativo(nuevoSistemaOperativo);

            String nuevoProcesador = JOptionPane.showInputDialog("Ingrese el nuevo procesador del equipo (el qeuipo actual es: " + com.getProcesador() + "):");
            com.setProcesador(nuevoProcesador);

            ex.exportarArchivoComputadorPortatil(equipos);

            JOptionPane.showMessageDialog(null, "Préstamo modificado correctamente para el estudiante con cédula " + cedula);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un equipo con el serial ingresado.");
        }
    }

    public void modificarPrestamoEquipoDiseño(LinkedList<EstudianteDiseño> Registro, LinkedList<TabletaGrafica> equipos) throws IOException {
        String cedula;
            EstudianteDiseño ed = new EstudianteDiseño();
            TabletaGrafica ta = new TabletaGrafica();
            BuscarRegistro b = new BuscarRegistro();
            Exportar ex = new Exportar();
        boolean encontrado = false;

        while (true) {
            cedula = JOptionPane.showInputDialog("Ingrese la cedula del estudiante cuyo prestamo desea modificar:");

            // Salir del método
            if (cedula == null) {
                JOptionPane.showMessageDialog(null, "Operacion cancelada.");
                return;
            }

            ed = b.buscarDiseñador(Registro, cedula);

            if (ed == null) {
                JOptionPane.showMessageDialog(null, "No se encontro un estudiante con la cedula " + cedula + " Intente de nuevo");

            } else {
                encontrado = true; // Se ha encontrado al estudiante
                break;
            }
        }
        mostrarTabletas(equipos);

        String serialSeleccionado = JOptionPane.showInputDialog("Ingrese el serial del equipo que desea modificar:");
        ta = b.buscarTableta(equipos, serialSeleccionado);

        // Verificar si el usuario cancela la entrada
        if (serialSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "Operacion cancelada ");
            return;
        }

        if (ta != null) {

            JOptionPane.showMessageDialog(null, "Modificando el prestamo");

            // Modificar el equipo existente
            String nuevoSerial = JOptionPane.showInputDialog("Ingrese el nuevo serial del equipo (el qeuipo actual es: " + ta.getSerial() + "):");
            ta.setSerial(nuevoSerial);

            String nuevaMarca = JOptionPane.showInputDialog("Ingrese la nueva marca del equipo (el equipo actual es: " + ta.getMarca() + "):");
            ta.setMarca(nuevaMarca);

            String nuevoTamaño = JOptionPane.showInputDialog("Ingrese el nuevo tamaño del equipo (el qeuipo actual es: " + ta.getSerial() + "):");
            ta.setTamaño(Float.parseFloat(nuevoTamaño));

            String nuevoPrecio = JOptionPane.showInputDialog("Ingrese el nuevo precio del equipo (el qeuipo actual es: " + ta.getSerial() + "):");
            ta.setPrecio(Float.parseFloat(nuevoPrecio));

            String nuevoSistemaOperativo = JOptionPane.showInputDialog("Ingrese el nuevo almacenamiento del equipo (el qeuipo actual es: " + ta.getAlmacenamiento() + "):");
            ta.setAlmacenamiento(nuevoSistemaOperativo);

            String nuevoProcesador = JOptionPane.showInputDialog("Ingrese el nuevo serial del peso (el qeuipo actual es: " + ta.getPeso() + "):");
            ta.setPeso(Float.parseFloat(nuevoProcesador));

            ex.exportarArchivoTabletaGrafica(equipos);

            JOptionPane.showMessageDialog(null, "Préstamo modificado correctamente para el estudiante con cédula " + cedula);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un equipo con el serial ingresado.");
        }
    }

}
