/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportesComisiones;

import Empleados.MdEmpleados;

/**
 *
 * @author HP
 */
public interface ReporteDatos {
    public void agregar(MdEmpleados nombrempleado, String nombreArchivo);
    public void ListaEmpleado(String nombreArchivo);
    public void Buscar(String nombreArchivo, String buscar);
    public void iniciarArchivo(String nombreArchivo);
    
}
