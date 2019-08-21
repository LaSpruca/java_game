package me.naenae.main;

import java.awt.*;

public abstract class GameObject {
    protected int x, y;
    protected GameObjectType type;
    protected int volX, volY;

    public GameObject(int x, int y, GameObjectType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public abstract void tick();
    public abstract void render(Graphics g);

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getVolX(){
        return this.volX;
    }

    //  Getters
    public int getVolY(){
        return this.volY;
    }

    public GameObjectType getType(){
        return this.type;
    }

    //  Setters
    public void setX(int i){
        this.x = i;
    }

    public void setY(int i){
        this.y = i;
    }

    public void setVolX(int i){
        this.volX = i;
    }

    public void setVolY(int i){
        this.volY = i;
    }

    public void setType(GameObjectType i){
        this.type = i;
    }
}
