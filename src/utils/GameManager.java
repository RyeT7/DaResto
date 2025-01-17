package utils;

import BaseClass.Agent;

import java.util.ArrayList;

public class GameManager {
    private ArrayList<Agent> allCharacters;
    private static GameManager instance;

    public static GameManager getInstance(){
        if(instance == null){
            instance = new GameManager();
        }

        return instance;
    }

    private GameManager(){
        allCharacters = new ArrayList<>();
    }

    public void addCharacters(Agent agent){
        allCharacters.add(agent);
    }

    public void clearAllCharacters(){
        allCharacters.clear();
    }

    public boolean isNameUnique(String name){
        for (Agent agent : allCharacters){
            if(agent.getName().equals(name)){
                return false;
            }
        }

        return true;
    }
}
