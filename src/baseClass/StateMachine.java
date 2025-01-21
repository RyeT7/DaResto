package baseClass;

import java.util.Hashtable;

public abstract class StateMachine<State extends Enum<State>> {
    protected Hashtable<State, BaseState<State>> allStates;

    public StateMachine() {
        allStates = new Hashtable<State, BaseState<State>>();
    }

    protected BaseState<State> currentState;

    protected abstract void fillStateMap();
    protected abstract int getSeconds();
}
