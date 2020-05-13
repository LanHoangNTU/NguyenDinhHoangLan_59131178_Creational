/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

import bt3.Shape;
import bt3.Circle;
import bt3.Rectangle;
import bt3.ShapeType;
import bt3.Triangle;

/**
 *
 * @author Lân
 */
public class ShapeFactory {

    public ShapeFactory() {
    }
    
    public Shape createShape(ShapeType type){
        switch(type){
            case circle:
                return Circle.createCircleInstance();
            case rectangle:
                return Rectangle.createRectangleInstance();
            case triangle:
                return Triangle.createTriangleInstance();
        }
        return null;
    }
}
