package chef;

import baseClass.Agent;

public class Chef implements Agent {
    private final String name;
    private String status;
    private int speed;
    private int skill;
    private final ChefStateMachine machine;

    public Chef(ChefStateMachine machine) {
        this.name = createName();
        this.status = "";
        this.speed = 1;
        this.skill = 1;
        this.machine = machine;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
