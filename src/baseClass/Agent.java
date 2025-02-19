package baseClass;

import Restaurant.RestaurantManager;
import utils.Util;

public interface Agent {
    String getName();

    private String generateName(){
        return String.format("%c%c", Util.randomChar(), Util.randomChar());
    }

    default String createName(){
        String name = generateName();
        while (RestaurantManager.getInstance().isNameUnique(name)){
            name = generateName();
        }

        return name;
    }
}
