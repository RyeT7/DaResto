package controller;

import utils.Router;
import utils.Util;
import views.ExitView;
import views.HighScoreView;
import views.MainMenuView;

public class MainMenuController {

    private final MainMenuView view;

    public MainMenuController(MainMenuView view) {
        this.view = view;
    }

    public void setView(){
        while(true){
            view.getView();
            int choice = Util.nextInt();

            switch (choice){
                case 1:
                    break;
                case 2:
                    Router.route(new HighScoreView());
                    break;
                case 3:
                    Router.route(new ExitView());
                    return;
                default:
                    break;
            }

            Util.clearScreen();
        }
    }
}
