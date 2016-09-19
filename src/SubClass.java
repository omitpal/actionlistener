import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SubClass extends JFrame implements ActionListener {
    private JLabel l;
    private JTextField name;
    private JButton j;
    private String names;
    
    public SubClass(){
    
    setLayout(null);
    
       setSize(300,250);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l=new JLabel("Enter your name");
          
    name=new JTextField();
      j=new JButton("click");
         l.setBounds(60,30,120,30);
         name.setBounds(80,60,130,30);
       j.setBounds(100,190,60,30);
          j.addActionListener(this);
           add(j);
           add(l);
           add(name);
    }
    
      public void actionPerformed(ActionEvent e){
          if(e.getSource()==j){
             
          names=name.getText();
              JOptionPane.showMessageDialog(null, "Hello names");
                System.exit(10);
              
          }
      
      }
}