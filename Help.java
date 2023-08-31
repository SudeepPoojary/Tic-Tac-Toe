import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Help {
    JFrame creditFrame = new JFrame();
    JLabel creditTitle = new JLabel();
    JPanel titlepanel = new JPanel();
    JTextArea content = new JTextArea();

    Help(){
        creditFrame.setSize(550,500);
        creditFrame.setVisible(true);

        creditTitle.setBackground(new Color(50,50,50));
        creditTitle.setForeground(new Color(255,255,255));
        creditTitle.setFont(new Font("Arial",Font.BOLD,50));
        creditTitle.setHorizontalAlignment(JLabel.CENTER);               //Sets the alignment of the label's contents along the X axis
        creditTitle.setText("RULES");
        creditTitle.setOpaque(true);

        titlepanel.setLayout(new BorderLayout());

        content.setText("1. It is a 2 Player game.\n"
                + "2. This game is played on 3x3 square grid.\n"
                + "3. Player1 who starts the game will mark 'X' on one square grid.\n"
                + "4. Player2 will mark 'O' after Player1's turn.\n"
                + "5. Player1 & player2 will keep on marking alternatively until all 9 grids are full or till any player wins.\n"
                + "6. The first player to get 3 grids 'X' or 'O' either horizontally or vertically or diagonally wins.\n"
                + "7. If all the 9 grids are used up and none of the players win then it will be considered draw.\n"
                + "8. The game tracks the number of victories each player has had and after each match, the players get an option to choose either to continue playing or quit the game.");

        content.setFont(new Font("Arial",Font.PLAIN,20));
        content.setWrapStyleWord(true);
        content.setLineWrap(true);
        content.setEditable(false);
        content.setBackground(new Color(50,50,50));
        content.setForeground(new Color(0,250,154));

        titlepanel.add(creditTitle);

        creditFrame.add(titlepanel,BorderLayout.NORTH);
        creditFrame.add(content,BorderLayout.CENTER);
    }
}
