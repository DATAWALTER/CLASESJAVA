package matriz;

import java.util.Scanner;

public class Main {
    
    private static Controlador controlador = new Controlador();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, sER = "[0-9]+";
        int opcion;
        do {
            do {
                MetodoMenu.cls();
                MetodoMenu.menu();
                s = sc.next();
            } while (!(s.matches(sER) && Integer.parseInt(s) >= 0 && Integer.parseInt(s) < 21));
            opcion = Integer.parseInt(s);

            switch (opcion) {
                case 1:
                    MetodoMenu.cls();
                    opcion01();
                    MetodoMenu.pause();
                    break;
                case 2:
                    MetodoMenu.cls();
                    opcion02();
                    MetodoMenu.pause();
                    break;
                case 3:
                    MetodoMenu.cls();
                    opcion03();
                    MetodoMenu.pause();
                    break;
                case 4:
                    MetodoMenu.cls();
                    opcion04();
                    MetodoMenu.pause();
                    break;
                case 5:
                    MetodoMenu.cls();
                    opcion05();
                    MetodoMenu.pause();
                    break;
                case 6:
                    MetodoMenu.cls();
                    opcion06();
                    MetodoMenu.pause();
                    break;
                case 7:
                    MetodoMenu.cls();
                    opcion07();
                    MetodoMenu.pause();
                    break;
                case 8:
                    MetodoMenu.cls();
                    opcion08();
                    MetodoMenu.pause();
                    break;
                case 9:
                    MetodoMenu.cls();
                    opcion09();
                    MetodoMenu.pause();
                    break;
                case 10:
                    MetodoMenu.cls();
                    opcion10();
                    MetodoMenu.pause();
                    break;
                case 11:
                    MetodoMenu.cls();
                    opcion11();
                    MetodoMenu.pause();
                    break;
                case 12:
                    MetodoMenu.cls();
                    opcion12();
                    MetodoMenu.pause();
                    break;
                case 13:
                    MetodoMenu.cls();
                    opcion13();
                    MetodoMenu.pause();
                    break;
                case 14:
                    MetodoMenu.cls();
                    opcion14();
                    MetodoMenu.pause();
                    break;
                case 15:
                    MetodoMenu.cls();
                    opcion15();
                    MetodoMenu.pause();
                    break;
                case 16:
                    MetodoMenu.cls();
                    opcion16();
                    MetodoMenu.pause();
                    break;
                case 17:
                    MetodoMenu.cls();
                    opcion17();
                    MetodoMenu.pause();
                    break;
                case 18:
                    MetodoMenu.cls();
                    opcion18();
                    MetodoMenu.pause();
                    break;
                case 19:
                    MetodoMenu.cls();
                    opcion19();
                    MetodoMenu.pause();
                    break;
                case 20:
                    MetodoMenu.cls();
                    opcion20();
                    MetodoMenu.pause();
                    break;
                case 0:
                    MetodoMenu.cls();
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static void opcion01() {
        System.out.print("\nOPCION 01: CREAR UNA MATRIZ 5X4 CON NÚMEROS ALEATORIOS ENTEROS EN EL RANGO [0,9] INCLUIDO LOS EXTREMOS");
        System.out.print("\n======================================================================================================\n");
        controlador.crearMatriz5x4NumerosAleatorios0_9();
    }

    public static void opcion02() {
        System.out.print("\nOPCION 02: CREAR UNA MATRIZ 5X5 CON LETRAS ALEATORIAS EN MAYUSCULA DEL ALFABETO INGLES");
        System.out.print("\n======================================================================================\n");
        controlador.crearMatriz5x5LetrasMayusculaAleatoriosAlfabetoIngles();
    }

    public static void opcion03() {
        System.out.print("\nOPCION 03: CONTAR CUANTAS VECES SE REPITE CADA LETRA DEL PROGLEMA 2");
        System.out.print("\n===================================================================\n");
        controlador.cuantasVecesRepiteCadaLetraMatriz5x5LetrasMayusculaAleatoriosAlfabetoIngles();
    }

    public static void opcion04() {
        System.out.print("\nOPCION 04: HALLAR EL MAYOR, MENOR, SUMA Y EL PROMEDIO DE UNA MATRIZ DE NUMEROS Y ENTEROS");
        System.out.print("\n========================================================================================\n");
        controlador.mayorMenorSumaPromedioNumeroMatriz3x2Estatica();
    }

    public static void opcion05() {
        System.out.print("\nOPCION 05: OBTENER UN ELEMENTO DE UNA MATRIZ DE MANERA ALEATORIA SINDO LA MATRIZ 5X3 DE NÚMEROS ENTEROS ESTÁTICA");
        System.out.print("\n================================================================================================================\n");
        controlador.obtenerAleatoriamenteElementoMatriz5x3Estatica();
    }

    public static void opcion06() {
        System.out.print("\nOPCION 06");
        System.out.print("\n=========");
    }

    public static void opcion07() {
        System.out.print("\nOPCION 07");
        System.out.print("\n=========");
    }

    public static void opcion08() {
        System.out.print("\nOPCION 08");
        System.out.print("\n=========");
    }

    public static void opcion09() {
        System.out.print("\nOPCION 09");
        System.out.print("\n=========");
    }

    public static void opcion10() {
        System.out.print("\nOPCION 10");
        System.out.print("\n=========");
    }

    public static void opcion11() {
        System.out.print("\nOPCION 11");
        System.out.print("\n=========");
    }

    public static void opcion12() {
        System.out.print("\nOPCION 12");
        System.out.print("\n=========");
    }

    public static void opcion13() {
        System.out.print("\nOPCION 13");
        System.out.print("\n=========");
    }

    public static void opcion14() {
        System.out.print("\nOPCION 14");
        System.out.print("\n=========");
    }

    public static void opcion15() {
        System.out.print("\nOPCION 15");
        System.out.print("\n=========");
    }

    public static void opcion16() {
        System.out.print("\nOPCION 16");
        System.out.print("\n=========");
    }

    public static void opcion17() {
        System.out.print("\nOPCION 17");
        System.out.print("\n=========");
    }

    public static void opcion18() {
        System.out.print("\nOPCION 18");
        System.out.print("\n=========");
    }

    public static void opcion19() {
        System.out.print("\nOPCION 19");
        System.out.print("\n=========");
    }

    public static void opcion20() {
        System.out.print("\nOPCION 20");
        System.out.print("\n=========");
    }

}
