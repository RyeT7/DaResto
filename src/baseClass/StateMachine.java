package baseClass;

import java.util.Hashtable;

public abstract class StateMachine<State extends Enum<State>> {
    protected Hashtable<State, AbstractState<State>> allStates;

    public StateMachine() {
        allStates = new Hashtable<State, AbstractState<State>>();
    }

    protected AbstractState<State> currentState;

    protected abstract void fillStateMap();
}
