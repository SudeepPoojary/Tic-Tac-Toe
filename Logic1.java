import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.metal.MetalButtonUI;

//import com.sun.tools.javac.Main;

class Logic1 implements ActionListener{

    int count=0;
    public static int xCount=0, oCount=0;
    Random random = new Random();
    JFrame gameFrame = new JFrame();

    JPanel title_panel = new JPanel();

    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttonGrid = new JButton[9];

    boolean player1_turn;

    Logic1(){
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(500,500);
        gameFrame.getContentPane().setBackground(new Color(50,50,50));
        gameFrame.setLayout(new BorderLayout());
        gameFrame.setVisible(true);

        textfield.setBackground(new Color(50,50,50));
        textfield.setForeground(new Color(0,250,154));
        textfield.setFont(new Font("DialogInput",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);               //Sets the alignment of the label's contents along the X axis
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,500,100);                 //x,y,width,height for title panel

        button_panel.setLayout(new GridLayout(3,3));              //Creates a grid layout with the specified number of rows and columns
        button_panel.setBackground(Color.GRAY);


        for(int i=0;i<9;i++) {
            buttonGrid[i] = new JButton();
            button_panel.add(buttonGrid[i]);
            buttonGrid[i].setFont(new Font("MV Boli",Font.BOLD,75));
            buttonGrid[i].setFocusable(false);
            buttonGrid[i].setBackground(new Color(248,247,237));
            buttonGrid[i].addActionListener((ActionListener) this);               //Adds an ActionListener to the button

        }

        title_panel.add(textfield);
        gameFrame.add(title_panel,BorderLayout.NORTH);
        gameFrame.add(button_panel, BorderLayout.CENTER);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {                //Invoked when an action occurs

        for(int i=0;i<9;i++) {
            if(e.getSource()==buttonGrid[i]) {
                if(player1_turn) {
                    if(buttonGrid[i].getText()=="") {
                        buttonGrid[i].setForeground(Color.RED);
                        buttonGrid[i].setText("X");
                        player1_turn=false;
                        textfield.setText("O turn");
                        check();

                    }
                }
                else{
                    if(buttonGrid[i].getText()=="") {
                        buttonGrid[i].setForeground(Color.BLUE);
                        buttonGrid[i].setText("O");
                        player1_turn=true;
                        textfield.setText("X turn");
                        check();
                    }
                }
            }
        }
        if(e.getSource()==yes) {
            new Logic1();
            scoreFrame.dispose();
            gameFrame.dispose();
        }
        if(e.getSource()==no) {
            scoreFrame.dispose();
            gameFrame.dispose();
        }

    }


    public void firstTurn() {

        if(random.nextInt(2)==0) {
            player1_turn=true;
            textfield.setText("X turn");
        }
        else {
            player1_turn=false;
            textfield.setText("O turn");
        }
    }

    public void check() {


        if(
                (buttonGrid[0].getText()=="X") &&
                        (buttonGrid[1].getText()=="X") &&
                        (buttonGrid[2].getText()=="X")
        ) {
            xWins(0,1,2);
        }
        if(
                (buttonGrid[3].getText()=="X") &&
                        (buttonGrid[4].getText()=="X") &&
                        (buttonGrid[5].getText()=="X")
        ) {
            xWins(3,4,5);
        }
        if(
                (buttonGrid[6].getText()=="X") &&
                        (buttonGrid[7].getText()=="X") &&
                        (buttonGrid[8].getText()=="X")
        ) {
            xWins(6,7,8);
        }
        if(
                (buttonGrid[0].getText()=="X") &&
                        (buttonGrid[3].getText()=="X") &&
                        (buttonGrid[6].getText()=="X")
        ) {
            xWins(0,3,6);
        }
        if(
                (buttonGrid[1].getText()=="X") &&
                        (buttonGrid[4].getText()=="X") &&
                        (buttonGrid[7].getText()=="X")
        ) {
            xWins(1,4,7);
        }
        if(
                (buttonGrid[2].getText()=="X") &&
                        (buttonGrid[5].getText()=="X") &&
                        (buttonGrid[8].getText()=="X")
        ) {
            xWins(2,5,8);
        }
        if(
                (buttonGrid[0].getText()=="X") &&
                        (buttonGrid[4].getText()=="X") &&
                        (buttonGrid[8].getText()=="X")
        ) {
            xWins(0,4,8);
        }
        if(
                (buttonGrid[2].getText()=="X") &&
                        (buttonGrid[4].getText()=="X") &&
                        (buttonGrid[6].getText()=="X")
        ) {
            xWins(2,4,6);
        }

        //Check O wins

        if(
                (buttonGrid[0].getText()=="O") &&
                        (buttonGrid[1].getText()=="O") &&
                        (buttonGrid[2].getText()=="O")
        ) {
            oWins(0,1,2);
        }
        if(
                (buttonGrid[3].getText()=="O") &&
                        (buttonGrid[4].getText()=="O") &&
                        (buttonGrid[5].getText()=="O")
        ) {
            oWins(3,4,5);
        }
        if(
                (buttonGrid[6].getText()=="O") &&
                        (buttonGrid[7].getText()=="O") &&
                        (buttonGrid[8].getText()=="O")
        ) {
            oWins(6,7,8);
        }
        if(
                (buttonGrid[0].getText()=="O") &&
                        (buttonGrid[3].getText()=="O") &&
                        (buttonGrid[6].getText()=="O")
        ) {
            oWins(0,3,6);
        }
        if(
                (buttonGrid[1].getText()=="O") &&
                        (buttonGrid[4].getText()=="O") &&
                        (buttonGrid[7].getText()=="O")
        ) {
            oWins(1,4,7);
        }
        if(
                (buttonGrid[2].getText()=="O") &&
                        (buttonGrid[5].getText()=="O") &&
                        (buttonGrid[8].getText()=="O")
        ) {
            oWins(2,5,8);
        }
        if(
                (buttonGrid[0].getText()=="O") &&
                        (buttonGrid[4].getText()=="O") &&
                        (buttonGrid[8].getText()=="O")
        ) {
            oWins(0,4,8);
        }
        if(
                (buttonGrid[2].getText()=="O") &&
                        (buttonGrid[4].getText()=="O") &&
                        (buttonGrid[6].getText()=="O")
        ) {
            oWins(2,4,6);
        }
        if(
                (buttonGrid[0].getText()!="")&&
                        (buttonGrid[1].getText()!="")&&
                        (buttonGrid[2].getText()!="")&&
                        (buttonGrid[3].getText()!="")&&
                        (buttonGrid[4].getText()!="")&&
                        (buttonGrid[5].getText()!="")&&
                        (buttonGrid[6].getText()!="")&&
                        (buttonGrid[7].getText()!="")&&
                        (buttonGrid[8].getText()!="")&&
                        (textfield.getText()!="X wins")&&
                        (textfield.getText()!="O wins")
        ) {
            draw();
        }
        if((textfield.getText()=="X wins")||(textfield.getText()=="O wins")||(textfield.getText()=="Draw")) {
            PlayAgain();
        }
        //add if X win O win or draw then play again

    }


    public void xWins(int a,int b,int c) {
        buttonGrid[a].setBackground(new Color(0,250,154));
        buttonGrid[b].setBackground(new Color(0,250,154));
        buttonGrid[c].setBackground(new Color(0,250,154));

        for(int i=0;i<9;i++) {
            buttonGrid[i].setEnabled(false);                   //Enables(true) or disables(false) the button.
        }
        textfield.setText("X wins");
        buttonGrid[a].setUI(new MetalButtonUI() {
            protected Color getDisabledTextColor() {
                return new Color(50,50,50);
            }
        });
        buttonGrid[b].setUI(new MetalButtonUI() {
            protected Color getDisabledTextColor() {
                return new Color(50,50,50);
            }
        });
        buttonGrid[c].setUI(new MetalButtonUI() {
            protected Color getDisabledTextColor() {
                return new Color(50,50,50);
            }
        });
        buttonGrid[a].setForeground(new Color(50,50,50));
        buttonGrid[b].setForeground(new Color(50,50,50));
        buttonGrid[c].setForeground(new Color(50,50,50));
        xCount++;
        //new Again();
        //gameFrame.dispose();
    }

    public void oWins(int a,int b,int c) {
        buttonGrid[a].setBackground(new Color(0,250,154));
        buttonGrid[b].setBackground(new Color(0,250,154));
        buttonGrid[c].setBackground(new Color(0,250,154));
        for(int i=0;i<9;i++) {
            buttonGrid[i].setEnabled(false);
        }
        textfield.setText("O wins");
        buttonGrid[a].setUI(new MetalButtonUI() {
            protected Color getDisabledTextColor() {
                return new Color(50,50,50);
            }
        });
        buttonGrid[b].setUI(new MetalButtonUI() {
            protected Color getDisabledTextColor() {
                return new Color(50,50,50);
            }
        });
        buttonGrid[c].setUI(new MetalButtonUI() {
            protected Color getDisabledTextColor() {
                return new Color(50,50,50);
            }
        });
        buttonGrid[a].setForeground(new Color(50,50,50));
        buttonGrid[b].setForeground(new Color(50,50,50));
        buttonGrid[c].setForeground(new Color(50,50,50));
        oCount++;
        //new Again();
        //gameFrame.dispose();
    }

    public void draw() {
        textfield.setText("Draw");
        //new Again();
        //gameFrame.dispose();
    }

    JFrame scoreFrame= new JFrame();
    JLabel Xscore = new JLabel();
    JLabel Oscore = new JLabel();
    JLabel Play = new JLabel();
    JPanel scorePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JButton yes = new JButton("YES");
    JButton no = new JButton("NO");


    private void PlayAgain() {



        scoreFrame.setSize(400,200);
        scoreFrame.setVisible(true);


        scorePanel.setBackground(new Color(50,50,50));

        Xscore.setBackground(new Color(50,50,50));
        Xscore.setForeground(Color.RED);
        Xscore.setFont(new Font("Arial",Font.BOLD,30));
        Xscore.setHorizontalAlignment(JLabel.CENTER);               //Sets the alignment of the label's contents along the X axis
        Xscore.setText("Player X : "+xCount+"  ");
        Xscore.setOpaque(true);

        Oscore.setBackground(new Color(50,50,50));
        Oscore.setForeground(Color.blue);
        Oscore.setFont(new Font("Arial",Font.BOLD,30));
        Oscore.setHorizontalAlignment(JLabel.CENTER);               //Sets the alignment of the label's contents along the X axis
        Oscore.setText("Player O : "+oCount);
        Oscore.setOpaque(true);


        scorePanel.add(Xscore);
        scorePanel.add(Oscore);

        Play.setText("    PLAY AGAIN ?    ");
        Play.setForeground(new Color(248,247,237));
        Play.setFont(new Font("Arial",Font.BOLD,40));

        yes.setFont(new Font("Arial",Font.BOLD,30));
        yes.setFocusable(false);
        yes.setBackground(new Color(127,127,127));
        yes.setForeground(new Color(248,247,237));
        yes.addActionListener(this);
        no.setFont(new Font("Arial",Font.BOLD,30));
        no.setBackground(new Color(127,127,127));
        no.setForeground(new Color(248,247,237));
        no.setFocusable(false);
        no.addActionListener(this);

        buttonPanel.setBackground(new Color(50,50,50));
        buttonPanel.add(Play);
        buttonPanel.add(yes);
        buttonPanel.add(no);

        scoreFrame.add(scorePanel,BorderLayout.NORTH);
        scoreFrame.add(buttonPanel,BorderLayout.CENTER);




    }
}
