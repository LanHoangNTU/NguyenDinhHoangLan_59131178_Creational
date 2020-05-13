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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape t1 = shapeFactory.createShape(ShapeType.triangle);
        t1.setBrush("Stencil").setPaper("Hot-press").setFrame("Wooden Inner");
        
        System.out.println("t1: " + t1.draw());
        
        Shape t2 = shapeFactory.createShape(ShapeType.triangle);
        t2.setBrush("Flagged Bristle").setPaper("Leather").setFrame("Barnwood Open");
        
        System.out.println("t1: " + t1.draw());
        System.out.println("t2: " + t2.draw());
        
        Shape r1 = shapeFactory.createShape(ShapeType.rectangle);
        r1.setBrush("Round Sash").setPaper("Rough").setFrame("Wooden Inner");
        
        System.out.println("r1: " + r1.draw());
        
        Shape r2 = shapeFactory.createShape(ShapeType.rectangle);
        r2.setBrush("Trim").setPaper("Medium-weight").setFrame("Barnwood Open");
        
        System.out.println("r1: " + r1.draw());
        System.out.println("r2: " + r2.draw());
        
        Shape c1 = shapeFactory.createShape(ShapeType.circle);
        c1.setBrush("Angled Sash").setPaper("Thick").setFrame("Wooden Inner");
        
        System.out.println("c1: " + c1.draw());
        
        Shape c2 = shapeFactory.createShape(ShapeType.circle);
        c2.setBrush("Nylon").setPaper("Leather").setFrame("Barnwood Open");
        
        System.out.println("c1: " + c1.draw());
        System.out.println("c2: " + c2.draw());
    }
    
}