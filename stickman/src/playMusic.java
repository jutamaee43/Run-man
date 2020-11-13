import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class playMusic {
    void playBackground(String filepath){
        try{
            File musicPath = new File(filepath);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}