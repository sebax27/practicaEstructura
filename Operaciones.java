
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

            cedula = JOptionPane.showInputDialog("Ingrese la cedula del estudiante");

            if (b.BuscarIngeniero(Registro, cedula) != null) {
                JOptionPane.showMessageDialog(null, "El estudiante con cédula " + cedula + " ya existe");
                continue; // Solicitar cédula nuevamente
            }
            ei = new EstudianteIngenieria();// Crear un nuevo objeto si no existe un registro duplicado
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
            System.out.println("¿Desea agregar más registros? (1. Sí, 2. No)");
            String opt = cp.readLine(); // Leer la entrada del usuario

            if (opt.equals("2")) {
                agregarMas = false; // Salir del bucle
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

            cedula = JOptionPane.showInputDialog("Ingrese la cedula del estudiante");

            ed = b.buscarDiseñador(Registro, cedula);
            if (b.buscarDiseñador(Registro, cedula) != null) {
                JOptionPane.showMessageDialog(null, "El estudiante con cédula " + cedula + " ya existe");
                continue; // Solicitar cédula nuevamente
            }
            ed = new EstudianteDiseño();// Crear un nuevo objeto si no existe un registro duplicado
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
               System.out.println("¿Desea agregar más registros? (1. Sí, 2. No)");
               String opt = cp.readLine(); // Leer la entrada del usuario
   
               if (opt.equals("2")) {
                   agregarMas = false; // Salir del bucle
               }

        }
        return Registro;
    }

    public LinkedList<ComputadorPortatil> LlenarRegistroComputadorPortatil(LinkedList<ComputadorPortatil> Registro) throws IOException {
        String serial;
        String marca;
        String tamaño;
        String precio;
        String sistemaOperativo ;
        String procesador;

        BuscarRegistro b = new BuscarRegistro();
        boolean agregarMas = true;

        while (agregarMas) {
            ComputadorPortatil com = new ComputadorPortatil();

            serial = JOptionPane.showInputDialog("Ingrese el serial del computador portatil");

            // ed = b.Buscar(Registro, cedula);
            // if (ei != null && ei.getNumSemestreActual() > 0) {
            //     System.out.println("el registro ya existe por favor escoja otra opcion");
            //     break;
            // }
            // ei = new EstudianteIngenieria();// Crear un nuevo objeto si no existe un registro duplicado
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
               System.out.println("¿Desea agregar más registros? (1. Sí, 2. No)");
               String opt = cp.readLine(); // Leer la entrada del usuario
   
               if (opt.equals("2")) {
                   agregarMas = false; // Salir del bucle
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

            serial = JOptionPane.showInputDialog("Ingrese el serial de la tableta");

            // ed = b.Buscar(Registro, cedula);
            // if (ei != null && ei.getNumSemestreActual() > 0) {
            //     System.out.println("el registro ya existe por favor escoja otra opcion");
            //     break;
            // }
            // ei = new EstudianteIngenieria();// Crear un nuevo objeto si no existe un registro duplicado
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
               System.out.println("¿Desea agregar más registros? (1. Sí, 2. No)");
               String opt = cp.readLine(); // Leer la entrada del usuario
   
               if (opt.equals("2")) {
                   agregarMas = false; // Salir del bucle
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
                    op.LlenarRegistroComputadorPortatil(Registro);
                    ex.exportarArchivoComputadorPortatil(Registro);
                    im.leerArchivoComputadorPortatil("ComputadorPortatil.txt");
                    JOptionPane.showMessageDialog(null, "Dispositivo agregado correctamente");
                    break;
                case 2:
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
                    op.LlenarRegistroTableta(Registro);
                    ex.exportarArchivoTabletaGrafica(Registro);
                    im.leerArchivoTabletaGrafica("TabletasGraficas");
                    JOptionPane.showMessageDialog(null, "Dispositivo agregado correctamente");
                    break;
                case 2:

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
            System.out.println("Detalles del portátil:\n"
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
            System.out.println("Detalles del portátil:\n"
                    + "Serial: " + ta.getSerial() + "\n"
                    + "Marca: " + ta.getMarca() + "\n"
                    + "Tamaño: " + ta.getTamaño() + "\n"
                    + "Precio: " + ta.getPrecio() + "\n"
                    + "Almacenamiento: " + ta.getAlmacenamiento() + "\n"
                    + "Peso: " + ta.getPeso() + "\n"
                    + "------------------------------------------");
        }
    }

}
