package Restaurant;

import baseClass.Entity;
import baseClass.RestaurantMediator;

import java.util.ArrayList;

public class Restaurant implements RestaurantMediator {
    private static Restaurant instance;
    private final ArrayList<Relationship> relationships;

    public static Restaurant getInstance(){
        if (instance == null){
            instance = new Restaurant();
        }

        return instance;
    }

    public static void resetInstance(){
        instance = null;
    }

    private Restaurant(){
        relationships = new ArrayList<>();
    }

    @Override
    public void notifyEntities(Entity from, Entity to) {
        for (Relationship relationship : relationships){
            if (relationship.from.equals(from) || relationship.to.equals(to)){
                relationships.remove(relationship);
                break;
            }
        }

        relationships.add(new Relationship(from, to));
    }

    public void setEntitiesToSend(){

    }

    public void closeRestaurant(){

    }
}
