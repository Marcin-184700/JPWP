package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Dzwieki1 extends JFrame {

    JButton pianino = new JButton();
    JButton gitara = new JButton();

    String gtr = "gitara.png";
    String pn = "piano.png";

    ImageIcon git = new ImageIcon(gtr);
    ImageIcon piano = new ImageIcon(pn);

    JButton c = new JButton();
    JButton d = new JButton();
    JButton e = new JButton();
    JButton f = new JButton();
    JButton g = new JButton();
    JButton a = new JButton();
    JButton h = new JButton();
    JButton dalej = new JButton(new ImageIcon("dalej.png"));
    int licznik = 0;
    int poprzedni;
    public boolean gotowe = false;

    int nr;
    public String Odp;

    Dzwieki1() {
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Dur czy moll?");
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
        gitara.setText("g");
        gitara.setFocusable(false);

        pianino.setBounds(740, 100, 300, 150);
        pianino.setFont(new Font("MV Boli", Font.BOLD, 35));
        pianino.setText("p");
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


        this.getContentPane().setBackground(new Color(50, 50, 50));
    }


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


        public void gra () {
            losowanie();
            Biblioteka[] tab;
            tab = new Biblioteka[10];
            tab[0] = new Biblioteka("C");
            tab[1] = new Biblioteka("D");
            tab[2] = new Biblioteka("E");
            tab[3] = new Biblioteka("F");
            tab[4] = new Biblioteka("G");
            tab[5] = new Biblioteka("A");
            tab[6] = new Biblioteka("H");

            System.out.println(tab[nr].pathp);
            tab[nr].odtworzp();


            ActionListener zagraj = new ActionListener() {
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

            ActionListener nastepne = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (e.getSource() == dalej) {
                        losowanie();
                        tab[nr].odtworzp();
                        dalej.removeActionListener(this);
                    }

                }
            };

        ActionListener odpowiedz = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b) {

                void dobra_odp(){


                }

                if (b.getSource() == c) {

                    if (nr == 0) {
                        c.setBackground(Color.green);
                        if (licznik < 7) {
                            licznik++;
                        } else {
                            gratulacje();
                        }
                    } else {
                        c.setBackground(Color.red);

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


                        if (licznik > 0) {
                            licznik--;
                        }
                    }

                }

                if (b.getSource() == e) {

                    if (nr == 2) {
                        e.setBackground(Color.green);
                        if (licznik < 9) {
                            licznik++;
                        } else {
                            gratulacje();
                        }
                    } else {
                        e.setBackground(Color.red);

                        if (nr == 0) {
                            c.setBackground(Color.green);
                        }
                        if (nr == 1) {
                            d.setBackground(Color.green);
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


                        if (licznik > 0) {
                            licznik--;
                        }
                    }

                }

                if (b.getSource() == d) {

                    if (nr == 1) {
                        d.setBackground(Color.green);
                        if (licznik < 9) {
                            licznik++;
                        } else {
                            gratulacje();
                        }
                    } else {
                        d.setBackground(Color.red);

                        if (nr == 0) {
                            c.setBackground(Color.green);
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


                        if (licznik > 0) {
                            licznik--;
                        }
                    }
                }

                if (b.getSource() == f) {

                    if (nr == 3) {
                        f.setBackground(Color.green);
                        if (licznik < 9) {
                            licznik++;
                        } else {
                            gratulacje();
                        }
                    } else {
                        f.setBackground(Color.red);

                        if (nr == 0) {
                            c.setBackground(Color.green);
                        }
                        if (nr == 2) {
                            e.setBackground(Color.green);
                        }
                        if (nr == 1) {
                            d.setBackground(Color.green);
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


                        if (licznik > 0) {
                            licznik--;
                        }
                    }
                }

                if (b.getSource() == g) {

                    if (nr == 4) {
                        g.setBackground(Color.green);
                        if (licznik < 9) {
                            licznik++;
                        } else {
                            gratulacje();
                        }
                    } else {
                        g.setBackground(Color.red);

                        if (nr == 0) {
                            c.setBackground(Color.green);
                        }
                        if (nr == 2) {
                            e.setBackground(Color.green);
                        }
                        if (nr == 3) {
                            f.setBackground(Color.green);
                        }
                        if (nr == 1) {
                            d.setBackground(Color.green);

                        }
                        if (nr == 5) {
                            a.setBackground(Color.green);

                        }
                        if (nr == 6) {
                            h.setBackground(Color.green);
                        }


                        if (licznik > 0) {
                            licznik--;
                        }
                    }

                }

                if (b.getSource() == a) {

                    if (nr == 5) {
                        a.setBackground(Color.green);
                        if (licznik < 9) {
                            licznik++;
                        } else {
                            gratulacje();
                        }
                    } else {
                        a.setBackground(Color.red);

                        if (nr == 0) {
                            c.setBackground(Color.green);
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
                        if (nr == 1) {
                            d.setBackground(Color.green);

                        }
                        if (nr == 6) {
                            h.setBackground(Color.green);
                        }
                    }
                }


                if (b.getSource() == h) {

                    if (nr == 6) {
                        h.setBackground(Color.green);
                        if (licznik < 9) {
                            licznik++;
                        } else {
                            gratulacje();
                        }
                    } else {
                        h.setBackground(Color.red);

                        if (nr == 0) {
                            c.setBackground(Color.green);
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
                        if (nr == 1) {
                            d.setBackground(Color.green);
                        }


                        if (licznik > 0) {
                            licznik--;
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
                Odp="dur";
                System.out.println(Odp);
                dalej.addActionListener(nastepne);
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
        public void gratulacje () {


        ActionListener next = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==dalej) {

                    Okno o = new Okno();

                }

            }
        };

            this.getContentPane().removeAll();
            this.add(dalej);
            this.repaint();

            JTextField napis = new JTextField();
            napis.setBounds(350, 262, 600, 100);
            napis.setFont(new Font("MV Boli", Font.BOLD, 50));
            napis.setText("Gratulacje!");
            napis.setDisabledTextColor(Color.green);
            napis.setSelectedTextColor(Color.green);
            napis.setHorizontalAlignment(JTextField.CENTER);
            napis.setBackground(Color.black);
            this.add(napis);

            JTextField napis2 = new JTextField();
            napis2.setBounds(350, 362, 600, 100);
            napis2.setFont(new Font("MV Boli", Font.BOLD, 50));
            napis2.setText("Dobrze Ci Idzie");
            napis2.setDisabledTextColor(Color.green);
            napis2.setSelectedTextColor(Color.green);
            napis2.setHorizontalAlignment(JTextField.CENTER);
            napis2.setBackground(Color.black);
            this.add(napis2);

            JTextField napis3 = new JTextField();
            napis3.setBounds(350, 462, 600, 100);
            napis3.setFont(new Font("MV Boli", Font.BOLD, 50));
            napis3.setText("Nacisnij dalej");
            napis3.setDisabledTextColor(Color.green);
            napis3.setSelectedTextColor(Color.green);
            napis3.setHorizontalAlignment(JTextField.CENTER);
            napis3.setBackground(Color.black);
            this.add(napis3);

            JTextField napis4 = new JTextField();
            napis4.setBounds(350, 562, 600, 100);
            napis4.setFont(new Font("MV Boli", Font.BOLD, 50));
            napis4.setText("i wybierz kolejny etap");
            napis4.setDisabledTextColor(Color.green);
            napis4.setSelectedTextColor(Color.green);
            napis4.setHorizontalAlignment(JTextField.CENTER);
            napis4.setBackground(Color.black);
            this.add(napis4);
            gotowe = true;
            this.setVisible(false);


        }

    }


