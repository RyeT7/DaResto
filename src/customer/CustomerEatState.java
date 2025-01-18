package customer;

import baseClass.AbstractState;

public class CustomerEatState implements AbstractState<CustomerStates> {
    public CustomerEatState() {
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
        return CustomerStates.EAT;
    }
}
