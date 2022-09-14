package ejercicios;
import java.util.Scanner;
import ejercicios.utils.EjercicioCinco;

public class Ej1{
    public static void main(String[] args) {
        // primero();
        // segundo();
        // tercero();
        // cuarto();
        // quinto();
        // sexta();
        // septimo();
    }

    public static void primero() {
        //1
        // Decalara e inicializa dos variables. Uno de tipo cadena de texto para un nombre y otra
        // de tipo entero para una edad. 
        // Crea una salida por consola con el texto "Los datos del empleado son " concatenado con el valor de dichas variables
        String nombre = "Juan";
        byte edad = 25;
        System.out.println("Los datos del empleado son nombre (" +nombre+ ") y edad (" +edad+ ")");
    }

    public static void segundo() {
        // 2
        // Crea una etructura condicional que evalúe si una edad introducida 
        // por consola es mayor o igual a 18, si es así, imprimir por la consola: 
        // "Eres  mayor de edad" caso contrario imprimir "eres menor de edad".
        Scanner scanner = new Scanner(System.in);
        byte inputEdad = (byte)scanner.nextInt();
        if(inputEdad >= 18)
            System.out.println("Eres  mayor de edad");
        else
            System.out.println("Eres menor de edad");
        scanner.close();
    }

    public static void tercero() {
        // 3
        // Crea un programa en java que pida dos datos por la consola al usuario:
        // nombre e email. Imprime el valor de estás variables por consola.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu email:");
        String email = scanner.nextLine();
        System.out.println("Los datos del usuario son:");
        System.out.println("Nombre: "+nombre);
        System.out.println("Email: "+email);
        scanner.close();
    }
    
    public static void cuarto() {
        // 4
        // Crea un programa en java que pida introducir un número por consola.
        // El programa pedirá siempre un número mientras que éste no sea el 5 y cuando así
        // sea imprimir "Fin del programa" terminando asi dicho programa
        Scanner scanner = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Introduce un número:");
            numero = scanner.nextInt();
        }while(numero != 5);
        System.out.println("Fin del programa");
        scanner.close();
    }

    public static void quinto() {
        // 5
        // Crea un programa que pida un número por consola entre el 1 y el 50.
        // Si el número está fuera de este rango imprimir "El número no es válido"
        // y seguir pidiendo números hasta que el número esté en ese rango. 
        // Si el número es válido crea la lógica para verificar si dicho número es par o impar.
        // Si es par imprimir por consola "Número par" y, si es impar, "Número impar".
        // La lógica para averiguar si el número es par o impar debe de estar fuera del archivo
        // que contiene el método main en una carpeta llamada "utils" y en una clase llamada 
        // EjercicioCinco Además esta lógica debe estar ejecutada a través de un método.
        boolean rango = false;
        int numero;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Introduce un número entre el 1 y el 50:");
            numero = scanner.nextInt();
            if(numero < 1 || numero > 50)
                System.out.println("El número no es válido");
            else{
                rango = true;
                if(EjercicioCinco.esPar(numero))
                    System.out.println("Número par");
                else
                    System.out.println("Número impar");
            }
        }while(numero < 1 || numero >50);
        scanner.close();
    }

    public static void sexta() {
        // 6
        // Crea un array de 5 elementos cuyos valores sean nombres de personas.
        // Imprime los elementos del array a través de un bucle for
        String[] nombres = {"Jeremy", "Agustin", "Edu", "Pedro", "Juan"};
        for(byte i = 0; i < nombres.length; i++)
            System.out.println(nombres[i]);
    }

    public static void septimo() {
        // 7
        // Repite el ejercicio anterior pero realiza la iteración e impresión de
        // los elementos del array a través de un bucel for mejorado.
        String[] nombres = {"Jeremy", "Agustin", "Edu", "Pedro", "Juan"};
        for(String n : nombres)
            System.out.println(n);
    }
}
