/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import Empleados.MdEmpleados;
import excepciones.*;
import java.util.List;

/**
 *
 * @author HP
 */
public interface AdministraDatos {
    boolean existe (String nombreArchivo) throws ClsAdministrarExc;
    public List<MdEmpleados> listar (String nombreArchivo) throws ClsLeerExc;
    void escribir(MdEmpleados empleados, MdEmpleados enero, MdEmpleados febrero, MdEmpleados marzo, String nombreArchivo, boolean anexar) throws ClsEscribirExc;
    public String buscar(String nombreArchivo, String buscar) throws ClsLeerExc;
    public void crear(String nombreArchivo) throws ClsAdministrarExc;
    public void borrar(String nombreArchivo) throws ClsAdministrarExc;

}
