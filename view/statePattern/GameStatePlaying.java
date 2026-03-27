package view.statePattern;

import java.awt.Graphics2D;
import view.AppWindow;

public class GameStatePlaying implements GameState {

    @Override
    public void goNext(AppWindow context) {
        // No transition from playing state, only to game over when game is done
    }

    @Override
    public void updateWindow() {
        // No window updates needed for playing state
    }

    @Override
    public void updateCanvas(Graphics2D g2) {
        // No canvas updates needed for playing state, handled by AppCanvas
    }
    
}
