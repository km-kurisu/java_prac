//Q1. write a program to demonstrate textbox, radio button and checkbox.

//importing applet, awt and swings
import java.applet.*;
import java.awt.*;
import javax.swing.*;

public class Prac_1 extends Applet{
    
    //you can use public static void main it works as well
    public void init(){
        
        //text area
        TextArea t1 = new TextArea("This is a TextArea");
        
        //textfield
        TextField Tf1 = new TextField("this is a text field");

        //radiobutton uses JRadioButtonMenuItem from the swings class
        JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("Pick one");
        JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("Pick two");
        JRadioButtonMenuItem r3 = new JRadioButtonMenuItem("Pick three");

        //checkbox
        Checkbox cb1 = new Checkbox("This is checkbox One");
        Checkbox cb2 = new Checkbox("This is checkbox Two");
        Checkbox cb3 = new Checkbox("This is checkbox Three");
        
        //adding all the components 
        add(Tf1);
        add(t1);
        add(r1);
        add(r2);
        add(r3);
        add(cb1);
        add(cb2);
        add(cb3);
    }
}

/*<APPLET CODE="Prac_1.class" 
    HEIGHT=600
    WIDTH=600>
</APPLET> */