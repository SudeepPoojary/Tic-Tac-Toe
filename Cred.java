import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Cred{
    JFrame frame6 = new JFrame();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();
    JButton button6 = new JButton();
    JPanel creditpanel = new JPanel();
    Cred(){
        //frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setSize(500,500);
        frame6.setVisible(true);

        creditpanel.setLayout(new GridLayout(6,1,0,15));

        label1.setBackground(new Color(255,255,255));
        label1.setForeground(new Color(50,50,50));
        label1.setFont(new Font("Arial",Font.BOLD,60));
        label1.setHorizontalAlignment(JLabel.CENTER);               //Sets the alignment of the label's contents along the X axis
        label1.setText("CREDITS");
        label1.setOpaque(true);

        label2.setBackground(new Color(50,50,50));
        label2.setForeground(new Color(0,250,154));
        label2.setFont(new Font("Arial",Font.BOLD,40));
        label2.setHorizontalAlignment(JLabel.CENTER);               //Sets the alignment of the label's contents along the X axis
        label2.setText("Sudeep K");
        label2.setOpaque(true);

        label3.setBackground(new Color(50,50,50));
        label3.setForeground(new Color(0,250,154));
        label3.setFont(new Font("Arial",Font.BOLD,40));
        label3.setHorizontalAlignment(JLabel.CENTER);               //Sets the alignment of the label's contents along the X axis
        label3.setText("Sirish Pandit");
        label3.setOpaque(true);

        label4.setBackground(new Color(50,50,50));
        label4.setForeground(new Color(0,250,154));
        label4.setFont(new Font("Arial",Font.BOLD,40));
        label4.setHorizontalAlignment(JLabel.CENTER);               //Sets the alignment of the label's contents along the X axis
        label4.setText("Rohit Kumar");
        label4.setOpaque(true);

        label5.setBackground(new Color(50,50,50));
        label5.setForeground(new Color(0,250,154));
        label5.setFont(new Font("Arial",Font.BOLD,40));
        label5.setHorizontalAlignment(JLabel.CENTER);               //Sets the alignment of the label's contents along the X axis
        label5.setText("Suhas Pai");
        label5.setOpaque(true);

        label6.setBackground(new Color(50,50,50));
        label6.setForeground(new Color(0,250,154));
        label6.setFont(new Font("Arial",Font.BOLD,40));
        label6.setHorizontalAlignment(JLabel.CENTER);               //Sets the alignment of the label's contents along the X axis
        label6.setText("Srishti Tyagi");
        label6.setOpaque(true);

        creditpanel.add(label1);
        creditpanel.add(label2);
        creditpanel.add(label3);
        creditpanel.add(label4);
        creditpanel.add(label5);
        creditpanel.add(label6);
        creditpanel.setBackground(new Color(50,50,50));
        frame6.add(creditpanel);
    }
}
