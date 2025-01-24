package factory;

import baseClass.Employee;
import baseClass.RestaurantMediator;
import chef.ChefStateMachine;
import utils.Entities;
import waiter.WaiterStateMachine;

public class EmployeeFactory {
    public Employee createEmployee(Entities entities, RestaurantMediator mediator){
        switch (entities){
            case CHEF:
                return new ChefStateMachine(mediator);
            case WAITER:
                return new WaiterStateMachine(mediator);
            default:
                return null;
        }
    }
}
