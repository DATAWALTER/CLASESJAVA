package matriz;

import java.io.*;

public class MetodoMenu {

    public static void menu() {
        System.out.println("MENU");
        System.out.println("====");
        System.out.print("\n(01) Crear una matriz 5x4 con números aleatorios enteros en el rango [0,9] incluido los extremos");
        System.out.print("\n(02) Crear una matriz 5x5 con letras aleatorias en mayuscula del alfabeto ingles");
        System.out.print("\n(03) Contar cuantas veces se repite cada letra del problema 2");
        System.out.print("\n(04) Hallar el mayor, menor, suma y el promedio de una matriz de numeros enteros estático");
        System.out.print("\n(05) Obtener un elemento de una matriz de manera aleatoria sindo la matriz 5x3 de números enteros estático");
        System.out.print("\n(06) XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.print("\n(07) XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.print("\n(08) XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.print("\n(09) XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.print("\n(10) XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.print("\nOpcion 11");
        System.out.print("\nOpcion 12");
        System.out.print("\nOpcion 13");
        System.out.print("\nOpcion 14");
        System.out.print("\nOpcion 15");
        System.out.print("\nOpcion 16");
        System.out.print("\nOpcion 17");
        System.out.print("\nOpcion 18");
        System.out.print("\nOpcion 19");
        System.out.print("\nOpcion 20");
        System.out.print("\nSalir 0\n\n");
        System.out.print("Introduzca su opcion? ");
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }
}
