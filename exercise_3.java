/**
 *
 * @author naathch
 */
import java.util.Scanner;
public class exercise_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int m = sc.nextInt();
        
        int[][] matriz = new int[m][m];
        int suma = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                
                if (i == j) {
                    suma += matriz[i][j];
                }
            }
        }
        
        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("La suma de la diagonal principal es: " + suma);
    }
}
