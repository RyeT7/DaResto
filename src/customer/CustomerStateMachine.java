package customer;

import baseClass.*;
import Restaurant.RestaurantManager;

public class CustomerStateMachine extends StateMachine<CustomerStates> implements ThreadMachine<CustomerStates, BaseState<CustomerStates>>, Entity {
    private final Customer customer;
    private Thread customerThread;
    private int seconds;
    private RestaurantMediator mediator;

    public CustomerStateMachine(RestaurantMediator mediator) {
        this.customer = new Customer();
        fillStateMap();
        RestaurantManager.getInstance().addCustomer(this);
        this.mediator = mediator;

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
        seconds = 0;
    }

    @Override
    public void update() throws InterruptedException {
        while (true){
            seconds += 1;
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

    @Override
    protected int getSeconds() {
        return seconds;
    }

    @Override
    public void sendEntity(Entity to) {

    }

    @Override
    public Thread getThread() {
        return customerThread;
    }

    @Override
    public BaseState<CustomerStates> getCurrentState() {
        return currentState;
    }

    @Override
    protected RestaurantMediator getMediator() {
        return mediator;
    }
}
