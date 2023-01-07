package jpwp.proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Durmoll extends JFrame {

    JButton pianino = new JButton(new ImageIcon("piano.png"));
    JButton gitara = new JButton(new ImageIcon("gitara.png"));
    JButton dur = new JButton();
    JButton moll = new JButton();
    JButton dalej = new JButton(new ImageIcon("dalej.png"));
    int licznik=0;
    int poprzedni;
    public boolean gotowe=false;

    int nr;
    public String Odp;

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



        this.getContentPane().setBackground(new Color(50, 50, 50));
        //SwingUtilities.updateComponentTreeUI(this);
        //pianino.setLocation(0, 50);
        //gitara.setLocation(200, 50);
        //dur.setLocation(400, 50);
        //moll.setLocation(600, 50);
        //dalej.setLocation(800, 50);
    }


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


    public void gra() {
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

                if (e.getSource()==dalej){
                    losowanie();
                    tab[nr].odtworzp();
                    dalej.removeActionListener(this);
                }

            }
        };

            ActionListener odpowiedz = new ActionListener() {
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
                    Odp="moll";
                    System.out.println(Odp);
                    dalej.addActionListener(nastepne);

                }
            };
            dur.addActionListener(odpowiedz);
            moll.addActionListener(odpowiedz);






        };
    public void gratulacje(){

        this.getContentPane().removeAll();
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
        gotowe=true;


    }

}

