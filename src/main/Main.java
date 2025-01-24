package main;

import utils.Router;
import views.MainMenuView;

public class Main {
    public Main() {
        Router.route(new MainMenuView());
    }

    public static void main(String[] args) {
        new Main();
    }
}
