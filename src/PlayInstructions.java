/*
Dhruv K. Saligram
4/1/18
This is a program that allows the user to play the classic battleships game
This class, when run, welcomes the user to the program
 */
package saligrambattleship;

//Imports below:
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PlayInstructions extends JFrame implements ActionListener {

    //Creating color below:
    private final Color COLOR = new Color(12, 69, 89);
    //Creating font below:
    private final Font INTRODUCTION_FONT = new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 25);
    //Creating JLabels below:
    private JLabel introduction1;
    private JLabel introduction2;
    private JLabel introduction3;
    private JLabel introduction4;
    private JLabel introduction5;
    //Creating JButtons below:
    private JButton exitButton;
    private JPanel buttonPanel;
    private JPanel textPanel;

    //Creating constructor below:
    public PlayInstructions() {
        //Detailing setup for constructor below:
        super("Instructions");
        this.setBounds(0, 0, 1440, 350);
        this.getContentPane().setBackground(COLOR);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        //Making panels below:
        buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(COLOR);
        textPanel = new JPanel(new FlowLayout());
        textPanel.setBackground(COLOR);
        //Setting text, font, and color for JLabels below:
        introduction1 = new JLabel("This is where you will play the game itself against an automatic AI ", SwingConstants.CENTER);
        introduction1.setFont(INTRODUCTION_FONT);
        introduction1.setForeground(Color.WHITE);
        introduction2 = new JLabel("Enter the coordinate you wish to attack in the text field ", SwingConstants.CENTER);
        introduction2.setFont(INTRODUCTION_FONT);
        introduction2.setForeground(Color.WHITE);
        introduction3 = new JLabel("The coordinate will be set up as letternumber: A1, A2, B3, G9, etc", SwingConstants.CENTER);
        introduction3.setFont(INTRODUCTION_FONT);
        introduction3.setForeground(Color.WHITE);
        introduction4 = new JLabel("All letters for the coordinate must be in uppercase", SwingConstants.CENTER);
        introduction4.setFont(INTRODUCTION_FONT);
        introduction4.setForeground(Color.WHITE);
        introduction5 = new JLabel("After submitting, you will see a message telling you if the opponent was hit or not ", SwingConstants.CENTER);
        introduction5.setFont(INTRODUCTION_FONT);
        introduction5.setForeground(Color.WHITE);
        //Naming buttons and making sure they perform when clicked below:
        exitButton = new JButton("OK");
        exitButton.addActionListener(this);
        //Adding JLabels to panel below:
        textPanel.add(introduction1);
        textPanel.add(introduction2);
        textPanel.add(introduction3);
        textPanel.add(introduction4);
        textPanel.add(introduction5);
        buttonPanel.add(exitButton);
        //Adding panels to frame below:
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(textPanel, FlowLayout.CENTER);
        //Making frame visible below:
        this.setVisible(true);
    }

    @Override
    //Setting up what happens when something is pressed below:
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        //If ok is clicked, the frame is removed
        if (command.equals("OK")) {
            this.dispose();
        }
    }
}