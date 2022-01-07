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
import java.util.Random;
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

public class PlayGame extends JFrame implements ActionListener {

    //Creating color below:
    private final Color COLOR = new Color(12, 69, 89);
    private final Color BG_COLOR = new Color(109, 165, 255);
    //Creating font below:
    private final Font INTRODUCTION_FONT = new Font("Merriweather", Font.BOLD | Font.ITALIC, 48);
    private final Font INTRODUCTION_FONT_2 = new Font("Merriweather", Font.BOLD | Font.ITALIC, 20);
    private final Font INTRODUCTION_FONT_3 = new Font("Merriweather", Font.BOLD | Font.ITALIC, 7);

    private final String FORMAT_SPACER;

    //Creating JButtons below:
    private JButton exitButton;
    private JButton submitButton;

    //Creating JLabels below:
    private JLabel coordinateEnter;
    private JLabel playerMessage;
    private JLabel aiMessage;
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

    private JLabel[][] board;

    public boolean[][] p1;
    public boolean[][] p2;

    //Creating panels to store ships and buttons below:
    private JPanel inputPanel;
    private JPanel textPanel;
    private JPanel boardPanel;
    private JPanel letterCoordinate;
    private JPanel numberCoordinate;

    private JTextField coordinateInput;

    private boolean flag;
    private boolean aiHitChecker;
    private boolean hitChecker;

    //Setting up JMenu below:
    private JMenuBar mainBar;
    private JMenu helpMenu;
    private JMenuItem generalHelp;

    //Creating constructor below:
    public PlayGame(boolean[][] p1Board, boolean[][] p2Board) {
        //Detailing setup for constructor below:
        super("Play Game");
        this.setBounds(0, 0, 1440, 900);
        this.getContentPane().setBackground(COLOR);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        //Setting up menu below:
        mainBar = new JMenuBar();
        helpMenu = new JMenu("HELP");
        generalHelp = new JMenuItem("GENERAL HELP");

        //Adding JMenu content to the menu below:
        mainBar.add(helpMenu);
        helpMenu.add(generalHelp);
        generalHelp.addActionListener(this);

        FORMAT_SPACER = new String("  ");

        p1 = p1Board;
        p2 = p2Board;

        flag = false;

        board = new JLabel[10][10];
        numberCoordinates = new JLabel[10];

        //Populating numbers array below:
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

        //Making panels below:
        inputPanel = new JPanel(new FlowLayout());
        inputPanel.setBackground(COLOR);

        textPanel = new JPanel(new FlowLayout());
        textPanel.setBackground(COLOR);

        //Setting up input panel content below:
        playerMessage = new JLabel("");
        playerMessage.setForeground(Color.WHITE);
        playerMessage.setFont(INTRODUCTION_FONT_2);
        aiMessage = new JLabel("");
        aiMessage.setForeground(Color.WHITE);
        aiMessage.setFont(INTRODUCTION_FONT_2);
        coordinateEnter = new JLabel("Enter coordinate to attack:");
        coordinateEnter.setFont(INTRODUCTION_FONT_2);
        coordinateEnter.setForeground(Color.WHITE);

        //Setting up spacers below:
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

        //Setting up letter array below:
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

        coordinateInput = new JTextField(2);

        letterCoordinate = new JPanel(new FlowLayout());

        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(11, 10));

        numberCoordinate = new JPanel();
        numberCoordinate.setLayout(new BoxLayout(numberCoordinate, BoxLayout.Y_AXIS));

        //Naming buttons and making sure they perform when clicked below:
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        //Adding items to panels below:
        inputPanel.add(playerMessage);
        inputPanel.add(coordinateEnter);
        inputPanel.add(coordinateInput);
        inputPanel.add(submitButton);
        inputPanel.add(aiMessage);
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

        //Setting up numbers array below:
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

        for (int i = 0; i < numberCoordinates.length; i++) {
            numberCoordinates[i].setFont(INTRODUCTION_FONT);
        }

        //Populating board to display to user below:
        for (int i = 0; i < board.length; i++) {
            for (int z = 0; z < board[0].length; z++) {
                board[z][i] = new JLabel("~" + FORMAT_SPACER);
                board[z][i].setFont(INTRODUCTION_FONT);
                boardPanel.add(board[z][i]);
            }
        }

        boardPanel.setBackground(BG_COLOR);
        numberCoordinate.setBackground(BG_COLOR);

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
        if (command.equals("Submit")) {
            //Checking if AI's input hit the user or not below:
            for (int i = 0; i < p1.length; i++) {
                for (int j = 0; j < p1[0].length; j++) {
                    if (p1[i][j] == true) {
                        aiHitChecker = true;
                    }
                }
            }
            if (aiHitChecker == false) {
                aiMessage.setText("AI wins! ");
                inputPanel.remove(submitButton);
                inputPanel.remove(submitButton);
                inputPanel.remove(playerMessage);
                inputPanel.remove(coordinateEnter);
                inputPanel.remove(coordinateInput);
            }
            //Checking if user's input hit the opponent or not below:
            for (int i = 0; i < p2.length; i++) {
                for (int j = 0; j < p2[0].length; j++) {
                    if (p2[i][j] == true) {
                        hitChecker = true;
                    }
                }
            }
            if (hitChecker == false) {
                playerMessage.setText("You win! ");
                inputPanel.remove(submitButton);
                inputPanel.remove(submitButton);
                inputPanel.remove(aiMessage);
                inputPanel.remove(coordinateEnter);
                inputPanel.remove(coordinateInput);
            } //Checking if attack hit the opponent or not if neither side won at the beginning of the turn below:
            else {
                aiHitChecker = false;
                hitChecker = false;
                String coordinate = coordinateInput.getText();
                int length = coordinate.length();
                //Calling classes to access methods to set up displays below:
                CoordinateChecker check1 = new CoordinateChecker();
                CoordinateBooleanDisplay check2 = new CoordinateBooleanDisplay();
                //Testing for robustness below:
                if (length != 0 && length != 1 && length <= 3) {
                    flag = check1.checker(coordinate, p2);
                    if (flag == false) {
                        playerMessage.setText("Enemy hit! ");
                        p2 = check2.checker(coordinate, p2);
                        CoordinateTrueLabelDisplay check3 = new CoordinateTrueLabelDisplay();
                        board = check3.checker(coordinate, board);
                    } //Testing to make sure user is not submitting the same coordinate twice to prevent errors below:
                    else {
                        int row = 0;
                        int column = 0;
                        if (coordinate.charAt(0) == 'A') {
                            row = 0;
                            if (coordinate.equals("A10")) {
                                String display = board[row][9].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            } else {
                                String columnDisplay = Character.toString(coordinate.charAt(1));
                                column = Integer.parseInt(columnDisplay);
                                column = column - 1;
                                String display = board[row][column].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            }
                        } else if (coordinate.charAt(0) == 'B') {
                            row = 1;
                            if (coordinate.equals("B10")) {
                                String display = board[row][9].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            } else {
                                String columnDisplay = Character.toString(coordinate.charAt(1));
                                column = Integer.parseInt(columnDisplay);
                                column = column - 1;
                                String display = board[row][column].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            }
                        } else if (coordinate.charAt(0) == 'C') {
                            row = 2;
                            if (coordinate.equals("C10")) {
                                String display = board[row][9].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            } else {
                                String columnDisplay = Character.toString(coordinate.charAt(1));
                                column = Integer.parseInt(columnDisplay);
                                column = column - 1;
                                String display = board[row][column].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            }
                        } else if (coordinate.charAt(0) == 'D') {
                            row = 3;
                            if (coordinate.equals("D10")) {
                                String display = board[row][9].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            } else {
                                String columnDisplay = Character.toString(coordinate.charAt(1));
                                column = Integer.parseInt(columnDisplay);
                                column = column - 1;
                                String display = board[row][column].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            }
                        } else if (coordinate.charAt(0) == 'E') {
                            row = 4;
                            if (coordinate.equals("E10")) {
                                String display = board[row][9].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            } else {
                                String columnDisplay = Character.toString(coordinate.charAt(1));
                                column = Integer.parseInt(columnDisplay);
                                column = column - 1;
                                String display = board[row][column].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            }
                        } else if (coordinate.charAt(0) == 'F') {
                            row = 5;
                            if (coordinate.equals("F10")) {
                                String display = board[row][9].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            } else {
                                String columnDisplay = Character.toString(coordinate.charAt(1));
                                column = Integer.parseInt(columnDisplay);
                                column = column - 1;
                                String display = board[row][column].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            }
                        } else if (coordinate.charAt(0) == 'G') {
                            row = 6;
                            if (coordinate.equals("G10")) {
                                String display = board[row][9].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            } else {
                                String columnDisplay = Character.toString(coordinate.charAt(1));
                                column = Integer.parseInt(columnDisplay);
                                column = column - 1;
                                String display = board[row][column].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            }
                        } else if (coordinate.charAt(0) == 'H') {
                            row = 7;
                            if (coordinate.equals("H10")) {
                                String display = board[row][9].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            } else {
                                String columnDisplay = Character.toString(coordinate.charAt(1));
                                column = Integer.parseInt(columnDisplay);
                                column = column - 1;
                                String display = board[row][column].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            }
                        } else if (coordinate.charAt(0) == 'I') {
                            row = 8;
                            if (coordinate.equals("I10")) {
                                String display = board[row][9].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            } else {
                                String columnDisplay = Character.toString(coordinate.charAt(1));
                                column = Integer.parseInt(columnDisplay);
                                column = column - 1;
                                String display = board[row][column].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            }
                        } else if (coordinate.charAt(0) == 'J') {
                            row = 9;
                            if (coordinate.equals("J10")) {
                                String display = board[row][9].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            } else {
                                String columnDisplay = Character.toString(coordinate.charAt(1));
                                column = Integer.parseInt(columnDisplay);
                                column = column - 1;
                                String display = board[row][column].getText();
                                if (display.equals("X  ")) {
                                    playerMessage.setText("You already hit there! ");
                                } else {
                                    playerMessage.setText("Miss! ");
                                    CoordinateFalseLabelDisplay check3 = new CoordinateFalseLabelDisplay();
                                    board = check3.checker(coordinate, board);
                                }
                            }
                        }
                    }
                } else {
                    playerMessage.setText("Input not accepted! ");
                }
                //Testing to see if AI's attack was successful or not below:
                boolean[][] checker = p1;
                Random placer = new Random();
                int row = 0;
                int column = 0;
                do {
                    row = placer.nextInt(10);
                    column = placer.nextInt(10);
                    if (p1[row][column] == true) {
                        aiMessage.setText("You were hit! ");
                        p1[row][column] = false;
                    } else {
                        aiMessage.setText("Opponent missed! ");
                    }
                    checker[row][column] = true;
                } while (checker[row][column] == false);
            }

            //Checking if AI won off of the new hit below:
            for (int i = 0; i < p1.length; i++) {
                for (int j = 0; j < p1[0].length; j++) {
                    if (p1[i][j] == true) {
                        aiHitChecker = true;
                    }
                }
            }
            if (aiHitChecker == false) {
                aiMessage.setText("AI wins! ");
                inputPanel.remove(submitButton);
                inputPanel.remove(playerMessage);
                inputPanel.remove(coordinateEnter);
                inputPanel.remove(coordinateInput);
            }
            //Checking if user won based off of most recent turn below:
            for (int i = 0; i < p2.length; i++) {
                for (int j = 0; j < p2[0].length; j++) {
                    if (p2[i][j] == true) {
                        hitChecker = true;
                    }
                }
            }

            if (hitChecker == false) {
                playerMessage.setText("You win! ");
                inputPanel.remove(submitButton);
                inputPanel.remove(submitButton);
                inputPanel.remove(aiMessage);
                inputPanel.remove(coordinateEnter);
                inputPanel.remove(coordinateInput);
            }
            coordinateInput.setText("");
        } //If user hits exit, disposing of the frame below:
        else if (command.equals("Exit")) {
            this.dispose();
        } //Opening help tab using JMenu if user clicks on the help tab below:
        else if (command.equals("GENERAL HELP")) {
            PlayInstructions objFrame1 = new PlayInstructions();
        }
    }
}
