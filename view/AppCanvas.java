package view;

import javax.swing.JPanel;

import controller.App;
import model.GameState;
import model.Marking;
import model.TicTacToeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class AppCanvas extends JPanel {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 100;

    public AppCanvas() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Custom drawing code can be added here
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Courier New", Font.BOLD, 16));

        TicTacToeGame game = App.game;
        GameState state = game.getState();

        switch (state) {
            case INIT:
                g2.setColor(Color.BLUE);
                g2.drawString("Press <New Game> to start", 50, 50);
                break;
            case PLAYING:
                g2.setColor(Color.BLUE);
                g2.drawString("Current turn: " + game.getTurn(), 50, 50);
                break;
            case OVER:
                Marking winner = game.getWinner();
                String overMessage = winner + " has won!";
                if (winner == Marking.U) {
                    overMessage = "Draw/Tie";
                }
                g2.setColor(Color.RED);
                g2.drawString("Game Over: " +overMessage, 50, 50);
                g2.drawString("Press <New Game> to play again", 50, 80);
                break;
        }
    }   
}
