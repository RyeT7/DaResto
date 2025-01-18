package customer;

import baseClass.AbstractState;

public class CustomerOrderState implements AbstractState<CustomerStates> {
    public CustomerOrderState() {
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
        return CustomerStates.ORDER;
    }
}
