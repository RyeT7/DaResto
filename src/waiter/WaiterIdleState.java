package waiter;

import baseClass.BaseState;

public class WaiterIdleState implements BaseState<WaiterState> {
    private final WaiterStateMachine waiterStateMachine;

    public WaiterIdleState(WaiterStateMachine waiterStateMachine) {
        this.waiterStateMachine = waiterStateMachine;
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
