/**
 *
 * @author naathch
 */
import java.util.Arrays;
public class Ejercicio17 {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[] B = {5, 6, 7, 8};
        int[] C = new int[A.length + B.length];
        
        System.arraycopy(A, 0, C, 0, A.length);
        System.arraycopy(B, 0, C, A.length, B.length);
        
        System.out.println("Vector A: " + Arrays.toString(A));
        System.out.println("Vector B: " + Arrays.toString(B));
        System.out.println("Vector C: " + Arrays.toString(C));
    }
}
