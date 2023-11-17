import javax.swing.*; 
import javax.swing.tree.DefaultMutableTreeNode;  
public class Prac_8 {  
    JFrame f;  
    Prac_8(){  
        f=new JFrame();   
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
        style.add(color);  
        style.add(font);  
        color.add(new DefaultMutableTreeNode("red")); 
        color.add(new DefaultMutableTreeNode("blue")); 
        color.add(new DefaultMutableTreeNode("black")); 
        color.add(new DefaultMutableTreeNode("green")); 
        font.add(new DefaultMutableTreeNode("Verdena"));
        font.add(new DefaultMutableTreeNode("Akira Expanded"));     
        JTree jt=new JTree(style);  
        f.add(jt);  
        f.setSize(200,200);  
        f.setVisible(true);  
    }  
    public static void main(String[] args) {  
        new Prac_8();  
    }
}