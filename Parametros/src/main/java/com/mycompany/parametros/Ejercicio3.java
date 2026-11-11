import java.util.Scanner;

public class Ejercicio3 {

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = src.nextInt();

        if (esPar(numero)) {
            System.out.println("El número es Par");
        } else {
            System.out.println("El número es Impar");
        }
    }
}