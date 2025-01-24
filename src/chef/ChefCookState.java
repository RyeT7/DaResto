package chef;

import baseClass.BaseState;

public class ChefCookState implements BaseState<ChefStates> {
    private final ChefStateMachine chefStateMachine;
    private int secondsToFinishAction;
    private Chef chef;

    public ChefCookState(ChefStateMachine chefStateMachine) {
        this.chefStateMachine = chefStateMachine;
        secondsToFinishAction = 0;
        chef = chefStateMachine.getChef();
    }

    @Override
    public void enterState() {
        int secondWhenStart = chefStateMachine.getSeconds();
        int speed = chef.getSpeed();
        secondsToFinishAction = secondWhenStart + speed;
    }

    @Override
    public void exitState() {
        secondsToFinishAction = 0;
    }

    @Override
    public void updateState() {

    }

    @Override
    public ChefStates getNextState() {
        if (chefStateMachine.getSeconds() < secondsToFinishAction){
            return ChefStates.COOK;
        } else {
            return ChefStates.DONE;
        }
    }

    @Override
    public ChefStates getKey() {
        return ChefStates.COOK;
    }

    @Override
    public void changeNextKey() {
        //
    }

    @Override
    public String toString() {
        return String.format("cook<%s>", "Customer");
    }
}
