package waiter;

import baseClass.BaseState;

public class WaiterIdleState implements BaseState<WaiterState> {
    public WaiterIdleState() {
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
        return WaiterState.IDLE;
    }
}
