/*
Dhruv K. Saligram
4/1/18
This is a program that allows the user to play the classic battleships game
This class, when run, creates a JTable to show the user where their ships were placed, and how long each ship is
 */

package saligrambattleship;

//Imports below:
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class CoordinateDisplay extends JFrame implements ActionListener {

    //Declarations below:
    private JButton nextButton;
    private final String[] COLUMN_NAMES = {"Ship Placed", "Size", "Start Coordinate"};
    private final Color COLOR = new Color(12, 69, 89);
    private Object[][] displayTable;
    private JTable coordinateTable;
    private JScrollPane tablePane;
    private JTableHeader header;
    private TableColumn column;
    private JPanel buttonPanel;
    public boolean[][] p1;
    public boolean[][] p2;

    //Setting up contructor with parameters below:
    public CoordinateDisplay(String cruiser, String destroyer, String battleship, boolean[][] player1Board, boolean[][] player2Board) {
        //Creating setup of frame below:
        super("Coordinates");
        this.setBounds(0, 0, 1440, 290);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nextButton = new JButton("Start game!");
        nextButton.addActionListener(this);

        //Making boards below:
        p1 = player1Board;
        p2 = player2Board;

        //Making panel below:
        buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(COLOR);
        buttonPanel.add(nextButton);

        //Populating object below:
        displayTable = new Object[3][3];
        displayTable[0][0] = "Cruiser";
        displayTable[0][1] = "3";
        displayTable[0][2] = cruiser;
        displayTable[1][0] = "Destroyer";
        displayTable[1][1] = "4";
        displayTable[1][2] = destroyer;
        displayTable[2][0] = "Battleship";
        displayTable[2][1] = "5";
        displayTable[2][2] = battleship;

        //Creating JTable below:
        coordinateTable = new JTable(displayTable, COLUMN_NAMES);
        coordinateTable.setForeground(Color.WHITE);
        coordinateTable.setGridColor(Color.WHITE);
        coordinateTable.setBackground(COLOR);

        //Setting JTable Header below:
        header = coordinateTable.getTableHeader();
        header.setBackground(Color.GRAY);
        header.setForeground(Color.WHITE);

        column = null;
        column = coordinateTable.getColumnModel().getColumn(0);
        column.setPreferredWidth(20);
        column = coordinateTable.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);

        coordinateTable.setRowHeight(70);

        tablePane = new JScrollPane();
        tablePane.getViewport().add(coordinateTable);
        coordinateTable.setFillsViewportHeight(true);

        //Adding panel and JTable to frame below:
        this.add(tablePane, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        //If user hits 'Start game!', creating a new frame and help frame, while disposing of this one below:
        if (command.equals("Start game!")) {
            PlayGame obj1 = new PlayGame(p1, p2);
            PlayInstructions obj2 = new PlayInstructions();
            this.dispose();
        }
    }
}
