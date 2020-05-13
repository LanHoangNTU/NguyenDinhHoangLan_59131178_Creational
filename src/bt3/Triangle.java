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
public class Triangle extends Shape{
    private static Triangle instance;

    protected Triangle() {
        this.brush = "";
        this.paper = "";
        this.frame = "";
    }
    
    public static Triangle createTriangleInstance(){
        if(instance == null)
            instance = new Triangle();
        return instance;
    }

    @Override
    public String draw() {
        StringBuilder b = new StringBuilder();
        b.append("- This is a Triangle").append(super.draw());
        return b.toString();       
    }
}
