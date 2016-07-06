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
public class GoodDonald {
    private DonaldStrategy gooddonald;
    
    public GoodDonald(DonaldStrategy gd){
        this.gooddonald = gd;
    }
    
    public void setStrategy(DonaldStrategy gd){
        this.gooddonald = gd;
    }
    
    public void runGoodDonald(){
        gooddonald.run();
    }
}
