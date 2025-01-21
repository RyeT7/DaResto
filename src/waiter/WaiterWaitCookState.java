package waiter;

import baseClass.BaseState;

public class WaiterWaitCookState implements BaseState<WaiterState> {
    public WaiterWaitCookState() {
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
    public WaiterState getNextState() {
        return null;
    }

    @Override
    public WaiterState getKey() {
        return WaiterState.WAIT_COOK;
    }
}
