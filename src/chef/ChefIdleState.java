package chef;

import baseClass.BaseState;

public class ChefIdleState implements BaseState<ChefStates> {
    private final ChefStateMachine chefStateMachine;
    private ChefStates nextState;

    public ChefIdleState(ChefStateMachine chefStateMachine) {
        this.chefStateMachine = chefStateMachine;
        nextState = ChefStates.IDLE;
    }

    @Override
    public void enterState() {
        nextState = ChefStates.IDLE;
    }

    @Override
    public void exitState() {
        nextState = ChefStates.IDLE;
    }

    @Override
    public void updateState() {

    }

    @Override
    public ChefStates getNextState() {
        return nextState;
    }

    @Override
    public ChefStates getKey() {
        return ChefStates.IDLE;
    }

    @Override
    public void changeNextKey() {
        nextState = ChefStates.COOK;
    }

    @Override
    public String toString() {
        return "idle";
    }
}
