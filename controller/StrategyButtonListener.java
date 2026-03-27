package controller;

import model.PlayStrategy;
import view.AppWindow;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StrategyButtonListener implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        var actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case AppWindow.vsHumanAction:
                App.game.setStrategy(PlayStrategy.VsHuman);
                break;
            case AppWindow.vsComputerAction:
                App.game.setStrategy(PlayStrategy.VsComputer);
                break;
        }
    }
}
