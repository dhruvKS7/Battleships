/*
Dhruv K. Saligram
4/1/18
This is a program that allows the user to play the classic battleships game
This class, when called, places the computer's ships on their board
 */
package saligrambattleship;

//Imports below:
import java.util.Random;

public class AIPlacement {

    //Making method to return boolean 2D array below:
    public static boolean[][] player2Board() {
        //Setting up booolean board below:
        boolean[][] board = new boolean[10][10];
        boolean flag;
        boolean tester;
        //Running for loop 3 times for 3 different ships below:
        for (int z = 0; z < 3; z++) {
            int row = 0;
            int column = 0;
            flag = false;
            tester = false;
            //Creating new random generator below:
            Random placer = new Random();
            //Setting orientation 0 for horizontal or 1 for vertical below:
            int orientation = placer.nextInt(2);
            //Checking which ship is being placed below:
            if (z == 0) {
                //Checking which orientation was randomly selected to build ships correctly below:
                if (orientation == 0) {
                    //Allowing rows to be placed, but only certain columns to ensure ship doesn't leave the board below:
                    row = placer.nextInt(10);
                    column = placer.nextInt(8);
                } else {
                    //Allowing columns to be placed, but only certain rows to ensure ship doesn't leave the board below:
                    row = placer.nextInt(8);
                    column = placer.nextInt(10);
                }
            } else if (z == 1) {
                //Checking which orientation was randomly selected to build ships correctly below:
                if (orientation == 0) {
                    //Allowing rows to be placed, but only certain columns to ensure ship doesn't leave the board
                    row = placer.nextInt(10);
                    column = placer.nextInt(7);
                } else {
                    //Allowing columns to be placed, but only certain rows to ensure ship doesn't leave the board below:
                    row = placer.nextInt(7);
                    column = placer.nextInt(10);
                }
            } else {
                //Checking which orientation was randomly selected to build ships correctly below:
                if (orientation == 0) {
                    //Allowing rows to be placed, but only certain columns to ensure ship doesn't leave the board
                    row = placer.nextInt(10);
                    column = placer.nextInt(6);
                } else {
                    //Allowing columns to be placed, but only certain rows to ensure ship doesn't leave the board below:
                    row = placer.nextInt(6);
                    column = placer.nextInt(10);
                }
            }
            if (z == 0) {
                //Horizontal:
                if (orientation == 0) {
                    do {
                        //Checking if spots are available below:
                        for (int i = column; i < column + 3; i++) {
                            if (board[i][row] == true) {
                                flag = true;
                            }
                        }
                        //If they are available, populating the board below:
                        if (flag == false) {
                            for (int i = column; i < column + 3; i++) {
                                board[i][row] = true;
                                tester = true;
                            }
                        } //Otherwise, creating new numbers to retry below:
                        else {
                            row = placer.nextInt(10);
                            column = placer.nextInt(8);
                            flag = false;
                        }
                    } while (tester == false);
                } //Vertical:
                else {
                    do {
                        //Checking if spots are available below:
                        for (int i = row; i < row + 3; i++) {
                            if (board[column][i] == true) {
                                flag = true;
                            }
                        }
                        //If they are available, populating the board below:
                        if (flag == false) {
                            for (int i = row; i < row + 3; i++) {
                                board[column][i] = true;
                                tester = true;
                            }
                            flag = false;
                        } //Otherwise, creating new numbers to retry below:
                        else {
                            row = placer.nextInt(8);
                            column = placer.nextInt(10);
                            flag = false;
                        }
                    } while (tester == false);
                }
            } else if (z == 1) {
                //Horizontal:
                if (orientation == 0) {
                    do {
                        //Checking if spots are available below:
                        for (int i = column; i < column + 4; i++) {
                            if (board[i][row] == true) {
                                flag = true;
                            }
                        }
                        //If they are available, populating the board below:
                        if (flag == false) {
                            for (int i = column; i < column + 4; i++) {
                                board[i][row] = true;
                                tester = true;
                            }
                            flag = false;
                        } //Otherwise, creating new numbers to retry below:
                        else {
                            row = placer.nextInt(10);
                            column = placer.nextInt(7);
                            flag = false;
                        }
                    } while (tester == false);
                } //Vertical:
                else {
                    do {
                        //Checking if spots are available below:
                        for (int i = row; i < row + 4; i++) {
                            if (board[column][i] == true) {
                                flag = true;
                            }
                        }
                        //If they are available, populating the board below:
                        if (flag == false) {
                            for (int i = row; i < row + 4; i++) {
                                board[column][i] = true;
                                tester = true;
                            }
                            flag = false;
                        } //Otherwise, creating new numbers to retry below:
                        else {
                            row = placer.nextInt(7);
                            column = placer.nextInt(10);
                            flag = false;
                        }
                    } while (tester == false);
                }
            } else {
                //Horizontal:
                if (orientation == 0) {
                    do {
                        //Checking if spots are available below:
                        for (int i = column; i < column + 5; i++) {
                            if (board[i][row] == true) {
                                flag = true;
                            }
                        }
                        //If they are available, populating the board below:
                        if (flag == false) {
                            for (int i = column; i < column + 5; i++) {
                                board[i][row] = true;
                                tester = true;
                            }
                            flag = false;
                        } //Otherwise, creating new numbers to retry below:
                        else {
                            row = placer.nextInt(10);
                            column = placer.nextInt(6);
                            flag = false;
                        }
                    } while (tester == false);
                } //Vertical:
                else {
                    do {
                        //Checking if spots are available below:
                        for (int i = row; i < row + 5; i++) {
                            if (board[column][i] == true) {
                                flag = true;
                            }
                        }
                        //If they are available, populating the board below:
                        if (flag == false) {
                            for (int i = row; i < row + 5; i++) {
                                board[column][i] = true;
                                tester = true;
                            }
                            flag = false;
                        } //Otherwise, creating new numbers to retry below:
                        else {
                            row = placer.nextInt(6);
                            column = placer.nextInt(10);
                            flag = false;
                        }
                        //Running code until tester is false below:
                    } while (tester == false);
                }
            }
        }
        //Returning boolean 2D array with the computer's ships below:
        return board;
    }
}
