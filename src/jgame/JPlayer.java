/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgame;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author monte
 */
public class JPlayer {

    private BufferedImage[] walkingLeft = {Sprite.getSprite(0, 1), Sprite.getSprite(2, 1)}; // Gets the upper left images of my sprite sheet
    private BufferedImage[] walkingRight = {Sprite.getSprite(0, 2), Sprite.getSprite(2, 2)};
    private BufferedImage[] standing = {Sprite.getSprite(1, 0)};

    private Animation walkLeft = new Animation(walkingLeft, 10);
    private Animation walkRight = new Animation(walkingRight, 10);
    private Animation stand = new Animation(standing, 10);

    public Animation animation = stand;
    private Vec2 pos;
    private Vec2 vel;
    public int x, y = 0;
    private int vida;

    public JPlayer(JFrame frame) {
        this.x = 0;
        this.y = 0;
        animation.start();
        frame.setVisible(true);
    }

    public Vec2 getPos() {
        return pos;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void draw(Graphics2D g) {
        animation.update();
        g.drawImage(animation.getSprite(), this.x, this.y, null);
    }

    public void walkLeft() {
        animation = walkLeft;
        animation.start();
    }
    
    public void walkRight() {
        animation = walkRight;
        animation.start();
    }

    public void stop() {
        animation.stop();
        animation.reset();
        animation = stand;
    }

}
