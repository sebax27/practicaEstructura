
import javax.swing.JOptionPane;

public class ComputadorPortatil extends Dispositivo {

    private String sistemaOperativo;
    private String procesador;

    public ComputadorPortatil() {

    }

    public ComputadorPortatil(String serial, String marca, float tamaño, float precio, String sistemaOperativo, String procesador) {
        super(serial, marca, tamaño, precio);
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = elegirSistemaOperativo();
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = elegirProcesador();
    }

    private String elegirSistemaOperativo() {

        byte opt = 0;
        try {
            while (opt < 1 || opt > 3) {
                opt = Byte.parseByte(JOptionPane.showInputDialog("\n\n--- Seleccione una opción ---\n" 
                + "1. Windows 7\n" 
                + "2. Windows 10\n" 
                + "3. Windows 11"));

                switch (opt) {
                    case 1:
                        setSistemaOperativo("Windows 7");
                        break;
                    case 2:
                        setSistemaOperativo("Windows 10");
                        break;
                    case 3:
                        setSistemaOperativo("Windows 11");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor seleccione 1, 2 o 3");
                        break;
                }

            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Ingrese una opción válida");
        }
        return sistemaOperativo;
    }

    private String elegirProcesador() {

        byte opt = 0;
        try {
            while (opt < 1 || opt > 2) {
                opt = Byte.parseByte(JOptionPane.showInputDialog("\n\n--- Seleccione una opción ---\n" 
                + "1. AMD Ryzen.\n"
                 + "2. Intel® Core™ i5. \n"));

                switch (opt) {
                    case 1:
                        setProcesador("AMD Ryzen");
                        break;
                    case 2:
                        setProcesador("Intel® Core™ i5");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor seleccione 1, 2 o 3");
                        break;
                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opción válida");
        }
        return procesador;
    }

}
