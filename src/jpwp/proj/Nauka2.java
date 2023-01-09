package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used to learn major chords , how to play them and howe they sound.
 * @author Marcin Oliński 184700
 */

public class Nauka2 extends JFrame {



    JButton wyjdz = new JButton(new ImageIcon("wyjdz.png"));

    JButton cdurp = new JButton(new ImageIcon("pianocdur.png"));
    JButton cisdurp = new JButton(new ImageIcon("pianocisdur.png"));
    JButton ddurp = new JButton(new ImageIcon("pianoddur.png"));
    JButton disdurp = new JButton(new ImageIcon("pianodisdur.png"));
    JButton edurp = new JButton(new ImageIcon("pianoedur.png"));
    JButton fdurp = new JButton(new ImageIcon("pianofdur.png"));
    JButton fisdurp = new JButton(new ImageIcon("pianofisdur.png"));
    JButton gdurp = new JButton(new ImageIcon("pianogdur.png"));
    JButton gisdurp = new JButton(new ImageIcon("pianogisdur.png"));
    JButton adurp = new JButton(new ImageIcon("pianoadur.png"));
    JButton bdurp = new JButton(new ImageIcon("pianobdur.png"));
    JButton hdurp = new JButton(new ImageIcon("pianohdur.png"));

    JButton cdurg = new JButton(new ImageIcon("gitaracdur.png"));
    JButton cisdurg = new JButton(new ImageIcon("gitaracisdur.png"));
    JButton ddurg = new JButton(new ImageIcon("gitaraddur.png"));
    JButton disdurg = new JButton(new ImageIcon("gitaradisdur.png"));
    JButton edurg = new JButton(new ImageIcon("gitaraedur.png"));
    JButton fdurg = new JButton(new ImageIcon("gitarafdur.png"));
    JButton fisdurg = new JButton(new ImageIcon("gitarafisdur.png"));
    JButton gdurg = new JButton(new ImageIcon("gitaragdur.png"));
    JButton gisdurg = new JButton(new ImageIcon("gitaragisdur.png"));
    JButton adurg = new JButton(new ImageIcon("gitaraadur.png"));
    JButton bdurg = new JButton(new ImageIcon("gitarabdur.png"));
    JButton hdurg = new JButton(new ImageIcon("gitarahdur.png"));

    Nauka2() {
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Dur czy moll?");
        this.setLayout(new GridLayout(5, 3));
        this.setResizable(false);

        cdurg.setToolTipText("Cdur");
        cisdurg.setToolTipText("Cisdur");
        ddurg.setToolTipText("Ddur");
        disdurg.setToolTipText("Disdur");
        edurg.setToolTipText("Edur");
        fdurg.setToolTipText("Fdur");
        fisdurg.setToolTipText("Fisdur");
        gdurg.setToolTipText("Gdur");
        gisdurg.setToolTipText("Gisdur");
        adurg.setToolTipText("Adur");
        bdurg.setToolTipText("Bdur");
        hdurg.setToolTipText("Hdur");

        cdurp.setToolTipText("Cdur");
        cisdurp.setToolTipText("Cisdur");
        ddurp.setToolTipText("Ddur");
        disdurp.setToolTipText("Disdur");
        edurp.setToolTipText("Edur");
        fdurp.setToolTipText("Fdur");
        fisdurp.setToolTipText("Fisdur");
        gdurp.setToolTipText("Gdur");
        gisdurp.setToolTipText("Gisdur");
        adurp.setToolTipText("Adur");
        bdurp.setToolTipText("Bdur");
        hdurp.setToolTipText("Hdur");


        this.add(cdurp);
        this.add(ddurp);
        this.add(edurp);
        this.add(fdurp);
        this.add(gdurp);
        this.add(adurp);
        this.add(hdurp);
        this.add(cisdurp);
        this.add(disdurp);
        this.add(fisdurp);
        this.add(gisdurp);
        this.add(bdurp);

        this.add(cdurg);
        this.add(ddurg);
        this.add(edurg);
        this.add(fdurg);
        this.add(gdurg);
        this.add(adurg);
        this.add(hdurg);
        this.add(cisdurg);
        this.add(disdurg);
        this.add(fisdurg);
        this.add(gisdurg);
        this.add(bdurg);

        this.add(wyjdz);





        this.getContentPane().setBackground(new Color(50, 50, 50));
    }

    /**
     * This method is used to close window.
     */

    void zamknij(){

        this.dispose();

    }

    /**
     * This method is used to start using this class and create objects.
     */



    void n(){

        /**
         * tab contains Biblioteka type objects.
         */

        Biblioteka[] tab;
        tab = new Biblioteka[12];
        tab[0] = new Biblioteka("Cdur");
        tab[1] = new Biblioteka("Cisdur");
        tab[2] = new Biblioteka("Ddur");
        tab[3] = new Biblioteka("Disdur");
        tab[4] = new Biblioteka("Edur");
        tab[5] = new Biblioteka("Fdur");
        tab[6] = new Biblioteka("Fisdur");
        tab[7] = new Biblioteka("Gdur");
        tab[8] = new Biblioteka("Gisdur");
        tab[9] = new Biblioteka("Adur");
        tab[10] = new Biblioteka("Bdur");
        tab[11] = new Biblioteka("Hdur");


        /**
         * agraj is used to use play sound method from Biblioteka class.
         */


        ActionListener zagraj = new ActionListener() {
            /**
             * This method is used to check which button has been chosen.
             * @param e gets source from buttons.
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == cdurg) {


                    tab[0].odtworzg();


                }
                if (e.getSource() == cisdurg) {

                    tab[1].odtworzg();


                }
                if (e.getSource() == ddurg) {

                    tab[2].odtworzg();


                }
                if (e.getSource() == disdurg) {

                    tab[3].odtworzg();


                }
                if (e.getSource() == edurg) {

                    tab[4].odtworzg();


                }
                if (e.getSource() == fdurg) {

                    tab[5].odtworzg();


                }
                if (e.getSource() == fisdurg) {

                    tab[6].odtworzg();


                }
                if (e.getSource() == gdurg) {

                    tab[7].odtworzg();


                }
                if (e.getSource() == gisdurg) {

                    tab[8].odtworzg();


                }
                if (e.getSource() == adurg) {

                    tab[9].odtworzg();


                }
                if (e.getSource() == bdurg) {

                    tab[10].odtworzg();


                }
                if (e.getSource() == hdurg) {

                    tab[11].odtworzg();


                }
                if (e.getSource() == cdurp) {

                    tab[0].odtworzp();


                }
                if (e.getSource() == cisdurp) {

                    tab[1].odtworzp();


                }
                if (e.getSource() == ddurp) {

                    tab[2].odtworzp();


                }
                if (e.getSource() == disdurp) {

                    tab[3].odtworzp();


                }
                if (e.getSource() == edurp) {

                    tab[4].odtworzp();


                }
                if (e.getSource() == fdurp) {

                    tab[5].odtworzp();


                }
                if (e.getSource() == fisdurp) {

                    tab[6].odtworzp();


                }
                if (e.getSource() == gdurp) {

                    tab[7].odtworzp();


                }
                if (e.getSource() == gisdurp) {

                    tab[8].odtworzp();


                }
                if (e.getSource() == adurp) {

                    tab[9].odtworzp();


                }
                if (e.getSource() == bdurp) {

                    tab[10].odtworzp();


                }
                if (e.getSource() == hdurp) {

                    tab[11].odtworzp();


                }

                if(e.getSource()==wyjdz){

                    zamknij();
                    Okno o = new Okno();
                }

            }
        };
        cdurg.addActionListener(zagraj);
        ddurg.addActionListener(zagraj);
        edurg.addActionListener(zagraj);
        fdurg.addActionListener(zagraj);
        gdurg.addActionListener(zagraj);
        adurg.addActionListener(zagraj);
        hdurg.addActionListener(zagraj);
        cisdurg.addActionListener(zagraj);
        disdurg.addActionListener(zagraj);
        fisdurg.addActionListener(zagraj);
        gisdurg.addActionListener(zagraj);
        bdurg.addActionListener(zagraj);

        cdurp.addActionListener(zagraj);
        ddurp.addActionListener(zagraj);
        edurp.addActionListener(zagraj);
        fdurp.addActionListener(zagraj);
        gdurp.addActionListener(zagraj);
        adurp.addActionListener(zagraj);
        hdurp.addActionListener(zagraj);
        cisdurp.addActionListener(zagraj);
        disdurp.addActionListener(zagraj);
        fisdurp.addActionListener(zagraj);
        gisdurp.addActionListener(zagraj);
        bdurp.addActionListener(zagraj);
        wyjdz.addActionListener(zagraj);
    }



}
