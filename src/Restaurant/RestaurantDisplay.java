package Restaurant;

import baseClass.BaseState;
import chef.ChefStateMachine;
import chef.ChefStates;
import customer.CustomerStateMachine;
import customer.CustomerStates;
import waiter.WaiterStates;
import waiter.WaiterStateMachine;

import java.util.ArrayList;

public class RestaurantDisplay implements Runnable {
    private static RestaurantDisplay instance;

    public static RestaurantDisplay getInstance(){
        if (instance == null){
            instance = new RestaurantDisplay();
        }

        return instance;
    }

    public static void resetInstance(){
        instance = null;
    }

    private RestaurantDisplay(){
    }

    private void setDisplay(ArrayList<ChefStateMachine> chefs, ArrayList<WaiterStateMachine> waiters, ArrayList<CustomerStateMachine> customers){
        System.out.println("=".repeat(52));
        System.out.printf("| %-15s| %-15s| %-15s|", "Chef", "Waiter", "Customer");
        System.out.println("=".repeat(52));

        int maxRows = Math.max(chefs.size(), Math.max(waiters.size(), customers.size()));

        for (int i = 0; i < maxRows; i++) {
            String chef, waiter, customer;
            String chefState, waiterState, customerState;

            try {
                chef = chefs.get(i).getChef().getName();
                chefState = chefs.get(i).getCurrentState().toString();
            } catch (Exception e) {
                chef = "";
                chefState = "";
            }

            try {
                waiter = waiters.get(i).getWaiter().getName();
                waiterState = waiters.get(i).getCurrentState().toString();
            } catch (Exception e) {
                waiter = "";
                waiterState = "";
            }

            try {
                customer = customers.get(i).getCustomer().getName();
                customerState = customers.get(i).getCurrentState().toString();
            } catch (Exception e) {
                customer = "";
                customerState = "";
            }

            System.out.printf("| %s %-11s| %s %-11s| %s %-11s|", chef, chefState, waiter, waiterState, customer, customerState);
        }
    }

    @Override
    public void run() {
        while (true){
        }
    }
}
