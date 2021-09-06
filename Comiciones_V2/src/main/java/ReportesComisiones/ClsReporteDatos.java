/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportesComisiones;

import Administrador.*;
import Empleados.MdEmpleados;
import excepciones.*;
import java.util.List;

/**
 *
 * @author HP
 */
public class ClsReporteDatos implements ReporteDatos {
    
    private final AdministraDatos datos;

    public ClsReporteDatos(){
        this.datos = new ClsAdministraDatos();
    }
        
    public void agregar(MdEmpleados nombrempleado, MdEmpleados enero, MdEmpleados febrero, MdEmpleados marzo, String nombreArchivo) {
        boolean anexar = false;
        try {
            anexar = datos.existe(nombreArchivo);//bandera si anexa o no
                datos.escribir(nombrempleado, enero, febrero, marzo, nombreArchivo, anexar);
        } catch (ClsAdministrarExc ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void ListaEmpleado(String nombreArchivo) {
        try {
            List<MdEmpleados> empleado = datos.listar(nombreArchivo);
            for(MdEmpleados empleados : empleado){
                System.out.println("Empleado: "+ empleados);
            }
        } catch (ClsLeerExc ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
        
    }

    @Override
    public void Buscar(String nombreArchivo, String buscar) {
                String resultado = null;
        try {
           
            resultado = datos.buscar(nombreArchivo, buscar);
        } catch (ClsLeerExc ex) {
            System.out.println("Error al buscar la peli");
            ex.printStackTrace();
        }
         System.out.println("Resultado Busqueda:"+resultado);
    
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
                
        try {
            if(datos.existe(nombreArchivo)){
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                //crearmos archivo
                datos.crear(nombreArchivo);
                
            }
        } catch (ClsAdministrarExc ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }

    }

    @Override
    public void agregar(MdEmpleados nombrempleado, String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
