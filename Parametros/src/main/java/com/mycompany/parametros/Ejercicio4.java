import java.util.Scanner;
public class Ejercicio4 {
    public static double promedio (double a, double b, double c){
        return (a + b + c)/3;
    }
    
    public static void main(String[]args){
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese las 3 notas: ");
        double a= src.nextDouble();
        double b= src.nextDouble();
        double c= src.nextDouble();
       double resultado= promedio(a,b,c);
        System.out.println("EL promedio de notas es: "+ resultado);
        
    }
}
