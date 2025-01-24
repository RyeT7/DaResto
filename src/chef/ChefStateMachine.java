package chef;

import baseClass.*;
import Restaurant.RestaurantManager;

public class ChefStateMachine extends StateMachine<ChefStates> implements ThreadMachine<ChefStates, BaseState<ChefStates>>, Employee, Entity {
    private final Chef chef;
    private int seconds;
    private Thread chefThread;
    private RestaurantMediator mediator;

    public ChefStateMachine(RestaurantMediator mediator) {
        chef = new Chef(this);
        fillStateMap();
        RestaurantManager.getInstance().addChef(this);
        this.mediator = mediator;

        start();

        startThread();
    }

    @Override
    protected void fillStateMap() {
        allStates.put(ChefStates.IDLE, new ChefIdleState(this));
        allStates.put(ChefStates.COOK, new ChefCookState(this));
        allStates.put(ChefStates.DONE, new ChefDoneState(this));
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
        seconds = 0;
    }

    @Override
    public void update() throws InterruptedException {
        while(true){
            ChefStates nextKey = currentState.getNextState();
            BaseState<ChefStates> nextState = allStates.get(nextKey);
            transitionToNextStateOrContinue(currentState, nextState);

            Thread.sleep(1000);
            seconds += 1;
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

    @Override
    protected int getSeconds() {
        return seconds;
    }

    @Override
    public void sendEntity(Entity to) {
    }

    @Override
    public Thread getThread() {
        return chefThread;
    }

    @Override
    public BaseState<ChefStates> getCurrentState() {
        return currentState;
    }

    @Override
    protected RestaurantMediator getMediator() {
        return mediator;
    }
}
