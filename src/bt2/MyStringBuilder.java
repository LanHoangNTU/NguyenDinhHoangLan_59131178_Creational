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
public class MyStringBuilder {
    private String str;

    public MyStringBuilder() {
        this.str = "";
    }

    public MyStringBuilder(String str) {
        this.str = str;
    }
    
    public MyStringBuilder append(String s){
        this.str += s;
        return this;
    }
    
    public MyStringBuilder append(float f){
        this.str += String.format("%f", f);
        return this;
    }
    
    public MyStringBuilder append(boolean b){
        this.str += String.format("%b", b);
        return this;
    }

    @Override
    public String toString() {
        return str;
    }
    
    
}
