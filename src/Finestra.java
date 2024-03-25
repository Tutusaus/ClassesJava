import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Finestra implements ActionListener{
    Button b=new Button("Boto1");
    Button c=new Button("Boto2");
    public static void main(String[] args){
        /* new Finestra(); */
        //CLASSE 2 (FINESTRA DE MANERA MÉS SENZILLA)//////////////////////////
        JFrame f=new JFrame("Finestra");
        f.setLayout(null);
        Button b=new Button("Boto");
        f.add(b);

        f.setSize(800,800);
        f.setVisible(true);
        b.setBounds(400, 400, b.getPreferredSize().width, b.getPreferredSize().height);
        ////////////////////////////////////
    }

    Finestra(){
        Frame f=new Frame("Finestra");
        f.setLayout(new FlowLayout());
        f.add(b);
        f.add(c);
        c.addActionListener(this);
        b.addActionListener(this);
        f.setVisible(true);
        b.setVisible(true);
        f.setSize(500,500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            System.out.println("boto1 premut");
        }
        if(e.getSource()==c){
            System.out.println("boto2 premut");
        }
    }
}