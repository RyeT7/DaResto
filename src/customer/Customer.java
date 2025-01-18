package customer;

import baseClass.Agent;
import utils.Util;

public class Customer implements Agent {
    private String name;
    private int tolerance;

    public Customer() {
        this.name = createName();
        this.tolerance = Util.getRandomInteger(10, 20);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTolerance() {
        return tolerance;
    }

    public void setTolerance(int tolerance) {
        this.tolerance = tolerance;
    }
}
