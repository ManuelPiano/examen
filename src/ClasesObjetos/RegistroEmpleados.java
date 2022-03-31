/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

import java.util.Scanner;

/**
 *
 * @author manuelpiano31
 */
public class RegistroEmpleados {
    public static void main(String[] args) {
       String datosPersonales;
       Empleado Datos = new Empleado();
       double tpempleado;
       String ubicaciones;
       Scanner leer = new Scanner(System.in);
       
       
        System.out.println("Escriba el nombre: ");
        Datos.setNombre(leer.nextLine());
        System.out.println("Escriba el codigo: ");
        Datos.setCodigo(Integer.parseInt(leer.nextLine()));
        System.out.println("Escriba la Edad: ");
        Datos.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.println("Escriba la direccion: ");
        Datos.setDireccion(leer.nextLine());
        System.out.println("Escriba el cargo: ");
        Datos.setCargo(leer.nextLine());
        System.out.println("Sueldo base: ");
        Datos.setSueldobase(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese el dia: ");
        Datos.setDD(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese el mes: ");
        Datos.setMM(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese el año: ");
        Datos.setYYYY(Integer.parseInt(leer.nextLine()));
        System.out.println("Que tipo de empleado es? 1:administrativo 2: Servicio" );
        Datos.setCalculo(Double.parseDouble(leer.nextLine()));
        
        datosPersonales = Datos.datosEmp(Datos);
        
        System.out.println(datosPersonales);
        tpempleado = Datos.tipoempleado();
        System.out.println(tpempleado);
        System.out.println("----------------------------------------");
        
        ubicaciones = Datos.datosEdificio();
        System.out.println(ubicaciones);
    }
}
