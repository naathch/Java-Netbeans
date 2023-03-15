/**
 *
 * @author naathch
 */
import java.util.concurrent.TimeUnit;
public class excercise_4 {

    public static void main(String[] args) {
        int hora = 0;
        int minuto = 0;
        int segundo = 0;
        
        while (hora < 24) {
            System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
            
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            segundo++;
            
            if (segundo == 60) {
                segundo = 0;
                minuto++;
            }
            
            if (minuto == 60) {
                minuto = 0;
                hora++;
            }
        }
    }
}
