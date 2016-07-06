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
public class GoodBob {
    private BobStrategy goodbob;
    
    public GoodBob(BobStrategy bob){
        this.goodbob = bob;
    }
    
    public void setStrategy (BobStrategy bob){
        this.goodbob = bob;
    }
    
    public double runGoodBob (double x, double y){
        return goodbob.weighted(x,y);
    }
    
}
