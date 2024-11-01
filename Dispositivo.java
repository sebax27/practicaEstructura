
import javax.swing.JOptionPane;

public class Dispositivo {

    private String serial;
    private String marca;
    private float tamaño;
    private float precio;

    public Dispositivo() {

    }

    public Dispositivo(String serial, String marca, float tamaño, float precio) {
        this.marca = marca;
        this.precio = precio;
        this.serial = serial;
        this.tamaño = tamaño;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        if (serial.matches("[a-zA-Z0-9]{1,10}") && !serial.isEmpty()) {
            this.serial = serial;
        } else {

            String nuevoValor = JOptionPane.showInputDialog("Ingrese un serial válido (solo números y letras, hasta 10 dígitos)");
            setSerial(nuevoValor);

        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.matches("[a-zA-Z]") && !marca.isEmpty()) {
            this.marca = marca;
        } else {

            String nuevoValor = JOptionPane.showInputDialog("Ingrese una marca válida (solo letras)");
            setMarca(nuevoValor);
        }
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        try {
            if (tamaño >= 7 && tamaño <= 20 && !String.valueOf(tamaño).isEmpty()) {
                this.tamaño = tamaño;
            } else {

                String nuevoValor = JOptionPane.showInputDialog("Ingrese un tamaño válido (solo números entre 7 y 20 pulgadas)");
                setTamaño(Float.parseFloat(nuevoValor));
            }
        } catch (NumberFormatException e) {

            String nuevoValor = JOptionPane.showInputDialog("Ingrese un tamaño válido (solo números entre 7 y 20 pulgadas):");
            setTamaño(Integer.parseInt(nuevoValor));
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        try {
            if (precio >= 1200000 && precio <= 8000000 && ! !String.valueOf(precio).isEmpty()) {
                this.precio = precio;
            } else {

                String nuevoValor = JOptionPane.showInputDialog("Ingrese un precio válido (solo números entre 1.200.000 y 8.000.000)");
                setPrecio(Float.parseFloat(nuevoValor));
            }
        } catch (NumberFormatException e) {

            String nuevoValor = JOptionPane.showInputDialog("Ingrese un precio válido (solo números entre 1.200.000 y 8.000.000)");
            setPrecio(Integer.parseInt(nuevoValor));
        }
    }

}
