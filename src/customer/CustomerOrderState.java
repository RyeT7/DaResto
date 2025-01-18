package customer;

import baseClass.AbstractState;

public class CustomerOrderState implements AbstractState<CustomerStates> {
    private CustomerStates.CustomerHelper customerHelper;

    public CustomerOrderState() {
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
        switch(customerHelper){
            case NONE:
                return CustomerStates.ORDER;
            case WAITER:
                return CustomerStates.ORDER_WAITER;
            default:
                return null;
        }
    }
}
