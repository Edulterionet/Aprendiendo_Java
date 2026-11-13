import java.util.Scanner;
public class Ejercicio2 {
    
    public static double IMC(double peso , double altura){
        double formula= peso / (altura * altura);
        return formula;
    }
    
    
    public static void main (String[]args){
        Scanner src = new Scanner(System.in);
        System.out.println("--Bienvenido--");
        System.out.println("Ingrese el peso en Kg");
        double peso= src.nextDouble();
        while(peso<0){
            System.out.println("ERROR");
            System.out.println("Coloque un pesos valido");
            peso= src.nextDouble();
        }
        
        System.out.println("Ingrese la altura en Mt");
        double altura = src.nextDouble();
          while(altura<0){
            System.out.println("ERROR");
            System.out.println("Coloque una altura valida");
            altura = src.nextDouble();
        }
        
         double calculo = IMC(peso, altura) ;
          
        System.out.println("Su IMC es: " + calculo); 
        
    }
    
}
