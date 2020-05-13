/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

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
        MyStringBuilder builder = new MyStringBuilder()
                .append("String: string\n")
                .append("Bool: ")
                .append(true)
                .append("\n")
                .append("Float: ")
                .append((float)1.22342442);
        
        System.out.println(builder.toString());
    }
    
}
