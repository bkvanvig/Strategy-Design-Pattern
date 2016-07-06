/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy2;

import org.junit.Test;
import static org.junit.Assert.*;
import static strategy2.BadDonald.First;

/**
 *
 * @author don
 */
public class BadDonaldTest {
    
    public BadDonaldTest() {
    }

    @Test
    public void baddonaldtest() {
        RegTest.Utility.init();
        RegTest.Utility.redirectStdOut("output.txt");
        
       BadDonald d = new BadDonald();
       d.setWhich(BadDonald.First);
       d.doit();
       d.setWhich(BadDonald.Second);
       d.doit();
       d.doit();
       d.setWhich(BadDonald.Third);
       d.doit();
       d.doit();
       d.doit();   
        
        RegTest.Utility.validate("output.txt", "Correct/BadDonaldTest.txt", false);
    }
    
}
