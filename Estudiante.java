
import javax.swing.JOptionPane;

public class Estudiante {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String serial;

    public Estudiante() {

    }

    public Estudiante(String cedula, String nombre, String apellido, String telefono, String serial) {
        this.apellido = apellido;
        this.cedula = cedula;
        this.nombre = nombre;
        this.serial = serial;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula.matches("[0-9]{1,10}")  && !cedula.isEmpty()) {
            this.cedula = cedula;
        } else {
            String nuevoValor = JOptionPane.showInputDialog("Ingrese una cedula válida (solo números, hasta 10 digitos)");
            setCedula(nuevoValor);
        }
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.matches("[a-zA-Z]*")  && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {

            String nuevoValor = JOptionPane.showInputDialog("Ingrese un nombre válido (solo letras)");
            setNombre(nuevoValor);
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.matches("[a-zA-z]*")  && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {

            String nuevoValor = JOptionPane.showInputDialog("Ingrese un apellido válido (solo letras)");
            setApellido(nuevoValor);
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.matches("[0-9]{1,10}")  && !telefono.isEmpty()) {
            this.telefono = telefono;
        } else {

            String nuevoValor = JOptionPane.showInputDialog("Ingrese un teléfono válido (solo números, hasta 10 dígitos)");
            setTelefono(nuevoValor);
        }
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        if (serial.matches("[a-zA-Z0-9]{1,10}") && !serial.isEmpty()) {
            this.serial = serial;
        } else {

            String nuevoValor = JOptionPane.showInputDialog("Ingrese un número serial válido (solo números y letras hasta 10 dígitos)");
            setSerial(nuevoValor);
        }

    }

}
