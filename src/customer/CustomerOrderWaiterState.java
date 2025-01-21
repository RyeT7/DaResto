package customer;

import baseClass.BaseState;

public class CustomerOrderWaiterState implements BaseState<CustomerStates> {
    private final CustomerStateMachine customerStateMachine;

    public CustomerOrderWaiterState(CustomerStateMachine customerStateMachine) {
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
        return CustomerStates.ORDER_WAITER;
    }
}
