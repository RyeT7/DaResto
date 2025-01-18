package chef;

import baseClass.AbstractState;
import baseClass.StateMachine;
import baseClass.ThreadMachine;
import utils.GameManager;

public class ChefStateMachine extends StateMachine<ChefStates> implements Runnable, ThreadMachine<ChefStates, AbstractState<ChefStates>> {
    private final Chef chef;
    private int seconds;
    private Thread chefThread;

    public ChefStateMachine() {
        chef = new Chef(this);
        fillStateMap();
        GameManager.getInstance().addCharacters(chef);

        start();

        startThread();
    }

    @Override
    protected void fillStateMap() {
        allStates.put(ChefStates.IDLE, new ChefIdleState());
        allStates.put(ChefStates.COOK, new ChefCookState());
        allStates.put(ChefStates.DONE, new ChefDoneState());
    }

    @Override
    public void run() {
        try {
            update();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start(){
        currentState = allStates.get(ChefStates.IDLE);
        currentState.enterState();
        seconds = 1;
    }

    @Override
    public void update() throws InterruptedException {
        while(true){
            seconds += 1;
            Thread.sleep(1000);

            ChefStates nextKey = currentState.getNextState();
            AbstractState<ChefStates> nextState = allStates.get(nextKey);
            transitionToNextStateOrContinue(currentState, nextState);
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
