package customer;

import baseClass.BaseState;
import baseClass.StateMachine;
import baseClass.ThreadMachine;
import utils.GameManager;

public class CustomerStateMachine extends StateMachine<CustomerStates> implements Runnable, ThreadMachine<CustomerStates, BaseState<CustomerStates>> {
    private final Customer customer;
    private Thread customerThread;

    public CustomerStateMachine() {
        this.customer = new Customer();
        fillStateMap();
        GameManager.getInstance().addCustomer(this);

        start();

        startThread();
    }

    @Override
    protected void fillStateMap() {
        allStates.put(CustomerStates.ORDER, new CustomerOrderState(this));
        allStates.put(CustomerStates.ORDER_WAITER, new CustomerOrderWaiterState(this));
        allStates.put(CustomerStates.WAIT_FOOD, new CustomerWaitState(this));
        allStates.put(CustomerStates.WAIT_FOOD_WAITER, new CustomerWaitWaiterState(this));
        allStates.put(CustomerStates.WAIT_FOOD_CHEF, new CustomerWaitChefState(this));
        allStates.put(CustomerStates.EAT, new CustomerEatState(this));
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
    public void start() {
        currentState = allStates.get(CustomerStates.ORDER);
        currentState.enterState();
    }

    @Override
    public void update() throws InterruptedException {
        while (true){
            Thread.sleep(1000);

            CustomerStates nextKey = currentState.getNextState();
            BaseState<CustomerStates> nextState = allStates.get(nextKey);
            transitionToNextStateOrContinue(currentState, nextState);
        }
    }

    @Override
    public boolean startThread() {
        try {
            customerThread = new Thread(this);
            customerThread.start();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public Customer getCustomer() {
        return customer;
    }
}
