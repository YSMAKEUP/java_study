import javax.swing.*;
import java.awt.*;

public class swing  extends JFrame  {
         public swing(){
             setTitle("스윙 프로젝트 연습");

             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setSize(500,300);
             setLocationRelativeTo(null);

             Container cp = getContentPane();
             cp.setLayout(null);
//             cp.setLayout
//

            JLabel jLabel =new JLabel("label test");
            jLabel.setBounds(100,100,100,10);
            cp.add(jLabel);

            JButton jButton = new JButton("Button Test");
            jLabel.setBounds(130,130,100,20);
            cp.add(jButton);

            JCheckBox lion = new JCheckBox("사자");
            JCheckBox rabbit = new JCheckBox("토끼");

            cp.add(lion);
            cp.add(rabbit);

            JColorChooser jColorChooser = new JColorChooser();
            jColorChooser.setBounds();



            String[] colors = {"red","yellow","blue"};
            String[] animals = {"rabbit","panda","Zebra"};




             setVisible(true);

         }
         public static void main(String[]args){
             swing se = new swing();

         }
}

