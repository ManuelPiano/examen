
package calcular.salario;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class ejercicio1 {
    String nombre, apellido;
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("$#,###.##");
        
        ejercicio1 est = new ejercicio1();
        est.nombre = "Manuel";
        est.apellido = "Alvarado";
        
        double horastrabajadas, pagoporhora, horasdobles, horastriples, renta, salariobr, salarioliq;
        System.out.println("horas trabajadas:");
        horastrabajadas = leer.nextDouble();
        System.out.println("pago por hora:");
        pagoporhora = leer.nextDouble();
        horasdobles=horastrabajadas-40;
        horastriples=horastrabajadas-48;
        salariobr=0;
        
        if (horastrabajadas<=40){
            salariobr=horastrabajadas*pagoporhora;
        }
        else if (horastrabajadas >=40 && horastrabajadas <=48){
            double he2 = horastrabajadas-40;
            salariobr=(40*pagoporhora)+(he2*pagoporhora*2);
        }else if (horastrabajadas>=48){
            double he3 = horastrabajadas-48;
            salariobr = (40*pagoporhora)+(8*pagoporhora*2)+(he3*pagoporhora*3);
        }else{
        }
        renta=salariobr*0.1;
        System.out.println("nombre de empleado: " + est.nombre);
        System.out.println("apellido de empleado: " + est.apellido);
        System.out.println("salario bruto: " + formato.format(salariobr));
        System.out.println("salario liquido: " + formato.format(salariobr-renta));
        System.out.println("retencion aplicada: " + formato.format(renta));
    }
}
