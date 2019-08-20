package me.naenae.main.game;

import me.naenae.main.GameObject;
import me.naenae.main.GameObjectType;

import java.awt.*;
import java.util.Random;

public class Circle extends GameObject {
    private Color color;
    private Color color2;
    private Random r = new Random();
    private int s;

    public Circle(int x, int y) {
        super(x, y, GameObjectType.PLAYER_T);

        s = r.nextInt(100);

        volX = r.nextInt(20) + 5;
        volY = r.nextInt(20) + 5;

        color = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        color2 = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
    }

    @Override
    public void tick() {
        color = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        color2 = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        x += volX;
        y += volY;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(color);
        g.drawArc(x, y, s, s, 0, 360);
        g.setColor(color2);
        g.fillArc(x + 1, y + 1, s - 1, s - 1, 0, 360);
    }
}
