package strategy2;
import org.junit.Test;
public class GoodBobTest {
    
    public GoodBobTest() {
    }

    @Test
    public void goodbobtest() {
        RegTest.Utility.init();
        RegTest.Utility.redirectStdOut("GoodBobOutput.txt");
        
        GoodBob b = new GoodBob(new weighted1());
        System.out.println(b.runGoodBob(4, 5));
        System.out.println(b.runGoodBob(3, 5));
        b.setStrategy(new weighted2());
        System.out.println(b.runGoodBob(4, 5));
        System.out.println(b.runGoodBob(3, 5)); 
        b.setStrategy(new weighted3());
        System.out.println(b.runGoodBob(4, 5));
        System.out.println(b.runGoodBob(3, 5));    
        
        RegTest.Utility.validate("GoodBobOutput.txt", 
                "Correct/BadBobTest.txt", false);
    }
    
}
