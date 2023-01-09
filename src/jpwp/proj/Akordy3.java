package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * This class is for third chord level of the game
 * @author Marcin Oliński 184700
 */

public class Akordy3 extends JFrame {


    public String gtr = "gitara.png";
    public String pn = "piano.png";

    ImageIcon git = new ImageIcon(gtr);
    ImageIcon piano = new ImageIcon(pn);

    JButton pianino = new JButton(piano);
    JButton gitara = new JButton(git);

    JButton wyjdz = new JButton(new ImageIcon("wyjdz.png"));


    JButton cdur = new JButton();
    JButton cisdur = new JButton();
    JButton ddur = new JButton();
    JButton disdur = new JButton();
    JButton edur = new JButton();
    JButton fdur = new JButton();
    JButton fisdur = new JButton();
    JButton gdur = new JButton();
    JButton gisdur = new JButton();
    JButton adur = new JButton();
    JButton bdur = new JButton();
    JButton hdur = new JButton();
    JButton cmoll = new JButton();
    JButton cismoll = new JButton();
    JButton dmoll = new JButton();
    JButton dismoll = new JButton();
    JButton emoll = new JButton();
    JButton fmoll = new JButton();
    JButton fismoll = new JButton();
    JButton gmoll = new JButton();
    JButton gismoll = new JButton();
    JButton amoll = new JButton();
    JButton bmoll = new JButton();
    JButton hmoll = new JButton();

    JButton dalej = new JButton(new ImageIcon("dalej.png"));

    /**
     *  licznik is for count how many times has been chosen th correct answer
     *  poprzedni contains number of previous number
     *  nr number of sound option
     */


    int licznik = 0;
    int poprzedni;

    int nr;

    Akordy3() {
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Akordy poziom 3");
        this.setLayout(null);
        this.setResizable(false);

        this.add(gitara);
        this.add(pianino);

        this.add(cdur);
        this.add(ddur);
        this.add(edur);
        this.add(fdur);
        this.add(gdur);
        this.add(adur);
        this.add(dmoll);
        this.add(emoll);
        this.add(fismoll);
        this.add(amoll);
        this.add(hmoll);
        this.add(cisdur);
        this.add(disdur);
        this.add(fisdur);
        this.add(gisdur);
        this.add(bdur);
        this.add(cmoll);
        this.add(cismoll);
        this.add(dismoll);
        this.add(fmoll);
        this.add(gmoll);
        this.add(gismoll);
        this.add(bmoll);
        this.add(hdur);

        this.add(dalej);

        gitara.setBounds(240, 100, 300, 150);
        gitara.setFont(new Font("MV Boli", Font.BOLD, 35));
        gitara.setFocusable(false);

        pianino.setBounds(740, 100, 300, 150);
        pianino.setFont(new Font("MV Boli", Font.BOLD, 35));
        pianino.setFocusable(false);

        cdur.setBounds(110, 280, 140, 100);
        cdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        cdur.setText("Cdur");
        cdur.setFocusable(false);
        cdur.setBackground(new Color(95, 16, 204));

        cisdur.setBounds(110, 400, 150, 100);
        cisdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        cisdur.setText("Cisdur");
        cisdur.setFocusable(false);
        cisdur.setBackground(new Color(95, 16, 204));

        ddur.setBounds(280, 280, 140, 100);
        ddur.setFont(new Font("MV Boli", Font.BOLD, 35));
        ddur.setText("Ddur");
        ddur.setFocusable(false);
        ddur.setBackground(new Color(95, 16, 204));

        disdur.setBounds(280, 400, 150, 100);
        disdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        disdur.setText("Disdur");
        disdur.setFocusable(false);
        disdur.setBackground(new Color(95, 16, 204));

        edur.setBounds(440, 280, 140, 100);
        edur.setFont(new Font("MV Boli", Font.BOLD, 35));
        edur.setText("Edur");
        edur.setFocusable(false);
        edur.setBackground(new Color(95, 16, 204));

        fdur.setBounds(600, 280, 140, 100);
        fdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        fdur.setText("Fdur");
        fdur.setFocusable(false);
        fdur.setBackground(new Color(95, 16, 204));

        fisdur.setBounds(600, 400, 140, 100);
        fisdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        fisdur.setText("Fisdur");
        fisdur.setFocusable(false);
        fisdur.setBackground(new Color(95, 16, 204));

        gdur.setBounds(760, 280, 140, 100);
        gdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        gdur.setText("Gdur");
        gdur.setFocusable(false);
        gdur.setBackground(new Color(95, 16, 204));

        gisdur.setBounds(760, 400, 150, 100);
        gisdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        gisdur.setText("Gisdur");
        gisdur.setFocusable(false);
        gisdur.setBackground(new Color(95, 16, 204));

        adur.setBounds(920, 280, 140, 100);
        adur.setFont(new Font("MV Boli", Font.BOLD, 35));
        adur.setText("Adur");
        adur.setFocusable(false);
        adur.setBackground(new Color(95, 16, 204));

        bdur.setBounds(920, 400, 140, 100);
        bdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        bdur.setText("Bdur");
        bdur.setFocusable(false);
        bdur.setBackground(new Color(95, 16, 204));

        hdur.setBounds(1090, 280, 140, 100);
        hdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        hdur.setText("Hdur");
        hdur.setFocusable(false);
        hdur.setBackground(new Color(95, 16, 204));

        cmoll.setBounds(110, 520, 140, 100);
        cmoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        cmoll.setText("Cmoll");
        cmoll.setFocusable(false);
        cmoll.setBackground(new Color(95, 16, 204));

        cismoll.setBounds(110, 640, 155, 100);
        cismoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        cismoll.setText("Cismoll");
        cismoll.setFocusable(false);
        cismoll.setBackground(new Color(95, 16, 204));

        dmoll.setBounds(280, 520, 140, 100);
        dmoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        dmoll.setText("Dmoll");
        dmoll.setFocusable(false);
        dmoll.setBackground(new Color(95, 16, 204));

        dismoll.setBounds(280, 640, 157, 100);
        dismoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        dismoll.setText("Dismoll");
        dismoll.setFocusable(false);
        dismoll.setBackground(new Color(95, 16, 204));

        emoll.setBounds(440, 520, 140, 100);
        emoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        emoll.setText("Emoll");
        emoll.setFocusable(false);
        emoll.setBackground(new Color(95, 16, 204));

        fmoll.setBounds(600, 520, 140, 100);
        fmoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        fmoll.setText("Fmoll");
        fmoll.setFocusable(false);
        fmoll.setBackground(new Color(95, 16, 204));

        fismoll.setBounds(500, 640, 150, 100);
        fismoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        fismoll.setText("Fismoll");
        fismoll.setFocusable(false);
        fismoll.setBackground(new Color(95, 16, 204));

        gmoll.setBounds(760, 520, 140, 100);
        gmoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        gmoll.setText("Gmoll");
        gmoll.setFocusable(false);
        gmoll.setBackground(new Color(95, 16, 204));

        gismoll.setBounds(660, 640, 155, 100);
        gismoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        gismoll.setText("Gismoll");
        gismoll.setFocusable(false);
        gismoll.setBackground(new Color(95, 16, 204));

        amoll.setBounds(920, 520, 140, 100);
        amoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        amoll.setText("Amoll");
        amoll.setFocusable(false);
        amoll.setBackground(new Color(95, 16, 204));

        bmoll.setBounds(820, 640, 140, 100);
        bmoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        bmoll.setText("Bmoll");
        bmoll.setFocusable(false);
        bmoll.setBackground(new Color(95, 16, 204));

        hmoll.setBounds(1090, 520, 140, 100);
        hmoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        hmoll.setText("Hmoll");
        hmoll.setFocusable(false);
        hmoll.setBackground(new Color(95, 16, 204));

        wyjdz.setBounds(50, 660, 263,134);
        wyjdz.setFocusable(false);
        wyjdz.setEnabled(true);


        dalej.setBounds(990, 640, 260, 130);
        dalej.setFont(new Font("MV Boli", Font.BOLD, 35));
        dalej.setFocusable(false);


        this.getContentPane().setBackground(new Color(50, 50, 50));

        this.add(wyjdz);
    }

    /**
     * This method is for closing this window.
     */

    public void zamknij()
    {
        this.dispose();
    }

    /**
     * This methos is for choosing random number.
     * When drawed number is the same as previous one another number is choosen.
     */

    public void losowanie() {
        Random numer = new Random();
        nr = numer.nextInt(24);
        while (nr == poprzedni) {
            nr = numer.nextInt(24);
        }
        poprzedni = nr;
        System.out.println(nr);

        cdur.setBackground(new Color(95, 16, 204));
        cisdur.setBackground(new Color(95, 16, 204));
        edur.setBackground(new Color(95, 16, 204));
        fdur.setBackground(new Color(95, 16, 204));
        fisdur.setBackground(new Color(95, 16, 204));
        gdur.setBackground(new Color(95, 16, 204));
        gisdur.setBackground(new Color(95, 16, 204));
        adur.setBackground(new Color(95, 16, 204));
        bdur.setBackground(new Color(95, 16, 204));
        hdur.setBackground(new Color(95, 16, 204));
        hmoll.setBackground(new Color(95, 16, 204));
        ddur.setBackground(new Color(95, 16, 204));
        disdur.setBackground(new Color(95, 16, 204));
        cmoll.setBackground(new Color(95, 16, 204));
        cismoll.setBackground(new Color(95, 16, 204));
        dmoll.setBackground(new Color(95, 16, 204));
        dismoll.setBackground(new Color(95, 16, 204));
        emoll.setBackground(new Color(95, 16, 204));
        fmoll.setBackground(new Color(95, 16, 204));
        fismoll.setBackground(new Color(95, 16, 204));
        gmoll.setBackground(new Color(95, 16, 204));
        gismoll.setBackground(new Color(95, 16, 204));
        amoll.setBackground(new Color(95, 16, 204));
        bmoll.setBackground(new Color(95, 16, 204));

        cdur.setEnabled(true);
        cisdur.setEnabled(true);
        edur.setEnabled(true);
        fdur.setEnabled(true);
        fisdur.setEnabled(true);
        gdur.setEnabled(true);
        gisdur.setEnabled(true);
        adur.setEnabled(true);
        bdur.setEnabled(true);
        hdur.setEnabled(true);
        hmoll.setEnabled(true);
        ddur.setEnabled(true);
        disdur.setEnabled(true);
        cmoll.setEnabled(true);
        cismoll.setEnabled(true);
        dmoll.setEnabled(true);
        dismoll.setEnabled(true);
        emoll.setEnabled(true);
        fmoll.setEnabled(true);
        fismoll.setEnabled(true);
        gmoll.setEnabled(true);
        gismoll.setEnabled(true);
        amoll.setEnabled(true);
        bmoll.setEnabled(true);
    }

    public void odswiez(){

        this.repaint();

    }


    /**
     * This method is used to start the game
     */


    public void gra () {

        /**
         *  tab contains objects Biblioteka type
         */

        Biblioteka[] tab;
        tab = new Biblioteka[24];
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
        tab[12] = new Biblioteka("Cmoll");
        tab[13] = new Biblioteka("Cismoll");
        tab[14] = new Biblioteka("Dmoll");
        tab[15] = new Biblioteka("Dismoll");
        tab[16] = new Biblioteka("Emoll");
        tab[17] = new Biblioteka("Fmoll");
        tab[18] = new Biblioteka("Fismoll");
        tab[19] = new Biblioteka("Gmoll");
        tab[20] = new Biblioteka("Gismoll");
        tab[21] = new Biblioteka("Amoll");
        tab[22] = new Biblioteka("Bmoll");
        tab[23] = new Biblioteka("Hmoll");

        losowanie();


        tab[nr].odtworzp();

        /**
         *  zagraj is for playing audio file
         */



        ActionListener zagraj = new ActionListener() {
            /**
             * This method is for choosing right method: piano or guitar, from Biblioteka class
             * @param e gets source from button
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == gitara) {
                    tab[nr].odtworzg();
                }
                if (e.getSource() == pianino) {

                    tab[nr].odtworzp();
                }

            }
        };
        gitara.addActionListener(zagraj);
        pianino.addActionListener(zagraj);

        /**
         *  nastepne is used for moving to the next question or exit game
         */

        ActionListener nastepne = new ActionListener() {
            /**
             * This method is used to dalej button
             * @param e gets source from button
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource()==dalej){
                    losowanie();
                    tab[nr].odtworzp();

                    pianino.setIcon(new ImageIcon("piano.png"));
                    gitara.setIcon(new ImageIcon("gitara.png"));

                    odswiez();

                    dalej.removeActionListener(this);
                }
            }
        };


        /**
         * This method is used to wyjdz button
         * @param e gets source from button
         */

        ActionListener wyjscie = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(e.getSource()==wyjdz);
                {
                    zamknij();
                    Okno o = new Okno();
                }

            }
        };
        wyjdz.addActionListener(wyjscie);


        /**
         *  odpowiedz is for getting information about user's answer
         */

        ActionListener odpowiedz = new ActionListener() {
            /**
             * This method is for checking chosen option
             *  @param z gets source from buttons
             */
            @Override
            public void actionPerformed(ActionEvent z) {


                if (z.getSource() == cdur) {

                    if (nr == 0) {
                        if(licznik<20) {
                            cdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        cdur.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }
                if (z.getSource() == cisdur) {

                    if (nr == 1) {
                        if(licznik<20) {
                            cisdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                            if(licznik>19){
                                gratulacje();
                                dalej.removeActionListener(this);
                            }
                        } else {
                            cisdur.setBackground(Color.red);
                            if (tab[nr].poziom > 0) {
                                tab[nr].poziom--;
                            }
                        }
                    }

                }
                if (z.getSource() == ddur) {

                    if (nr == 2) {

                        if(licznik<20) {
                            ddur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                            if(licznik>19){
                                gratulacje();
                                dalej.removeActionListener(this);
                            }
                        } else {
                            ddur.setBackground(Color.red);
                            if (tab[nr].poziom > 0) {
                                tab[nr].poziom--;
                            }
                        }
                    }

                }
                if (z.getSource() == disdur) {

                    if (nr == 3) {
                        if(licznik<20) {
                            disdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                            if(licznik>19){
                                gratulacje();
                                dalej.removeActionListener(this);
                            }
                        } else {
                            disdur.setBackground(Color.red);
                            if (tab[nr].poziom > 0) {
                                tab[nr].poziom--;
                            }
                        }
                    }

                }
                if (z.getSource() == edur) {

                    if (nr == 4) {
                        if(licznik<20) {
                            edur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                            if(licznik>19){
                                gratulacje();
                                dalej.removeActionListener(this);
                            }
                        } else {
                            edur.setBackground(Color.red);
                            if (tab[nr].poziom > 0) {
                                tab[nr].poziom--;
                            }
                        }
                    }

                }
                if (z.getSource() == fdur) {

                    if (nr == 5) {
                        if(licznik<20) {
                            fdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                            if(licznik>19){
                                gratulacje();
                                dalej.removeActionListener(this);
                            }
                        } else {
                            fdur.setBackground(Color.red);
                            if (tab[nr].poziom > 0) {
                                tab[nr].poziom--;
                            }
                        }
                    }

                }
                if (z.getSource() == fisdur) {

                    if (nr == 6) {
                        if(licznik<20) {
                            fisdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                            if(licznik>19){
                                gratulacje();
                                dalej.removeActionListener(this);
                            }
                        } else {
                            fisdur.setBackground(Color.red);
                            if (tab[nr].poziom > 0) {
                                tab[nr].poziom--;
                            }
                        }
                    }

                }

                if (z.getSource() == gdur) {

                    if (nr == 7) {
                        if(licznik<20) {
                            gdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        gdur.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }
                if (z.getSource() == gisdur) {

                    if (nr == 8) {
                        if(licznik<20) {
                            gisdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        gisdur.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }
                if (z.getSource() == adur) {

                    if (nr == 9) {
                        if(licznik<20) {
                            adur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        adur.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }
                if (z.getSource() == bdur) {

                    if (nr == 10) {
                        if(licznik<20) {
                            bdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        bdur.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }
                if (z.getSource() == hdur) {

                    if (nr == 11) {
                        if(licznik<20) {
                            hdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        hdur.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == cmoll) {

                    if (nr == 12) {
                        if(licznik<20) {
                            cmoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        cmoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == cismoll) {

                    if (nr == 13) {
                        if(licznik<20) {
                            cismoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        cismoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == dmoll) {

                    if (nr == 14) {
                        if(licznik<20) {
                            dmoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        dmoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == dismoll) {

                    if (nr == 15) {
                        if(licznik<20) {
                            dismoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        dismoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == emoll) {

                    if (nr == 16) {
                        if(licznik<20) {
                            emoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        emoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == fmoll) {

                    if (nr == 17) {
                        if(licznik<20) {
                            fmoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        fmoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == fismoll) {

                    if (nr == 18) {
                        if(licznik<20) {
                            fismoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        fismoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == gmoll) {

                    if (nr == 19) {
                        if(licznik<20) {
                            gmoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        gmoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == gismoll) {

                    if (nr == 20) {
                        if(licznik<20) {
                            gismoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        gismoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == amoll) {

                    if (nr == 21) {
                        if(licznik<20) {
                            amoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        amoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == bmoll) {

                    if (nr == 22) {
                        if(licznik<20) {
                            bmoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        bmoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                if (z.getSource() == hmoll) {

                    if (nr == 23) {
                        if(licznik<20) {
                            hmoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 2) {
                                licznik++;
                            }
                        }
                        if(licznik>19){
                            gratulacje();
                            dalej.removeActionListener(this);
                        }
                    } else {
                        hmoll.setBackground(Color.red);

                        if (tab[nr].poziom > 0) {
                            tab[nr].poziom--;
                        }
                    }

                }

                cdur.setEnabled(false);
                cisdur.setEnabled(false);
                edur.setEnabled(false);
                fdur.setEnabled(false);
                fisdur.setEnabled(false);
                gdur.setEnabled(false);
                gisdur.setEnabled(false);
                adur.setEnabled(false);
                bdur.setEnabled(false);
                hdur.setEnabled(false);
                hmoll.setEnabled(false);
                ddur.setEnabled(false);
                cmoll.setEnabled(false);
                cismoll.setEnabled(false);
                dmoll.setEnabled(false);
                dismoll.setEnabled(false);
                emoll.setEnabled(false);
                fmoll.setEnabled(false);
                fismoll.setEnabled(false);
                gmoll.setEnabled(false);
                gismoll.setEnabled(false);
                amoll.setEnabled(false);
                bmoll.setEnabled(false);


                if (nr == 0) {
                    cdur.setBackground(Color.green);
                }
                if (nr == 1) {
                    cisdur.setBackground(Color.green);
                }
                if (nr == 2) {
                    ddur.setBackground(Color.green);
                }
                if (nr == 3) {
                    disdur.setBackground(Color.green);
                }
                if (nr == 4) {
                    edur.setBackground(Color.green);

                }
                if (nr == 5) {
                    fdur.setBackground(Color.green);

                }
                if (nr == 6) {
                    fisdur.setBackground(Color.green);
                }
                if (nr == 7) {
                    gdur.setBackground(Color.green);
                }
                if (nr == 8) {
                    gisdur.setBackground(Color.green);
                }
                if (nr == 9) {
                    adur.setBackground(Color.green);
                }
                if (nr == 10) {
                    bdur.setBackground(Color.green);
                }
                if (nr == 11) {
                    hdur.setBackground(Color.green);
                }
                if (nr == 12) {
                    cmoll.setBackground(Color.green);
                }
                if (nr == 13) {
                    cismoll.setBackground(Color.green);
                }
                if (nr == 14) {
                    dmoll.setBackground(Color.green);
                }
                if (nr == 15) {
                    dismoll.setBackground(Color.green);
                }
                if (nr == 16) {
                    emoll.setBackground(Color.green);
                }
                if (nr == 17) {
                    fmoll.setBackground(Color.green);
                }
                if (nr == 18) {
                    fismoll.setBackground(Color.green);
                }
                if (nr == 19) {
                    gmoll.setBackground(Color.green);
                }
                if (nr == 20) {
                    gismoll.setBackground(Color.green);
                }
                if (nr == 21) {
                    amoll.setBackground(Color.green);
                }
                if (nr == 22) {
                    bmoll.setBackground(Color.green);
                }
                if (nr == 23) {
                    hmoll.setBackground(Color.green);
                }


                dalej.addActionListener(nastepne);

                gitara.setIcon(new ImageIcon(tab[nr].pathgitimg));
                pianino.setIcon(new ImageIcon(tab[nr].pathpianoimg));
                odswiez();
                System.out.println("poziom"+tab[nr].poziom);
                System.out.println("licznik"+licznik);


            }




        };




        cdur.addActionListener(odpowiedz);
        cisdur.addActionListener(odpowiedz);
        edur.addActionListener(odpowiedz);
        fdur.addActionListener(odpowiedz);
        fisdur.addActionListener(odpowiedz);
        gdur.addActionListener(odpowiedz);
        gisdur.addActionListener(odpowiedz);
        adur.addActionListener(odpowiedz);
        bdur.addActionListener(odpowiedz);
        hdur.addActionListener(odpowiedz);
        hmoll.addActionListener(odpowiedz);
        ddur.addActionListener(odpowiedz);
        disdur.addActionListener(odpowiedz);
        cmoll.addActionListener(odpowiedz);
        cismoll.addActionListener(odpowiedz);
        dmoll.addActionListener(odpowiedz);
        dismoll.addActionListener(odpowiedz);
        emoll.addActionListener(odpowiedz);
        fmoll.addActionListener(odpowiedz);
        fismoll.addActionListener(odpowiedz);
        gmoll.addActionListener(odpowiedz);
        gismoll.addActionListener(odpowiedz);
        amoll.addActionListener(odpowiedz);
        bmoll.addActionListener(odpowiedz);


    }

    /**
     * This void is for finishing a game.
     */
    public void gratulacje(){

        this.getContentPane().removeAll();
        this.add(dalej);
        this.remove(wyjdz);


        /**
         *  kontynuuj is for going back to the menu.
         */
        ActionListener kontynuuj = new ActionListener() {
            /**
             * This method is for checking if dalej was clicked.
             * @param e gets source from dalej button.
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==dalej){

                    zamknij();

                    Okno o = new Okno();

                }

            }
        };
        dalej.addActionListener(kontynuuj);

        this.repaint();

        JTextField napis = new JTextField();
        napis.setBounds(350, 262, 600, 100);
        napis.setFont(new Font("MV Boli", Font.BOLD, 50));
        napis.setText("Gratulacje!");
        napis.setDisabledTextColor(Color.green);
        napis.setSelectedTextColor(Color.green);
        napis.setHorizontalAlignment(JTextField.CENTER);
        napis.setBackground(Color.white);
        this.add(napis);

        JTextField napis2 = new JTextField();
        napis2.setBounds(350, 362, 600, 100);
        napis2.setFont(new Font("MV Boli", Font.BOLD, 50));
        napis2.setText("Dobrze Ci Idzie");
        napis2.setDisabledTextColor(Color.green);
        napis2.setSelectedTextColor(Color.green);
        napis2.setHorizontalAlignment(JTextField.CENTER);
        napis2.setBackground(Color.white);
        this.add(napis2);

        JTextField napis3 = new JTextField();
        napis3.setBounds(350, 462, 600, 100);
        napis3.setFont(new Font("MV Boli", Font.BOLD, 50));
        napis3.setText("Nacisnij dalej");
        napis3.setDisabledTextColor(Color.green);
        napis3.setSelectedTextColor(Color.green);
        napis3.setHorizontalAlignment(JTextField.CENTER);
        napis3.setBackground(Color.white);
        this.add(napis3);

        JTextField napis4 = new JTextField();
        napis4.setBounds(350, 562, 600, 100);
        napis4.setFont(new Font("MV Boli", Font.BOLD, 50));
        napis4.setText("i wybierz kolejny etap");
        napis4.setDisabledTextColor(Color.green);
        napis4.setSelectedTextColor(Color.green);
        napis4.setHorizontalAlignment(JTextField.CENTER);
        napis4.setBackground(Color.white);
        this.add(napis4);



    }

}


