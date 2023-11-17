import javax.swing.*;   
public class Prac_7 {    
    JFrame f;    
    Prac_7(){    
        f=new JFrame("ComboBox Example");    
        String cities[]={"Mumbai","Delhi","banglore","Hydrabaad","Kolkatta"};        
        JComboBox cb = new JComboBox(cities);    
        cb.setBounds(50, 50,90,20);    
        f.add(cb);        
        f.setLayout(null);    
        f.setSize(400,500);    
        f.setVisible(true);         
    }    
    public static void main(String[] args) {    
        new Prac_7();         
    }    
}
