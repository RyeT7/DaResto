package waiter;

import baseClass.Agent;

public class Waiter implements Agent {
    private String name;
    private int speed;

    public Waiter() {
        this.name = createName();
        this.speed = 1;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
