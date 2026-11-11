import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args){
        Scanner src= new Scanner(System.in);
        int opciones;
        
        do{ 
        System.out.println("--BIENVENIDO--");
        System.out.println("Elija una las opciones del 1 al 3 ");
        System.out.println("1. Saludar");
        System.out.println("2. Fecha de hoy");
        System.out.println("3.Salir");
        opciones = src.nextInt();
        
        switch(opciones){
            case 1:
                System.out.println("Saludar");
                break;
            case 2:
                System.out.println("11 de Noviembre del 2026");
                break;
            case 3:
                System.out.println("Hasta la proxima");
                break;
                
            default: System.out.println("Opcion no valida");
        }
        
        }while( opciones != 3);
        
        
       
    }
}
