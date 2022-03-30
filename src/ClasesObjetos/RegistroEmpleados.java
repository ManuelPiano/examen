/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author manuelpiano31
 */
public class RegistroEmpleados {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        BufferedReader leer =new BufferedReader (new InputStreamReader(System.in));
        try{
            //valores
            System.out.println("Codigo:");
            long codigo = Long.parseLong(leer.readLine());
            System.out.println("Nombre del empleado: ");
            String nombre = leer.readLine();
            System.out.println("Apellidos:");
            String apellido = leer.readLine();
            
            
            emp.setcodigoEmpleado(codigo);
            emp.setnombreEmpleado(nombre);
            emp.setApellidosEmpleado(apellido);
            
            System.out.println("---Recuperando Valores---");
            System.out.println("Codigo empleado: " +emp.getCodigo());
            System.out.println("Nombres: " + emp.getNombre());
            System.out.println("Apellidos" + emp.getApellido());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
