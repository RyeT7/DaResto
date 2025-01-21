package factory;

import baseClass.Employee;
import chef.ChefStateMachine;
import utils.Entities;
import waiter.WaiterStateMachine;

public class EmployeeFactory {
    public Employee createEmployee(Entities entities){
        switch (entities){
            case CHEF:
                return new ChefStateMachine();
            case WAITER:
                return new WaiterStateMachine();
            default:
                return null;
        }
    }
}
