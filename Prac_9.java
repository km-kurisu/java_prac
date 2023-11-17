import javax.swing.*;    
public class Prac_9 {    
    JFrame f;    
    Prac_9(){    
    f=new JFrame();    
    String data[][]={   {"Nihar","3D","Blender"},    
                        {"Kamlesh","Illustration","Illustrator"},    
                        {"Om","Video Editor","After Effects"}};    
    String column[]={"Name","Department","Software"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new Prac_9();    
}    
}  