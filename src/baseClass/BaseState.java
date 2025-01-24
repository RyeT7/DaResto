package baseClass;

public interface BaseState<State extends Enum<State>> {
    void enterState();
    void exitState();
    void updateState();
    State getNextState();
    State getKey();
    void changeNextKey();
}
