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