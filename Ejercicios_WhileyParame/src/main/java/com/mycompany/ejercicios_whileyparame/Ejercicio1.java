import java.util.Scanner;
public class Ejercicio1 {
    
    public static double Pago_Empleados(double ht, double ph){
        double resultado= ht * ph ;
        return resultado;
    }
    
    
    
    
    
    public static void main (String[]args){
        Scanner src = new Scanner(System.in);
        System.out.println("--BIENVENIDO--");
        System.out.println("Cuantas horas trabajo esta semana?");
        double Horas_Trabajadas= src.nextDouble();
        while(Horas_Trabajadas<0){
            System.out.println("Error , Ingrese un numero positivo: ");
            Horas_Trabajadas= src.nextDouble();
    }
        
        System.out.println("Cuanto le pagan por hora?");
        double Pago_Hora = src.nextDouble();
        while(Pago_Hora<0){
            System.out.println("Error , Ingrese un numero positivo: ");
            Pago_Hora= src.nextDouble();
    }
        
        double Pago_Final= Pago_Empleados(Horas_Trabajadas, Pago_Hora);
        System.out.println("El pago que le corresponde esta semana es: " + Pago_Final);
        
        
    }
    
}
