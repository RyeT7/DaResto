package customer;

import baseClass.AbstractState;

public class CustomerWaitState implements AbstractState<CustomerStates> {
    private CustomerStates.CustomerHelper customerHelper;

    public CustomerWaitState() {
        customerHelper = CustomerStates.CustomerHelper.NONE;
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
        switch (customerHelper){
            case NONE:
                return CustomerStates.WAIT_FOOD;
            case WAITER:
                return CustomerStates.WAIT_FOOD_WAITER;
            case CHEF:
                return CustomerStates.WAIT_FOOD_CHEF;
            default:
                return null;
        }
    }
}
