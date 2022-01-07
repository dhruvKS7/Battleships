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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WelcomePage extends JFrame implements ActionListener {

    //Creating color below:
    private final Color COLOR = new Color(12, 69, 89);
    //Creating font below:
    private final Font INTRODUCTION_FONT = new Font("Merriweather", Font.BOLD | Font.ITALIC, 45);
    //Creating and sizing image below:
    private final java.net.URL FIRST_IMAGE = getClass().getResource("welcomeImage.png");
    private final ImageIcon WELCOME_PICTURE = new ImageIcon(new ImageIcon(FIRST_IMAGE).getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT));
    //Creating JLabels below:
    private JLabel introduction1;
    private JLabel introduction2;
    private JLabel introduction3;
    private JLabel introduction4;
    private JLabel introduction5;
    private JLabel imageLabel;
    //Creating JButtons below:
    private JButton startButton;
    private JButton exitButton;
    private JPanel buttonPanel;
    private JPanel textPanel;
    //Creating parts for menu below:
    private JMenuBar mainBar;
    private JMenu helpMenu;
    private JMenuItem generalHelp;

    //Creating constructor below:
    public WelcomePage() {
        //Detailing setup for constructor below:
        super("Welcome Page");
        this.setBounds(0, 0, 1440, 900);
        this.getContentPane().setBackground(COLOR);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        //Making panels below:
        buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(COLOR);
        textPanel = new JPanel(new FlowLayout());
        textPanel.setBackground(COLOR);
        //Putting image in label below:
        imageLabel = new JLabel(WELCOME_PICTURE);
        //Setting text, font, and color for JLabels below:
        introduction1 = new JLabel(" Welcome! My name is Dhruv, ", SwingConstants.CENTER);
        introduction1.setFont(INTRODUCTION_FONT);
        introduction1.setForeground(Color.WHITE);
        introduction2 = new JLabel("and this is my ", SwingConstants.CENTER);
        introduction2.setFont(INTRODUCTION_FONT);
        introduction2.setForeground(Color.WHITE);
        introduction3 = new JLabel(" BATTLESHIP GAME! ", SwingConstants.CENTER);
        introduction3.setFont(INTRODUCTION_FONT);
        introduction3.setForeground(Color.WHITE);
        introduction4 = new JLabel("This program allows you to play the full ", SwingConstants.CENTER);
        introduction4.setFont(INTRODUCTION_FONT);
        introduction4.setForeground(Color.WHITE);
        introduction5 = new JLabel(" battleship game with an automatic AI! ", SwingConstants.CENTER);
        introduction5.setFont(INTRODUCTION_FONT);
        introduction5.setForeground(Color.WHITE);
        //Naming buttons and making sure they perform when clicked below:
        startButton = new JButton("Begin");
        startButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        //Adding JLabels to panel below:
        textPanel.add(introduction1);
        textPanel.add(introduction2);
        textPanel.add(introduction3);
        textPanel.add(introduction4);
        textPanel.add(introduction5);
        textPanel.add(imageLabel);
        buttonPanel.add(startButton);
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
        //If begin is clicked, open new frame below:
        if (command.equals("Begin")) {
            this.dispose();
            GameStart objFrame2 = new GameStart();
            HelpInstructions objFrame1 = new HelpInstructions();
        } //If exit is clicked, close frame below:
        else if (command.equals("Exit")) {
            this.dispose();
        }
    }

    //Main class to create first frame below:
    public static void main(String[] args) {
        WelcomePage objFrame1 = new WelcomePage();
    }
}