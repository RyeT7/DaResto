package chef;

import baseClass.Agent;

public class Chef implements Agent {
    private final String name;
    private String customer;
    private int speed;
    private int skill;
    private final ChefStateMachine machine;

    public Chef(ChefStateMachine machine) {
        this.name = createName();
        this.customer = "";
        this.speed = 1;
        this.skill = 1;
        this.machine = machine;
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

    public ChefStateMachine getMachine() {
        return machine;
    }
}
