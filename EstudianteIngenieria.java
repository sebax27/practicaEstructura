
import javax.swing.JOptionPane;





public class EstudianteIngenieria extends Estudiante {
    
    
    private int numSemestreActual;
    private float promedioAcumulado;
   

    public EstudianteIngenieria() {
    }


    public EstudianteIngenieria( String cedula, String nombre, String apellido, String telefono,int numSemestreActual, float promedioAcumulado, String serial) {
        super(cedula, nombre, apellido, telefono, serial);
        this.numSemestreActual = numSemestreActual;
        this.promedioAcumulado = promedioAcumulado;
    }


    public int getNumSemestreActual() {
        return numSemestreActual;
    }

    public void setNumSemestreActual(int numSemestreActual) {
        try{
        if(String.valueOf(numSemestreActual).matches("[0-9]{1,2}") && numSemestreActual >= 1 && numSemestreActual <= 15 && !String.valueOf(numSemestreActual).isEmpty()){
        this.numSemestreActual = numSemestreActual;
        }else{
            String nuevoValor = JOptionPane.showInputDialog("Ingrese un número de semestre válido (solo números, entre 1 y 15)");
            setNumSemestreActual(Integer.parseInt(nuevoValor));
        }
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "No se admiten letras ni carácteres especiales");
        String nuevoValor = JOptionPane.showInputDialog("Ingrese un número de semestre válido (solo números entre 1 y 15):");
        setNumSemestreActual(Integer.parseInt(nuevoValor));
    }
    }

    public float getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(float promedioAcumulado) {
        try {
            // Verificar que el promedio está entre 0.0 y 5.0
            if (promedioAcumulado >= 0.0 && promedioAcumulado <= 5.0) {
                this.promedioAcumulado = promedioAcumulado;
            } else {
                // Solicitar un nuevo valor si está fuera del rango
                String nuevoValor = JOptionPane.showInputDialog("Ingrese un promedio válido (solo números entre 0.0 y 5.0)");
                setPromedioAcumulado(Float.parseFloat(nuevoValor)); 
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se admiten letras ni caracteres especiales.");
            String nuevoValor = JOptionPane.showInputDialog("Ingrese un promedio válido (solo números entre 0.0 y 5.0)");
            setPromedioAcumulado(Float.parseFloat(nuevoValor)); 
        }
    }
    
    }


    
  

    
    



