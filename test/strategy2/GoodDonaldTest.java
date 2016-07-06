/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy2;
import org.junit.Test;
/**
 *
 * @author brittkvanvig
 */
public class GoodDonaldTest {
    
    public GoodDonaldTest() {
    }

    @Test
    public void gooddonaldtest() {
        RegTest.Utility.init();
        RegTest.Utility.redirectStdOut("GoodDonaldOutput.txt");
        
        GoodDonald d = new GoodDonald(DonaldStrategy.FIRST);
        d.runGoodDonald();
        d.setStrategy(DonaldStrategy.SECOND);
        d.runGoodDonald();
        d.runGoodDonald();
        d.setStrategy(DonaldStrategy.THIRD);
        d.runGoodDonald();
        d.runGoodDonald();
        d.runGoodDonald();
        
        
        RegTest.Utility.validate("GoodDonaldOutput.txt", 
                "Correct/BadDonaldTest.txt", false);
    }
    
}
