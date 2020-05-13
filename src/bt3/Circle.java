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
public class Circle extends Shape{
    private static Circle instance;

    protected Circle() {
        this.brush = "";
        this.paper = "";
        this.frame = "";
    }
    
    public static Circle createCircleInstance(){
        if(instance == null)
            instance = new Circle();
        return instance;
    }

    @Override
    public String draw() {
        StringBuilder b = new StringBuilder();
        b.append("- This is a Circle").append(super.draw());
        return b.toString();
    }
}
