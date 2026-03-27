package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.TicTacToeGame;
import view.BoardButton;
import model.GameState;

public class ButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TicTacToeGame game = App.game;
        BoardButton button = (BoardButton) e.getSource();


        game.play(button.getPos());
        if (game.getWinner() != null) {
            game.setState(GameState.OVER);
            System.out.println("Game Over: " + game.getWinner());
        } else {
            game.changeTurns();
        }

        App.win.updateWindow();

    }
    
}
