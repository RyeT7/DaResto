package utils;

import baseClass.Agent;

import java.util.ArrayList;

public class GameManager {
    private final ArrayList<Agent> allAgents;
    private static GameManager instance;

    public static GameManager getInstance(){
        if(instance == null){
            instance = new GameManager();
        }

        return instance;
    }

    private GameManager(){
        allAgents = new ArrayList<>();
    }

    public void addCharacters(Agent agent){
        allAgents.add(agent);
    }

    public void clearAllCharacters(){
        allAgents.clear();
    }

    public boolean isNameUnique(String name){
        for (Agent agent : allAgents){
            if(agent.getName().equals(name)){
                return false;
            }
        }

        return true;
    }
}
