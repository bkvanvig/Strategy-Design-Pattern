package strategy2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author don
 */
public class BadBob {
    
    double weighted1(double x, double y) {
        return x*23 + .01*x*y + y;
    }
    
    double weighted2(double x, double y) {
        return x*x*.04 + y;
    }
    
    double weighted3(double x, double y) {
           return Math.pow(x,y)/14;
    }
    
    double weighted(double x, double y, int which) {
        switch (which) {
            case 1: return weighted1(x,y);
            case 2: return weighted2(x,y);
            case 3: return weighted3(x,y);
            default: throw new RuntimeException(""+which);
        }
    }
}
