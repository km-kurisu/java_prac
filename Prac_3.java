//Q3. Write a program to demonstrate the use of border layout, card layout and grid layout

/*import java.applet.*;
import java.awt.*;
//import java.awt.event.*;
//import java.swing.*;

public class Prac_3 extends Applet {
    public void init(){

        Frame Fr1 = new Frame("Border Layout");
        Fr1.setLayout(new BorderLayout(3,5));
        Fr1.setSize(500,500);
        Fr1.setVisible(true);

        
        Fr1.add(new Button("North"),BorderLayout.NORTH);
        Fr1.add(new Button("West"),BorderLayout.WEST);
        Fr1.add(new Button("East"),BorderLayout.EAST);
        Fr1.add(new Button("South"),BorderLayout.SOUTH);
        Fr1.add(new Button("Center"),BorderLayout.CENTER);

        Frame Fr2 = new Frame("Grid Layout");
        Fr2.setLayout(new GridLayout(5,5));
        Fr2.setSize(500,500);
        Fr2.setVisible(true);
        Fr2.add(new Button("b1"));
        Fr2.add(new Button("b2"));
        Fr2.add(new Button("b3"));
        Fr2.add(new Button("b4"));


        /*CardLayout card;
        Frame Fr2 = new Frame();
        card = new CardLayout(40,50);
        Fr2.setLayout(card);
        Fr2.setLayout(new CardLayout(40,50));
        Fr2.setSize(500,500);
        Fr2.setVisible(true);

        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        Fr2.add("a",b1);
        Fr2.add("b",b2);
        Fr2.add("c",b3);
        card.next(Fr2);

        add(Fr1);
        add(Fr2);
    }

    /*public void actionPerformed(ActionEvent e){
        card.next(Fr2);
    }
} */

import java.awt.*;
import javax.swing.*;
import java.applet.*;

class one extends JPanel{
    
    public one(){
        setLayout(new BorderLayout());
        add(new JLabel("IDE's"));
        add(new Checkbox("VS Code"),BorderLayout.NORTH);
        add(new Checkbox("Eclipse"),BorderLayout.EAST);
    }
}
class two extends JPanel{
    
    public two(){
        setLayout(new CardLayout());
        add(new Button("Languages"));
        add(new Button("Dart"));
        add(new Button("C++"));
    }
}
class three extends JPanel{
    
    public three(){
        setLayout(new GridLayout());
        add(new JLabel("Languages"));
        add(new Button("Dart"));
        add(new Button("C++"));
    }
}
public class Prac_3 extends JApplet{
    @Override
    public void init(){
        JTabbedPane tb1 = new JTabbedPane();
        tb1.addTab("Border", new one());
        tb1.addTab("Card", new two());
        tb1.addTab("Grid", new three());
        getContentPane().add(tb1);
    }
}

/*<APPLET CODE="Prac_3.class" 
    HEIGHT=600
    WIDTH=600>
</APPLET> */