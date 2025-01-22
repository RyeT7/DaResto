package baseClass;

import chef.ChefStateMachine;
import customer.CustomerStateMachine;
import waiter.WaiterStateMachine;

public interface RestaurantMediator {
    void requestCustomer(ChefStateMachine chef);

    void passCustomerToChef(WaiterStateMachine waiter, ChefStateMachine chef);

    void requestWaiter(CustomerStateMachine customer);
}
