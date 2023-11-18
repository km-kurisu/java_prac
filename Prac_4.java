import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Prac_4 extends Frame{
    MenuBar mb;
    MenuItem m1,m2,m3,m4;
    Menu mn;
    MenuShortcut msb;

    public Prac_4(){
        setTitle("MenuBar");
        setSize(500,500);
        setLayout(null);

        msb = new MenuShortcut(KeyEvent.VK_X);
        mn = new Menu("File");
        mb = new MenuBar();
        m1 = new MenuItem("New File");
        m2 = new MenuItem("Open File");
        m3 = new MenuItem("Save File");
        
        mn.add(m1);
        mn.add(m2);
        mn.add(m3);
        
        setMenuBar(mb);

    }

    public static void main(String[] args) {
        Prac_4 pr = new Prac_4();
        pr.setVisible(true);
    }
}

/*<APPLET CODE="Prac_4.class" 
    HEIGHT=600
    WIDTH=600>
</APPLET> */