import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener{
    JCheckBox box ;
    JButton b;
    ImageIcon x ;
    ImageIcon y ;

    myFrame(){
        //this.setSize(500,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        x = new ImageIcon("right.jpg");
        y = new ImageIcon("wrong.jpg");

        b = new JButton();
        b.setText("Submit");
        b.addActionListener(this);
     
        box = new JCheckBox();
        box.setText("I am not a Robot");
        //box.setSize(50,50);
        box.setFocusable(false);
        box.setFont(new Font("Consolas",Font.PLAIN,35));
        box.setIcon(x);
        box.setSelectedIcon(y);
        
       // box.setBounds(40,100,20,30);
       this.setBounds(50,90,200,100);
        this.setPreferredSize(new Dimension());


        this.add(b);
        this.add(box);
        this.pack();
        this.setVisible(true);

     }





    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            System.out.println(box.isSelected());

        }
        // TODO Auto-generated method stub
        
    }
}