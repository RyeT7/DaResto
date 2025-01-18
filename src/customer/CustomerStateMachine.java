package customer;

import baseClass.StateMachine;
import baseClass.ThreadMachine;
import utils.GameManager;

public class CustomerStateMachine extends StateMachine<CustomerStates> implements Runnable, ThreadMachine {
    private final Customer customer;
    private Thread customerThread;

    private CustomerOrderState customerOrderState;
    private CustomerWaitState customerWaitState;
    private CustomerEatState customerEatState;

    public CustomerStateMachine() {
        this.customer = new Customer();
        fillStateMap();
        GameManager.getInstance().addCharacters(customer);

        start();

        startThread();
    }

    @Override
    protected void fillStateMap() {
        customerOrderState = new CustomerOrderState();
        customerWaitState = new CustomerWaitState();
        customerEatState = new CustomerEatState();

        allStates.put(CustomerStates.ORDER, customerOrderState);
        allStates.put(CustomerStates.ORDER_WAITER, customerOrderState);
        allStates.put(CustomerStates.WAIT_FOOD, customerWaitState);
        allStates.put(CustomerStates.WAIT_FOOD_WAITER, customerWaitState);
        allStates.put(CustomerStates.WAIT_FOOD_CHEF, customerWaitState);
        allStates.put(CustomerStates.EAT, customerEatState);
    }

    @Override
    public void run() {
        update();
    }

    @Override
    public void start() {
        currentState = allStates.get(CustomerStates.ORDER);
        currentState.enterState();
    }

    @Override
    public void update() {
        while (true){

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
