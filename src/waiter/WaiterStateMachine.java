package waiter;

import baseClass.BaseState;
import baseClass.StateMachine;
import baseClass.ThreadMachine;
import utils.GameManager;

public class WaiterStateMachine extends StateMachine<WaiterState> implements Runnable, ThreadMachine<WaiterState, BaseState<WaiterState>> {
    private final Waiter waiter;
    private Thread waiterThread;

    public WaiterStateMachine() {
        waiter = new Waiter();
        fillStateMap();
        GameManager.getInstance().addWaiter(this);

        start();

        startThread();
    }

    @Override
    protected void fillStateMap() {
        allStates.put(WaiterState.IDLE, new WaiterIdleState(this));
        allStates.put(WaiterState.TAKE_ORDER, new WaiterTakeOrderState(this));
        allStates.put(WaiterState.WAIT_COOK, new WaiterWaitCookState(this));
        allStates.put(WaiterState.BRING_ORDER, new WaiterBringOrderState(this));
        allStates.put(WaiterState.SERVING_FOOD, new WaiterServingFoodState(this));
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

    }

    @Override
    public void update() throws InterruptedException {
        while (true){
            Thread.sleep(1000);

            WaiterState nextKey = currentState.getNextState();
            BaseState<WaiterState> nextState = allStates.get(nextKey);
            transitionToNextStateOrContinue(currentState, nextState);
        }
    }

    public Waiter getWaiter() {
        return waiter;
    }
}
