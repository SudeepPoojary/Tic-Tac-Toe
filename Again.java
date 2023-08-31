import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Again extends Logic1 implements ActionListener{
    JFrame scoreFrame= new JFrame();
    JPanel score_panel= new JPanel();
    JPanel play = new JPanel();
    JButton p= new JButton("Play again");

    Again() {
        scoreFrame.setSize(300,100);
        scoreFrame.add(score_panel,BorderLayout.NORTH);
        scoreFrame.add(play,BorderLayout.CENTER);
        scoreFrame.setVisible(true);
        JLabel x= new JLabel();
        JLabel o= new JLabel();

        p.setFocusable(false);

        score_panel.setLayout(new GridLayout(1,2));
        score_panel.setBounds(0,0,300,100);
        x.setText("Player X: "+Logic1.xCount);
        o.setText("Player O: "+Logic1.oCount);
        score_panel.setBackground(Color.RED);
        score_panel.add(o, BorderLayout.WEST);
        score_panel.add(x, BorderLayout.EAST);
        play.setLayout(new BorderLayout());
        play.add(p);
        p.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource()==p) {
            super.gameFrame.dispose();
            new Logic1();
        }
    }
}
