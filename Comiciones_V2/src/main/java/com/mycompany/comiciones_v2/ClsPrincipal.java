/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comiciones_v2;

import Empleados.MdEmpleados;
import java.util.*;
import ReportesComisiones.*;

/**
 *
 * @author Ruldin
 */
    public class ClsPrincipal {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "c:\\tmp\\Comisiones_V2\\Comisiones.txt";
    private static final ReporteDatos reporte = new ClsReporteDatos();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mientras la opcion elegida sea 0, preguntamos al usuario
        while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n1.- Iniciar Nomina de empleados"
                        + "\n2.- Agregar Empleados y comisiones\n"
                        + "3.- Listar Empleados\n"
                        + "4.- Buscar Empleados\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        reporte.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        System.out.println("Introduce el nombre de un empleado a agregar: ");
                        String nombre = scanner.nextLine();
                        System.out.println("Introduce la cantidad de enero: ");
                        double enero = scanner.nextInt();
                        System.out.println("Introduce la cantidad de febrero: ");
                        double febrero = scanner.nextInt();
                        System.out.println("Introduce la cantidad de marzo: ");
                        double marzo = scanner.nextInt();
                        MdEmpleados empleado = new MdEmpleados(nombre, enero, febrero, marzo);
                        reporte.agregar(empleado, nombreArchivo);
                        break;
                    case 3:
                        reporte.ListaEmpleado(nombreArchivo);
                        break;
                    case 4:
                        System.out.println("Introduce el nombre de un empleado a buscar:");
                        String buscar = scanner.nextLine();
                        reporte.Buscar(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }

    }
}
