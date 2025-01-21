package customer;

import baseClass.BaseState;

public class CustomerWaitWaiterState implements BaseState<CustomerStates> {
    public CustomerWaitWaiterState() {
    }

    @Override
    public void enterState() {

    }

    @Override
    public void exitState() {

    }

    @Override
    public void updateState() {

    }

    @Override
    public CustomerStates getNextState() {
        return null;
    }

    @Override
    public CustomerStates getKey() {
        return CustomerStates.WAIT_FOOD_WAITER;
    }
}
