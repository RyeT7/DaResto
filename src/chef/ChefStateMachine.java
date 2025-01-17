package chef;

import BaseClass.ThreadMachine;

public class ChefStateMachine implements Runnable, ThreadMachine {
    private Chef chef;
    private Thread chefThread;

    private ChefStates currentState;

    public ChefStateMachine() {
        chef = new Chef();
        currentState = ChefStates.IDLE;

        startThread();
    }

    @Override
    public void run() {
        while(true){

        }
    }

    @Override
    public boolean startThread(){
        try {
            chefThread = new Thread(this);
            chefThread.start();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public Chef getChef() {
        return chef;
    }
}
