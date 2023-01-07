package jpwp.proj;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Biblioteka {


    public String pathg, pathp, pathpianoimg, pathgitimg;
    public String nazwa;
    public int poziom;

    Biblioteka(String nazwa) {
        this.nazwa = nazwa;
        this.pathg = nazwa + "g.wav";
        this.pathp = nazwa + "p.wav";
        this.pathpianoimg = "piano"+nazwa+".png";
        this.pathgitimg = "gitara"+nazwa+".png";
    }


    public void odtworzp() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(this.pathp).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Błąd");
            ex.printStackTrace();
        }
    }

        public void odtworzg() {
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(this.pathp).getAbsoluteFile());
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        System.out.println("Błąd");
                        ex.printStackTrace();
            }
        }



}
