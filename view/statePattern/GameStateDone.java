package view.statePattern;

import java.awt.Graphics2D;

import view.AppWindow;

public class GameStateDone implements GameState {

    @Override
    public void goNext(AppWindow context) {
        // No transitions from done state, only to init when new game is started
    }

    @Override
    public void updateWindow() {
        // No window updates needed for done state
    }

    @Override
    public void updateCanvas(Graphics2D g2) {
        // No canvas updates needed for done state, handled by AppCanvas
    }
    
}
