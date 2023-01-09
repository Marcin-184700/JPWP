package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used to learn minor chords, how to play them and howe they sound.
 * @author Marcin Oliński 184700
 */

public class Nauka3 extends JFrame {



    JButton wyjdz = new JButton(new ImageIcon("wyjdz.png"));

    JButton cmollp = new JButton(new ImageIcon("pianocmoll.png"));
    JButton cismollp = new JButton(new ImageIcon("pianocismoll.png"));
    JButton dmollp = new JButton(new ImageIcon("pianodmoll.png"));
    JButton dismollp = new JButton(new ImageIcon("pianodismoll.png"));
    JButton emollp = new JButton(new ImageIcon("pianoemoll.png"));
    JButton fmollp = new JButton(new ImageIcon("pianofmoll.png"));
    JButton fismollp = new JButton(new ImageIcon("pianofismoll.png"));
    JButton gmollp = new JButton(new ImageIcon("pianogmoll.png"));
    JButton gismollp = new JButton(new ImageIcon("pianogismoll.png"));
    JButton amollp = new JButton(new ImageIcon("pianoamoll.png"));
    JButton bmollp = new JButton(new ImageIcon("pianobmoll.png"));
    JButton hmollp = new JButton(new ImageIcon("pianohmoll.png"));

    JButton cmollg = new JButton(new ImageIcon("gitaracmoll.png"));
    JButton cismollg = new JButton(new ImageIcon("gitaracismoll.png"));
    JButton dmollg = new JButton(new ImageIcon("gitaradmoll.png"));
    JButton dismollg = new JButton(new ImageIcon("gitaradismoll.png"));
    JButton emollg = new JButton(new ImageIcon("gitaraemoll.png"));
    JButton fmollg = new JButton(new ImageIcon("gitarafmoll.png"));
    JButton fismollg = new JButton(new ImageIcon("gitarafismoll.png"));
    JButton gmollg = new JButton(new ImageIcon("gitaragmoll.png"));
    JButton gismollg = new JButton(new ImageIcon("gitaragismoll.png"));
    JButton amollg = new JButton(new ImageIcon("gitaraamoll.png"));
    JButton bmollg = new JButton(new ImageIcon("gitarabmoll.png"));
    JButton hmollg = new JButton(new ImageIcon("gitarahmoll.png"));

    Nauka3() {
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("moll czy moll?");
        this.setLayout(new GridLayout(5, 3));
        this.setResizable(false);

        cmollg.setToolTipText("Cmoll");
        cismollg.setToolTipText("Cismoll");
        dmollg.setToolTipText("Dmoll");
        dismollg.setToolTipText("Dismoll");
        emollg.setToolTipText("Emoll");
        fmollg.setToolTipText("Fmoll");
        fismollg.setToolTipText("Fismoll");
        gmollg.setToolTipText("Gmoll");
        gismollg.setToolTipText("Gismoll");
        amollg.setToolTipText("Amoll");
        bmollg.setToolTipText("Bmoll");
        hmollg.setToolTipText("Hmoll");

        cmollp.setToolTipText("Cmoll");
        cismollp.setToolTipText("Cismoll");
        dmollp.setToolTipText("Dmoll");
        dismollp.setToolTipText("Dismoll");
        emollp.setToolTipText("Emoll");
        fmollp.setToolTipText("Fmoll");
        fismollp.setToolTipText("Fismoll");
        gmollp.setToolTipText("Gmoll");
        gismollp.setToolTipText("Gismoll");
        amollp.setToolTipText("Amoll");
        bmollp.setToolTipText("Bmoll");
        hmollp.setToolTipText("Hmoll");


        this.add(cmollp);
        this.add(dmollp);
        this.add(emollp);
        this.add(fmollp);
        this.add(gmollp);
        this.add(amollp);
        this.add(hmollp);
        this.add(cismollp);
        this.add(dismollp);
        this.add(fismollp);
        this.add(gismollp);
        this.add(bmollp);

        this.add(cmollg);
        this.add(dmollg);
        this.add(emollg);
        this.add(fmollg);
        this.add(gmollg);
        this.add(amollg);
        this.add(hmollg);
        this.add(cismollg);
        this.add(dismollg);
        this.add(fismollg);
        this.add(gismollg);
        this.add(bmollg);

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
         *tab contains Biblioteka type objects.
         */

        Biblioteka[] tab;
        tab = new Biblioteka[12];
        tab[0] = new Biblioteka("Cmoll");
        tab[1] = new Biblioteka("Cismoll");
        tab[2] = new Biblioteka("Dmoll");
        tab[3] = new Biblioteka("Dismoll");
        tab[4] = new Biblioteka("Emoll");
        tab[5] = new Biblioteka("Fmoll");
        tab[6] = new Biblioteka("Fismoll");
        tab[7] = new Biblioteka("Gmoll");
        tab[8] = new Biblioteka("Gismoll");
        tab[9] = new Biblioteka("Amoll");
        tab[10] = new Biblioteka("Bmoll");
        tab[11] = new Biblioteka("Hmoll");

        /**
         *zagraj is used to use play sound method from Biblioteka class.
         */


        ActionListener zagraj = new ActionListener() {
            /**
             * This method is used to check which button has been chosen.
             * @param e gets source from buttons.
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == cmollg) {


                    tab[0].odtworzg();


                }
                if (e.getSource() == cismollg) {

                    tab[1].odtworzg();


                }
                if (e.getSource() == dmollg) {

                    tab[2].odtworzg();


                }
                if (e.getSource() == dismollg) {

                    tab[3].odtworzg();


                }
                if (e.getSource() == emollg) {

                    tab[4].odtworzg();


                }
                if (e.getSource() == fmollg) {

                    tab[5].odtworzg();


                }
                if (e.getSource() == fismollg) {

                    tab[6].odtworzg();


                }
                if (e.getSource() == gmollg) {

                    tab[7].odtworzg();


                }
                if (e.getSource() == gismollg) {

                    tab[8].odtworzg();


                }
                if (e.getSource() == amollg) {

                    tab[9].odtworzg();


                }
                if (e.getSource() == bmollg) {

                    tab[10].odtworzg();


                }
                if (e.getSource() == hmollg) {

                    tab[11].odtworzg();


                }
                if (e.getSource() == cmollp) {

                    tab[0].odtworzp();


                }
                if (e.getSource() == cismollp) {

                    tab[1].odtworzp();


                }
                if (e.getSource() == dmollp) {

                    tab[2].odtworzp();


                }
                if (e.getSource() == dismollp) {

                    tab[3].odtworzp();


                }
                if (e.getSource() == emollp) {

                    tab[4].odtworzp();


                }
                if (e.getSource() == fmollp) {

                    tab[5].odtworzp();


                }
                if (e.getSource() == fismollp) {

                    tab[6].odtworzp();


                }
                if (e.getSource() == gmollp) {

                    tab[7].odtworzp();


                }
                if (e.getSource() == gismollp) {

                    tab[8].odtworzp();


                }
                if (e.getSource() == amollp) {

                    tab[9].odtworzp();


                }
                if (e.getSource() == bmollp) {

                    tab[10].odtworzp();


                }
                if (e.getSource() == hmollp) {

                    tab[11].odtworzp();


                }

                if(e.getSource()==wyjdz){

                    zamknij();
                    Okno o = new Okno();
                }

            }
        };
        cmollg.addActionListener(zagraj);
        dmollg.addActionListener(zagraj);
        emollg.addActionListener(zagraj);
        fmollg.addActionListener(zagraj);
        gmollg.addActionListener(zagraj);
        amollg.addActionListener(zagraj);
        hmollg.addActionListener(zagraj);
        cismollg.addActionListener(zagraj);
        dismollg.addActionListener(zagraj);
        fismollg.addActionListener(zagraj);
        gismollg.addActionListener(zagraj);
        bmollg.addActionListener(zagraj);

        cmollp.addActionListener(zagraj);
        dmollp.addActionListener(zagraj);
        emollp.addActionListener(zagraj);
        fmollp.addActionListener(zagraj);
        gmollp.addActionListener(zagraj);
        amollp.addActionListener(zagraj);
        hmollp.addActionListener(zagraj);
        cismollp.addActionListener(zagraj);
        dismollp.addActionListener(zagraj);
        fismollp.addActionListener(zagraj);
        gismollp.addActionListener(zagraj);
        bmollp.addActionListener(zagraj);
        wyjdz.addActionListener(zagraj);
    }



}
