package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JFrame {



    JButton nauka = new JButton(new ImageIcon("nauka.png"));
    JButton spr = new JButton(new ImageIcon("spr.png"));
    JButton durmoll = new JButton(new ImageIcon("durmoll.png"));
    JButton dzwieki1 = new JButton(new ImageIcon("dzwieki1.png"));
    JButton dzwieki2 = new JButton(new ImageIcon("dzwieki2.png"));
    JButton akordy1 = new JButton(new ImageIcon("akordy1.png"));
    JButton akordy2 = new JButton(new ImageIcon("akordy2.png"));
    JButton akordy3 = new JButton(new ImageIcon("akordy3.png"));

    Okno() {
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Słuch absolutny");
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(50, 50, 50));
        this.add(nauka);
        this.add(spr);

        nauka.setBounds(507, 100, 266, 180);
        spr.setBounds(506, 500, 268, 179);
        nauka.setFocusable(false);
        spr.setFocusable(false);

        durmoll.setBounds(250, 150, 264, 130);
        dzwieki1.setBounds(250, 300, 264, 130);
        dzwieki2.setBounds(250, 450, 264, 130);
        akordy1.setBounds(800, 150, 264, 130);
        akordy2.setBounds(800, 300, 264, 130);
        akordy3.setBounds(800, 450, 264, 130);




        nauka.addActionListener(tryb);
        spr.addActionListener(tryb);

    }

    void odsw(){
        this.add(durmoll);
        this.add(dzwieki1);
        this.add(dzwieki2);
        this.add(akordy1);
        this.add(akordy2);
        this.add(akordy3);
        this.remove(spr);
        this.remove(nauka);

        durmoll.addActionListener(poziom);
        dzwieki1.addActionListener(poziom);
        dzwieki2.addActionListener(poziom);
        akordy1.addActionListener(poziom);
        akordy2.addActionListener(poziom);
        akordy3.addActionListener(poziom);

        this.repaint();
    }

    public void zamknij(){

        this.dispose();
        this.repaint();

    }

    public void otworz(){

        this.setVisible(true);
        this.repaint();

    }


            ActionListener tryb = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (e.getSource() == nauka) {
                        System.out.println("nauka");

                    }
                    if (e.getSource() == spr) {
                        System.out.println("sprawdzian");


                        odsw();

                    }

                }
            };
    ActionListener poziom = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==durmoll){
                zamknij();
                Durmoll durmoll = new Durmoll();
                durmoll.gra();
            }
            if(e.getSource()==dzwieki1){
                zamknij();

                Dzwieki1 dd1 = new Dzwieki1();
                dd1.gra();

            }
            if(e.getSource()==dzwieki2){
                zamknij();

            }
            if(e.getSource()==akordy1){
                zamknij();

            }
            if(e.getSource()==akordy2){
                zamknij();

            }
            if(e.getSource()==akordy3){
                zamknij();

            }

        }
    };

    }

