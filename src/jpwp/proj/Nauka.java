package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used to learn sounds, how to play them and howe they sound.
 * @author Marcin Oliński 184700
 */

public class Nauka extends JFrame {

    JButton wyjdz = new JButton(new ImageIcon("wyjdz.png"));

    JButton cg = new JButton(new ImageIcon("gitarac.png"));
    JButton dg = new JButton(new ImageIcon("gitarad.png"));
    JButton eg = new JButton(new ImageIcon("gitarae.png"));
    JButton fg = new JButton(new ImageIcon("gitaraf.png"));
    JButton gg = new JButton(new ImageIcon("gitarag.png"));
    JButton ag = new JButton(new ImageIcon("gitaraa.png"));
    JButton hg = new JButton(new ImageIcon("gitarah.png"));
    JButton cisg = new JButton(new ImageIcon("gitaracis.png"));
    JButton disg = new JButton(new ImageIcon("gitaragis.png"));
    JButton fisg = new JButton(new ImageIcon("gitarafis.png"));
    JButton gisg = new JButton(new ImageIcon("gitaragis.png"));
    JButton bg = new JButton(new ImageIcon("gitarab.png"));


    JButton cp = new JButton(new ImageIcon("pianoc.png"));
    JButton dp = new JButton(new ImageIcon("pianod.png"));
    JButton ep = new JButton(new ImageIcon("pianoe.png"));
    JButton fp = new JButton(new ImageIcon("pianof.png"));
    JButton gp = new JButton(new ImageIcon("pianog.png"));
    JButton ap = new JButton(new ImageIcon("pianoa.png"));
    JButton hp = new JButton(new ImageIcon("pianoh.png"));
    JButton cisp = new JButton(new ImageIcon("pianocis.png"));
    JButton disp = new JButton(new ImageIcon("pianodis.png"));
    JButton fisp = new JButton(new ImageIcon("pianofis.png"));
    JButton gisp = new JButton(new ImageIcon("pianogis.png"));
    JButton bp = new JButton(new ImageIcon("pianob.png"));



    Nauka() {
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Dur czy moll?");
        this.setLayout(new GridLayout(5, 3));
        this.setResizable(false);

        cg.setToolTipText("C");
        cisg.setToolTipText("Cis");
        dg.setToolTipText("D");
        disg.setToolTipText("Dis");
        eg.setToolTipText("E");
        fg.setToolTipText("F");
        fisg.setToolTipText("Fis");
        gg.setToolTipText("G");
        gisg.setToolTipText("Gis");
        ag.setToolTipText("A");
        bg.setToolTipText("B");
        hg.setToolTipText("H");

        cp.setToolTipText("C");
        cisp.setToolTipText("Cis");
        dp.setToolTipText("D");
        disp.setToolTipText("Dis");
        ep.setToolTipText("E");
        fp.setToolTipText("F");
        fisp.setToolTipText("Fis");
        gp.setToolTipText("G");
        gisp.setToolTipText("Gis");
        ap.setToolTipText("A");
        bp.setToolTipText("B");
        hp.setToolTipText("H");



        this.add(cp);
        this.add(dp);
        this.add(ep);
        this.add(fp);
        this.add(gp);
        this.add(ap);
        this.add(hp);
        this.add(cisp);
        this.add(disp);
        this.add(fisp);
        this.add(gisp);
        this.add(bp);

        this.add(cg);
        this.add(dg);
        this.add(eg);
        this.add(fg);
        this.add(gg);
        this.add(ag);
        this.add(hg);
        this.add(cisg);
        this.add(disg);
        this.add(fisg);
        this.add(gisg);
        this.add(bg);

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

    void n()

    {
        /**
         * tab contains Biblioteka type objects.
         */

        Biblioteka[] tab;
        tab = new Biblioteka[12];
        tab[0] = new Biblioteka("C");
        tab[1] = new Biblioteka("D");
        tab[2] = new Biblioteka("E");
        tab[3] = new Biblioteka("F");
        tab[4] = new Biblioteka("G");
        tab[5] = new Biblioteka("A");
        tab[6] = new Biblioteka("H");
        tab[7] = new Biblioteka("Cis");
        tab[8] = new Biblioteka("Dis");
        tab[9] = new Biblioteka("Fis");
        tab[10] = new Biblioteka("Gis");
        tab[11] = new Biblioteka("B");

        cg.setEnabled(true);
        dg.setEnabled(true);
        eg.setEnabled(true);
        fg.setEnabled(true);
        gg.setEnabled(true);
        ag.setEnabled(true);
        hg.setEnabled(true);
        cisg.setEnabled(true);
        disg.setEnabled(true);
        fisg.setEnabled(true);
        gisg.setEnabled(true);
        bg.setEnabled(true);

        cp.setEnabled(true);
        dp.setEnabled(true);
        ep.setEnabled(true);
        fp.setEnabled(true);
        gp.setEnabled(true);
        ap.setEnabled(true);
        hp.setEnabled(true);
        cisp.setEnabled(true);
        disp.setEnabled(true);
        fisp.setEnabled(true);
        gisp.setEnabled(true);
        bp.setEnabled(true);


        /**
         * zagraj is used to use play sound method from Biblioteka class.
         */


        ActionListener zagraj = new ActionListener() {
            /**
             * This method is used to check which button has been chosen.
             * @param e gets source from buttons.
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == cg) {


                    tab[0].odtworzg();


                }
                if (e.getSource() == cisg) {

                    tab[1].odtworzg();


                }
                if (e.getSource() == dg) {

                    tab[2].odtworzg();


                }
                if (e.getSource() == disg) {

                    tab[3].odtworzg();


                }
                if (e.getSource() == eg) {

                    tab[4].odtworzg();


                }
                if (e.getSource() == fg) {

                    tab[5].odtworzg();


                }
                if (e.getSource() == fisg) {

                    tab[6].odtworzg();


                }
                if (e.getSource() == gg) {

                    tab[7].odtworzg();


                }
                if (e.getSource() == gisg) {

                    tab[8].odtworzg();


                }
                if (e.getSource() == ag) {

                    tab[9].odtworzg();


                }
                if (e.getSource() == bg) {

                    tab[10].odtworzg();


                }
                if (e.getSource() == hg) {

                    tab[11].odtworzg();


                }
                if (e.getSource() == cp) {

                    tab[0].odtworzp();


                }
                if (e.getSource() == cisp) {

                    tab[1].odtworzp();


                }
                if (e.getSource() == dp) {

                    tab[2].odtworzp();


                }
                if (e.getSource() == disp) {

                    tab[3].odtworzp();


                }
                if (e.getSource() == ep) {

                    tab[4].odtworzp();


                }
                if (e.getSource() == fp) {

                    tab[5].odtworzp();


                }
                if (e.getSource() == fisp) {

                    tab[6].odtworzp();


                }
                if (e.getSource() == gp) {

                    tab[7].odtworzp();


                }
                if (e.getSource() == gisp) {

                    tab[8].odtworzp();


                }
                if (e.getSource() == ap) {

                    tab[9].odtworzp();


                }
                if (e.getSource() == bp) {

                    tab[10].odtworzp();


                }
                if (e.getSource() == hp) {

                    tab[11].odtworzp();


                }

                if(e.getSource()==wyjdz){

                    zamknij();
                    Okno o = new Okno();
                }

            }
        };
        cg.addActionListener(zagraj);
        dg.addActionListener(zagraj);
        eg.addActionListener(zagraj);
        fg.addActionListener(zagraj);
        gg.addActionListener(zagraj);
        ag.addActionListener(zagraj);
        hg.addActionListener(zagraj);
        cisg.addActionListener(zagraj);
        disg.addActionListener(zagraj);
        fisg.addActionListener(zagraj);
        gisg.addActionListener(zagraj);
        bg.addActionListener(zagraj);

        cp.addActionListener(zagraj);
        dp.addActionListener(zagraj);
        ep.addActionListener(zagraj);
        fp.addActionListener(zagraj);
        gp.addActionListener(zagraj);
        ap.addActionListener(zagraj);
        hp.addActionListener(zagraj);
        cisp.addActionListener(zagraj);
        disp.addActionListener(zagraj);
        fisp.addActionListener(zagraj);
        gisp.addActionListener(zagraj);
        bp.addActionListener(zagraj);
        wyjdz.addActionListener(zagraj);
    }
}
