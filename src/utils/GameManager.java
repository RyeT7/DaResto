package utils;

import baseClass.Agent;
import chef.ChefStateMachine;
import customer.CustomerStateMachine;
import waiter.WaiterStateMachine;

import java.util.ArrayList;

public class GameManager {
    private final ArrayList<Agent> agents;
    private final ArrayList<WaiterStateMachine> waiters;
    private final ArrayList<ChefStateMachine> chefs;
    private final ArrayList<CustomerStateMachine> customers;
    private static GameManager instance;

    public static GameManager getInstance(){
        if(instance == null){
            instance = new GameManager();
        }

        return instance;
    }

    private GameManager(){
        agents = new ArrayList<>();
        waiters = new ArrayList<>();
        chefs = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCharacters(Agent agent){
        agents.add(agent);
    }

    public void clearAllCharacters(){
        customers.clear();
        waiters.clear();
        chefs.clear();
        agents.clear();
    }

    public boolean isNameUnique(String name){
        for (Agent agent : agents){
            if(agent.getName().equals(name)){
                return false;
            }
        }

        return true;
    }

    public void addChef(ChefStateMachine chef){
        chefs.add(chef);
        addCharacters(chef.getChef());
    }

    public void addCustomer(CustomerStateMachine customer){
        customers.add(customer);
        addCharacters(customer.getCustomer());
    }

    public void addWaiter(WaiterStateMachine waiter){
        waiters.add(waiter);
        addCharacters(waiter.getWaiter());
    }
}
