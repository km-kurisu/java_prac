import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prac_5 extends JFrame implements ActionListener{
    CardLayout card;
    JButton b1,b2,b3;
    Container c;
    
    Prac_5(){
        c = getContentPane();
        card = new CardLayout(50,50);

        c.setLayout(card);

        b1 = new JButton("Apple");
        b2 = new JButton("JJK");
        b3 = new JButton("Orange");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("a",b1);
        c.add("b",b2);
        c.add("c",b3);
    }

    public void actionPerformed(ActionEvent e){
        card.next(c);
    }

    public static void main(String [] args) {
        Prac_5 p5 = new Prac_5();
        p5.setSize(500,500);
        p5.setVisible(true);
        p5.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

/*<APPLET CODE="Prac_5.class" 
    HEIGHT=600
    WIDTH=600>
</APPLET> */