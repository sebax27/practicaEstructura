
import javax.swing.JOptionPane;

public class TabletaGrafica extends Dispositivo {

    private String almacenamiento;
    private float peso;

    public TabletaGrafica() {

    }

    public TabletaGrafica(String serial, String marca, float tamaño, float precio, String almacenamiento, float peso) {
        super(serial, marca, tamaño, precio);
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = elegirAlmacenamiento()            ;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        try {

            if (peso >= 0.1 && peso <= 5 && !!String.valueOf(peso).isEmpty()) {
                this.peso = peso;
            } else {

                String nuevoValor = JOptionPane.showInputDialog("Ingrese un peso válido (en kilogramos, entre 0.1 y 5):");
                setPeso(Float.parseFloat(nuevoValor));  
            }
        } catch (NumberFormatException e) {
            
            String nuevoValor = JOptionPane.showInputDialog("Ingrese un peso válido (en kilogramos, entre 0.1 y 5):");
            setPeso(Float.parseFloat(nuevoValor));
        }
    }

    

    
private String elegirAlmacenamiento() {
    byte opt ;
    boolean entradaValida = false;

    while (!entradaValida) {
        try {
            opt = Byte.parseByte(JOptionPane.showInputDialog("\n\n--- Seleccione una opción ---\n" 
                + "1. 256 GB\n" 
                + "2. 512 GB\n" 
                + "3. 1 TB"));

            switch (opt) {
                case 1:
                    almacenamiento = "256 GB";
                    entradaValida = true;
                    break;
                case 2:
                    almacenamiento = "512 GB";
                    entradaValida = true;
                    break;
                case 3:
                    almacenamiento = "1 TB";
                    entradaValida = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor seleccione 1, 2 o 3");
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "--- Ingrese una opción válida ---");
        }
    }

    return almacenamiento;
}


}
