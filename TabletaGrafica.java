
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
        this.almacenamiento = almacenamiento;
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

    

    public String elegirAlmacenamiento() {

        byte opt = 0;
        try{
        while (opt < 1 || opt > 3) {
            
            opt = Byte.parseByte(JOptionPane.showInputDialog("\n\n--- Seleccione una opción ---\n" + "1. 256 GB\n" + "2. 512 GB\n" + "3. 1 TB"));

            switch (opt) {
                case 1:
                    setAlmacenamiento("256 GB");
                    break;
                case 2:
                    setAlmacenamiento("512 GB");
                    break;
                case 3:
                    setAlmacenamiento("1 TB");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " Opción no válida. Por favor seleccione 1, 2 o 3");
                    ;
                    break;
            }

        }

    }catch(NumberFormatException e){

        JOptionPane.showMessageDialog(null, "--- Ingrese una opción válida ---");
        elegirAlmacenamiento();
    }
    
    return almacenamiento;
    }


}
