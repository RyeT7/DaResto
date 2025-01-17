package controller;

import utils.Util;
import views.ExitView;

public class ExitController {
    private final ExitView view;

    public ExitController(ExitView view) {
        this.view = view;
    }

    public void setView(){
        view.getView();
        Util.nextLine();
    }
}
