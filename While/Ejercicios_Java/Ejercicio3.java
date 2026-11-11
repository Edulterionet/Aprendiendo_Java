import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[]args){
        Scanner src = new Scanner (System.in);
        String contrase= "java123";
         String contra;    
        System.out.println("----BIENVENIDO---");
       do{
           
           System.out.println("Ingrese la contraseña: ");
           contra= src.nextLine();
           System.out.println("Error ingrese la contraseña correcta");
       }while(!contra.equals(contrase));
       
       System.out.println("----BIENVENIDO CONTRASEÑA CORRECTA---");
    }
    
     
}
