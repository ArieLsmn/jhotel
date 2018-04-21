import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
/**
 * Kelas untuk menjalankan fungsi utamna dari multithread disertai fungsi randomisasi delay .
 *
 * @author Aria Lesmana
 * @version 21.4.2018
 */
public class LetsGo {
    private static int[] delay = new int[3];
    private static int[][] finaldelay = new int[3][20];
    private static int counter=0;

    public static void main(String args[]) {
        Random();
        RunForYourLife R1 = new RunForYourLife( "Messi");
        R1.start();

        RunForYourLife R2 = new RunForYourLife( "Lionel");
        R2.start();

        RunForYourLife R3 = new RunForYourLife( "Andres");
        R3.start();
    }

    public static void Random(){
        while(counter<20)
        {
            for (int x=0;x<3;x++){
                delay[x]=ThreadLocalRandom.current().nextInt(100, 500 + 1);
            }
            Arrays.sort(delay);

            for (int x=0;x<3;x++){
                finaldelay[x][counter]=delay[x];

            }
            counter++;
        }

    }

    public static int getRandom(String name, int id){
        if(name=="Messi"){
            return finaldelay[0][id];
        } else if(name=="Andres"){
            return finaldelay[1][id];
        } else return finaldelay[2][id];
    }
}
