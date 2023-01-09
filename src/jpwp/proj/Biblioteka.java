package jpwp.proj;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * This class is for creating objects for a game, which contains path for audio and image files and methods used in the game
 * @author Marcin Oliński 184700
 */

public class Biblioteka {

    /**
     * pathg Path for guitar audio file.
     * pathp Path for piano audio file.
     * pathpianoimg Path for piano image file.
     * pathgitimg Path for guitar image file.
     * poziom counts how many this option has been guessed.
     */

    public String pathg, pathp, pathpianoimg, pathgitimg;
    public String nazwa;
    public int poziom;

    /**
     * Constructor for Biblioteka objects.
     *  @param nazwa name of the chord/sound, used to generate paths.
     */

    Biblioteka(String nazwa) {
        this.nazwa = nazwa;
        this.pathg = nazwa + "g.wav";
        this.pathp = nazwa + "p.wav";
        this.pathpianoimg = "piano"+nazwa+".png";
        this.pathgitimg = "gitara"+nazwa+".png";
    }

    /**
     * This method is used to play piano audio file.
     */

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

    /**
     * This method is used to play guitar audio file.
     */

        public void odtworzg() {
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(this.pathg).getAbsoluteFile());
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        System.out.println("Błąd");
                        ex.printStackTrace();
            }
        }



}
