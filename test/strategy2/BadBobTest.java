/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author don
 */
public class BadBobTest {
    
    public BadBobTest() {
    }

    @Test
    public void badbobtest() {
        RegTest.Utility.init();
        RegTest.Utility.redirectStdOut("output.txt");
        
        BadBob b = new BadBob();
        System.out.println(b.weighted(4, 5, 1));
        System.out.println(b.weighted(3, 5, 1));
        System.out.println(b.weighted(4, 5, 2));
        System.out.println(b.weighted(3, 5, 2));    
        System.out.println(b.weighted(4, 5, 3));
        System.out.println(b.weighted(3, 5, 3));    
        
        RegTest.Utility.validate("output.txt", "Correct/BadBobTest.txt", false);
    }
    
}
