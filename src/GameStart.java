/*
Dhruv K. Saligram
4/1/18
This is a program that allows the user to play the classic battleships game
This class, when run, allows the user to place their battleships on the board
 */
package saligrambattleship;

//Imports below:
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameStart extends JFrame implements ActionListener {

    //Creating color below:
    private final Color COLOR = new Color(12, 69, 89);
    private final Color BG_COLOR = new Color(109, 165, 255);
    //Creating font below:
    private final Font INTRODUCTION_FONT = new Font("Merriweather", Font.BOLD | Font.ITALIC, 48);
    private final Font INTRODUCTION_FONT_2 = new Font("Merriweather", Font.BOLD | Font.ITALIC, 20);
    private final Font INTRODUCTION_FONT_3 = new Font("Merriweather", Font.BOLD | Font.ITALIC, 7);

    private final String FORMAT_SPACER;

    //Creating JButtons below:
    private JButton cruiserButton;
    private JButton destroyerButton;
    private JButton battleshipButton;
    private JButton exitButton;
    private JButton doneButton;

    //Creating Strings to pass start below:
    public String cruiserStart;
    public String destroyerStart;
    public String battleshipStart;

    //Creating JLabels below:
    private JLabel coordinateInstructions;
    private JLabel orientationInstructions;
    private JLabel errorMessage;
    private JLabel letterCoordinateA;
    private JLabel letterCoordinateB;
    private JLabel letterCoordinateC;
    private JLabel letterCoordinateD;
    private JLabel letterCoordinateE;
    private JLabel letterCoordinateF;
    private JLabel letterCoordinateG;
    private JLabel letterCoordinateH;
    private JLabel letterCoordinateI;
    private JLabel letterCoordinateJ;
    private JLabel[] numberCoordinates;
    private JLabel spacer1;
    private JLabel spacer2;
    private JLabel spacer3;
    private JLabel spacer4;
    private JLabel spacer5;
    private JLabel spacer6;
    private JLabel spacer7;
    private JLabel spacer8;
    private JLabel spacer9;
    private JLabel spacer10;

    //Creating board below:
    private JLabel[][] board;

    //Creating panels to store ships and buttons below:
    private JPanel inputPanel;
    private JPanel textPanel;
    private JPanel boardPanel;
    private JPanel letterCoordinate;
    private JPanel numberCoordinate;

    //Creating JTextFields for user input below:
    private JTextField orientation;
    private JTextField coordinateInput;

    //Creating booleans for robustness below:
    private boolean flag;
    private boolean cruiserFlag;
    private boolean destroyerFlag;
    private boolean battleshipFlag;
    private boolean[][] coordinateTester;
    private boolean[][] player2;

    //Creating parts for JMenu below:
    private JMenuBar mainBar;
    private JMenu helpMenu;
    private JMenuItem generalHelp;

    //Creating constructor below:
    public GameStart() {
        //Detailing setup for constructor below:
        super("Game Start");
        this.setBounds(0, 0, 1440, 900);
        this.getContentPane().setBackground(COLOR);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        FORMAT_SPACER = new String("  ");

        //Initializing boards below:
        board = new JLabel[10][10];
        coordinateTester = new boolean[10][10];
        numberCoordinates = new JLabel[10];

        //Populating number array below:
        for (int i = 0; i < numberCoordinates.length; i++) {
            if (i != 9) {
                int value = i + 1;
                String stringValue = Integer.toString(value);
                numberCoordinates[i] = new JLabel("     " + stringValue + "    ");
            } else {
                int value = i + 1;
                String stringValue = Integer.toString(value);
                numberCoordinates[i] = new JLabel("    " + stringValue + "    ");
            }
        }

        //Setting up menu below:
        mainBar = new JMenuBar();
        helpMenu = new JMenu("HELP");
        generalHelp = new JMenuItem("GENERAL HELP");

        //Adding JMenu content to the menu below:
        mainBar.add(helpMenu);
        helpMenu.add(generalHelp);
        generalHelp.addActionListener(this);

        //Setting Strings below:
        cruiserStart = "null";
        destroyerStart = "null";
        battleshipStart = "null";

        //Making panels below:
        inputPanel = new JPanel(new FlowLayout());
        inputPanel.setBackground(COLOR);

        textPanel = new JPanel(new FlowLayout());
        textPanel.setBackground(COLOR);

        //Setting up input panel content below:
        orientationInstructions = new JLabel("Orientation:");
        orientationInstructions.setForeground(Color.WHITE);
        orientationInstructions.setFont(INTRODUCTION_FONT_2);
        errorMessage = new JLabel("");
        errorMessage.setForeground(Color.WHITE);
        errorMessage.setFont(INTRODUCTION_FONT_2);
        coordinateInstructions = new JLabel("Start coordinate:");
        coordinateInstructions.setFont(INTRODUCTION_FONT_2);
        coordinateInstructions.setForeground(Color.WHITE);

        //Setting up spacers for numbers below:
        spacer1 = new JLabel(" ");
        spacer1.setFont(INTRODUCTION_FONT);
        spacer2 = new JLabel(" ");
        spacer2.setFont(INTRODUCTION_FONT_2);
        spacer3 = new JLabel(" ");
        spacer3.setFont(INTRODUCTION_FONT_3);
        spacer4 = new JLabel(" ");
        spacer4.setFont(INTRODUCTION_FONT_3);
        spacer5 = new JLabel(" ");
        spacer5.setFont(INTRODUCTION_FONT_3);
        spacer6 = new JLabel(" ");
        spacer6.setFont(INTRODUCTION_FONT_3);
        spacer7 = new JLabel(" ");
        spacer7.setFont(INTRODUCTION_FONT_3);
        spacer8 = new JLabel(" ");
        spacer8.setFont(INTRODUCTION_FONT_3);
        spacer9 = new JLabel(" ");
        spacer9.setFont(INTRODUCTION_FONT_3);
        spacer10 = new JLabel(" ");
        spacer10.setFont(INTRODUCTION_FONT_3);

        //Initializing letter array below:
        letterCoordinateA = new JLabel("A   ");
        letterCoordinateA.setFont(INTRODUCTION_FONT);
        letterCoordinateB = new JLabel("B   ");
        letterCoordinateB.setFont(INTRODUCTION_FONT);
        letterCoordinateC = new JLabel("C   ");
        letterCoordinateC.setFont(INTRODUCTION_FONT);
        letterCoordinateD = new JLabel("D   ");
        letterCoordinateD.setFont(INTRODUCTION_FONT);
        letterCoordinateE = new JLabel("E   ");
        letterCoordinateE.setFont(INTRODUCTION_FONT);
        letterCoordinateF = new JLabel("F   ");
        letterCoordinateF.setFont(INTRODUCTION_FONT);
        letterCoordinateG = new JLabel("G   ");
        letterCoordinateG.setFont(INTRODUCTION_FONT);
        letterCoordinateH = new JLabel("H   ");
        letterCoordinateH.setFont(INTRODUCTION_FONT);
        letterCoordinateI = new JLabel(" I   ");
        letterCoordinateI.setFont(INTRODUCTION_FONT);
        letterCoordinateJ = new JLabel(" J   ");
        letterCoordinateJ.setFont(INTRODUCTION_FONT);

        //Setting up JTextFields below:
        orientation = new JTextField(1);
        coordinateInput = new JTextField(2);

        //Setting up panels below;
        letterCoordinate = new JPanel(new FlowLayout());
        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(11, 10));
        numberCoordinate = new JPanel();
        numberCoordinate.setLayout(new BoxLayout(numberCoordinate, BoxLayout.Y_AXIS));

        //Naming buttons and making sure they perform when clicked below:
        cruiserButton = new JButton("Submit cruiser");
        cruiserButton.addActionListener(this);
        destroyerButton = new JButton("Submit destroyer");
        destroyerButton.addActionListener(this);
        battleshipButton = new JButton("Submit battleship");
        battleshipButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        doneButton = new JButton("Done");
        doneButton.addActionListener(this);

        //Adding items to panels below:
        inputPanel.add(errorMessage);
        inputPanel.add(orientationInstructions);
        inputPanel.add(orientation);
        inputPanel.add(coordinateInstructions);
        inputPanel.add(coordinateInput);
        inputPanel.add(cruiserButton);
        inputPanel.add(destroyerButton);
        inputPanel.add(battleshipButton);
        inputPanel.add(doneButton);
        inputPanel.add(exitButton);

        boardPanel.add(letterCoordinateA);
        boardPanel.add(letterCoordinateB);
        boardPanel.add(letterCoordinateC);
        boardPanel.add(letterCoordinateD);
        boardPanel.add(letterCoordinateE);
        boardPanel.add(letterCoordinateF);
        boardPanel.add(letterCoordinateG);
        boardPanel.add(letterCoordinateH);
        boardPanel.add(letterCoordinateI);
        boardPanel.add(letterCoordinateJ);

        numberCoordinate.add(spacer1);
        numberCoordinate.add(spacer2);
        numberCoordinate.add(numberCoordinates[0]);
        numberCoordinate.add(spacer3);
        numberCoordinate.add(numberCoordinates[1]);
        numberCoordinate.add(spacer4);
        numberCoordinate.add(numberCoordinates[2]);
        numberCoordinate.add(spacer5);
        numberCoordinate.add(numberCoordinates[3]);
        numberCoordinate.add(spacer6);
        numberCoordinate.add(numberCoordinates[4]);
        numberCoordinate.add(spacer7);
        numberCoordinate.add(numberCoordinates[5]);
        numberCoordinate.add(spacer8);
        numberCoordinate.add(numberCoordinates[6]);
        numberCoordinate.add(spacer9);
        numberCoordinate.add(numberCoordinates[7]);
        numberCoordinate.add(spacer10);
        numberCoordinate.add(numberCoordinates[8]);
        numberCoordinate.add(numberCoordinates[9]);

        //Setting font for numbers below:
        for (int i = 0; i < numberCoordinates.length; i++) {
            numberCoordinates[i].setFont(INTRODUCTION_FONT);
        }

        //Setting up board displayed to users below:
        for (int i = 0; i < board.length; i++) {
            for (int z = 0; z < board[0].length; z++) {
                board[z][i] = new JLabel("~" + FORMAT_SPACER);
                board[z][i].setFont(INTRODUCTION_FONT);
                boardPanel.add(board[z][i]);
            }
        }

        //Setting background colors below:
        numberCoordinate.setBackground(BG_COLOR);
        boardPanel.setBackground(BG_COLOR);

        //Adding panels to frame below:
        this.add(numberCoordinate, BorderLayout.WEST);
        this.add(boardPanel, BorderLayout.CENTER);
        this.add(inputPanel, BorderLayout.SOUTH);
        this.setJMenuBar(mainBar);

        //Making frame visible below:
        this.setVisible(true);
    }

    @Override
    //Setting up what happens when something is pressed below:
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        //Checking which ship user is placing below:
        if (command.equals("Submit cruiser")) {
            //Converting user input to Strings and ints below:
            String coordinate = coordinateInput.getText();
            int length = coordinate.length();
            String orientationSet = orientation.getText();
            boolean[][] coordinates = coordinateTester;
            JLabel[][] arena = board;
            //Testing for robustness below:
            if (length != 0 && length != 1 && length <= 3) {
                if (coordinate.charAt(0) == 'A' || coordinate.charAt(0) == 'B' || coordinate.charAt(0) == 'C' || coordinate.charAt(0) == 'D' || coordinate.charAt(0) == 'E' || coordinate.charAt(0) == 'F' || coordinate.charAt(0) == 'G' || coordinate.charAt(0) == 'H' || coordinate.charAt(0) == 'I' || coordinate.charAt(0) == 'J') {
                    if (orientationSet.equals("H") || orientationSet.equals("V")) {
                        cruiserStart = coordinate;
                        if (cruiserStart.equals(destroyerStart) || cruiserStart.equals(battleshipStart)) {
                            errorMessage.setText("Ship is already there" + FORMAT_SPACER);
                        } else {
                            //Calling on methods to place ship below:
                            CruiserLabelPlacement obj1 = new CruiserLabelPlacement();
                            CruiserBooleanPlacement obj2 = new CruiserBooleanPlacement();
                            CruiserReturn obj3 = new CruiserReturn();
                            board = obj1.placement(coordinate, orientationSet, coordinates, arena);
                            coordinateTester = obj2.placement(coordinate, orientationSet, coordinates);
                            flag = obj3.placement(coordinate, orientationSet, coordinates);
                            //Erasing all text in user input fields below:
                            orientation.setText("");
                            coordinateInput.setText("");
                            errorMessage.setText("");
                            if (flag == true) {
                                inputPanel.remove(cruiserButton);
                                cruiserFlag = true;
                            } else {
                                errorMessage.setText("ERROR!" + FORMAT_SPACER);
                            }
                        }
                    } else {
                        errorMessage.setText("Orientation was not 'H' or 'V'" + FORMAT_SPACER);
                    }
                } else {
                    errorMessage.setText("You did not enter A-J coordinates" + FORMAT_SPACER);
                }
            } else {
                errorMessage.setText("Coordinate not accepted" + FORMAT_SPACER);
            }
        } else if (command.equals("Submit destroyer")) {
            //Converting user input to Strings and ints below:
            String coordinate = coordinateInput.getText();
            int length = coordinate.length();
            String orientationSet = orientation.getText();
            boolean[][] coordinates = coordinateTester;
            JLabel[][] arena = board;
            //Testing for robustness below:
            if (length != 0 && length != 1 && length <= 3) {
                if (coordinate.charAt(0) == 'A' || coordinate.charAt(0) == 'B' || coordinate.charAt(0) == 'C' || coordinate.charAt(0) == 'D' || coordinate.charAt(0) == 'E' || coordinate.charAt(0) == 'F' || coordinate.charAt(0) == 'G' || coordinate.charAt(0) == 'H' || coordinate.charAt(0) == 'I' || coordinate.charAt(0) == 'J') {
                    if (orientationSet.equals("H") || orientationSet.equals("V")) {
                        destroyerStart = coordinate;
                        if (destroyerStart.equals(battleshipStart) || destroyerStart.equals(cruiserStart)) {
                            errorMessage.setText("Ship is already there" + FORMAT_SPACER);
                        } else {
                            DestroyerLabelPlacement obj1 = new DestroyerLabelPlacement();
                            DestroyerBooleanPlacement obj2 = new DestroyerBooleanPlacement();
                            DestroyerReturn obj3 = new DestroyerReturn();
                            board = obj1.placement(coordinate, orientationSet, coordinates, arena);
                            coordinateTester = obj2.placement(coordinate, orientationSet, coordinates);
                            flag = obj3.placement(coordinate, orientationSet, coordinates);
                            //Erasing all text in user input fields below:
                            orientation.setText("");
                            coordinateInput.setText("");
                            errorMessage.setText("");
                            if (flag == true) {
                                inputPanel.remove(destroyerButton);
                                destroyerFlag = true;
                            } else {
                                errorMessage.setText("ERROR!" + FORMAT_SPACER);
                            }
                        }
                    } else {
                        errorMessage.setText("Orientation was not 'H' or 'V'" + FORMAT_SPACER);
                    }
                } else {
                    errorMessage.setText("You did not enter A-J coordinates" + FORMAT_SPACER);
                }
            } else {
                errorMessage.setText("Coordinate not accepted");
            }
        } else if (command.equals("Submit battleship")) {
            //Converting user input to Strings and ints below:
            String coordinate = coordinateInput.getText();
            int length = coordinate.length();
            String orientationSet = orientation.getText();
            boolean[][] coordinates = coordinateTester;
            JLabel[][] arena = board;
            //Testing for robustness below:
            if (length != 0 && length != 1 && length <= 3) {
                if (coordinate.charAt(0) == 'A' || coordinate.charAt(0) == 'B' || coordinate.charAt(0) == 'C' || coordinate.charAt(0) == 'D' || coordinate.charAt(0) == 'E' || coordinate.charAt(0) == 'F' || coordinate.charAt(0) == 'G' || coordinate.charAt(0) == 'H' || coordinate.charAt(0) == 'I' || coordinate.charAt(0) == 'J') {
                    if (orientationSet.equals("H") || orientationSet.equals("V")) {
                        battleshipStart = coordinate;
                        if (battleshipStart.equals(destroyerStart) || battleshipStart.equals(cruiserStart)) {
                            errorMessage.setText("Ship is already there" + FORMAT_SPACER);
                        } else {
                            BattleshipLabelPlacement obj1 = new BattleshipLabelPlacement();
                            BattleshipBooleanPlacement obj2 = new BattleshipBooleanPlacement();
                            BattleshipReturn obj3 = new BattleshipReturn();
                            board = obj1.placement(coordinate, orientationSet, coordinates, arena);
                            coordinateTester = obj2.placement(coordinate, orientationSet, coordinates);
                            flag = obj3.placement(coordinate, orientationSet, coordinates);
                            //Erasing all text in user input fields below:
                            orientation.setText("");
                            coordinateInput.setText("");
                            errorMessage.setText("");
                            if (flag == true) {
                                inputPanel.remove(battleshipButton);
                                battleshipFlag = true;
                            } else {
                                errorMessage.setText("ERROR!" + FORMAT_SPACER);
                            }
                        }
                    } else {
                        errorMessage.setText("Orientation was not 'H' or 'V'" + FORMAT_SPACER);
                    }
                } else {
                    errorMessage.setText("You did not enter A-J coordinates" + FORMAT_SPACER);
                }
            } else {
                errorMessage.setText("Coordinate not accepted");
            }
        } //Disposing of frame is user selects exit below:
        else if (command.equals("Exit")) {
            this.dispose();
        } //If user is ready to proceed, AI places their ships below:
        else if (command.equals("Done")) {
            //Testing if user has placed all ships already below:
            if (cruiserFlag == true && destroyerFlag == true && battleshipFlag == true) {
                AIPlacement obj1 = new AIPlacement();
                player2 = obj1.player2Board();
                CoordinateDisplay obj7 = new CoordinateDisplay(cruiserStart, destroyerStart, battleshipStart, coordinateTester, player2);
                this.dispose();
            } else {
                errorMessage.setText("You are not done placing" + FORMAT_SPACER);
            }
        } //Setting up help tab using JMenu below:
        else if (command.equals("GENERAL HELP")) {
            HelpInstructions objFrame1 = new HelpInstructions();
        }
    }
}