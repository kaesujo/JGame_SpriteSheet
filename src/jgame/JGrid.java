/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgame;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author daniel.bbarros
 */
public class JGrid { 

    int[][] grid;
    int[] element_size = new int[2];

    JGrid(int rows, int columns, int size[]) {
        this.grid = new int[rows][columns];
        this.element_size[1] = size[0] / rows;        //vertical - height - linhas.
        this.element_size[0] = size[1] / columns;     //horizontal - width - colunas.
    }

    public void Draw(Graphics2D g) {
        int[] p1, p2, p3, p4;

        p1 = new int[2];
        p3 = new int[2];

        p2 = new int[2];
        p4 = new int[2];

        p2[1] = this.element_size[1] * this.grid.length;
        p4[0] = this.element_size[0] * this.grid[0].length;

        for (int i = 0; i < this.grid.length; i++) {
            g.drawLine(p3[0], p3[1], p4[0], p4[1]);
            p3[1] += this.element_size[1];
            p4[1] += this.element_size[1];
            g.drawLine(p1[0], p1[1], p2[0], p2[1]);
            p1[0] += this.element_size[0];
            p2[0] += this.element_size[0];
        }
    }

    public void drawRects(Graphics2D g) {
        int x, y = 0;
        for (int j = 0; j < grid[0].length; j++) {
            for (int i = 0; i < grid.length; i++) {
                g.setColor(Color.DARK_GRAY);

                // temos a posicao de cada casa
                x = j * this.element_size[0];
                y = i * this.element_size[1];

                g.fillRect(x, y, 10, 10);
            }
        }
    }
}
