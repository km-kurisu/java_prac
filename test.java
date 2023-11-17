//this is a test file to make sure applet works

import java.applet.*;
import java.awt.*;

public class test extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello this is a test",100,150);
    }
}

/*<APPLET CODE="test.class" 
    HEIGHT=500
    WIDTH=500>
</APPLET> */