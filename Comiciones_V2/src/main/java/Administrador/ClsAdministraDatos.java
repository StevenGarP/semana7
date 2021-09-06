/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import Empleados.MdEmpleados;
import excepciones.ClsAdministrarExc;
import excepciones.ClsEscribirExc;
import excepciones.ClsLeerExc;
import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class ClsAdministraDatos implements AdministraDatos {

    public boolean existe (String nombreArchivo) throws ClsAdministrarExc {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }
    
    public List<MdEmpleados> listar (String nombreArchivo) throws ClsLeerExc {
          List<MdEmpleados> empleados = new ArrayList();
        try {
           BufferedReader entrada = null; 
            File archivo = new File(nombreArchivo);
           
            entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null){
                MdEmpleados empleado = new MdEmpleados(linea);
                empleados.add(empleado);
                linea = entrada.readLine();
            }   
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) { 
            ex.printStackTrace(System.out);
        }
        return empleados;
    }
    
    /**
     *
     * @param empleados
     * @param enero
     * @param febrero
     * @param marzo
     * @param nombreArchivo
     * @param anexar
     * @throws ClsEscribirExc
     */
   
    @Override
    public void escribir(MdEmpleados empleados, MdEmpleados enero, MdEmpleados febrero, MdEmpleados marzo, String nombreArchivo, boolean anexar) throws ClsEscribirExc{
        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(empleados.toString());
            salida.println(enero.toString());
            salida.println(febrero.toString());
            salida.println(marzo.toString());
            //salida.println(empleados.);
            salida.close();
            System.out.println("Se ha escrito el registro en el archivo");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            salida.close();
        }
    }
    
    
    public String buscar(String nombreArchivo,String buscar){
        BufferedReader entrada = null;
        String resultado = null;
        try {
            File archivo = new File(nombreArchivo);
            
            entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            int i=0;
            linea = entrada.readLine();
            while (linea != null){
                if(buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado = "empleado: "+ linea + " encontrado en el indice " + i;
                    break;
                }
                linea = entrada.readLine();
                i++;
            }   entrada.close();
        } catch (FileNotFoundException ex) {
             ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                 ex.printStackTrace(System.out);
            }
        }
        return resultado;
    }

public void crear(String nombreArchivo){
    PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter(new FileWriter(archivo));
            System.out.println("Se ha creado el archivo");
            salida.close();
          } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            salida.close();
        }
}
  
public void borrar(String nombreArchivo) throws ClsAdministrarExc{
    File archivo = new File(nombreArchivo);
    archivo.delete();
    System.out.println("Se ha borrado el archivo");
}

    
}

