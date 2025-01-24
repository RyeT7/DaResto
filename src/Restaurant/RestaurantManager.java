package Restaurant;

import baseClass.Agent;
import baseClass.Entity;
import baseClass.RestaurantMediator;
import baseClass.StateMachine;
import chef.ChefStateMachine;
import customer.CustomerStateMachine;
import waiter.WaiterStateMachine;

import java.util.ArrayList;

public class RestaurantManager implements RestaurantMediator {
    private final ArrayList<Agent> agents;
    private final ArrayList<WaiterStateMachine> waiters;
    private final ArrayList<ChefStateMachine> chefs;
    private final ArrayList<CustomerStateMachine> customers;
    private static RestaurantManager instance;

    private ArrayList<Entity> entities;

    public static RestaurantManager getInstance(){
        if(instance == null){
            instance = new RestaurantManager();
        }

        return instance;
    }

    private RestaurantManager(){
        agents = new ArrayList<>();
        waiters = new ArrayList<>();
        chefs = new ArrayList<>();
        customers = new ArrayList<>();

        entities = new ArrayList<>();
    }

    public void addThreads(Runnable command){

    }

    public void pauseThreads(){

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

    public void addEntities(Entity entity){
        entities.add(entity);
    }

    @Override
    public void notifyEntities(Entity from, Entity to) {
        from.getCurrentState().changeNextKey();
        to.getCurrentState().changeNextKey();
    }
}
