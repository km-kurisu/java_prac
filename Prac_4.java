import java.awt.*;
import javax.swing.*;

public class Prac_4 extends JFrame {
   JMenuBar menuBar;
   JMenu fileMenu, editMenu, helpMenu;
   JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem;

   public Prac_4() {
      setTitle("Menu Demo");
      setSize(300, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      menuBar = new JMenuBar();

      fileMenu = new JMenu("File");
      newMenuItem = new JMenuItem("New");
      openMenuItem = new JMenuItem("Open");
      saveMenuItem = new JMenuItem("Save");
      exitMenuItem = new JMenuItem("Exit");
      fileMenu.add(newMenuItem);
      fileMenu.add(openMenuItem);
      fileMenu.add(saveMenuItem);
      fileMenu.addSeparator();
      fileMenu.add(exitMenuItem);

      editMenu = new JMenu("Edit");

      helpMenu = new JMenu("Help");

      menuBar.add(fileMenu);
      menuBar.add(editMenu);
      menuBar.add(helpMenu);

      setJMenuBar(menuBar);
   }

   public static void main(String[] args) {
      Prac_4 Prac_4 = new Prac_4();
      Prac_4.setVisible(true);
   }
}

/*<APPLET CODE="Prac_4.class" 
    HEIGHT=600
    WIDTH=600>
</APPLET> */