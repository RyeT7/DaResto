package waiter;

import baseClass.BaseState;

public class WaiterIdleState implements BaseState<WaiterStates> {
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
    public WaiterStates getNextState() {
        return null;
    }

    @Override
    public WaiterStates getKey() {
        return WaiterStates.IDLE;
    }
}
