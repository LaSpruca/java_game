package me.naenae.main;

import java.awt.*;
import java.util.LinkedList;

public class Handler {
    LinkedList<GameObject> gameObjects = new LinkedList<>();

    public void tick(){
        for(int i = 0; i < gameObjects.size(); i++){
            GameObject obj = gameObjects.get(i);

            obj.tick();
        }
    }

    public void render(Graphics g){
        for(int i = 0; i < gameObjects.size(); i++){
            GameObject obj = gameObjects.get(i);

            obj.render(g);
        }
    }

    public void addGameObject(GameObject object){
        this.gameObjects.add(object);
    }

    public void removeGameObject(GameObject object){
        this.gameObjects.remove(object);
    }
}
