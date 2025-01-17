package chef;

import BaseClass.Agent;

public class Chef implements Agent {
    private String name;
    private String customer;
    private int speed;
    private int skill;

    public Chef() {
        this.name = createName();
        this.customer = "";
        this.speed = 1;
        this.skill = 1;
    }

    public String getName() {
        return name;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
}
