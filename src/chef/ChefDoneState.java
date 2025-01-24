package chef;

import baseClass.BaseState;

public class ChefDoneState implements BaseState<ChefStates> {
    private final ChefStateMachine chefStateMachine;

    public ChefDoneState(ChefStateMachine chefStateMachine) {
        this.chefStateMachine = chefStateMachine;
    }

    @Override
    public void enterState() {

    }

    @Override
    public void exitState() {

    }

    @Override
    public void updateState() {

    }

    @Override
    public ChefStates getNextState() {
        return null;
    }

    @Override
    public ChefStates getKey() {
        return ChefStates.DONE;
    }

    @Override
    public String toString() {
        return String.format("done<%s>", "Customer");
    }
}
