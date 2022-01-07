/*
Dhruv K. Saligram
4/1/18
This is a program that allows the user to play the classic battleships game
This class, when accessed, updates the player's board to show them on the screen where they placed their destroyer
 */
package saligrambattleship;

//Imports below:
import javax.swing.JLabel;

public class DestroyerLabelPlacement {

    //Setting parameters below:
    public static JLabel[][] placement(String coordinateInput, String orientation, boolean[][] coordinateTester, JLabel[][] board) {

        //Setting and creating spacer and flag below:
        final String FORMAT_SPACER;
        boolean flag;
        flag = false;
        FORMAT_SPACER = new String("  ");

        //Checking if user's placed ship is in A row below:
        if (coordinateInput.charAt(0) == 'A') {
            //Checking if user's orientation is vertical below:
            if (orientation.equals("V")) {
                //Testing for each individial A coordinate below:
                if (coordinateInput.equals("A1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[0][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[0][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[0][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("A2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[0][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[0][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[0][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("A3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[0][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[0][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[0][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("A4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[0][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[0][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[0][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("A5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[0][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[0][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[0][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("A6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[0][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[0][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[0][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("A7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[0][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[0][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[0][i] = true;
                        }
                    }
                }
            } else if (orientation.equals("H")) {
                if (coordinateInput.equals("A1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[a][0] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][0].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][0] = true;
                        }
                    }
                } else if (coordinateInput.equals("A2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[a][1] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][1].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][1] = true;
                        }
                    }
                } else if (coordinateInput.equals("A3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[a][2] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][2].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][2] = true;
                        }
                    }
                } else if (coordinateInput.equals("A4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[a][3] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][3].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][3] = true;
                        }
                    }
                } else if (coordinateInput.equals("A5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[a][4] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][4].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][4] = true;
                        }
                    }
                } else if (coordinateInput.equals("A6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[a][5] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][5].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][5] = true;
                        }
                    }
                } else if (coordinateInput.equals("A7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[a][6] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][6].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][6] = true;
                        }
                    }
                } else if (coordinateInput.equals("A8")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[a][7] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][7].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][7] = true;
                        }
                    }
                } else if (coordinateInput.equals("A9")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[a][8] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][8].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][8] = true;
                        }
                    }
                } else if (coordinateInput.equals("A10")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[a][9] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][9].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][9] = true;
                        }
                    }
                }
            }
        } else if (coordinateInput.charAt(0) == 'B') {
            if (orientation.equals("H")) {
                if (coordinateInput.equals("B1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[a][0] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][0].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][0] = true;
                        }
                    }
                } else if (coordinateInput.equals("B2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[a][1] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][1].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][1] = true;
                        }
                    }
                } else if (coordinateInput.equals("B3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[a][2] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][2].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][2] = true;
                        }
                    }
                } else if (coordinateInput.equals("B4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[a][3] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][3].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][3] = true;
                        }
                    }
                } else if (coordinateInput.equals("B5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[a][4] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][4].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][4] = true;
                        }
                    }
                } else if (coordinateInput.equals("B6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[a][5] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][5].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][5] = true;
                        }
                    }
                } else if (coordinateInput.equals("B7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[a][6] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][6].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][6] = true;
                        }
                    }
                } else if (coordinateInput.equals("B8")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[a][7] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][7].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][7] = true;
                        }
                    }
                } else if (coordinateInput.equals("B9")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[a][8] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][8].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][8] = true;
                        }
                    }
                } else if (coordinateInput.equals("B10")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[a][9] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][9].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][9] = true;
                        }
                    }
                }
            } else if (orientation.equals("V")) {
                if (coordinateInput.equals("B1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[1][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[1][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[1][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("B2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[1][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[1][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[1][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("B3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[1][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[1][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[1][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("B4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[1][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[1][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[1][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("B5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[1][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[1][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[1][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("B6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[1][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[1][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[1][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("B7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[1][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[1][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[1][i] = true;
                        }
                    }
                }
            }
        } else if (coordinateInput.charAt(0) == 'C') {
            if (orientation.equals("H")) {
                if (coordinateInput.equals("C1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[a][0] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][0].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][0] = true;
                        }
                    }
                } else if (coordinateInput.equals("C2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[a][1] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][1].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][1] = true;
                        }
                    }
                } else if (coordinateInput.equals("C3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[a][2] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][2].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][2] = true;
                        }
                    }
                } else if (coordinateInput.equals("C4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[a][3] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][3].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][3] = true;
                        }
                    }
                } else if (coordinateInput.equals("C5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[a][4] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][4].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][4] = true;
                        }
                    }
                } else if (coordinateInput.equals("C6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[a][5] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][5].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][5] = true;
                        }
                    }
                } else if (coordinateInput.equals("C7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[a][6] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][6].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][6] = true;
                        }
                    }
                } else if (coordinateInput.equals("C8")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[a][7] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][7].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][7] = true;
                        }
                    }
                } else if (coordinateInput.equals("C9")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[a][8] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][8].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][8] = true;
                        }
                    }
                } else if (coordinateInput.equals("C10")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[a][9] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][9].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][9] = true;
                        }
                    }
                }
            } else if (orientation.equals("V")) {
                if (coordinateInput.equals("C1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[2][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[2][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[2][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("C2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[2][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[2][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[2][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("C3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[2][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[2][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[2][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("C4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[2][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[2][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[2][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("C5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[2][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[2][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[2][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("C6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[2][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[2][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[2][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("C7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[2][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[2][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[2][i] = true;
                        }
                    }
                }
            }
        } else if (coordinateInput.charAt(0) == 'D') {
            if (orientation.equals("H")) {
                if (coordinateInput.equals("D1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[a][0] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][0].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][0] = true;
                        }
                    }
                } else if (coordinateInput.equals("D2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[a][1] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][1].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][1] = true;
                        }
                    }
                } else if (coordinateInput.equals("D3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[a][2] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][2].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][2] = true;
                        }
                    }
                } else if (coordinateInput.equals("D4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[a][3] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][3].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][3] = true;
                        }
                    }
                } else if (coordinateInput.equals("D5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[a][4] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][4].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][4] = true;
                        }
                    }
                } else if (coordinateInput.equals("D6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[a][5] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][5].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][5] = true;
                        }
                    }
                } else if (coordinateInput.equals("D7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[a][0] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][6].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][6] = true;
                        }
                    }
                } else if (coordinateInput.equals("D8")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[a][7] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][7].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][7] = true;
                        }
                    }
                } else if (coordinateInput.equals("D9")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[a][8] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][8].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][8] = true;
                        }
                    }
                } else if (coordinateInput.equals("D10")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[a][9] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][9].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][9] = true;
                        }
                    }
                }
            } else if (orientation.equals("V")) {
                if (coordinateInput.equals("D1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[3][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[3][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[3][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("D2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[3][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[3][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[3][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("D3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[3][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[3][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[3][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("D4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[3][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[3][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[3][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("D5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[3][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[3][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[3][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("D6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[3][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[3][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[3][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("D7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[3][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[3][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[3][i] = true;
                        }
                    }
                }
            }
        } else if (coordinateInput.charAt(0) == 'E') {
            if (orientation.equals("H")) {
                if (coordinateInput.equals("E1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[a][0] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][0].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][0] = true;
                        }
                    }
                } else if (coordinateInput.equals("E2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[a][1] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][1].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][1] = true;
                        }
                    }
                } else if (coordinateInput.equals("E3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[a][2] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][2].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][2] = true;
                        }
                    }
                } else if (coordinateInput.equals("E4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[a][3] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][3].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][3] = true;
                        }
                    }
                } else if (coordinateInput.equals("E5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[a][4] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][4].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][4] = true;
                        }
                    }
                } else if (coordinateInput.equals("E6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[a][5] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][5].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][5] = true;
                        }
                    }
                } else if (coordinateInput.equals("E7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[a][6] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][6].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][6] = true;
                        }
                    }
                } else if (coordinateInput.equals("E8")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[a][7] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][7].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][7] = true;
                        }
                    }
                } else if (coordinateInput.equals("E9")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[a][8] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][8].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][8] = true;
                        }
                    }
                } else if (coordinateInput.equals("E10")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[a][9] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][9].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][9] = true;
                        }
                    }
                }
            } else if (orientation.equals("V")) {
                if (coordinateInput.equals("E1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[4][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[4][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[4][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("E2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[4][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[4][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[4][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("E3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[4][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[4][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[4][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("E4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[4][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[4][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[4][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("E5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[4][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[4][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[4][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("E6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[4][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[4][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[4][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("E7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[4][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[4][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[4][i] = true;
                        }
                    }
                }
            }
        } else if (coordinateInput.charAt(0) == 'F') {
            if (orientation.equals("H")) {
                if (coordinateInput.equals("F1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[a][0] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][0].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][0] = true;
                        }
                    }
                } else if (coordinateInput.equals("F2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[a][1] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][1].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][1] = true;
                        }
                    }
                } else if (coordinateInput.equals("F3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[a][2] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][2].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][2] = true;
                        }
                    }
                } else if (coordinateInput.equals("F4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[a][3] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][3].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][3] = true;
                        }
                    }
                } else if (coordinateInput.equals("F5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[a][4] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][4].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][4] = true;
                        }
                    }
                } else if (coordinateInput.equals("F6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[a][5] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][5].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][5] = true;
                        }
                    }
                } else if (coordinateInput.equals("F7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[a][6] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][6].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][6] = true;
                        }
                    }
                } else if (coordinateInput.equals("F8")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[a][7] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][7].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][7] = true;
                        }
                    }
                } else if (coordinateInput.equals("F9")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[a][8] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][8].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][8] = true;
                        }
                    }
                } else if (coordinateInput.equals("F10")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[a][9] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][9].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][9] = true;
                        }
                    }
                }
            } else if (orientation.equals("V")) {
                if (coordinateInput.equals("F1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[5][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[5][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[5][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("F2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[5][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[5][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[5][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("F3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[5][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[5][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[5][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("F4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[5][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[5][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[5][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("F5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[5][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[5][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[5][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("F6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[5][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[5][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[5][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("F7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[5][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[5][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[5][i] = true;
                        }
                    }
                }
            }
        } else if (coordinateInput.charAt(0) == 'G') {
            if (orientation.equals("H")) {
                if (coordinateInput.equals("G1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[a][0] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][0].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][0] = true;
                        }
                    }
                } else if (coordinateInput.equals("G2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[a][1] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][1].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][1] = true;
                        }
                    }
                } else if (coordinateInput.equals("G3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[a][2] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][2].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][2] = true;
                        }
                    }
                } else if (coordinateInput.equals("G4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[a][3] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][3].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][3] = true;
                        }
                    }
                } else if (coordinateInput.equals("G5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[a][4] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][4].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][4] = true;
                        }
                    }
                } else if (coordinateInput.equals("G6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[a][5] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][5].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][5] = true;
                        }
                    }
                } else if (coordinateInput.equals("G7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[a][6] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][6].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][6] = true;
                        }
                    }
                } else if (coordinateInput.equals("G8")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[a][7] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][7].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][7] = true;
                        }
                    }
                } else if (coordinateInput.equals("G9")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[a][8] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][8].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][8] = true;
                        }
                    }
                } else if (coordinateInput.equals("G10")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[a][9] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[i][9].setText("X" + FORMAT_SPACER);
                            coordinateTester[i][9] = true;
                        }
                    }
                }
            } else if (orientation.equals("V")) {
                if (coordinateInput.equals("G1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[6][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[6][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[6][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("G2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[6][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[6][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[6][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("G3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[6][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[6][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[6][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("G4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[6][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[6][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[6][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("G5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[6][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[6][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[6][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("G6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[6][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[6][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[6][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("G7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[6][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[6][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[6][i] = true;
                        }
                    }
                }
            }
        } else if (coordinateInput.charAt(0) == 'H') {
            if (orientation.equals("V")) {
                if (coordinateInput.equals("H1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[7][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[7][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[7][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("H2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[7][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[7][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[7][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("H3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[7][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[7][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[7][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("H4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[7][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[7][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[7][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("H5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[7][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[7][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[7][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("H6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[7][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[7][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[7][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("H7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[7][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[7][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[7][i] = true;
                        }
                    }
                }
            }
        } else if (coordinateInput.charAt(0) == 'I') {
            if (orientation.equals("V")) {
                if (coordinateInput.equals("I1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[8][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[8][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[8][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("I2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[8][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[8][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[8][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("I3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[8][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[8][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[8][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("I4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[8][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[8][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[8][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("I5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[8][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[8][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[8][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("I6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[8][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[8][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[8][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("I7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[8][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[8][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[8][i] = true;
                        }
                    }
                }
            }
        } else if (coordinateInput.charAt(0) == 'J') {
            if (orientation.equals("V")) {
                if (coordinateInput.equals("J1")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 0; a < 4; a++) {
                        if (coordinateTester[9][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 0; i < 4; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[9][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[9][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("J2")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 1; a < 5; a++) {
                        if (coordinateTester[9][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 1; i < 5; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[9][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[9][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("J3")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 2; a < 6; a++) {
                        if (coordinateTester[9][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 2; i < 6; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[9][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[9][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("J4")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 3; a < 7; a++) {
                        if (coordinateTester[9][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 3; i < 7; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[9][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[9][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("J5")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 4; a < 8; a++) {
                        if (coordinateTester[9][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 4; i < 8; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[9][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[9][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("J6")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 5; a < 9; a++) {
                        if (coordinateTester[9][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 5; i < 9; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[9][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[9][i] = true;
                        }
                    }
                } else if (coordinateInput.equals("J7")) {
                    //Testing to see if a ship has already been placed in the same region below:
                    for (int a = 6; a < 10; a++) {
                        if (coordinateTester[9][a] == true) {
                            flag = true;
                        }
                    }
                    //If the spots are all open, the user proceeds with placement below:
                    if (flag == false) {
                        for (int i = 6; i < 10; i++) {
                            //Changing board to show ships and registering where ships are placed below:
                            board[9][i].setText("X" + FORMAT_SPACER);
                            coordinateTester[9][i] = true;
                        }
                    }
                }
            }
        }
        //Returning JLabel 2D array below to show user where they placed their destroyer below:
        return board;
    }
}
