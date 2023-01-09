package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * This class is for first sounds level of the game
 * @author Marcin Oliński 184700
 */

public class Dzwieki1 extends JFrame {


    public String gtr = "gitara.png";
    public String pn = "piano.png";

    ImageIcon git = new ImageIcon(gtr);
    ImageIcon piano = new ImageIcon(pn);

    JButton pianino = new JButton(piano);
    JButton gitara = new JButton(git);

    JButton wyjdz = new JButton(new ImageIcon("wyjdz.png"));


    JButton c = new JButton();
    JButton d = new JButton();
    JButton e = new JButton();
    JButton f = new JButton();
    JButton g = new JButton();
    JButton a = new JButton();
    JButton h = new JButton();
    JButton dalej = new JButton(new ImageIcon("dalej.png"));

    /**
     *  licznik is for count how many times has been chosen th correct answer
     *  poprzedni contains number of previous number
     *  nr number of sound option
     */


    int licznik = 0;
    int poprzedni;

    int nr;

    Dzwieki1() {
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Dźwięki poziom 1");
        this.setLayout(null);
        this.setResizable(false);

        this.add(gitara);
        this.add(pianino);

        this.add(c);
        this.add(d);
        this.add(e);
        this.add(f);
        this.add(g);
        this.add(a);
        this.add(h);

        this.add(dalej);

        gitara.setBounds(240, 100, 300, 150);
        gitara.setFont(new Font("MV Boli", Font.BOLD, 35));
        gitara.setFocusable(false);

        pianino.setBounds(740, 100, 300, 150);
        pianino.setFont(new Font("MV Boli", Font.BOLD, 35));
        pianino.setFocusable(false);

        c.setBounds(145, 450, 75, 100);
        c.setFont(new Font("MV Boli", Font.BOLD, 35));
        c.setText("C");
        c.setFocusable(false);
        c.setBackground(new Color(95, 16, 204));

        d.setBounds(290, 450, 75, 100);
        d.setFont(new Font("MV Boli", Font.BOLD, 35));
        d.setText("D");
        d.setFocusable(false);
        d.setBackground(new Color(95, 16, 204));

        e.setBounds(435, 450, 75, 100);
        e.setFont(new Font("MV Boli", Font.BOLD, 35));
        e.setText("E");
        e.setFocusable(false);
        e.setBackground(new Color(95, 16, 204));

        f.setBounds(580, 450, 75, 100);
        f.setFont(new Font("MV Boli", Font.BOLD, 35));
        f.setText("F");
        f.setFocusable(false);
        f.setBackground(new Color(95, 16, 204));

        g.setBounds(725, 450, 75, 100);
        g.setFont(new Font("MV Boli", Font.BOLD, 35));
        g.setText("G");
        g.setFocusable(false);
        g.setBackground(new Color(95, 16, 204));

        a.setBounds(870, 450, 75, 100);
        a.setFont(new Font("MV Boli", Font.BOLD, 35));
        a.setText("A");
        a.setFocusable(false);
        a.setBackground(new Color(95, 16, 204));

        h.setBounds(1015, 450, 75, 100);
        h.setFont(new Font("MV Boli", Font.BOLD, 35));
        h.setText("H");
        h.setFocusable(false);
        h.setBackground(new Color(95, 16, 204));


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
        c.setBackground(new Color(95, 16, 204));
        e.setBackground(new Color(95, 16, 204));
        f.setBackground(new Color(95, 16, 204));
        g.setBackground(new Color(95, 16, 204));
        a.setBackground(new Color(95, 16, 204));
        h.setBackground(new Color(95, 16, 204));
        d.setBackground(new Color(95, 16, 204));

        c.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
        g.setEnabled(true);
        a.setEnabled(true);
        h.setEnabled(true);
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
            tab = new Biblioteka[7];
            tab[0] = new Biblioteka("C");
            tab[1] = new Biblioteka("D");
            tab[2] = new Biblioteka("E");
            tab[3] = new Biblioteka("F");
            tab[4] = new Biblioteka("G");
            tab[5] = new Biblioteka("A");
            tab[6] = new Biblioteka("H");

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
                 * @param b gets source from buttons
                 */
            @Override
            public void actionPerformed(ActionEvent b) {


                    if (b.getSource() == c) {

                        if (nr == 0) {
                            if(licznik<7) {
                                c.setBackground(Color.green);
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
                            c.setBackground(Color.red);

                            if (tab[nr].poziom > 0) {
                                tab[nr].poziom--;
                            }
                        }

                    }
                    if (b.getSource() == d) {

                            if (nr == 1) {
                                if(licznik<7) {
                                d.setBackground(Color.green);
                                tab[nr].poziom++;
                                if (tab[nr].poziom == 3) {
                                    licznik++;
                                }
                                    if(licznik>6){
                                    gratulacje();
                                        dalej.removeActionListener(this);
                                }
                            } else {
                                d.setBackground(Color.red);
                                if (tab[nr].poziom > 0) {
                                    tab[nr].poziom--;
                                }
                            }
                        }

                    }
                    if (b.getSource() == e) {

                            if (nr == 2) {

                                if(licznik<7) {
                                e.setBackground(Color.green);
                                tab[nr].poziom++;
                                if (tab[nr].poziom == 3) {
                                    licznik++;
                                }
                                    if(licznik>6){
                                    gratulacje();
                                        dalej.removeActionListener(this);
                                }
                            } else {
                                e.setBackground(Color.red);
                                if (tab[nr].poziom > 0) {
                                    tab[nr].poziom--;
                                }
                            }
                        }

                    }
                    if (b.getSource() == f) {

                            if (nr == 3) {
                                if(licznik<7) {
                                f.setBackground(Color.green);
                                tab[nr].poziom++;
                                if (tab[nr].poziom == 3) {
                                    licznik++;
                                }
                                    if(licznik>6){
                                    gratulacje();
                                        dalej.removeActionListener(this);
                                }
                            } else {
                                f.setBackground(Color.red);
                                if (tab[nr].poziom > 0) {
                                    tab[nr].poziom--;
                                }
                            }
                        }

                    }
                    if (b.getSource() == g) {

                            if (nr == 4) {
                                if(licznik<7) {
                                g.setBackground(Color.green);
                                tab[nr].poziom++;
                                if (tab[nr].poziom == 3) {
                                    licznik++;
                                }
                                    if(licznik>6){
                                    gratulacje();
                                        dalej.removeActionListener(this);
                                }
                            } else {
                                g.setBackground(Color.red);
                                if (tab[nr].poziom > 0) {
                                    tab[nr].poziom--;
                                }
                            }
                        }

                    }
                    if (b.getSource() == a) {

                            if (nr == 5) {
                                if(licznik<7) {
                                a.setBackground(Color.green);
                                tab[nr].poziom++;
                                if (tab[nr].poziom == 3) {
                                    licznik++;
                                }
                                    if(licznik>6){
                                    gratulacje();
                                        dalej.removeActionListener(this);
                                }
                            } else {
                                a.setBackground(Color.red);
                                if (tab[nr].poziom > 0) {
                                    tab[nr].poziom--;
                                }
                            }
                        }

                    }
                    if (b.getSource() == h) {

                            if (nr == 6) {
                                if(licznik<7) {
                                h.setBackground(Color.green);
                                tab[nr].poziom++;
                                if (tab[nr].poziom == 3) {
                                    licznik++;
                                }
                                    if(licznik>6){
                                    gratulacje();
                                }
                            } else {
                                h.setBackground(Color.red);
                                if (tab[nr].poziom > 0) {
                                    tab[nr].poziom--;
                                }
                            }
                        }

                    }

                    c.setEnabled(false);
                    d.setEnabled(false);
                    e.setEnabled(false);
                    f.setEnabled(false);
                    g.setEnabled(false);
                    a.setEnabled(false);
                    h.setEnabled(false);


                    if (nr == 0) {
                        c.setBackground(Color.green);
                    }
                    if (nr == 1) {
                        d.setBackground(Color.green);
                    }
                    if (nr == 2) {
                        e.setBackground(Color.green);
                    }
                    if (nr == 3) {
                        f.setBackground(Color.green);
                    }
                    if (nr == 4) {
                        g.setBackground(Color.green);

                    }
                    if (nr == 5) {
                        a.setBackground(Color.green);

                    }
                    if (nr == 6) {
                        h.setBackground(Color.green);
                    }
                    dalej.addActionListener(nastepne);

                    gitara.setIcon(new ImageIcon(tab[nr].pathgitimg));
                    pianino.setIcon(new ImageIcon(tab[nr].pathpianoimg));
                    odswiez();
                    System.out.println("poziom"+tab[nr].poziom);
                    System.out.println("licznik"+licznik);


                }

        };




            c.addActionListener(odpowiedz);
            d.addActionListener(odpowiedz);
            e.addActionListener(odpowiedz);
            f.addActionListener(odpowiedz);
            g.addActionListener(odpowiedz);
            a.addActionListener(odpowiedz);
            h.addActionListener(odpowiedz);


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


