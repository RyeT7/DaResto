package utils;

import views.View;

public class Router {
    public static void route(View view){
        Util.clearScreen();
        view.run();
    }
}
