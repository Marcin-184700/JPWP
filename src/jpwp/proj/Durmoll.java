package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * This class is for first level of the game
 * @author Marcin Oliński 184700
 */

public class Durmoll extends JFrame {

    JButton pianino = new JButton(new ImageIcon("piano.png"));
    JButton gitara = new JButton(new ImageIcon("gitara.png"));
    JButton dur = new JButton();
    JButton moll = new JButton();
    JButton dalej = new JButton(new ImageIcon("dalej.png"));

    JButton wyjdz = new JButton(new ImageIcon("wyjdz.png"));

    /**
     *  licznik is for count how many times has been chosen th correct answer
     *  poprzedni contains number of previous number
     *  nr number of sound option
     */


    int licznik=0;
    int poprzedni;

    int nr;

    Durmoll() {
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Dur czy moll?");
        this.setLayout(null);
        this.setResizable(false);
        this.add(gitara);
        this.add(pianino);
        this.add(dur);
        this.add(moll);
        this.add(dalej);

        gitara.setBounds(240, 100, 300, 150);
        gitara.setFont(new Font("MV Boli", Font.BOLD, 35));
        gitara.setFocusable(false);

        pianino.setBounds(740, 100, 300, 150);
        pianino.setFont(new Font("MV Boli", Font.BOLD, 35));
        pianino.setFocusable(false);

        dur.setBounds(790, 450, 150, 100);
        dur.setFont(new Font("MV Boli", Font.BOLD, 35));
        dur.setText("Dur");
        dur.setFocusable(false);
        dur.setBackground(new Color(95, 16, 204));

        moll.setBounds(340, 450, 150, 100);
        moll.setFont(new Font("MV Boli", Font.BOLD, 35));
        moll.setText("Moll");
        moll.setFocusable(false);
        moll.setBackground(new Color(95, 16, 204));


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
     * This methos is for choosing random number.
     * When drawed number is the same as previous one another number is choosen.
     */

    public void losowanie() {
        Random numer = new Random();
        nr = numer.nextInt(10);
        while(nr==poprzedni)
        {
            nr = numer.nextInt(10);
        }
        poprzedni=nr;
        System.out.println(nr);
        moll.setBackground(new Color(95, 16, 204));
        dur.setBackground(new Color(95, 16, 204));
        dur.setEnabled(true);
        moll.setEnabled(true);
    }

    /**
     * This method is used to start the game
     */

    public void gra() {

        /**
         *  tab contains objects Biblioteka type
         */
        losowanie();
        Biblioteka[] tab;
        tab = new Biblioteka[10];
        tab[0] = new Biblioteka("Cdur");
        tab[1] = new Biblioteka("Cmoll");
        tab[2] = new Biblioteka("Ddur");
        tab[3] = new Biblioteka("Dmoll");
        tab[4] = new Biblioteka("Edur");
        tab[5] = new Biblioteka("Emoll");
        tab[6] = new Biblioteka("Fdur");
        tab[7] = new Biblioteka("Fmoll");
        tab[8] = new Biblioteka("Gdur");
        tab[9] = new Biblioteka("Gmoll");

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
                 * @param e gets source from buttons
                 */
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (e.getSource() == dur) {

                        if((nr%2)==0){
                            dur.setBackground(Color.green);
                            if(licznik<9) {
                                licznik++;
                            }
                            else{
                                gratulacje();
                                dalej.removeActionListener(this);

                            }
                        }
                        else{
                            dur.setBackground(Color.red);
                            moll.setBackground(Color.green);
                            if(licznik>0){
                                licznik--;
                            }
                        }

                    }

                    if (e.getSource() == moll) {

                        if((nr%2)==1){
                            moll.setBackground(Color.green);
                            if(licznik<9) {
                                licznik++;
                            }
                            else{
                                gratulacje();
                                dalej.removeActionListener(this);
                            }
                        }
                        else{
                            moll.setBackground(Color.red);
                            dur.setBackground(Color.green);
                            if(licznik>0){
                                licznik--;
                            }
                        }
                    }
                    dur.setEnabled(false);
                    moll.setEnabled(false);
                    dalej.addActionListener(nastepne);

                }
            };
            dur.addActionListener(odpowiedz);
            moll.addActionListener(odpowiedz);






        };

    /**
     * This method is for closing this window.
     */
    void zamknij(){

        this.dispose();

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

