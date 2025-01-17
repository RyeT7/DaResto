package views;

import controller.ExitController;
import utils.Util;

public class ExitView implements View {

    private ExitController controller;

    public ExitView() {
        // TODO: exit view
        controller = new ExitController(this);
    }

    private void exit(){
        System.out.println("Prove Our Will Emerge Our Spirit");
        System.out.println("Press Enter to Continue...");
    }

    @Override
    public void getView() {
        exit();
    }

    @Override
    public void run() {
        controller.setView();
    }
}
