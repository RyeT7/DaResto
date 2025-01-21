package customer;

import baseClass.BaseState;

import javax.swing.plaf.IconUIResource;

public class CustomerWaitWaiterState implements BaseState<CustomerStates> {
    private final CustomerStateMachine customerStateMachine;

    public CustomerWaitWaiterState(CustomerStateMachine customerStateMachine) {
        this.customerStateMachine = customerStateMachine;
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
