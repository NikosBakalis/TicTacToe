package test.test;

import javax.swing.*;
import javax.swing.JFrame.*;

public class TicTacToe {
    public static void main (String[] Args) {
        JFrame ticTacToe = new TicTacToeFrame();
        ticTacToe.setTitle("The Tic-Tac-Toe Game!");
        ticTacToe.setSize(600,600);
        ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticTacToe.setLocationRelativeTo(null);
        ticTacToe.setVisible(true);
    }
}

