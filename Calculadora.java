/*
*Descripción del programa:
*La clase calculadora"
*/
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){

        Scanner escaner = new Scanner(System.in);
    
        //Declaración de variable 
        System.out.println("Hola, regalame tu nombre ");
        String mensaje = escaner.nextLine();
        System.out.println("Buenos dias " + mensaje);
        System.out.println("Ingrese su primer numero:");
        double numero1 = escaner.nextDouble();
        escaner.nextLine();

        System.out.println("Ingrese su segundo numero:");
        double numero2 = escaner.nextDouble();
        escaner.nextLine();
        //System.out.println("Ingresaste: "+numero1);

        double suma, resta, multiplicacion, modulo, division;
        suma = sumar (numero1, numero2); //Invocar un metodo
        resta = restar (numero1, numero2);
        multiplicacion = multiplicar (numero1, numero2);
        division = dividir (numero1, numero2);
        modulo = modular (numero1, numero2);
        
      
        System.out.println("La suma de los numeros es: "+ suma);
        System.out.println("La resta de los numeros es: "+ resta);
        System.out.println("La multiplicacion de los numeros es: "+ multiplicacion);
        System.out.println("El resultado del modulo es: "+ modulo);
        System.out.println("La division de los numeros es: "+ division);
    }
    //Declarar un metodo
    public static double sumar(double a, double b) {
        return a + b;

    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar (double a, double b) {
        return a * b;
    }
    public static double dividir (double a, double b) {
        return a / b;
    }
    public static double modular (double a, double b) {
        return a % b;
    }
}

/*suma = numero1 + numero2; 
resta = numero1 - numero2;
multiplicacion = numero1 * numero2;
modulo = numero1 % numero2;
division = numero1 / numero2;
*/