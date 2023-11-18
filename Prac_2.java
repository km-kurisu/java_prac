import java.applet.*;
import java.awt.*;

public class Prac_2 extends Applet{
    public void init(){
        List l1 = new List( 4);
        l1.add("Mumbai");
        l1.add("chennai");
        l1.add("Delhi");
        

        Choice ch1 = new Choice();
        ch1.add("patna");
        ch1.add("indore");
        ch1.add("kanpur");

        add(l1);
        add(ch1);
    }
}


/*<APPLET CODE="Prac_2.class" 
    HEIGHT=600
    WIDTH=600>
</APPLET> */