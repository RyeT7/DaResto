package waiter;

import baseClass.*;
import Restaurant.RestaurantManager;

public class WaiterStateMachine extends StateMachine<WaiterStates> implements ThreadMachine<WaiterStates, BaseState<WaiterStates>>, Employee, Entity {
    private final Waiter waiter;
    private Thread waiterThread;
    private int seconds;
    private RestaurantMediator mediator;

    public WaiterStateMachine(RestaurantMediator mediator) {
        waiter = new Waiter();
        fillStateMap();
        RestaurantManager.getInstance().addWaiter(this);
        this.mediator = mediator;

        start();

        startThread();
    }

    @Override
    protected void fillStateMap() {
        allStates.put(WaiterStates.IDLE, new WaiterIdleState(this));
        allStates.put(WaiterStates.TAKE_ORDER, new WaiterTakeOrderState(this));
        allStates.put(WaiterStates.WAIT_COOK, new WaiterWaitCookState(this));
        allStates.put(WaiterStates.BRING_ORDER, new WaiterBringOrderState(this));
        allStates.put(WaiterStates.SERVING_FOOD, new WaiterServingFoodState(this));
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
    public boolean startThread() {
        try {
            waiterThread = new Thread(this);
            waiterThread.start();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public void start() {
        currentState = allStates.get(WaiterStates.IDLE);
        currentState.enterState();
        seconds = 0;
    }

    @Override
    public void update() throws InterruptedException {
        while (true){
            seconds += 1;
            Thread.sleep(1000);

            WaiterStates nextKey = currentState.getNextState();
            BaseState<WaiterStates> nextState = allStates.get(nextKey);
            transitionToNextStateOrContinue(currentState, nextState);
        }
    }

    public Waiter getWaiter() {
        return waiter;
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
        return waiterThread;
    }

    @Override
    public BaseState<WaiterStates> getCurrentState() {
        return currentState;
    }

    @Override
    protected RestaurantMediator getMediator() {
        return null;
    }
}
