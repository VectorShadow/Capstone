package io.modes;

import engine.Engine;
import engine.Messages;
import io.file.FileManager;
import io.gui.GUIManager;

import java.awt.*;

public class MainMenuMode extends MenuMode {

    private final int OPT_IDX_NEW_GAME = 0;
    private final int OPT_IDX_LOAD_GAME = 1;
    private final int OPT_IDX_DEL_GAME = 2;
    private final int OPT_IDX_MAN_PAGE = 3;
    private final int OPT_IDX_EXIT = 4;

    public MainMenuMode() {
        super(
                "Welcome to Depth First Search and Destroy!",
                new Color[] {
                     null,
                     Color.BLUE,
                     Color.GREEN,
                     null,
                     null,
                     Color.GREEN,
                     null,
                     Color.DARK_GRAY
                },
                new MenuOption("Begin New Game", !FileManager.doesSavedGameExist()),
                new MenuOption("Load Existing Game", FileManager.doesSavedGameExist()),
                new MenuOption("Delete Existing Game", FileManager.doesSavedGameExist()),
                new MenuOption("View Commands and Info", true),
                new MenuOption("Exit", true)
        );
    }

    @Override
    public void execute() {
        switch (selectedOption) {
            case OPT_IDX_NEW_GAME:
                startGame();
                break;
            case OPT_IDX_LOAD_GAME:
                FileManager.loadSavedGame();
                startGame();
                break;
            case OPT_IDX_DEL_GAME:
                FileManager.deleteSavedGame();
                GUIManager.getInstance().revert(); //pop off current MainMenuMode
                GUIManager.getInstance().transitionTo(new MainMenuMode()); //transition to a new one reflecting current savegame state
                break;
            case OPT_IDX_MAN_PAGE:
                GUIManager.getInstance().transitionTo(new HelpScreenMode());
                break;
            case OPT_IDX_EXIT:
                GUIManager.getInstance().revert();
                break;
            default:
                throw new IllegalStateException("Option index " + selectedOption + " not handled.");
        }
    }

    private void startGame() {
        GUIManager.getInstance().transitionTo(new GameplayMode());
        Messages.addMessage("Welcome to <untitled roguelike>!");
        Engine.getInstance().start();
    }
}
