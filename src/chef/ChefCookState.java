package chef;

import baseClass.AbstractState;

public class ChefCookState implements AbstractState<ChefStates> {
    public ChefCookState() {
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
        return ChefStates.COOK;
    }
}
