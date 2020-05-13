/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Lân
 */
public abstract class Shape {
    protected String brush;
    protected String paper;
    protected String frame;

    public Shape() {
    }

    public Shape setBrush(String brush) {
        this.brush = brush;
        return this;
    }

    public Shape setPaper(String paper) {
        this.paper = paper;
        return this;
    }

    public Shape setFrame(String frame) {
        this.frame = frame;
        return this;
    }

    public String draw() {
        StringBuilder b = new StringBuilder();
        b.append("\n\t+ Brush: ").append(this.brush)
                .append("\n\t+ Paper: ").append(this.paper)
                .append("\n\t+ Frame: ").append(this.frame);
        return b.toString();
    }
}
