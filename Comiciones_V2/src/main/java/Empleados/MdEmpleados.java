/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author HP
 */
public class MdEmpleados {

    private String nombre;
    private double enero;
    private double febrero;
    private double marzo;
    private double promedio;
    
    public MdEmpleados (String nombre_Empleado, double enero, double febrero, double marzo){
        this.nombre = nombre_Empleado.toString();
        this.enero = enero;
        this.febrero = febrero;
        this.marzo = marzo;
    }

    public MdEmpleados(String linea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String toString(){
        return this.getNombre();
    }
    
    public double toDouble(double enero, double febrero, double marzo){
        if(this.enero == enero){
            return this.getEnero();
        }
        if(this.febrero == febrero){
            return this.getFebrero();
        }
        if(this.marzo == marzo){
            return this.getMarzo();
        }
        return 0.0;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the enero
     */
    public double getEnero() {
        return enero;
    }

    /**
     * @param enero the enero to set
     */
    public void setEnero(double enero) {
        this.enero = enero;
    }

    /**
     * @return the febrero
     */
    public double getFebrero() {
        return febrero;
    }

    /**
     * @param febrero the febrero to set
     */
    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    /**
     * @return the marzo
     */
    public double getMarzo() {
        return marzo;
    }

    /**
     * @param marzo the marzo to set
     */
    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
}
