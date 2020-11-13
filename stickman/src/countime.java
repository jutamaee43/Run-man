import java.util.Timer;
import java.util.TimerTask;
public class countime {
    public int count=0;
    Timer timer =new Timer();
    TimerTask task=new TimerTask(){
        public void run()
        {
            count++;
        }
    };
    public void start(){
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
            
    
}
