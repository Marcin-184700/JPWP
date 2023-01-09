package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * This class is for first chord level of the game
 * @author Marcin Oliński 184700
 */

public class Akordy1 extends JFrame {


    public String gtr = "gitara.png";
    public String pn = "piano.png";

    ImageIcon git = new ImageIcon(gtr);
    ImageIcon piano = new ImageIcon(pn);

    JButton pianino = new JButton(piano);
    JButton gitara = new JButton(git);

    JButton wyjdz = new JButton(new ImageIcon("wyjdz.png"));


    JButton cdur = new JButton();
    JButton fdur = new JButton();
    JButton gdur = new JButton();
    JButton dmoll = new JButton();
    JButton emoll = new JButton();
    JButton amoll = new JButton();
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

    Akordy1() {
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Akordy poziom 1");
        this.setLayout(null);
        this.setResizable(false);

        this.add(gitara);
        this.add(pianino);

        this.add(cdur);
        this.add(fdur);
        this.add(gdur);
        this.add(dmoll);
        this.add(emoll);
        this.add(amoll);
        this.add(hmoll);

        this.add(dalej);

        gitara.setBounds(240, 100, 300, 150);
        gitara.setFont(new Font("MV Boli", Font.BOLD, 35));
        gitara.setFocusable(false);

        pianino.setBounds(740, 100, 300, 150);
        pianino.setFont(new Font("MV Boli", Font.BOLD, 35));
        pianino.setFocusable(false);

        cdur.setBounds(145, 450, 115, 100);
        cdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        cdur.setText("Cdur");
        cdur.setFocusable(false);
        cdur.setBackground(new Color(95, 16, 204));

        fdur.setBounds(290, 450, 115, 100);
        fdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        fdur.setText("Fdur");
        fdur.setFocusable(false);
        fdur.setBackground(new Color(95, 16, 204));

        gdur.setBounds(435, 450, 127, 100);
        gdur.setFont(new Font("MV Boli", Font.BOLD, 35));
        gdur.setText("Gdur");
        gdur.setFocusable(false);
        gdur.setBackground(new Color(95, 16, 204));

        dmoll.setBounds(580, 450, 131, 100);
        dmoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        dmoll.setText("Dmoll");
        dmoll.setFocusable(false);
        dmoll.setBackground(new Color(95, 16, 204));

        emoll.setBounds(725, 450, 127, 100);
        emoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        emoll.setText("Emoll");
        emoll.setFocusable(false);
        emoll.setBackground(new Color(95, 16, 204));

        amoll.setBounds(870, 450, 130, 100);
        amoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        amoll.setText("Amoll");
        amoll.setFocusable(false);
        amoll.setBackground(new Color(95, 16, 204));

        hmoll.setBounds(1015, 450, 131, 100);
        hmoll.setFont(new Font("MV Boli", Font.BOLD, 35));
        hmoll.setText("Hmoll");
        hmoll.setFocusable(false);
        hmoll.setBackground(new Color(95, 16, 204));


        dalej.setBounds(965, 660, 260, 130);
        dalej.setFont(new Font("MV Boli", Font.BOLD, 35));
        dalej.setFocusable(false);

        wyjdz.setBounds(50, 660, 263,134);
        wyjdz.setFocusable(false);
        wyjdz.setEnabled(true);


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
        nr = numer.nextInt(7);
        while (nr == poprzedni) {
            nr = numer.nextInt(7);
        }
        poprzedni = nr;
        System.out.println(nr);
        cdur.setBackground(new Color(95, 16, 204));
        fdur.setBackground(new Color(95, 16, 204));
        gdur.setBackground(new Color(95, 16, 204));
        emoll.setBackground(new Color(95, 16, 204));
        amoll.setBackground(new Color(95, 16, 204));
        hmoll.setBackground(new Color(95, 16, 204));
        dmoll.setBackground(new Color(95, 16, 204));

        cdur.setEnabled(true);
        dmoll.setEnabled(true);
        emoll.setEnabled(true);
        fdur.setEnabled(true);
        gdur.setEnabled(true);
        amoll.setEnabled(true);
        hmoll.setEnabled(true);
    }



    public void odswiez(){

        this.repaint();

    }

    /**
     * This method is used to start the game
     */

    public void gra () {

        /**
         * @ tab contains objects Biblioteka type
         */

        Biblioteka[] tab;
        tab = new Biblioteka[7];
        tab[0] = new Biblioteka("Cdur");
        tab[1] = new Biblioteka("Fdur");
        tab[2] = new Biblioteka("Gdur");
        tab[3] = new Biblioteka("Dmoll");
        tab[4] = new Biblioteka("Emoll");
        tab[5] = new Biblioteka("Amoll");
        tab[6] = new Biblioteka("Hmoll");

        losowanie();
        while (tab[nr].poziom > 3 && licznik < 5) {

            losowanie();

        }

        System.out.println(tab[nr].pathp);
        tab[nr].odtworzp();


        /**
         *  zagraj is for playing audio file
         */


        ActionListener zagraj = new ActionListener() {
            /**
             * This method is for choosing right method: piano or guitar, from Biblioteka class
             *  @param e gets source from button
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

                if (e.getSource() == dalej) {
                    losowanie();
                }


                tab[nr].odtworzp();

                pianino.setIcon(new ImageIcon("piano.png"));
                gitara.setIcon(new ImageIcon("gitara.png"));

                odswiez();

                dalej.removeActionListener(this);
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
             * @param b gets source from buttons
             */
            @Override
            public void actionPerformed(ActionEvent b) {


                if (b.getSource() == cdur) {

                    if (nr == 0) {
                        if(licznik<7) {
                            cdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 3) {
                                licznik++;
                            }
                        }
                        if(licznik>6){
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
                if (b.getSource() == fdur) {

                    if (nr == 1) {
                        if(licznik<7) {
                            fdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 3) {
                                licznik++;
                            }
                            if(licznik>6){
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
                if (b.getSource() == gdur) {

                    if (nr == 2) {

                        if(licznik<7) {
                            gdur.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 3) {
                                licznik++;
                            }
                            if(licznik>6){
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

                }
                if (b.getSource() == dmoll) {

                    if (nr == 3) {
                        if(licznik<7) {
                            dmoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 3) {
                                licznik++;
                            }
                            if(licznik>6){
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

                }
                if (b.getSource() == emoll) {

                    if (nr == 4) {
                        if(licznik<7) {
                            emoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 3) {
                                licznik++;
                            }
                            if(licznik>6){
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

                }
                if (b.getSource() == amoll) {

                    if (nr == 5) {
                        if(licznik<7) {
                            amoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 3) {
                                licznik++;
                            }
                            if(licznik>6){
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

                }
                if (b.getSource() == hmoll) {

                    if (nr == 6) {
                        if(licznik<7) {
                            hmoll.setBackground(Color.green);
                            tab[nr].poziom++;
                            if (tab[nr].poziom == 3) {
                                licznik++;
                            }
                            if(licznik>6){
                                gratulacje();
                            }
                        } else {
                            hmoll.setBackground(Color.red);
                            if (tab[nr].poziom > 0) {
                                tab[nr].poziom--;
                            }
                        }
                    }

                }

                cdur.setEnabled(false);
                dmoll.setEnabled(false);
                emoll.setEnabled(false);
                fdur.setEnabled(false);
                gdur.setEnabled(false);
                amoll.setEnabled(false);
                hmoll.setEnabled(false);


                if (nr == 0) {
                    cdur.setBackground(Color.green);
                }
                if (nr == 1) {
                    fdur.setBackground(Color.green);
                }
                if (nr == 2) {
                    gdur.setBackground(Color.green);
                }
                if (nr == 3) {
                    dmoll.setBackground(Color.green);
                }
                if (nr == 4) {
                    emoll.setBackground(Color.green);

                }
                if (nr == 5) {
                    amoll.setBackground(Color.green);

                }
                if (nr == 6) {
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
        dmoll.addActionListener(odpowiedz);
        emoll.addActionListener(odpowiedz);
        fdur.addActionListener(odpowiedz);
        gdur.addActionListener(odpowiedz);
        amoll.addActionListener(odpowiedz);
        hmoll.addActionListener(odpowiedz);


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


