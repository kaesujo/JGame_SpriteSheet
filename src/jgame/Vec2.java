/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgame;

/**
 *
 * @author daniel.bbarros
 */
public class Vec2 {

    private int x, y;

    /* CONSTRUTORES */
    Vec2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Vec2(Vec2 p) {
        this.x = p.x;
        this.y = p.y;
    }

    Vec2() {
        this.x = 0;
        this.y = 0;
    }

    /* METODOS */
    public boolean equals(Vec2 v) {
        return this.x == v.x && this.y == v.y;
    }

    @Override
    public String toString() {
        return "[" + this.x + " ," + this.y + "]";
    }

    public static float Distance(Vec2 a, Vec2 b) {
        int dx, dy;
        dx = a.x - b.x;
        dy = a.y - b.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public static float Angle(Vec2 origin, Vec2 target) {
        /* IMPLEMENTAR */
        return 0.0f;
    }
}
