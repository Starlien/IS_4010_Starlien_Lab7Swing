import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LFCounter implements ActionListener{
  JLabel rightlabel;
  JLabel leftlabel;
  int leftCounter = 0;
    int rightCounter = 0;
   LFCounter(){
    JFrame frame = new JFrame("Counter");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    JButton Left = new JButton("Left");
    JButton Right = new JButton("Right");
    JButton Reset = new JButton("Reset");

    

    Left.addActionListener(this);
    Right.addActionListener(this);
    Reset.addActionListener(this);

    frame.add(Left);
    frame.add(Right);
    
    
    leftlabel = new JLabel("Count: " + leftCounter);
    rightlabel = new JLabel("Count: " + rightCounter);
    frame.add(leftlabel);
    frame.add(rightlabel);


    frame.add(Reset);
    frame.setVisible(true);
    
  
  

  }
  public void actionPerformed(ActionEvent ae){
    if(ae.getActionCommand().equals("Left")){
      leftCounter = leftCounter + 1;
      leftlabel.setText("Count: " + leftCounter);
    }
    if(ae.getActionCommand().equals("Right")){
      rightCounter = rightCounter + 1;
      rightlabel.setText("Count: " + rightCounter);
    }
    if(ae.getActionCommand().equals("Reset")){
      rightCounter = 0;
      leftCounter = 0;
      leftlabel.setText("Count: " + leftCounter);
      rightlabel.setText("Count: " + rightCounter);
  }
  }

  
}