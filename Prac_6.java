import java.applet.*;
import java.awt.*;

public class Prac_6 extends Applet {
    public void init(){

        Frame Fr1 = new Frame("Grid Layout");
        Fr1.setLayout(new GridLayout(3,2));
        Fr1.setSize(500,500);
        Fr1.setVisible(true);
        Fr1.add(new Button("b1"));
        Fr1.add(new Button("b2"));
        Fr1.add(new Button("b3"));
        Fr1.add(new Button("b4"));
        Fr1.add(new Button("b5"));
        Fr1.add(new Button("b6"));

        add(Fr1);
    }
}

/*<APPLET CODE="Prac_6.class" 
    HEIGHT=600
    WIDTH=600>
</APPLET> */