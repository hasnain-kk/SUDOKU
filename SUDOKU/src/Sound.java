/* 
 * This code is Developed By Zarar
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {

  Clip clip;

/*
 * To set the Music File in an Object
 */
  public void setFile(String i) {
    try {
      AudioInputStream ais = AudioSystem.getAudioInputStream(new File(i));
      clip = AudioSystem.getClip();
      clip.open(ais);
    } catch (Exception e) {}
  }
/*
 * To Play the Music
 */
  public void play() {
    clip.start();
  }
/*
 * To Loop the Music
 */
  public void loop() {
    clip.loop(Clip.LOOP_CONTINUOUSLY);
  }
/*
 * To Stop the Music
 */
  public void stop() {
    clip.stop();
  }
}
