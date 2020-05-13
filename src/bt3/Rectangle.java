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
public class Rectangle extends Shape{
    private static Rectangle instance;

    protected Rectangle() {
        this.brush = "";
        this.paper = "";
        this.frame = "";
    }
    
    public static Rectangle createRectangleInstance(){
        if(instance == null)
            instance = new Rectangle();
        return instance;
    }

    @Override
    public String draw() {
        StringBuilder b = new StringBuilder();
        b.append("- This is a Rectangle").append(super.draw());
        return b.toString();       
    }
}
