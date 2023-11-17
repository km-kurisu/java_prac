import javax.swing.*;    
import java.awt.event.*;  
public class Prac_10 {  
    public static void main(String[] args) {    
    JFrame f=new JFrame("Password Field Example");    
     final JLabel label = new JLabel();             
     final JPasswordField value = new JPasswordField();   
     label.setBounds(20,150, 200,50); 
     value.setBounds(100,75,100,30);   
        JLabel l1=new JLabel("Username:");    
        JLabel l2=new JLabel("Password:");    
        l2.setBounds(20,75, 80,30);    
        l1.setBounds(20,20, 80,30);
        JButton b = new JButton("Login");  
        b.setBounds(100,120, 80,30);    
        final JTextField text = new JTextField();  
        text.setBounds(100,20, 100,30);    
                f.add(value); 
                f.add(l1); 
                f.add(label); 
                f.add(l2); 
                f.add(b); 
                f.add(text);  
                f.setSize(300,300);    
                f.setLayout(null);    
                f.setVisible(true);     
                b.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {       
                   String data = "Username " + text.getText();  
                   data += ", Password: " + new String(value.getPassword());   
                   label.setText(data);          
                }  
             });   
    }  
} 