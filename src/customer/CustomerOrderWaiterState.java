package customer;

import baseClass.BaseState;

public class CustomerOrderWaiterState implements BaseState<CustomerStates> {
    public CustomerOrderWaiterState() {
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
        return CustomerStates.ORDER_WAITER;
    }
}
