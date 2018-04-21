
/**
 * Kelas berisi method untuk menjalankan fungsi-fungsi dalam thread.
 *
 * @author Aria Lesmana
 * @version 21.4.2018
 */
public class RunForYourLife implements Runnable
{
    private Thread runner;
    private String nama;

    /**
     * Constructor for objects of class RunForYourLife
     */
    public RunForYourLife(String nama){
        this.nama = nama;
        System.out.println(nama+", ready");
    }
    public void run(){
        System.out.println(getNama()+", go!" );
        try {
            for(int i = 0; i <=19; i++) {
                // Let the thread sleep for a while.
                Thread.sleep(LetsGo.getRandom(getNama(),i));
                int check=i+1;
                System.out.println(getNama()+" has passed checkpoint "+ check + ". Delay : "+LetsGo.getRandom(getNama(),i));
            }
        } catch (InterruptedException e) {
            System.out.println(getNama()+" was interupted.");
        }
        System.out.println(getNama()+" has finished");
    }

    public void start () {
        System.out.println(getNama()+", set" );
        if (runner == null) {
            runner = new Thread (this, getNama());
            runner.start ();
        }
    }

    public String getNama(){
        return nama;
    }
}

