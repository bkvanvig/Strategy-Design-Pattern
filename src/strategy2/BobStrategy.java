/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy2;

/**
 *
 * @author brittkvanvig
 */
public interface BobStrategy {
    
    double weighted(double x, double y);
    
}

class weighted1 implements BobStrategy{
    
    public double weighted(double x, double y) {
        return x*23 + .01*x*y + y;
    }
}

class weighted2 implements BobStrategy{
    
    public double weighted(double x, double y) {
        return x*x*.04 + y;
    }
}
class weighted3 implements BobStrategy{
    
    public double weighted(double x, double y) {
           return Math.pow(x,y)/14;
    }
}