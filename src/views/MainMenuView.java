package views;

import controller.MainMenuController;

public class MainMenuView implements View {

    private MainMenuController controller;

    public MainMenuView() {
        // TODO: create main menu
        controller = new MainMenuController(this);
    }

    private void mainMenu(){
        System.out.println("Main Menu");

        System.out.println("1. Play New Restaurant");
        System.out.println("2. High Score");
        System.out.println("Exit");
        System.out.print("Input [1..3]: ");
    }

    @Override
    public void getView() {
        mainMenu();
    }

    @Override
    public void run() {
        controller.setView();
    }
}
