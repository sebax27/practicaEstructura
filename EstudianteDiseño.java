
import javax.swing.JOptionPane;

public class EstudianteDiseño extends Estudiante {

    private String modalidad;
    private int asignaturas;

    public EstudianteDiseño() {

    }

    public EstudianteDiseño(String cedula, String nombre, String apellido, String telefono, String modalidad, int asignaturas, String serial) {
        super(cedula, nombre, apellido, telefono, serial);
        this.asignaturas = asignaturas;
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        if (modalidad.equalsIgnoreCase("virtual") || modalidad.equalsIgnoreCase("presencial") && !modalidad.isEmpty()) {
            this.modalidad = modalidad;
        } else {
            JOptionPane.showMessageDialog(null, "Modalidad no válida debe ser presencial o virtual");
            String nuevoValor = JOptionPane.showInputDialog("Ingrese una modalidad válida(presencial o virtual)");
            setModalidad(nuevoValor);
        }
    }

    public int getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(int asignaturas) {
        try {
            if (String.valueOf(asignaturas).matches("[0-9]") && asignaturas >= 1 && asignaturas <= 12 && !String.valueOf(asignaturas).isEmpty()) {
                this.asignaturas = asignaturas;
            } else {
                String nuevoValor = JOptionPane.showInputDialog("Ingrese una modalidad válida (solo números entre 1 y 12):");
                setAsignaturas(Integer.parseInt(nuevoValor));
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "No se admiten letras ni carácteres especiales");
            String nuevoValor = JOptionPane.showInputDialog("Ingrese una modalidad válida (solo números entre 1 y 12):");
            setAsignaturas(Integer.parseInt(nuevoValor));
        }
    }

}
