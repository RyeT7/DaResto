package chef;

import baseClass.BaseState;

public class ChefIdleState implements BaseState<ChefStates> {
    public ChefIdleState() {
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
        return ChefStates.IDLE;
    }
}
