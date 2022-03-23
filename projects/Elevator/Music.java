package Elevator;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
  
public class Music {
    Long currentFrame;
    Clip clip;
      
    AudioInputStream audioInputStream;
    static String filePath = "\"C:\\Users\\hp\\Downloads\\bp.mp3\"";
    
       Music() throws Exception
        {
            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
              
            clip = AudioSystem.getClip();
              
            clip.open(audioInputStream);
              
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
       
       
       public void play() 
       {
           clip.start();
       }
       
       
         
       public void pause() 
       {
           this.currentFrame = this.clip.getMicrosecondPosition();
           clip.stop();
       }
       
       public void stop()  
       {
           currentFrame = 0L;
           clip.stop();
           clip.close();
       }
    
}
