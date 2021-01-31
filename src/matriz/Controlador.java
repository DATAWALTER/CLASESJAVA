package matriz;

public class Controlador {

    //(01)
    public void crearMatriz5x4NumerosAleatorios0_9() {
        int[][] matriz = new int[5][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //(02)
    public void crearMatriz5x5LetrasMayusculaAleatoriosAlfabetoIngles() {
        char[][] matriz = new char[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (char) (int) (Math.random() * 26 + 65);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //(03)
    public void cuantasVecesRepiteCadaLetraMatriz5x5LetrasMayusculaAleatoriosAlfabetoIngles() {
        char[][] matriz = new char[5][5];
        int[] contador = new int[26];
        for(int c=0; c<26; c++) contador[c] = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (char) (int) (Math.random() * 26 + 65);
                System.out.print(matriz[i][j] + "  ");
                for(int k=0; k<26; k++) {
                    if((char)(k+65) == matriz[i][j]) contador[k]++;
                }
            }
            System.out.println();
        }
        System.out.println("VECES QUE SE REPITE CADA LETRA");
        for(int m=0; m<26; m++) {
            System.out.println((char)(m+65) + " : " + contador[m]);
        }
    }
    
    //(04)
    public void mayorMenorSumaPromedioNumeroMatriz3x2Estatica() {
        int[][] matriz = {{1,5},{8,9},{4,0}};
        int menor = 99999;
        int mayor = -9999;
        int suma = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
                if(matriz[i][j] < menor) menor = matriz[i][j];
                if(matriz[i][j] > mayor) mayor = matriz[i][j];
                suma = suma + matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("Número filas    : " + filas);
        System.out.println("Número columnas : " + columnas);
        System.out.println("Mayor           : " + mayor);
        System.out.println("Menor           : " + menor);
        System.out.println("Suma            : " + suma);
        System.out.println("Promedio        : " + (suma/(double)(filas*columnas)));
    }
    
    //(05)
    public void obtenerAleatoriamenteElementoMatriz5x3Estatica() {
         int[][] matriz = {{1,5,11},{8,9,12},{4,0,14},{13,9,12},{8,21,12}};
         int faleatoria = (int)(Math.random()*5);
         int caleatoria = (int)(Math.random()*3);
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
         }
         System.out.println("Fila Aleatoria     : " + faleatoria);
         System.out.println("Columna Aleatoria  : " + caleatoria);
         System.out.println("Elemento aleatorio : " + matriz[faleatoria][caleatoria]);
         
    }
}
