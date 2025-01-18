package chef;

import baseClass.AbstractState;

public class ChefDoneState implements AbstractState<ChefStates> {
    public ChefDoneState() {
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
}
