/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

/**
 *
 * @author manuelpiano31
 */
public class Empleado extends Edificio {
   String nombre, direccion, cargo;
   int edad, sueldobase, DD, MM, YYYY;
   long codigo;
   double calculo;

    public Empleado() {
    }

    public Empleado(String nombre, String direccion, String cargo, int edad, int sueldobase, int DD, int MM, int YYYY, long codigo, double calculo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cargo = cargo;
        this.edad = edad;
        this.sueldobase = sueldobase;
        this.DD = DD;
        this.MM = MM;
        this.YYYY = YYYY;
        this.codigo = codigo;
        this.calculo = calculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(int sueldobase) {
        this.sueldobase = sueldobase;
    }

    public int getDD() {
        return DD;
    }

    public void setDD(int DD) {
        this.DD = DD;
    }

    public int getMM() {
        return MM;
    }

    public void setMM(int MM) {
        this.MM = MM;
    }

    public int getYYYY() {
        return YYYY;
    }

    public void setYYYY(int YYYY) {
        this.YYYY = YYYY;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
   
   String datosEmp(Empleado A){
       String info = "";
       info += "El nombre del empleado es: " + nombre +"\n";
       info += "El codigo del empleado es: " + codigo + "\n";
       info += "La edad del empleado es: " + edad + "\n";
       info += "La direccion del empleado es: " + direccion + "\n";
       info += "Cargo: " + cargo + "\n";
       info += "Sueldo base: " + sueldobase + "\n";
       info += "La fecha de ingreso del empleado: " + DD+ "/" + MM + "/" + YYYY + "\n";
       info += "El salario liquido es: " + A.calcularSalario(A);
       return info;
       
       
   }
   
   double calcularSalario(Empleado A){
       double isss, afp, renta, salario;
       if (this.calculo == 1){
           isss = (sueldobase * 0.075);
           afp = (sueldobase * 0.15);
           renta = (sueldobase* 0.10);
           salario = (sueldobase - (isss-afp-renta));
           return salario;
       }else if (this.calculo == 2){
           renta = (sueldobase * 0.10);
           salario = (sueldobase - renta);
           return salario;
       }
       return this.calculo;
   }
   double tipoempleado(){
       double empleadoT = this.calculo;
       if (empleadoT == 1){
           System.out.println("El empleo es permanente");
           return empleadoT;
       }else{
           System.out.println("El empleado es de servicio");
       }
       return empleadoT;//
   }
    }
   
    
    
