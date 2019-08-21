package me.naenae.main.game;

import me.naenae.main.*;

import java.awt.*;

public class Player extends GameObject {

    public Player(int x, int y, GameObjectType type){
        super(x, y, type);

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.CYAN);
        g.drawRect(x, y, 50, 50);
    }
}
