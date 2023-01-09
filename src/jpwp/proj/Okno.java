package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *This class is to generate a window with main menu
 * @author Marcin Oliński 184700
 */

public class Okno extends JFrame {

    /**
     * These Buttons are used to to navigate menu
     */

    JButton nauka = new JButton(new ImageIcon("nauka.png"));
    JButton spr = new JButton(new ImageIcon("spr.png"));
    JButton durmoll = new JButton(new ImageIcon("durmoll.png"));
    JButton dzwieki1 = new JButton(new ImageIcon("dzwieki1.png"));
    JButton dzwieki2 = new JButton(new ImageIcon("dzwieki2.png"));
    JButton akordy1 = new JButton(new ImageIcon("akordy1.png"));
    JButton akordy2 = new JButton(new ImageIcon("akordy2.png"));
    JButton akordy3 = new JButton(new ImageIcon("akordy3.png"));

    JButton dzw = new JButton();
    JButton ak1 = new JButton();
    JButton ak2 = new JButton();

    JButton wyjdz = new JButton(new ImageIcon("wyjdz.png"));


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



        dzw.setBounds(450, 50, 400, 200);
        dzw.setFont(new Font("MV Boli", Font.BOLD, 35));
        dzw.setText("Dzwieki");
        dzw.setFocusable(false);
        dzw.setBackground(new Color(95, 16, 204));

        ak1.setBounds(450, 350, 400, 200);
        ak1.setFont(new Font("MV Boli", Font.BOLD, 35));
        ak1.setText("Akordy durowe");
        ak1.setFocusable(false);
        ak1.setBackground(new Color(95, 16, 204));

        ak2.setBounds(450, 650, 400, 200);
        ak2.setFont(new Font("MV Boli", Font.BOLD, 35));
        ak2.setText("Akordy mollowe");
        ak2.setFocusable(false);
        ak2.setBackground(new Color(95, 16, 204));

        wyjdz.setBounds(100, 700, 263,134);
        wyjdz.setFocusable(false);
        wyjdz.setEnabled(true);



        nauka.addActionListener(tryb);
        spr.addActionListener(tryb);

    }

    /**
     * This method is for adding buttons to the menu after choosing "sprawdzian" option,
     * removing previvous buttons, adding action listener and refreshing frame
     */

    void odsw(){

        this.add(durmoll);
        this.add(dzwieki1);
        this.add(dzwieki2);
        this.add(akordy1);
        this.add(akordy2);
        this.add(akordy3);
        this.add(wyjdz);
        this.remove(spr);
        this.remove(nauka);

        durmoll.addActionListener(poziom);
        dzwieki1.addActionListener(poziom);
        dzwieki2.addActionListener(poziom);
        akordy1.addActionListener(poziom);
        akordy2.addActionListener(poziom);
        akordy3.addActionListener(poziom);
        wyjdz.addActionListener(poziom);

        this.repaint();
    }

    /**
     * This method is for adding buttons to the menu after choosing "nauka" option,
     * removing previvous buttons, adding action listener and refreshing frame
     */

    void odsw2(){
        this.remove(spr);
        this.remove(nauka);

        this.add(dzw);
        this.add(ak1);
        this.add(ak2);
        this.add(wyjdz);

        dzw.addActionListener(poziom);
        ak1.addActionListener(poziom);
        ak2.addActionListener(poziom);
        wyjdz.addActionListener(poziom);

        this.repaint();
    }

    /**
     * This method is for going back to the main page
     */

    void wstecz(){

        this.dispose();
        Okno o = new Okno();


    }

    /**
     * This method is for closing window
     */

    public void zamknij(){

        this.dispose();
        this.repaint();

    }

    /**
     * tryb is for choosing menu options
     */

    ActionListener tryb = new ActionListener() {

        /**
         * This method is for checking action event source
         * @param e gets source from buttons nauka and sprawdzian
         */
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (e.getSource() == nauka) {
                        System.out.println("nauka");

                        odsw2();

                    }
                    if (e.getSource() == spr) {
                        System.out.println("sprawdzian");


                        odsw();

                    }

                }
            };
    /**
     *poziom is for choosing menu options from another level
     */
    ActionListener poziom = new ActionListener() {
        /**
         * This method is for checking action event source from second level
         * @param e gets source from other buttons
         */
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
                Dzwieki2 dd2 = new Dzwieki2();
                dd2.gra();

            }
            if(e.getSource()==akordy1){

                Akordy1 akr1 = new Akordy1();
                akr1.gra();
                zamknij();

            }
            if(e.getSource()==akordy2){

                Akordy2 akr2 = new Akordy2();
                akr2.gra();
                zamknij();

            }
            if(e.getSource()==akordy3){

                Akordy3 akr3 = new Akordy3();
                akr3.gra();
                zamknij();

            }

            if(e.getSource()==dzw)
            {

                Nauka nauka =  new Nauka();
                nauka.n();
                zamknij();

            }
            if(e.getSource()==ak1)
            {

                Nauka2 nauka2 = new Nauka2();
                nauka2.n();
                zamknij();

            }
            if(e.getSource()==ak2)
            {

                Nauka3 nauka3 = new Nauka3();
                nauka3.n();
                zamknij();

            }
            if(e.getSource()==wyjdz){

                wstecz();

            }

        }
    };

    }

